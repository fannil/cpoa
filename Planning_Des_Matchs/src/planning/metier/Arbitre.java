package planning.metier;

public class Arbitre {
    private int id;
    private String categorie;
    private String nom;
    private String poste;

    
    public Arbitre(int id, String categorie, String nom, String poste){
        this.id=id;
        this.categorie=categorie;
        this.nom=nom;
        this.poste=poste;
    }
    
    public int getid() {
        return id;
    }
    
    public String getcategorie() {
        return categorie;
    }
    
    public String getnom() {
        return nom;
    }
    
    public String getposte() {
        return poste;
    }
}
