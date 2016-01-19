package planning_des_matchs;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;
import java.awt.Component;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
import javax.sql.DataSource;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import planning.metier.Match;
import planning.dao.oracle.*;
import javax.swing.table.DefaultTableModel;
import planning.dao.IArbitreDAO;
import planning.metier.Arbitre;

public class PanneauInserer3 extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    private static List<Arbitre> listeArbitreLigne;
    public static List listelignechoisi = new ArrayList();
    private static String nom,categorie;
    private static int id,index;
    private static boolean choix;
    //PanneauInserer2 panneau2 = new PanneauInserer2(fenetre);
    
    public PanneauInserer3(FenetreProjet fenetre) {
        this.fenetre = fenetre;        
        listeArbitreLigne = TestProjet.listeArbitreLigne;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jCheckBox1.setText("jCheckBox1");

        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("Désignation des arbitre de ligne");

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
        for (int i=0;i<listeArbitreLigne.size();i++){
            Arbitre tmp;

            tmp = TestProjet.listeArbitreLigne.get(index);
            nom = String.valueOf(tmp.getnom());
            id = Integer.valueOf(tmp.getid());
            categorie = String.valueOf(tmp.getcategorie());

            jTable1.setValueAt(nom,i,0);
            jTable1.setValueAt(id,i,1);
            jTable1.setValueAt(categorie,i,2);
            jTable1.setValueAt(choix,i,3);
            index = index+1;
        }
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jButton1)
                                .addGap(69, 69, 69)
                                .addComponent(jButton2)))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton1)) {
            JPanel panneau = new PanneauInserer2(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton2)) {
            for (int i=0;i<listeArbitreLigne.size();i++){
                boolean isChecked = (Boolean) jTable1.getValueAt(i,3);
                Boolean newliste;
                Object id = jTable1.getValueAt(i,1);
                    if (isChecked){
                        jTable1.setValueAt(true,i,3);
                        newliste = listelignechoisi.add(id);
                        }
                }
            PanneauInserer.inserermatch.listearbitre = listelignechoisi;
            System.out.println("Liste ID arbitre choisi " + PanneauInserer.inserermatch.getListearbitre());
            JPanel panneau = new PanneauInserer4(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
