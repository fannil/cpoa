package planning_des_matchs;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import planning.metier.Match;

public class PanneauModifier extends javax.swing.JPanel {
    private final FenetreProjet fenetre;
    public static List<Match> listeMatch;
    public String date,heure,type,court;
    public int id,index;
    
    public PanneauModifier(FenetreProjet fenetre) {
        this.fenetre = fenetre;
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

        jLabel1.setText("Liste des matchs prévus");

        /*Object[] columnNames = {"ID", "Date", "Heure", "Type","Court","Arbitre","Ramasseurs","Joueur","Choix"};
        Object[][] data = {
            {null, "", "", "", "", "", "", "", false},
            {null, "", "", "", "", "", "", "", false},
            {null, "", "", "", "", "", "", "", false},
            {null, "", "", "", "", "", "", "", false},
            {null, "", "", "", "", "", "", "", false},
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
                    case 2:
                    return String.class;
                    case 3:
                    return String.class;
                    case 4:
                    return String.class;
                    case 5:
                    return String.class;
                    case 6:
                    return String.class;
                    case 7:
                    return String.class;
                    default:
                    return Boolean.class;
                }
            }
        };
        index=0;
        for (int i=0;i<listeMatch.size();i++){
            Match tmp;
            tmp = TestProjet.listeMatch.get(index);

            id = Integer.valueOf(tmp.getId());
            date = String.valueOf(tmp.getDate());
            heure = String.valueOf(tmp.getHeure());
            type = String.valueOf(tmp.getType());

            jTable1.setValueAt(id,i,0);
            jTable1.setValueAt(date,i,1);
            jTable1.setValueAt(heure,i,2);
            jTable1.setValueAt(type,i,3);

            index = index+1;
        }*/
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Précédent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Suivant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jButton1)
                                .addGap(54, 54, 54)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object source = evt.getSource();
        if (source.equals(this.jButton1)) {
            this.fenetre.retourAccueil();
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
