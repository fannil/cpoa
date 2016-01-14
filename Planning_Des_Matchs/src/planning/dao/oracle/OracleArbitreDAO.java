package planning.dao.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import planning.dao.IArbitreDAO;
import planning.metier.Arbitre;

public class OracleArbitreDAO implements IArbitreDAO {
    private static DataSource ds;
    private static Connection connexionBD;
    private static ResultSet rset;
     private static Statement stmt;
    
    @Override
    public void setDataSource(DataSource ds) {
        OracleArbitreDAO.ds = ds;
    }
    
    @Override
    public void setConnection(Connection c) {
        OracleArbitreDAO.connexionBD = c;
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
    public List<Arbitre> getArbitreLigne() /*throws DAOException*/{
        rset = null;
        stmt = null;
        List<Arbitre> listeArbitreLigne = null;
        try{
            stmt = connexionBD.createStatement();
            listeArbitreLigne = new ArrayList<>();
            rset = stmt.executeQuery("SELECT * from ARBITRE where poste='ligne'");
            while(rset.next()){
                Arbitre a = new Arbitre(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getString(4));
                listeArbitreLigne.add(a);
            }
        }
        catch (SQLException exc){
            Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
        finally {
            try{
                stmt.close();
                rset.close();
                closeConnection(connexionBD);
                System.out.println("connexion fermee");
            }
            catch (SQLException ex){
                Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,ex);
                
            }
        }
        return listeArbitreLigne;
    }
    
    @Override
    public List<Arbitre> getArbitreFilet() /*throws DAOException*/{
        ResultSet rset = null;
        Statement stmt = null;
        List<Arbitre> listeArbitreFilet = null;
        try{
            stmt = connexionBD.createStatement();
            listeArbitreFilet = new ArrayList<>();
            rset = stmt.executeQuery("SELECT * from ARBITRE where poste='filet'");
            while(rset.next()){
                Arbitre a = new Arbitre(rset.getInt(1),rset.getString(2),rset.getString(2),rset.getString(2));
                listeArbitreFilet.add(a);
            }
        }
        catch (SQLException exc){
            Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
        finally {
            try{
                stmt.close();
                rset.close();
                closeConnection(connexionBD);
                System.out.println("connexion fermee");
            }
            catch (SQLException ex){
                Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,ex);
                
            }
        }
        return listeArbitreFilet;
    }
    
    @Override
    public List<Arbitre> getArbitreChaise() /*throws DAOException*/{
        ResultSet rset = null;
        Statement stmt = null;
        List<Arbitre> listeArbitreChaise = null;
        try{
            stmt = connexionBD.createStatement();
            listeArbitreChaise = new ArrayList<>();
            rset = stmt.executeQuery("SELECT * from ARBITRE where poste='chaise'");
            while(rset.next()){
                Arbitre a = new Arbitre(rset.getInt(1),rset.getString(2),rset.getString(2),rset.getString(2));
                listeArbitreChaise.add(a);
            }
        }
        catch (SQLException exc){
            Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
        finally {
            try{
                stmt.close();
                rset.close();
                closeConnection(connexionBD);
                System.out.println("connexion fermee");
            }
            catch (SQLException ex){
                Logger.getLogger(OracleArbitreDAO.class.getName()).log(Level.SEVERE,null,ex);
                
            }
        }
        return listeArbitreChaise;
    }
}