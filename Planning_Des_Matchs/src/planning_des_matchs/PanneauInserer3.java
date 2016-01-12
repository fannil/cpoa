package planning_des_matchs;

import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;
import java.awt.Component;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanneauInserer3 extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    //PanneauInserer2 panneau2 = new PanneauInserer2(fenetre);
    
    public PanneauInserer3(FenetreProjet fenetre) {
        this.fenetre = fenetre;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("Désignation des arbitre de ligne");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nom", "ID", "Catégorie", "Choix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName(""); // NOI18N
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }
        jTable1.getAccessibleContext().setAccessibleName("jTable1");
        jTable1.getAccessibleContext().setAccessibleDescription("jTable1");

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

        jButton3.setText("Mise à jour");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton1)
                        .addGap(69, 69, 69)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
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
            JPanel panneau = new PanneauInserer4(fenetre);
            this.fenetre.changerPanneau(panneau);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    JTable table = new JTable();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object source = evt.getSource();
        if (source.equals(jButton3)){
            System.out.println("ca marche je crois");
            //DefaultTableModel model = new DefaultTableModel(0,0);
            //jTable1.setModel(new Object[][]{"nom",1,"categorie",null}, String[]);
            //model.addRow(new Object[]{"nom",1,"categorie",null});
            String nom = "Nil", categorie = "lol";
            int id = 2;
            JCheckBox choix = new JCheckBox();
            choix.setSelected(false);
            
            DefaultTableModel model = new DefaultTableModel(new String[] { "nom", "id", "categorie", "Choix"},0);
            jTable1.setModel(model);
            for (int count = 1; count <= 10; count++) {
                 model.addRow(new Object[]{ nom,id,categorie,choix});
            }
            
            //new test
            /*Object[] columnNames = {"Type", "Company", "Shares", "Price", "Boolean"};
            Object[][] data = {
                {"Buy", "IBM", new Integer(1000), new Double(80.50), false},
                {"Sell", "MicroSoft", new Integer(2000), new Double(6.25), true},
                {"Sell", "Apple", new Integer(3000), new Double(7.35), true},
                {"Buy", "Nortel", new Integer(4000), new Double(20.00), false}
            };
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            table = new JTable(model) {

                @Override
                public Class getColumnClass(int column) {
                    switch (column) {
                        case 0:
                            return String.class;
                        case 1:
                            return String.class;
                        case 2:
                            return Integer.class;
                        case 3:
                            return Double.class;
                        default:
                            return Boolean.class;
                    }
                }
            };
            table.setPreferredScrollableViewportSize(table.getPreferredSize());
            JScrollPane scrollPane = new JScrollPane(table);
            //PanneauInserer3.add(scrollPane);
            fenetre.pack();*/
            }
        this.repaint();
        fenetre.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        // TODO add your handling code here:
        //jTable1.addRow(new Object[]{"nom",1,"categorie","null"});
        //Object source = evt.getSource();
        //JButton btu = panneau2.jButton2;
        //if (source.equals(btu)){
            //}

    }//GEN-LAST:event_jTable1InputMethodTextChanged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
