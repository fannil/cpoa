package planning_des_matchs;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import planning.metier.Arbitre;

public class PanneauInserer5 extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    private static List<Arbitre> listeArbitreChaise;
    private static List listechaisechoisi = new ArrayList();
    private static String nom,categorie;
    private static int id,index;
    private static boolean choix;
    
    public PanneauInserer5(FenetreProjet fenetre) {
        this.fenetre = fenetre;
        listeArbitreChaise = TestProjet.listeArbitreChaise;
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

        jLabel1.setText("Désignation de l'arbitre de chaise");

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
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
            {"", 0, "", false},
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
        for (int i=0;i<listeArbitreChaise.size();i++){
            Arbitre tmp;
            tmp = TestProjet.listeArbitreChaise.get(index);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton1)
                .addGap(63, 63, 63)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton1)) {
            JPanel panneau = new PanneauInserer4(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton2)) {
            for (int i=0;i<listeArbitreChaise.size();i++){
                boolean isChecked = (Boolean) jTable1.getValueAt(i,3);
                Boolean newliste;
                Object id = jTable1.getValueAt(i,1);
                    if (isChecked){
                        newliste = listechaisechoisi.add(id);
                        }
                }            
            PanneauInserer3.listelignechoisi.addAll(listechaisechoisi);
            PanneauInserer.inserermatch.listearbitre = PanneauInserer3.listelignechoisi;
            System.out.println("Liste ID arbitre ligne + filet + chaise choisi " + PanneauInserer.inserermatch.getListearbitre());
            JPanel panneau = new PanneauInserer6(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
