
package planning.metier;

public class Ramasseur {
    private int id_ramasseur;
    private int num_equipe;
    
    public Ramasseur (int id_ramasseur,int num_equipe){
        this.id_ramasseur=id_ramasseur;
        this.num_equipe=num_equipe;
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
}
