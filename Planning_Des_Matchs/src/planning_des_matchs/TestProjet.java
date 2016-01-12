package planning_des_matchs;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class TestProjet {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetreProjet fenetre = new FenetreProjet();
                fenetre.pack();
                fenetre.setVisible(true);
            }
        });
    }
}