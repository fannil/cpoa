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
import planning.dao.IJoueurDAO;
import planning.metier.Joueur;
import planning.metier.Ramasseur;

public class OracleJoueurDAO implements IJoueurDAO {
    private static DataSource ds;
    private static Connection connexionBD;
    
    @Override
    public void setDataSource(DataSource ds) {
        OracleJoueurDAO.ds = ds;
    }
    
    @Override
    public void setConnection(Connection c) {
        OracleJoueurDAO.connexionBD = c;
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
    public List<Joueur> getJoueur() /*throws DAOException*/{
        ResultSet rset = null;
        Statement stmt = null;
        List<Joueur> listeJoueur = null;
        try{
            stmt = connexionBD.createStatement();
            listeJoueur = new ArrayList<>();
            rset = stmt.executeQuery("select * from joueur");
            while(rset.next()){
                Joueur j = new Joueur(rset.getInt(1),rset.getString(2));
                listeJoueur.add(j);
            }
        }
        catch (SQLException exc){
            Logger.getLogger(OracleJoueurDAO.class.getName()).log(Level.SEVERE,null,exc);
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
        return listeJoueur;
    }
    
    @Override 
    public Joueur getJoueur(int i) /*throws DAOException*/{
        ResultSet rset = null;
        PreparedStatement stmt = null;
        Joueur joueur = null;
        try{
            stmt = connexionBD.prepareStatement("select * from joueur where id_joueur= ? ");
            stmt.setInt(1,i);
            rset = stmt.executeQuery();
            while (rset.next()){
                joueur = new Joueur(rset.getInt(1),rset.getString(2));
            }
            //return arbitre;
        }
        catch (SQLException exc){
            Logger.getLogger(OracleJoueurDAO.class.getName()).log(Level.SEVERE,null,exc);
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
        return joueur;
    }
}
