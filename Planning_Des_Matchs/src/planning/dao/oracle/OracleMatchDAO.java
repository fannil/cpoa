/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planning.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.sql.DataSource;
import planning.dao.IMatchDAO;
import planning.metier.Match;

/**
 *
 * @author Niil
 */
public class OracleMatchDAO implements IMatchDAO {
    private static DataSource ds;
    private static Connection connexionBD;
    
    @Override
    public void setDataSource(DataSource ds) {
        OracleMatchDAO.ds = ds;
    }
    
    @Override
    public void setConnection(Connection c) {
        OracleMatchDAO.connexionBD = c;
    }
    @Override
    public void closeConnection(Connection c)throws SQLException {
        if (c != null){
            c.close();
        }
    }
    public Connection getConnection() throws SQLException {
        return(ds.getConnection());
    }
    
    @Override
    public List<Match> getMatch() /*throws DAOException*/{
        ResultSet rset = null;
        Statement stmt = null;
        List<Match> listeMatch = null;
        try{
            stmt = connexionBD.createStatement();
            listeMatch = new ArrayList<>();
            rset = stmt.executeQuery("select * from match");
            while(rset.next()){
                List<String> strings = Arrays.asList(rset.getString(6).split(","));
                System.out.println(strings);
                List<String> strings2 = Arrays.asList(rset.getString(7).split(","));
                System.out.println(strings2);
                List<String> strings3 = Arrays.asList(rset.getString(8).split(","));
                System.out.println(strings3);
                
                
                Scanner scanner = new Scanner(rset.getString(6));
                List<Integer> liste1 = new ArrayList<Integer>();
                while (scanner.hasNextInt()) {
                    liste1.add(scanner.nextInt());
                }
                
                Scanner scanner2 = new Scanner(rset.getString(7));
                List<Integer> liste2 = new ArrayList<Integer>();
                while (scanner2.hasNextInt()) {
                    liste2.add(scanner2.nextInt());
                }
                
                Scanner scanner3 = new Scanner(rset.getString(8));
                List<Integer> liste3 = new ArrayList<Integer>();
                while (scanner3.hasNextInt()) {
                    liste3.add(scanner3.nextInt());
                }
                System.out.println(liste1);
                System.out.println(liste2);
                System.out.println(liste3);
                
                
                /*
                List<Integer> newList = new ArrayList<Integer>(strings.size());
                for (String s : strings) {
                    newList.add(Integer.valueOf(s)); 
                }
                
                List<Integer> newList2 = new ArrayList<Integer>(strings2.size());
                for (String s2 : strings2) { 
                    newList2.add(Integer.valueOf(s2)); 
                }
                
                List<Integer> newList3 = new ArrayList<Integer>(strings3.size());
                for (String s3 : strings) { 
                    newList3.add(Integer.valueOf(s3)); 
                }
                */
                
                Match a = new Match(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),liste1,liste2,liste3);
                listeMatch.add(a);
            }
        }
        catch (SQLException exc){
            Logger.getLogger(OracleMatchDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
        //finally {
        //    try{
        //        stmt.close();
        //        rset.close();
        //        closeConnection(connexionBD);
         //       System.out.println("connexion fermee");
        //    }
         //   catch (SQLException ex){
         //       Logger.getLogger(OracleMatchDAO.class.getName()).log(Level.SEVERE,null,ex);
         //   }
        //}
        return listeMatch;
    }
    
    @Override
    public void ajouterMatch(int id_match,String date,String heure, String type, String nom_court, String listearbitre,String listeramasseur,String listejoueur){
        //Connection connexionBD = null;
        PreparedStatement stmt = null;
        int col = 0;
        try{
            //connexionBD = getConnection();
            stmt = connexionBD.prepareStatement("INSERT INTO MATCH VALUES (?,?,?,?,?,?,?,?)");
            stmt.setInt(1,id_match);
            stmt.setString(2,date);
            stmt.setString(3,heure);
            stmt.setString(4,type);
            stmt.setString(5,nom_court);
            stmt.setString(6,listearbitre);
            stmt.setString(7,listeramasseur);
            stmt.setString(8,listejoueur);
            col = stmt.executeUpdate();
            System.out.println("Match ajouté");
        }
        catch (SQLException exc){
            Logger.getLogger(OracleMatchDAO.class.getName()).log(Level.SEVERE,null,exc);
        }
    }
}
