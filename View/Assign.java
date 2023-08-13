package View;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static Helper.HelperClear.clearAssign;
import static View.View.*;

public class Assign extends javax.swing.JPanel {

    public Assign() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPainel1 = new javax.swing.JPanel();
        txtLoginAssign = new javax.swing.JTextField();
        lblNumero4 = new javax.swing.JLabel();
        lblNumero5 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        lblNumero6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextoAssign = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jAttribute = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        CenterPainel1.setBackground(new java.awt.Color(145, 117, 199));
        CenterPainel1.setPreferredSize(new java.awt.Dimension(720, 520));
        CenterPainel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLoginAssign.setBackground(new java.awt.Color(225, 209, 255));
        txtLoginAssign.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLoginAssign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoginAssign.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CenterPainel1.add(txtLoginAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 169, -1));

        lblNumero4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero4.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero4.setText("Value");
        CenterPainel1.add(lblNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        lblNumero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero5.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero5.setText("Login");
        CenterPainel1.add(lblNumero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        txtValue.setBackground(new java.awt.Color(225, 209, 255));
        txtValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });
        CenterPainel1.add(txtValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 169, -1));

        lblNumero6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero6.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero6.setText("Attribute");
        CenterPainel1.add(lblNumero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Assign");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CenterPainel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 122, 40));

        jTextoAssign.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextoAssign.setForeground(new java.awt.Color(0, 0, 0));
        jTextoAssign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenterPainel1.add(jTextoAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 640, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Otherwise, the rule will be created in the database.");
        CenterPainel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 650, -1));

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
        jLabel2.setText(" Add a static IP or a specific pool of IPs to the desired login.");
        CenterPainel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 630, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-banco-de-dados-de-pesquisa-35.png"))); // NOI18N
        CenterPainel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("If the login already has a fixed IP or IP pool rule, it will be updated.");
        CenterPainel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 650, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("If you want to delete an existing attribute,");
        jLabel5.setToolTipText("");
        CenterPainel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 290, -1));

        jButton3.setBackground(new java.awt.Color(85, 65, 118));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(" Click here.");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        CenterPainel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 70, 20));

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

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValueActionPerformed

    private void jAttributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAttributeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAttributeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String login = txtLoginAssign.getText();
        String value = txtValue.getText();

        Object plan = jAttribute.getSelectedItem();

        if (plan.equals("IP /32")) {
            try {
                alterIP(login, value);
            } catch (SQLException ex) {

            }
        } else if (plan.equals("POOL")) {
            try {
                alterPool(login, value);
            } catch (SQLException ex) {

            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Delete p2 = new Delete();
        p2.setSize(817, 643);
        p2.setLocation(0, 0);

        CenterPainel.removeAll();
        CenterPainel.add(p2);
        CenterPainel.revalidate();
        CenterPainel.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void alterIP(String login, String value) throws SQLException {

        if (value.trim().length() == 0) {
            jTextoAssign.setText("Value field empty. Fill it out.");
            clearAssign();
            return;
        } else {

            if (isValidIPAddress(value)) {

                if (login.trim().length() == 0) {
                    jTextoAssign.setText("Login field empty. Fill it out.");
                    clearAssign();
                    return;
                }
                ModelDAO.ModifyDAO.modifyIP(login, value);

            } else {
                jTextoAssign.setText("Invalid IP. Validate the syntax!");
                clearAssign();
                return;
            }
        }

    }

    public static void alterPool(String login, String value) throws SQLException {

        if (login.trim().length() == 0) {
            jTextoAssign.setText("Login field empty. Fill it out.");
            clearAssign();
            return;
        }

        if (value.trim().length() == 0) {
            jTextoAssign.setText("Value field empty. Fill it out.");
            clearAssign();
            return;
        }
        ModelDAO.ModifyDAO.modifyPool(login, value);
    }

    public static boolean isValidIPAddress(String ip) {
        // Padrão para validar endereço IP
        String ipPattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // Compila o padrão
        Pattern pattern = Pattern.compile(ipPattern);

        // Cria um Matcher para a string dada
        Matcher matcher = pattern.matcher(ip);

        // Verifica se o padrão corresponde à string
        return matcher.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPainel1;
    private javax.swing.JComboBox<String> jAttribute;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jTextoAssign;
    private javax.swing.JLabel lblNumero4;
    private javax.swing.JLabel lblNumero5;
    private javax.swing.JLabel lblNumero6;
    public static javax.swing.JTextField txtLoginAssign;
    public static javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
