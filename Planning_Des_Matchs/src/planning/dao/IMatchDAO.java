package planning.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import planning.metier.Match;

public interface IMatchDAO {
    public void setDataSource(DataSource ds);
    public void setConnection(Connection c);
    public void closeConnection(Connection c)throws SQLException;
    
    public List<Match> getMatch();
    public void ajouterMatch(int id_match, String date,String heure, String type, String nom_court, String listearbitre,String listeramasseur,String listejoueur);
}
