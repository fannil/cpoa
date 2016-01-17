package planning.metier;

public class Joueur {
    private int id_joueur;
    private String nom_joueur;
    
    public Joueur (int id_joueur,String nom_joueur){
        this.id_joueur=id_joueur;
        this.nom_joueur=nom_joueur;
    }
    
    public int getIdjoueur() {
        return id_joueur;
    }
    
    public void setIdjoueur(int id_joueur) {
        this.id_joueur=id_joueur;
    }
    
    public String getNomjoueur() {
        return nom_joueur;
    }
    
    public void setNomjoueur(String nom_joueur) {
        this.nom_joueur=nom_joueur;
    }
}
