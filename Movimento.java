/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author wanghley
 */
public class Movimento extends javax.swing.JFrame {

    /**
     * Creates new form Movimento
     */
    float vm;
    public Movimento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDS = new javax.swing.JTextField();
        cbDS = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtDt = new javax.swing.JTextField();
        cbDT = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnCalcVM = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panVMedia = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblResultVM = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbtnDV = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDV = new javax.swing.JTextField();
        cbDV = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDT = new javax.swing.JTextField();
        cbDTA = new javax.swing.JComboBox<>();
        btnCalcA = new javax.swing.JButton();
        panAM = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblRA = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center><b>Movimento</b><br><b>Velocidade Média & Aceleração</br></center></html>");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 78, 78));
        jLabel2.setText("Velocidade Média");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setText("Distância total:");

        txtDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDSActionPerformed(evt);
            }
        });

        cbDS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "Hec", "Decam", "M", "Decim", "Cm", "Mm" }));

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jLabel4.setText("Tempo gasto:");

        cbDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "Min", "Seg" }));

        jLabel5.setText("<html><b>&Delta;v<br>---<br>&Delta;t</b></html>");
        jLabel5.setToolTipText("");

        btnCalcVM.setText("<html><center><b>Calcular<br>Vel. Média</b></center></html>");
        btnCalcVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcVMActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person.png"))); // NOI18N

        jLabel7.setText("Velocidade Média:");

        lblResultVM.setText("0");

        jLabel9.setText("<html><center>Utilizar Velocidade média<br>como Delta V em aceleração?</center></html>");

        tbtnDV.setText("SIM");
        tbtnDV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbtnDVStateChanged(evt);
            }
        });
        tbtnDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnDVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVMediaLayout = new javax.swing.GroupLayout(panVMedia);
        panVMedia.setLayout(panVMediaLayout);
        panVMediaLayout.setHorizontalGroup(
            panVMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVMediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultVM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(221, 221, 221))
            .addGroup(panVMediaLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtnDV)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panVMediaLayout.setVerticalGroup(
            panVMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVMediaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panVMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbtnDV)
                    .addGroup(panVMediaLayout.createSequentialGroup()
                        .addGroup(panVMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblResultVM))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Aceleração Média");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel10.setText("<html>Mudança total<br>da Velocidade:</html>");
        jLabel10.setToolTipText("");

        txtDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDVActionPerformed(evt);
            }
        });

        cbDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M/s" }));
        cbDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDVActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel11.setText("<html>Tempo total<br>do evento:</html>");

        cbDTA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "Min", "Seg" }));

        btnCalcA.setText("<html><center><b>Calcular<br>Aceleração</b></center></html>");
        btnCalcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcAActionPerformed(evt);
            }
        });

        jLabel12.setText("Aceleração Média:");

        lblRA.setText("0");

        javax.swing.GroupLayout panAMLayout = new javax.swing.GroupLayout(panAM);
        panAM.setLayout(panAMLayout);
        panAMLayout.setHorizontalGroup(
            panAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAMLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        panAMLayout.setVerticalGroup(
            panAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAMLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblRA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setText("<html><b>&Delta;s<br>---<br>&Delta;t</b></html>");
        jLabel14.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtDS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cbDS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cbDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(btnCalcVM, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(280, 280, 280)
                                        .addComponent(btnCalcA, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90)
                                                .addComponent(cbDTA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(362, 362, 362)
                                                .addComponent(cbDV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(190, 190, 190)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panVMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(panAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel3))
                                    .addComponent(txtDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(btnCalcVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDTA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(btnCalcA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(panVMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDSActionPerformed

    private void txtDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDVActionPerformed

    private void cbDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDVActionPerformed

    private void btnCalcVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcVMActionPerformed

        float dist = Float.parseFloat(txtDS.getText());
        float temp = Float.parseFloat(txtDt.getText());
        String unidDist = cbDS.getSelectedItem().toString();
        String unidTemp = cbDT.getSelectedItem().toString();
        
        operacoes.Vmtest(unidDist, unidTemp);
        vm = operacoes.Vm(dist, temp);
        lblResultVM.setText(vm+" Km/h");
    }//GEN-LAST:event_btnCalcVMActionPerformed

    private void tbtnDVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbtnDVStateChanged
     
    }//GEN-LAST:event_tbtnDVStateChanged

    private void tbtnDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnDVActionPerformed
        float AV = vm/3.6f;   
        txtDV.setText(Float.toString(AV));
    }//GEN-LAST:event_tbtnDVActionPerformed

    private void btnCalcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcAActionPerformed
        float variaVel = Float.parseFloat(txtDV.getText());
        float temp = Float.parseFloat(txtDT.getText());
        String dV = cbDV.getSelectedItem().toString();
        String dTA = cbDTA.getSelectedItem().toString();
        
        operacoes.Amtest(dV, dTA);
        float aM = operacoes.Am(variaVel, temp);
        lblRA.setText(aM+" M/s²");
        
    }//GEN-LAST:event_btnCalcAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcA;
    private javax.swing.JButton btnCalcVM;
    private javax.swing.JComboBox<String> cbDS;
    private javax.swing.JComboBox<String> cbDT;
    private javax.swing.JComboBox<String> cbDTA;
    private javax.swing.JComboBox<String> cbDV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblRA;
    private javax.swing.JLabel lblResultVM;
    private javax.swing.JPanel panAM;
    private javax.swing.JPanel panVMedia;
    private javax.swing.JToggleButton tbtnDV;
    private javax.swing.JTextField txtDS;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtDt;
    // End of variables declaration//GEN-END:variables
}
