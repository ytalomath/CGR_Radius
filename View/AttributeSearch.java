package View;

import Conexao.ConnectionDAO;
import Model.Attribute;
import Model.Group;
import Model.Rules;
import ModelDAO.AttributeDAO;
import ModelDAO.GroupDAO;
import ModelDAO.RulesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AttributeSearch extends javax.swing.JPanel {

    public AttributeSearch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CenterPainel1 = new javax.swing.JPanel();
        lblNumero4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextoSearch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAttribute = new javax.swing.JTable();
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

        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        CenterPainel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 169, -1));

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

        jTextoSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextoSearch.setForeground(new java.awt.Color(0, 0, 0));
        jTextoSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CenterPainel1.add(jTextoSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 690, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("The table will display, if the login exists in the base, the speed attributes and fixed IP rules/IP pool.");
        CenterPainel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 740, -1));

        tblAttribute.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblAttribute.setForeground(new java.awt.Color(0, 0, 0));
        tblAttribute.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Table", "Attribute", "Value"
            }
        ));
        tblAttribute.setGridColor(new java.awt.Color(122, 72, 221));
        tblAttribute.setRowHeight(23);
        jScrollPane1.setViewportView(tblAttribute);

        CenterPainel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 800, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search for attributes of a specific login.");
        CenterPainel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 430, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-banco-de-dados-de-pesquisa-35.png"))); // NOI18N
        CenterPainel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-código-fonte-35.png"))); // NOI18N
        CenterPainel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CenterPainel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CenterPainel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String login = txtLogin.getText();

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        if (login.equals("")) {
            jTextoSearch.setText("Empty login field. Necessary to fill.");
            Helper.HelperClear.clearTable();
            return;

        } else {
            Helper.HelperClear.clearInput();
            //Helper.HelperClear.clearLabel();
            Helper.HelperClear.clearTable();
            try {
                stmt = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + login + "'");
                rs = stmt.executeQuery();

                if (rs.next()) {

                    preencherTabelaAttribute(login);

                    // Continue com a próxima etapa
                } else {

                    jTextoSearch.setText("Login not found in base!");

                    // Tome ação adequada ou exiba mensagem de erro
                }

                Helper.HelperClear.clearInput();

            } catch (SQLException e) {

                jTextoSearch.setText("Login not found in base!");

                //Search.jTextoSearch.setText("Login não encontrado na base!");
            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    public static void preencherTabelaAttribute(String login) {

        String attribute = "";

        DefaultTableModel model = (DefaultTableModel) tblAttribute.getModel();
        model.setNumRows(0);

        Object colunas[] = new Object[3];
        Attribute attr = new Attribute();
        Group group = new Group();
        Rules rules = new Rules();

        ArrayList<Group> listaGroup = new ArrayList<Group>();
        ArrayList<Rules> listaRules = new ArrayList<Rules>();
        ArrayList<Attribute> listaAttribute = new ArrayList<Attribute>();

        try {
            listaGroup = GroupDAO.listarGroup(login);
        } catch (SQLException ex) {
            jTextoSearch.setText("Login not found in base!");
        }

        for (int i = 0; i < listaGroup.size(); i++) {

            group = listaGroup.get(i);
            colunas[0] = "radusergroup";
            colunas[1] = "groupname";
            colunas[2] = group.getGroup();
            attribute = group.getGroup();

            model.addRow(colunas);
        }

        try {
            listaRules = RulesDAO.listarRules(login);
        } catch (SQLException ex) {
            jTextoSearch.setText("Login not found in base!");
        }

        for (int i = 0; i < listaRules.size(); i++) {

            rules = listaRules.get(i);
            colunas[0] = "radreply";
            colunas[1] = rules.getAttribute();
            colunas[2] = rules.getValue();

            model.addRow(colunas);
        }

        try {
            listaAttribute = AttributeDAO.listarAttribute(attribute);
        } catch (SQLException ex) {
            jTextoSearch.setText("Login not found in base!");

        }

        for (int i = 0; i < listaAttribute.size(); i++) {

            attr = listaAttribute.get(i);
            colunas[0] = "radgroupreply";
            colunas[1] = attr.getAttribute();
            colunas[2] = attr.getValue();

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel jTextoSearch;
    private javax.swing.JLabel lblNumero4;
    public static javax.swing.JTable tblAttribute;
    public static javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
