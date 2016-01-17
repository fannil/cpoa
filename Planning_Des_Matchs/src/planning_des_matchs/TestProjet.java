package planning_des_matchs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import planning.dao.IArbitreDAO;
import planning.dao.IJoueurDAO;
import planning.dao.IRamasseurDAO;
import planning.dao.oracle.OracleArbitreDAO;
import planning.dao.oracle.OracleDataSourceDAO;
import planning.dao.oracle.OracleJoueurDAO;
import planning.dao.oracle.OracleRamasseurDAO;
import planning.metier.Arbitre;
import planning.metier.Joueur;
import planning.metier.Ramasseur;

public class TestProjet {
    
    public static List<Arbitre> listeArbitreLigne;
    public static List<Arbitre> listeArbitreFilet;
    public static List<Arbitre> listeArbitreChaise;
    public static List<Ramasseur> listeRamasseurE1;
    public static List<Ramasseur> listeRamasseurE2;
    public static List<Joueur> listeJoueur;
    
    public static IArbitreDAO ArbitreDAO;
    public static IRamasseurDAO RamasseurDAO;
    public static IJoueurDAO JoueurDAO;
    
    private static DataSource dataSourceDAO;
    private static Connection connexionBD;
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(()->{
            try {
                dataSourceDAO = OracleDataSourceDAO.getOracleDataSourceDAO();
                
                ArbitreDAO = new OracleArbitreDAO();
                ArbitreDAO.setDataSource(dataSourceDAO);
                connexionBD = dataSourceDAO.getConnection();
                ArbitreDAO.setConnection(connexionBD);
                
                dataSourceDAO = OracleDataSourceDAO.getOracleDataSourceDAO();
                
                RamasseurDAO = new OracleRamasseurDAO();
                RamasseurDAO.setDataSource(dataSourceDAO);
                connexionBD = dataSourceDAO.getConnection();
                RamasseurDAO.setConnection(connexionBD);
                
                dataSourceDAO = OracleDataSourceDAO.getOracleDataSourceDAO();
                
                JoueurDAO = new OracleJoueurDAO();
                JoueurDAO.setDataSource(dataSourceDAO);
                connexionBD = dataSourceDAO.getConnection();
                JoueurDAO.setConnection(connexionBD);
                
                listeArbitreLigne = ArbitreDAO.getArbitreLigne();
                listeArbitreFilet = ArbitreDAO.getArbitreFilet();
                listeArbitreChaise = ArbitreDAO.getArbitreChaise();
                
                listeRamasseurE1 = RamasseurDAO.getRamasseurE1();
                listeRamasseurE2 = RamasseurDAO.getRamasseurE2();
                
                listeJoueur = JoueurDAO.getJoueur();
                        
                SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FenetreProjet fenetre = new FenetreProjet();
                    fenetre.pack();
                    fenetre.setVisible(true);
                }
        });
                
            } catch (SQLException | IOException ex){
                Logger.getLogger(TestProjet.class.getName()).log(Level.SEVERE, null, ex);
            } 
        });
    }
}