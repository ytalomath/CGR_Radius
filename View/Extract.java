package View;

import Conexao.ConnectionDAO;
import Model.Authentication;
import ModelDAO.AuthenticationDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Extract extends javax.swing.JPanel {

    public Extract() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CenterPainel1 = new javax.swing.JPanel();
        lblNumero4 = new javax.swing.JLabel();
        txtLoginExtract = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextoExtract = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAuth = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        CenterPainel1.setBackground(new java.awt.Color(145, 117, 199));
        CenterPainel1.setPreferredSize(new java.awt.Dimension(720, 520));
        CenterPainel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero4.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero4.setText("Login");
        CenterPainel1.add(lblNumero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        txtLoginExtract.setBackground(new java.awt.Color(225, 209, 255));
        txtLoginExtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLoginExtract.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoginExtract.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLoginExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginExtractActionPerformed(evt);
            }
        });
        CenterPainel1.add(txtLoginExtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 169, -1));

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CenterPainel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 122, 50));

        jTextoExtract.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextoExtract.setForeground(new java.awt.Color(0, 0, 0));
        jTextoExtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenterPainel1.add(jTextoExtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 690, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("The table will display, if the login exists in the base, the data of the authentication sessions of the specific login.");
        CenterPainel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 750, -1));

        tblAuth.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblAuth.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "VLAN", "MAC", "GATEWAY", "START_SESSION", "END_SESSION"
            }
        ));
        tblAuth.setColumnSelectionAllowed(true);
        tblAuth.setRowHeight(23);
        jScrollPane2.setViewportView(tblAuth);
        tblAuth.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblAuth.getColumnModel().getColumnCount() > 0) {
            tblAuth.getColumnModel().getColumn(0).setMinWidth(120);
            tblAuth.getColumnModel().getColumn(0).setMaxWidth(210);
            tblAuth.getColumnModel().getColumn(0).setHeaderValue("IP");
            tblAuth.getColumnModel().getColumn(1).setMinWidth(30);
            tblAuth.getColumnModel().getColumn(1).setMaxWidth(70);
            tblAuth.getColumnModel().getColumn(1).setHeaderValue("VLAN");
            tblAuth.getColumnModel().getColumn(2).setMinWidth(140);
            tblAuth.getColumnModel().getColumn(2).setMaxWidth(220);
            tblAuth.getColumnModel().getColumn(2).setHeaderValue("MAC");
            tblAuth.getColumnModel().getColumn(3).setMinWidth(100);
            tblAuth.getColumnModel().getColumn(3).setMaxWidth(160);
            tblAuth.getColumnModel().getColumn(3).setHeaderValue("GATEWAY");
            tblAuth.getColumnModel().getColumn(4).setHeaderValue("START_SESSION");
            tblAuth.getColumnModel().getColumn(5).setHeaderValue("END_SESSION");
        }

        CenterPainel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 800, 270));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Search for the connection extract of a specific login.");
        jLabel2.setToolTipText("");
        CenterPainel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 510, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-banco-de-dados-de-pesquisa-35.png"))); // NOI18N
        CenterPainel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-código-fonte-35.png"))); // NOI18N
        CenterPainel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, -1, -1));

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
                .addComponent(CenterPainel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginExtractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginExtractActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String login = txtLoginExtract.getText();

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        if (login.equals("")) {
            jTextoExtract.setText("Empty login field. Necessary to fill.");

            Helper.HelperClear.clearTableExtract();

        } else {
            Helper.HelperClear.clearInputExtract();
            //Helper.HelperClear.clearLabel();
            Helper.HelperClear.clearTableExtract();
            try {
                stmt = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + login + "'");
                rs = stmt.executeQuery();

                if (rs.next()) {
                    jTextoExtract.setText("");
                    preencherTabelaAuthentication(login);

                    // Continue com a próxima etapa
                } else {

                    jTextoExtract.setText("Login not found in base!");

                    // Tome ação adequada ou exiba mensagem de erro
                }

                Helper.HelperClear.clearInputExtract();

            } catch (SQLException e) {

                jTextoExtract.setText("Login not found in base!");

                //Search.jTextoSearch.setText("Login não encontrado na base!");
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void preencherTabelaAuthentication(String login) {

        DefaultTableModel model = (DefaultTableModel) tblAuth.getModel();
        model.setNumRows(0);

        Object colunas[] = new Object[6];
        Authentication auth = new Authentication();

        ArrayList<Authentication> listaAuth = new ArrayList<Authentication>();

        try {
            listaAuth = AuthenticationDAO.listarAuthentication(login);
        } catch (SQLException ex) {
            jTextoExtract.setText("Login not found in base!");

        }

        for (int i = 0; i < listaAuth.size(); i++) {

            auth = listaAuth.get(i);
            colunas[0] = auth.getIp();
            colunas[1] = auth.getVlan();
            colunas[2] = auth.getMac();
            colunas[3] = auth.getGateway();
            colunas[4] = auth.getInicioSessao();
            if (auth.getFinalSessao() == null) {
                colunas[5] = "ONLINE";
            } else {
                colunas[5] = auth.getFinalSessao();
            }

            model.addRow(colunas);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPainel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel jTextoExtract;
    private javax.swing.JLabel lblNumero4;
    public static javax.swing.JTable tblAuth;
    public static javax.swing.JTextField txtLoginExtract;
    // End of variables declaration//GEN-END:variables
}
