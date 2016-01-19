package planning_des_matchs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import planning.dao.oracle.OracleArbitreDAO;
import planning.dao.oracle.OracleMatchDAO;
import planning.metier.Arbitre;
import planning.metier.Joueur;
import planning.metier.Ramasseur;

public class PanneauInsererRecap extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    public static OracleArbitreDAO ArbitreDAO;
    private static int id,equipe,index;
    private static String nom,categorie,poste;
    private static boolean choix;
    
    public PanneauInsererRecap(FenetreProjet fenetre) {
        this.fenetre=fenetre;
        fenetre.setSize(600, 600);
        fenetre.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Récapitulatif");

        String newdate = PanneauInserer.inserermatch.getDate();
        jLabel2.setText("Date : " + newdate);

        String heure = PanneauInserer.inserermatch.getHeure();
        jLabel3.setText("Heure : " + heure);

        String tournoi = PanneauInserer.inserermatch.getType();
        jLabel4.setText("Tournoi : " + tournoi);

        String court = PanneauInserer.inserermatch.getNom_court();
        jLabel5.setText("Court : " + court);

        //List liste = PanneauInserer.inserermatch.getListearbitre();
        jLabel6.setText("Liste des arbitres : ");

        Object[] columnNames = {"Nom", "ID", "Catégorie", "Poste"};
        Object[][] data = {
            {"", 1,"", ""},
            {"", 2, "", ""},
            {"", 3, "",""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 4, "", ""},
            {"", 0, "", ""},
            {"", 0, "", ""},
            {"", 0, "", ""},
            {"", 0, "", ""},
            {"", 0, "", ""},
            {"", 0, "", ""},
            {"", 0, "", ""},
            {"", null, "", ""},

        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable1 = new JTable(model) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return Integer.class;
                    case 2:
                    return String.class;
                    default:
                    return String.class;
                }
            }
        };
        index=0;

        for (int i=0;i<PanneauInserer.inserermatch.listearbitre.size();i++){
            Arbitre tmp;
            int a = PanneauInserer.inserermatch.listearbitre.get(i);
            tmp = TestProjet.ArbitreDAO.getArbitre(a);
            nom = String.valueOf(tmp.getnom());
            id = Integer.valueOf(tmp.getid());
            categorie = String.valueOf(tmp.getcategorie());
            poste = String.valueOf(tmp.getposte());
            jTable1.setValueAt(nom,i,0);
            jTable1.setValueAt(id,i,1);
            jTable1.setValueAt(categorie,i,2);
            jTable1.setValueAt(poste,i,3);
            index = index+1;
        }
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("Liste des ramasseurs : ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Object[] columnNames2 = {"Prénom", "ID", "Equipe"};
        Object[][] data2 = {
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},
            {"", null,  ""},

        };
        DefaultTableModel model2 = new DefaultTableModel(data2, columnNames2);
        jTable2 = new JTable(model2) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return Integer.class;
                    default:
                    return String.class;
                }
            }
        };
        index=0;

        for (int i=0;i<PanneauInserer.inserermatch.listeramasseur.size();i++){
            Ramasseur tmp;
            int r = PanneauInserer.inserermatch.listeramasseur.get(i);
            tmp = TestProjet.RamasseurDAO.getRamasseur(r);
            nom = String.valueOf(tmp.getNomramasseur());
            id = Integer.valueOf(tmp.getIdramasseur());
            equipe = Integer.valueOf(tmp.getNumequipe());
            jTable2.setValueAt(nom,i,0);
            jTable2.setValueAt(id,i,1);
            jTable2.setValueAt(equipe,i,2);
            index = index+1;
        }
        jScrollPane2.setViewportView(jTable2);

        jLabel8.setText("Liste des joueurs : ");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        Object[] columnNames3 = {"Prénom", "ID"};
        Object[][] data3 = {
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},
            {"", null},

        };
        DefaultTableModel model3 = new DefaultTableModel(data2, columnNames2);
        jTable3 = new JTable(model3) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    default:
                    return Integer.class;
                }
            }
        };
        index=0;

        for (int i=0;i<PanneauInserer.inserermatch.listejoueur.size();i++){
            Joueur tmp;
            int j = PanneauInserer.inserermatch.listejoueur.get(i);
            tmp = TestProjet.JoueurDAO.getJoueur(j);
            nom = String.valueOf(tmp.getNomjoueur());
            id = Integer.valueOf(tmp.getIdjoueur());
            jTable3.setValueAt(nom,i,0);
            jTable3.setValueAt(id,i,1);
            index = index+1;
        }
        jScrollPane3.setViewportView(jTable3);

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel3)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton1)) {
            OracleMatchDAO MatchDAO = new OracleMatchDAO();
            int id = PanneauInserer.inserermatch.getId();
            String newdate = PanneauInserer.inserermatch.getDate();
            String heure = PanneauInserer.inserermatch.getHeure();
            String type = PanneauInserer.inserermatch.getType();
            String court = PanneauInserer.inserermatch.getNom_court();
            
            List listearbitre = new ArrayList();
            listearbitre = PanneauInserer.inserermatch.getListearbitre();
            String listearbitrestring = listearbitre.toString().replaceAll("\\s","").replaceAll("\\[","").replaceAll("\\]","");
            
            List listeramasseur = new ArrayList();
            listeramasseur = PanneauInserer.inserermatch.getListeramasseur();
            String listeramasseurstring = listeramasseur.toString().replaceAll("\\s","").replaceAll("\\[","").replaceAll("\\]","");
            
            List listejoueur = new ArrayList();
            listejoueur = PanneauInserer.inserermatch.getListejoueur();
            String listeajoueurstring = listejoueur.toString().replaceAll("\\s","").replaceAll("\\[","").replaceAll("\\]","");
            
            MatchDAO.ajouterMatch(id, newdate, heure, type, court, listearbitrestring, listeramasseurstring, listeajoueurstring);
            this.fenetre.retourAccueil();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
