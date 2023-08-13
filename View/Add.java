package View;

import ModelDAO.RegisterDAO;

public class Add extends javax.swing.JPanel {

    public Add() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPainel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        lblNumero4 = new javax.swing.JLabel();
        lblNumero5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblNumero6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextoAdd = new javax.swing.JLabel();
        jPlan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(145, 117, 199));

        CenterPainel1.setBackground(new java.awt.Color(145, 117, 199));
        CenterPainel1.setPreferredSize(new java.awt.Dimension(720, 520));
        CenterPainel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(225, 209, 255));
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CenterPainel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 169, -1));

        lblNumero4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero4.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero4.setText("Password");
        CenterPainel1.add(lblNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        lblNumero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero5.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero5.setText("Speed");
        CenterPainel1.add(lblNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        txtPass.setBackground(new java.awt.Color(225, 209, 255));
        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        CenterPainel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 169, -1));

        lblNumero6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero6.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero6.setText("User");
        CenterPainel1.add(lblNumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CenterPainel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 122, 40));

        jTextoAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextoAdd.setForeground(new java.awt.Color(0, 0, 0));
        jTextoAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenterPainel1.add(jTextoAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 125, 560, 50));

        jPlan.setBackground(new java.awt.Color(225, 209, 255));
        jPlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPlan.setForeground(new java.awt.Color(0, 0, 0));
        jPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10MB", "50MB", "100MB", "300MB", "600MB" }));
        jPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlanActionPerformed(evt);
            }
        });
        CenterPainel1.add(jPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 169, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("insertion is interrupted.");
        CenterPainel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 490, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add a PPPOE user to the authentication bank.");
        CenterPainel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 490, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Adds the attributes of a new database login. If there is already a");
        CenterPainel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 490, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("login with the same user, the user is informed and the process of");
        CenterPainel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 490, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-código-fonte-35.png"))); // NOI18N
        CenterPainel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-banco-de-dados-de-pesquisa-35.png"))); // NOI18N
        CenterPainel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CenterPainel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CenterPainel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void jPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPlanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        String user = txtUser.getText();
        String pass = txtPass.getText();

        String vel;

        Object plan = jPlan.getSelectedItem();

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

        if (user.trim().length() == 0) {
            jTextoAdd.setText("Username field empty. Fill it out.");
            return;
        }

        if (pass.trim().length() == 0) {
            jTextoAdd.setText("Password field empty. Fill it out.");
            return;
        }

        RegisterDAO.registerLogin(user, pass, vel);


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPainel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jPlan;
    public static javax.swing.JLabel jTextoAdd;
    private javax.swing.JLabel lblNumero4;
    private javax.swing.JLabel lblNumero5;
    private javax.swing.JLabel lblNumero6;
    public static javax.swing.JTextField txtPass;
    public static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
