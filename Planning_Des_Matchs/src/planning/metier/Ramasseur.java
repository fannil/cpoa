
package planning.metier;

public class Ramasseur {
    private int id_ramasseur;
    private int num_equipe;
    private String nom_ramasseur;
    
    public Ramasseur (int id_ramasseur,int num_equipe, String nom_ramasseur){
        this.id_ramasseur=id_ramasseur;
        this.num_equipe=num_equipe;
        this.nom_ramasseur=nom_ramasseur;
    }
    
    public int getIdramasseur() {
        return id_ramasseur;
    }

    public void setIdramasseur(int id_ramasseur) {
        this.id_ramasseur = id_ramasseur;
    }
    
    public int getNumequipe() {
        return num_equipe;
    }

    public void setNumequipe(int num_equipe) {
        this.num_equipe = num_equipe;
    }
    
    public String getNomramasseur() {
        return nom_ramasseur;
    }

    public void setNomramasseur(String nom_ramasseur) {
        this.nom_ramasseur = nom_ramasseur;
    }
}
