package planning_des_matchs;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreProjet extends JFrame{
    private JPanel PanneauAccueil;
    public FenetreProjet () {
        super();
        this.setTitle("Planning des matchs");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.build();
    }
    
    private void build() {
        this.PanneauAccueil = new PanneauAccueil(this);
        this.setContentPane(this.PanneauAccueil);
    }
    public void retourAccueil() {
        this.changerPanneau(this.PanneauAccueil);
    }
    
    public void changerPanneau(JPanel panneau) {
        this.setContentPane(panneau);
        this.revalidate();
    }
}
