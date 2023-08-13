package View;

import java.sql.SQLException;

public class Speed extends javax.swing.JPanel {

    public Speed() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPainel1 = new javax.swing.JPanel();
        txtLoginSpeed = new javax.swing.JTextField();
        lblNumero5 = new javax.swing.JLabel();
        lblNumero6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextoSpeed = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPlan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        CenterPainel1.setBackground(new java.awt.Color(145, 117, 199));
        CenterPainel1.setPreferredSize(new java.awt.Dimension(720, 520));
        CenterPainel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLoginSpeed.setBackground(new java.awt.Color(225, 209, 255));
        txtLoginSpeed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLoginSpeed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoginSpeed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CenterPainel1.add(txtLoginSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 169, -1));

        lblNumero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero5.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero5.setText("Login");
        CenterPainel1.add(lblNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        lblNumero6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero6.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero6.setText("New speed");
        CenterPainel1.add(lblNumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Alter");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CenterPainel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 122, 40));

        jTextoSpeed.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextoSpeed.setForeground(new java.awt.Color(0, 0, 0));
        jTextoSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenterPainel1.add(jTextoSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 640, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Increase or decrease the speed linked to a login.");
        CenterPainel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 630, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-banco-de-dados-de-pesquisa-35.png"))); // NOI18N
        CenterPainel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select speed and change the speed assigned to a login.");
        jLabel4.setToolTipText("");
        CenterPainel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 580, -1));

        jPlan.setBackground(new java.awt.Color(225, 209, 255));
        jPlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPlan.setForeground(new java.awt.Color(0, 0, 0));
        jPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10MB", "50MB", "100MB", "300MB", "600MB" }));
        jPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlanActionPerformed(evt);
            }
        });
        CenterPainel1.add(jPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 169, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("If the login does not exist in the database or the chosen speed is already the current login speed, ");
        jLabel5.setToolTipText("");
        CenterPainel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 650, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("the user will be alerted about.");
        jLabel6.setToolTipText("");
        CenterPainel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 580, -1));

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
        String login = txtLoginSpeed.getText();

        Object plan = jPlan.getSelectedItem();

        String vel;

        if (plan.equals("10MB")) {
            vel = "10MB";
        } else if (plan.equals("50MB")) {
            vel = "50MB";
        } else if (plan.equals("100MB")) {
            vel = "100MB";
        } else if (plan.equals("300MB")) {
            vel = "300MB";
        } else {
            vel = "600MB";
        }

        if (login.trim().length() == 0) {
            jTextoSpeed.setText("Login field empty. Fill it out.");
            return;
        }

        try {
            ModelDAO.SpeedDAO.alterSpeed(login, vel);
        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPlanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPainel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jPlan;
    public static javax.swing.JLabel jTextoSpeed;
    private javax.swing.JLabel lblNumero5;
    private javax.swing.JLabel lblNumero6;
    public static javax.swing.JTextField txtLoginSpeed;
    // End of variables declaration//GEN-END:variables
}
