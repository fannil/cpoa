package planning.metier;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Match {
    public int id_match;
    public String date;
    public String heure;
    public String type;
    public String nom_court;
    public List<Integer> listearbitre;
    public List<Integer> listeramasseur;
    public List<Integer> listejoueur;
    
    public Match(int id_match,String date,String heure,String type,String nom_court,List<Integer> listearbitre,List<Integer> listeramasseur,List<Integer> listejoueur) {
        this.id_match=id_match;
        this.date=date;
        this.heure=heure;
        this.type=type;
        this.nom_court=nom_court;
        this.listearbitre=listearbitre;
        this.listeramasseur=listeramasseur;
        this.listejoueur=listejoueur;
    }

    public int getId() {
        return id_match;
    }

    public void setId(int id_match) {
        this.id_match = id_match;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getNom_court() {
        return nom_court;
    }

    public void setNom_court(String nom_court) {
        this.nom_court = nom_court;
    }
    
    public List<Integer> getListearbitre() {
        return listearbitre;
    }

    public void setListearbitre(List<Integer> listearbitre) {
        this.listearbitre = listearbitre;
    }
    
    public List<Integer> getListeramasseur() {
        return listeramasseur;
    }

    public void setListeramasseur(List<Integer> listeramasseur) {
        this.listeramasseur = listeramasseur;
    }
    
    public List<Integer> getListejoueur() {
        return listejoueur;
    }

    public void setListejoueur(List<Integer> listejoueur) {
        this.listejoueur = listejoueur;
    }

}
