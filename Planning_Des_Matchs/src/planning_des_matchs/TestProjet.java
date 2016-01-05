package planning_des_matchs;

import javax.swing.SwingUtilities;

public class TestProjet {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetreProjet fenetre = new FenetreProjet();
                fenetre.setVisible(true);
            }
        });
    }
}