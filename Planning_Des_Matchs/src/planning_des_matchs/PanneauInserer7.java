package planning_des_matchs;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import planning.metier.Joueur;
import planning.metier.Ramasseur;

public class PanneauInserer7 extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    private static List<Joueur> listeJoueur;
    private static List listejoueurchoisi = new ArrayList();
    private static int id,index;
    private static String nom;
    private static boolean choix;
    
    public PanneauInserer7(FenetreProjet fenetre) {
        listeJoueur = TestProjet.listeJoueur;
        this.fenetre=fenetre;
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

        jLabel1.setText("Désignation des joueurs");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Object[] columnNames = {"ID", "Nom", "Boolean"};
        Object[][] data = {
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
            {0,"", false},
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable1 = new JTable(model) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return Integer.class;
                    case 1:
                    return String.class;
                    default:
                    return Boolean.class;
                }
            }
        };
        index=0;
        for (int i=0;i<listeJoueur.size();i++){
            Joueur tmp;
            tmp = TestProjet.listeJoueur.get(index);
            id = Integer.valueOf(tmp.getIdjoueur());
            nom = String.valueOf(tmp.getNomjoueur());
            choix = false;
            jTable1.setValueAt(id,i,0);
            jTable1.setValueAt(nom,i,1);
            jTable1.setValueAt(choix,i,2);
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
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton1)
                .addGap(60, 60, 60)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton1)) {
            JPanel panneau = new PanneauInserer6(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton2)) {
            for (int i=0;i<listeJoueur.size();i++){
                boolean isChecked = (Boolean) jTable1.getValueAt(i,2);
                Boolean newliste;
                Object id = jTable1.getValueAt(i,0);
                    if (isChecked){
                        newliste = listejoueurchoisi.add(id);
                        }
                }
            
            PanneauInserer.inserermatch.listejoueur = listejoueurchoisi;
            System.out.println("Liste ID joueurs " + PanneauInserer.inserermatch.getListejoueur());
            JPanel panneau = new PanneauInsererRecap(fenetre);
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
