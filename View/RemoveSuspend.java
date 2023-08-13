package View;

import java.sql.SQLException;

public class RemoveSuspend extends javax.swing.JPanel {

    public RemoveSuspend() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPainel1 = new javax.swing.JPanel();
        txtLoginRemoveSuspend = new javax.swing.JTextField();
        lblNumero5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextoRemoveSuspend = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        CenterPainel1.setBackground(new java.awt.Color(145, 117, 199));
        CenterPainel1.setPreferredSize(new java.awt.Dimension(720, 520));
        CenterPainel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLoginRemoveSuspend.setBackground(new java.awt.Color(225, 209, 255));
        txtLoginRemoveSuspend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLoginRemoveSuspend.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoginRemoveSuspend.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CenterPainel1.add(txtLoginRemoveSuspend, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 169, -1));

        lblNumero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero5.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero5.setText("Login");
        CenterPainel1.add(lblNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove");
        jButton2.setToolTipText("");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CenterPainel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 122, 40));

        jTextoRemoveSuspend.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextoRemoveSuspend.setForeground(new java.awt.Color(0, 0, 0));
        jTextoRemoveSuspend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenterPainel1.add(jTextoRemoveSuspend, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 640, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Remove the suspend attribute from a given login.");
        CenterPainel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 630, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-banco-de-dados-de-pesquisa-35.png"))); // NOI18N
        CenterPainel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inform the login in which the suspension attribute will be removed from the bank.");
        jLabel4.setToolTipText("");
        CenterPainel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 580, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("If the login does not exist in the database or does not have the attribute linked to the login,");
        jLabel5.setToolTipText("");
        CenterPainel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 620, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("the user will be alerted about.");
        jLabel7.setToolTipText("");
        CenterPainel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 580, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-código-fonte-35.png"))); // NOI18N
        CenterPainel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(CenterPainel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(CenterPainel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String login = txtLoginRemoveSuspend.getText();

        if (login.trim().length() == 0) {
            jTextoRemoveSuspend.setText("Login field empty. Fill it out.");
            return;
        }

        try {
            ModelDAO.SpeedDAO.removeSuspend(login);
        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPainel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jTextoRemoveSuspend;
    private javax.swing.JLabel lblNumero5;
    public static javax.swing.JTextField txtLoginRemoveSuspend;
    // End of variables declaration//GEN-END:variables
}
