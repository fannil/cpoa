package planning.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import planning.metier.Arbitre;

public interface IArbitreDAO {
    public void setDataSource(DataSource ds);
    public void setConnection(Connection c);
    public void closeConnection(Connection c)throws SQLException;
    public List<Arbitre> getArbitre();
    
}
