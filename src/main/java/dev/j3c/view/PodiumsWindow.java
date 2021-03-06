
package dev.j3c.view;

import dev.j3c.domain.Podium;
import java.util.List;

public class PodiumsWindow extends javax.swing.JFrame {

    List<Podium> podiumsFullList;
    
    public PodiumsWindow(List<Podium> podiumsFullList) {
        initComponents();
        this.podiumsFullList = podiumsFullList;
        this.configWindow();
        this.setupPodiumsHistory();
    }
    
    private void configWindow(){
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null); 
    }

    public void setupPodiumsHistory(){
        String listaPodiums = "";
        int i = 0;
        for(Podium pd : podiumsFullList){
            listaPodiums += "Primer puesto: " + pd.getListaGanadores()[i].getName() + " " + pd.getListaGanadores()[i].getNationality()+ "\n";
            i++;
            listaPodiums += "Segundo puesto: " + pd.getListaGanadores()[i].getName() + " " + pd.getListaGanadores()[i].getNationality() + "\n";
            i++;
            listaPodiums += "Tercer puesto: " + pd.getListaGanadores()[i].getName() + " " + pd.getListaGanadores()[i].getNationality() + "\n";
            i = 0;
            listaPodiums += "\n\n";
        }
        this.jTextAreaPodiumsHistory.setText(listaPodiums);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPodiumsHistory = new javax.swing.JTextArea();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 219, 250));

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        jLabel1.setText("Historial de Podios");

        jTextAreaPodiumsHistory.setEditable(false);
        jTextAreaPodiumsHistory.setBackground(new java.awt.Color(250, 235, 224));
        jTextAreaPodiumsHistory.setColumns(20);
        jTextAreaPodiumsHistory.setFont(new java.awt.Font(".SF NS Text", 0, 15)); // NOI18N
        jTextAreaPodiumsHistory.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPodiumsHistory);

        jButtonClose.setFont(new java.awt.Font(".SF NS Text", 0, 15)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(0, 0, 0));
        jButtonClose.setText("Cerrar");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPodiumsHistory;
    // End of variables declaration//GEN-END:variables
}
