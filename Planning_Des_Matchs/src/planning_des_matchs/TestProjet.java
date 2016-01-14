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
import planning.dao.oracle.OracleArbitreDAO;
import planning.dao.oracle.OracleDataSourceDAO;
import planning.metier.Arbitre;

public class TestProjet {
    /*
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetreProjet fenetre = new FenetreProjet();
                fenetre.pack();
                fenetre.setVisible(true);
            }
        });
    }*/
    private static List<Arbitre> listeArbitreLigne;
    private static IArbitreDAO ArbitreDAO;
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