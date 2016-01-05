package planning.dao.oracle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;


public class OracleDataSourceDAO extends OracleDataSource {
    private static OracleDataSourceDAO ods;
    private OracleDataSourceDAO() throws SQLException{
        
    }
    
    public static OracleDataSourceDAO getOracleDataSourceDAO() throws FileNotFoundException, IOException, SQLException{
    FileInputStream fichier =null;
    try{
    Properties props = new Properties();
    fichier = new FileInputStream(".\\src\\planning\\dao\\oracle\\connexion.properties");
    props.load(fichier);
    ods = new OracleDataSourceDAO();
    ods.setDriverType(props.getProperty("pilote"));
    ods.setPortNumber(new Integer(props.getProperty("port")).intValue());
    ods.setServiceName(props.getProperty("service"));
    ods.setUser(props.getProperty("user"));
    ods.setPassword(props.getProperty("pwd"));
    ods.setServerName(props.getProperty("serveur"));
    }
    catch(SQLException | IOException ex){
        Logger.getLogger(OracleDataSourceDAO.class.getName()).log(Level.SEVERE, null,ex);
        System.out.println("Problème d'obtention de la source de données");
    }
    finally{
        try{fichier.close();
        }
        catch (IOException ex){
            Logger.getLogger(OracleDataSourceDAO.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("Problème d'entrée/sortie");
        }
    return ods;
    }
    }
}
  
