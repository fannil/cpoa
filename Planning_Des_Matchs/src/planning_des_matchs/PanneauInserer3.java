package planning_des_matchs;

import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;
import java.awt.Component;
import java.sql.Connection;
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
    private static IArbitreDAO ArbitreDAO;
    private static DataSource dataSourceDAO;
    private static Connection connexionBD;
    //PanneauInserer2 panneau2 = new PanneauInserer2(fenetre);
    
    public PanneauInserer3(FenetreProjet fenetre) {
        listeArbitreLigne = ArbitreDAO.getArbitreLigne();
        this.fenetre = fenetre;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

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

        jButton3.setText("Mise à jour");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
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
    //JTable table = new JTable();
    /*OracleArbitreDAO oracle = new OracleArbitreDAO();
    listeArbitreLigne = oracle.getArbitreLigne();
    int nbrarbitre = listeArbitreLigne.size();*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object source = evt.getSource();
        if (source.equals(jButton3)){
            //System.out.println("ca marche je crois");
            //DefaultTableModel model = new DefaultTableModel(0,0);
            //jTable1.setModel(new Object[][]{"nom",1,"categorie",null}, String[]);
            //model.addRow(new Object[]{"nom",1,"categorie",null});
            /*
            TEST 1
            
            String nom = "Nil", categorie = "lol";
            int id = 2;
            JCheckBox choix = new JCheckBox();
            choix.setSelected(false);
            
            DefaultTableModel model = new DefaultTableModel(new String[] { "nom", "id", "categorie", "Choix"},0);
            jTable1.setModel(model);
            for (int count = 1; count <= 10; count++) {
                 model.addRow(new Object[]{ nom,id,categorie,choix});
            }
            */
            
            //TEST 2
            
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
            
            //TEST 3 liste de checkbox
            /*
            JCheckBox comboarbitre = new JCheckBox();
            comboarbitre.setSelected(false);
            this.add(comboarbitre);
            this.revalidate();
            fenetre.pack();
            this.setVisible(true);
            */
            
            // TEST 4
            
            /*for (int i=0;i<nbrarbitre;i++){
                Checkbox newcheckbox = new Checkbox();
                newcheckbox.setLabel("checkbox"+i);
                this.add(newcheckbox);
            }*/
            setTexts();
            }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void setTexts() {
        Arbitre tmp;
        tmp = listeArbitreLigne.get(index);
        jTextField1.setText(String.valueOf((tmp.getid())));
    }
    private static int index = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
