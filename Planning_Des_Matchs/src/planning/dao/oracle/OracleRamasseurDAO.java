package planning.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import planning.dao.IRamasseurDAO;
import planning.metier.Arbitre;
import planning.metier.Ramasseur;

public class OracleRamasseurDAO implements IRamasseurDAO {
    private static DataSource ds;
    private static Connection connexionBD;
    
    @Override
    public void setDataSource(DataSource ds) {
        OracleRamasseurDAO.ds = ds;
    }
    
    @Override
    public void setConnection(Connection c) {
        OracleRamasseurDAO.connexionBD = c;
    }
    @Override
    public void closeConnection(Connection c)throws SQLException {
        if (c != null){
            c.close();
        }
    }
    public Connection getConnection() throws SQLException {
        return(ds.getConnection());
    }
    
    @Override
    public List<Ramasseur> getRamasseurE1() /*throws DAOException*/{
        ResultSet rset = null;
        Statement stmt = null;
        List<Ramasseur> listeRamasseurE1 = null;
        try{
            stmt = connexionBD.createStatement();
            listeRamasseurE1 = new ArrayList<>();
            rset = stmt.executeQuery("select * from RAMASSEUR where NUM_EQUIPE=1");
            while(rset.next()){
                Ramasseur r = new Ramasseur(rset.getInt(1),rset.getInt(2),rset.getString(3));
                listeRamasseurE1.add(r);
            }
        }
        catch (SQLException exc){
            Logger.getLogger(OracleRamasseurDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
        //finally {
        //    try{
        //        stmt.close();
        //        rset.close();
        //        closeConnection(connexionBD);
        //        System.out.println("connexion fermee");
        //   }
        //   catch (SQLException ex){
        //        Logger.getLogger(OracleRamasseurDAO.class.getName()).log(Level.SEVERE,null,ex);
        //    }
        //}
        return listeRamasseurE1;
    }
    
    @Override
    public List<Ramasseur> getRamasseurE2() /*throws DAOException*/{
        ResultSet rset = null;
        Statement stmt = null;
        List<Ramasseur> listeRamasseurE2 = null;
        try{
            stmt = connexionBD.createStatement();
            listeRamasseurE2 = new ArrayList<>();
            rset = stmt.executeQuery("select * from RAMASSEUR where NUM_EQUIPE=2");
            while(rset.next()){
                Ramasseur r = new Ramasseur(rset.getInt(1),rset.getInt(2),rset.getString(3));
                listeRamasseurE2.add(r);
            }
        }
        catch (SQLException exc){
            Logger.getLogger(OracleRamasseurDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
        //finally {
        //    try{
        //        stmt.close();
        //        rset.close();
        //        closeConnection(connexionBD);
        //        System.out.println("connexion fermee");
        //    }
        //   catch (SQLException ex){
        //        Logger.getLogger(OracleRamasseurDAO.class.getName()).log(Level.SEVERE,null,ex);
        //    }
        //}
        return listeRamasseurE2;
    }
    
    @Override 
    public Ramasseur getRamasseur(int i) /*throws DAOException*/{
        ResultSet rset = null;
        PreparedStatement stmt = null;
        Ramasseur ramasseur = null;
        try{
            stmt = connexionBD.prepareStatement("select * from ramasseur where id_ramasseur= ? ");
            stmt.setInt(1,i);
            rset = stmt.executeQuery();
            while (rset.next()){
                ramasseur = new Ramasseur(rset.getInt(1),rset.getInt(2),rset.getString(3));
            }
            //return arbitre;
        }
        catch (SQLException exc){
            Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
        //finally {
        //    try{
        //        stmt.close();
        //        rset.close();
        //        closeConnection(connexionBD);
         //       System.out.println("connexion fermee");
        //    }
         //   catch (SQLException ex){
         //       Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,ex);
         //   }
        //}
        return ramasseur;
    }
}
