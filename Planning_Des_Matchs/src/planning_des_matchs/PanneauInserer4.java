package planning_des_matchs;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import planning.metier.Arbitre;

public class PanneauInserer4 extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    private static List<Arbitre> listeArbitreFilet;
    public static List listefiletchoisi = new ArrayList();
    private static String nom,categorie;
    private static int id,index;
    private static boolean choix;
    
    public PanneauInserer4(FenetreProjet fenetre) {
        this.fenetre = fenetre;
        listeArbitreFilet = TestProjet.listeArbitreFilet;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("Désignation de l'arbitre de filet");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Object[] columnNames = {"Nom", "ID", "Catégorie", "Boolean"};
        Object[][] data = {
            {"", 1,"", false},
            {"", 2, "", true},
            {"", 3, "",true},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 4, "", false},
            {"", 0, "", false},
            {"", 0, "", false},

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
                    return Boolean.class;
                }
            }
        };
        index=0;
        for (int i=0;i<listeArbitreFilet.size();i++){
            Arbitre tmp;
            tmp = TestProjet.listeArbitreFilet.get(index);
            nom = String.valueOf(tmp.getnom());
            id = Integer.valueOf(tmp.getid());
            choix = false;
            categorie = String.valueOf(tmp.getcategorie());
            jTable1.setValueAt(nom,i,0);
            jTable1.setValueAt(id,i,1);
            jTable1.setValueAt(categorie,i,2);
            jTable1.setValueAt(choix,i,3);
            index = index+1;
        }
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Précédent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Suivant");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton2)) {
            for (int i=0;i<listeArbitreFilet.size();i++){
                boolean isChecked = (Boolean) jTable1.getValueAt(i,3);
                Boolean newliste;
                Object id = jTable1.getValueAt(i,1);
                    if (isChecked ){
                        newliste = listefiletchoisi.add(id);
                        }
                }            
            PanneauInserer3.listelignechoisi.addAll(listefiletchoisi);
            PanneauInserer.inserermatch.listearbitre = PanneauInserer3.listelignechoisi;
            System.out.println("Liste ID arbitre ligne + filet choisi " + PanneauInserer.inserermatch.getListearbitre());
            listefiletchoisi.clear();
            JPanel panneau = new PanneauInserer5(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton1)) {
            //PanneauInserer3.listelignechoisi.removeAll(listefiletchoisi);
            //PanneauInserer.inserermatch.listearbitre = PanneauInserer3.listelignechoisi;
            System.out.println("Liste ID arbitre ligne + filet choisi " + PanneauInserer.inserermatch.getListearbitre());
            JPanel panneau = new PanneauInserer3(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
