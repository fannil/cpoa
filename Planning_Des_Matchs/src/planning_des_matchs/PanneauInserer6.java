package planning_des_matchs;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import planning.metier.Ramasseur;

public class PanneauInserer6 extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    private static List<Ramasseur> listeRamasseurE1;
    private static List<Ramasseur> listeRamasseurE2;
    private static List listeramasseure1choisi = new ArrayList();
    private static List listeramasseure2choisi = new ArrayList();
    private static int id,num,index;
    private static boolean choix;
    
    public PanneauInserer6(FenetreProjet fenetre) {
        listeRamasseurE1 = TestProjet.listeRamasseurE1;
        listeRamasseurE2 = TestProjet.listeRamasseurE2;
        this.fenetre = fenetre;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Désignation des ramasseurs de balles");

        jLabel2.setText("Equipe 1 : 6 ramasseurs");

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
        Object[] columnNames = {"ID", "Equipe", "Boolean"};
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
                    return Integer.class;
                    default:
                    return Boolean.class;
                }
            }
        };
        index=0;
        for (int i=0;i<listeRamasseurE1.size();i++){
            Ramasseur tmp;
            tmp = TestProjet.listeRamasseurE1.get(index);
            id = Integer.valueOf(tmp.getIdramasseur());
            num = Integer.valueOf(tmp.getNumequipe());
            choix = false;
            jTable1.setValueAt(id,i,0);
            jTable1.setValueAt(num,i,1);
            jTable1.setValueAt(choix,i,2);
            index = index+1;
        }
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Equipe 2 : 6 ramasseurs");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        DefaultTableModel model2 = new DefaultTableModel(data, columnNames);
        jTable2 = new JTable(model2) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return Integer.class;
                    case 1:
                    return Integer.class;
                    default:
                    return Boolean.class;
                }
            }
        };
        index=0;
        for (int i=0;i<listeRamasseurE2.size();i++){
            Ramasseur tmp;
            tmp = TestProjet.listeRamasseurE2.get(index);
            id = Integer.valueOf(tmp.getIdramasseur());
            num = Integer.valueOf(tmp.getNumequipe());
            choix = false;
            jTable2.setValueAt(id,i,0);
            jTable2.setValueAt(num,i,1);
            jTable2.setValueAt(choix,i,2);
            index = index+1;
        }
        jScrollPane2.setViewportView(jTable2);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton1)) {
            JPanel panneau = new PanneauInserer5(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton2)) {
            for (int i=0;i<listeRamasseurE1.size();i++){
                boolean isChecked = (Boolean) jTable1.getValueAt(i,2);
                Boolean newliste;
                Object id = jTable1.getValueAt(i,0);
                    if (isChecked){
                        newliste = listeramasseure1choisi.add(id);
                        }
                }
            for (int i=0;i<listeRamasseurE2.size();i++){
                boolean isChecked = (Boolean) jTable2.getValueAt(i,2);
                Boolean newliste;
                Object id = jTable2.getValueAt(i,0);
                    if (isChecked){
                        newliste = listeramasseure2choisi.add(id);
                        }
                }
            listeramasseure1choisi.addAll(listeramasseure2choisi);
            PanneauInserer.inserermatch.listeramasseur = listeramasseure1choisi;
            System.out.println("Liste ID ramasseurs de balles " + PanneauInserer.inserermatch.getListeramasseur());
            JPanel panneau = new PanneauInserer7(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
