package planning.metier;

public class Arbitre {
    private int id_arbitre;
    private String categorie;
    private String nom;
    private String poste;

    
    public Arbitre(int id_arbitre, String categorie, String nom, String poste){
        this.id_arbitre=id_arbitre;
        this.categorie=categorie;
        this.nom=nom;
        this.poste=poste;
    }
    
    public int getid() {
        return id_arbitre;
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
