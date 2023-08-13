package View;

import Conexao.ConnectionDAO;
import static Helper.HelperClear.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete extends javax.swing.JPanel {

    public Delete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPainel1 = new javax.swing.JPanel();
        txtLoginDelete = new javax.swing.JTextField();
        lblNumero5 = new javax.swing.JLabel();
        lblNumero6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextoDelete = new javax.swing.JLabel();
        jAttribute = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        CenterPainel1.setBackground(new java.awt.Color(145, 117, 199));
        CenterPainel1.setPreferredSize(new java.awt.Dimension(720, 520));
        CenterPainel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLoginDelete.setBackground(new java.awt.Color(225, 209, 255));
        txtLoginDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLoginDelete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoginDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CenterPainel1.add(txtLoginDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 169, -1));

        lblNumero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero5.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero5.setText("Login");
        CenterPainel1.add(lblNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        lblNumero6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero6.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero6.setText("Attribute");
        CenterPainel1.add(lblNumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CenterPainel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 122, 40));

        jTextoDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextoDelete.setForeground(new java.awt.Color(0, 0, 0));
        jTextoDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenterPainel1.add(jTextoDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 640, 50));

        jAttribute.setBackground(new java.awt.Color(225, 209, 255));
        jAttribute.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAttribute.setForeground(new java.awt.Color(0, 0, 0));
        jAttribute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IP /32", "POOL" }));
        jAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAttributeActionPerformed(evt);
            }
        });
        CenterPainel1.add(jAttribute, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 169, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Delete an existing rule.");
        CenterPainel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 630, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" it will be deleted from the database.");
        jLabel3.setToolTipText("");
        CenterPainel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 580, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-banco-de-dados-de-pesquisa-35.png"))); // NOI18N
        CenterPainel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" If the rule specified in the \"Attribute\" box exists for the given login,");
        jLabel4.setToolTipText("");
        CenterPainel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 580, -1));

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
        String login = txtLoginDelete.getText();

        Object plan = jAttribute.getSelectedItem();

        if (login.trim().length() == 0) {
            jTextoDelete.setText("Login field empty. Fill it out.");
            clearDelete();
            return;
        }

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + login + "'");
            rs = stmt.executeQuery();

            if (rs.next()) {

                if (plan.equals("IP /32")) {
                    deleteIP(login);
                } else if (plan.equals("POOL")) {
                    deletePool(login);
                }

            } else {
                jTextoDelete.setText("Login not found!");
                clearDelete();
            }

        } catch (SQLException e) {
            jTextoDelete.setText("Login não encontrado na base!");
            //Search.jTextoSearch.setText("Login não encontrado na base!");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jAttributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAttributeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAttributeActionPerformed

    public static void deleteIP(String login) {

        try {
            ModelDAO.ModifyDAO.deleteIP(login);
        } catch (SQLException ex) {

        }

    }

    public static void deletePool(String login) {

        try {
            ModelDAO.ModifyDAO.deletePool(login);
        } catch (SQLException ex) {

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPainel1;
    private javax.swing.JComboBox<String> jAttribute;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jTextoDelete;
    private javax.swing.JLabel lblNumero5;
    private javax.swing.JLabel lblNumero6;
    public static javax.swing.JTextField txtLoginDelete;
    // End of variables declaration//GEN-END:variables
}
