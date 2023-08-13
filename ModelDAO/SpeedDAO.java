package ModelDAO;

import Conexao.ConnectionDAO;
import static Helper.HelperClear.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static View.Speed.*;
import static View.Suspend.*;
import static View.RemoveSuspend.*;

public class SpeedDAO {

    // Metodo para alterar a velocidade atribuida a um login
    public static void alterSpeed(String username, String plan) throws SQLException {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;

        ResultSet rs = null;
        ResultSet rs1 = null;

        // Valida se o usuário existe na tabela radcheck
        try {
            stmt = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + username + "'");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            jTextoSpeed.setText("Login not found in base!");
            clearSpeed();
            return;
        }

        // Existindo, ele avança para verificar se a atual velocidade atribuida ao login é a mesma solicitada para alteração
        if (rs.next()) {

            // Faz a verificação para identificar se é mesma velocidade da troca
            try {
                stmt1 = c.prepareStatement("SELECT * FROM radusergroup WHERE username ='" + username + "'AND groupname = '" + plan + "';");
                rs = stmt1.executeQuery();

                // Sendo a mesma, ele informa ao usuário e sai do metodo
                if (rs.next()) {
                    jTextoSpeed.setText("Login already has the chosen speed!");
                    clearSpeed();
                    return;
                } // Não sendo, ele faz a atualização da velocidade
                else {

                    stmt3 = c.prepareStatement("UPDATE radusergroup SET groupname = '" + plan + "' WHERE username='" + username + "';");
                    int rows = stmt3.executeUpdate();

                    if (rows > 0) {
                        jTextoSpeed.setText("Speed changed sucessfully!");
                        clearSpeed();
                        return;
                    } else {
                        System.out.println("Erro");
                    }

                }
            } catch (SQLException e) {
                System.out.println(e);
                jTextoSpeed.setText("Erro!");
                clearSpeed();

            }
        } else {
            jTextoSpeed.setText("Login not found in base!");
            clearSpeed();
        }
    }

    // Metodo para atribuir uma suspensão a um login
    public static void suspendSpeed(String username) throws SQLException {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;
        PreparedStatement stmt4 = null;
        PreparedStatement stmt5 = null;
        PreparedStatement stmt6 = null;
        PreparedStatement stmt7 = null;

        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ResultSet rs4 = null;
        ResultSet rs5 = null;

        // Valida se o usuário existe na tabela radcheck
        try {
            stmt = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + username + "'");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            jTextoSuspend.setText("Login not found in base!");
            clearSuspend();
            return;
        }

        // Existindo, ele avança para verificar se já existe uma suspensão para aquele login
        if (rs.next()) {

            // Verifica se já existe uma suspensão atribuida para aquele login
            try {

                stmt1 = c.prepareStatement("SELECT * FROM radreply WHERE username ='" + username + "' AND attribute ='Mikrotik-Rate-Limit';");
                rs1 = stmt1.executeQuery();

                // Se não tiver, ele adiciona as regras de suspensão ao login inserido pelo usuário
                if (!rs1.next()) {

                    try {
                        stmt1 = c.prepareStatement("INSERT INTO radreply (username,attribute,value) VALUES (?,?,?)");
                        stmt1.setString(1, username);
                        stmt1.setString(2, "Mikrotik-Rate-Limit");
                        stmt1.setString(3, "128k/128k");
                        int num1 = stmt1.executeUpdate();

                        stmt1 = c.prepareStatement("INSERT INTO radreply (username,attribute,value) VALUES (?,?,?)");
                        stmt1.setString(1, username);
                        stmt1.setString(2, "Huawei-Qos-Profile-Name");
                        stmt1.setString(3, "128k");
                        num1 += stmt1.executeUpdate();

                        stmt1 = c.prepareStatement("INSERT INTO radreply (username,attribute,value) VALUES (?,?,?)");
                        stmt1.setString(1, username);
                        stmt1.setString(2, "Huawei-Down-Qos-Profile-Name");
                        stmt1.setString(3, "128k");
                        num1 += stmt1.executeUpdate();

                        stmt1 = c.prepareStatement("INSERT INTO radreply (username,attribute,value) VALUES (?,?,?)");
                        stmt1.setString(1, username);
                        stmt1.setString(2, "ERX-Ingress-Policy-Name");
                        stmt1.setString(3, "in-128k-residencial");
                        num1 += stmt1.executeUpdate();

                        stmt1 = c.prepareStatement("INSERT INTO radreply (username,attribute,value) VALUES (?,?,?)");
                        stmt1.setString(1, username);
                        stmt1.setString(2, "ERX-Egress-Policy-Name");
                        stmt1.setString(3, "out-128k-residencial");
                        num1 += stmt1.executeUpdate();

                        if (num1 > 0) {
                            jTextoSuspend.setText("Successfully added attribute!");
                            clearSuspend();
                            return;
                        } else {

                            jTextoSuspend.setText("Erro!");

                        }
                    } catch (SQLException e) {
                        System.out.println(e);
                        jTextoSuspend.setText("Erro nas queries!");
                        clearSuspend();

                    }
                } // Se já tiver o atributo de suspensão, é informado ao usuário
                else {
                    jTextoSuspend.setText("Login already has suspend attribute!");
                    clearSuspend();
                    return;
                }

            } catch (SQLException e) {
                System.out.println(e);
                jTextoSuspend.setText("Erro nas queries!");
                clearSuspend();

            }
        } // Se o login não existir na tabela, o usuário é informado
        else {
            jTextoSuspend.setText("Login not found in base!");
            clearSuspend();
        }
    }

    //Metodo para remover o atributo de suspensão de um determinado login
    public static void removeSuspend(String username) throws SQLException {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;
        PreparedStatement stmt4 = null;
        PreparedStatement stmt5 = null;
        PreparedStatement stmt6 = null;
        PreparedStatement stmt7 = null;

        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ResultSet rs4 = null;
        ResultSet rs5 = null;

        // Valida se o usuário existe na tabela radcheck
        try {
            stmt = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + username + "'");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            jTextoRemoveSuspend.setText("Login not found in base!");
            clearRemoveSuspend();
            return;
        }

        // Existindo, ele avança para verificar se existe uma suspensão para aquele login
        if (rs.next()) {

            // Verifica se existe uma suspensão ou não
            try {
                stmt1 = c.prepareStatement("SELECT * FROM radreply WHERE username ='" + username + "' AND attribute ='Mikrotik-Rate-Limit';");
                rs1 = stmt1.executeQuery();

                // Se existir, ele remove todas os atributos de suspensão atrelados ao login informado pelo usuário
                if (rs1.next()) {

                    try {
                        stmt1 = c.prepareStatement("DELETE FROM radreply WHERE username='" + username + "' AND attribute = 'Mikrotik-Rate-Limit';");
                        int num1 = stmt1.executeUpdate();

                        stmt2 = c.prepareStatement("DELETE FROM radreply WHERE username='" + username + "' AND attribute = 'Huawei-Qos-Profile-Name';");
                        num1 += stmt2.executeUpdate();

                        stmt3 = c.prepareStatement("DELETE FROM radreply WHERE username='" + username + "' AND attribute = 'Huawei-Down-Qos-Profile-Name';");
                        num1 += stmt3.executeUpdate();

                        stmt4 = c.prepareStatement("DELETE FROM radreply WHERE username='" + username + "' AND attribute = 'ERX-Ingress-Policy-Name';");
                        num1 += stmt4.executeUpdate();

                        stmt5 = c.prepareStatement("DELETE FROM radreply WHERE username='" + username + "' AND attribute = 'ERX-Egress-Policy-Name';");
                        num1 += stmt5.executeUpdate();

                        if (num1 > 0) {
                            jTextoRemoveSuspend.setText("Attributes removed successfully!");
                            clearRemoveSuspend();
                            ConnectionDAO.closeConnection(c);
                            return;
                        } else {

                            jTextoRemoveSuspend.setText("Erro!");

                        }
                    } catch (SQLException e) {
                        System.out.println(e);
                        jTextoRemoveSuspend.setText("Erro nas queries!");
                        clearRemoveSuspend();

                    }
                } // Se não existir atributos de suspensão para aquele login, o usuário é informado
                else {
                    jTextoRemoveSuspend.setText("Login has no suspend attributes bound to it!");
                    clearRemoveSuspend();
                    ConnectionDAO.closeConnection(c);
                    return;
                }

            } catch (SQLException e) {
                System.out.println(e);
                jTextoRemoveSuspend.setText("Erro nas queries!");
                clearRemoveSuspend();
            }
        } // Se o login não existir no banco, o usuário também é informado.
        else {
            jTextoRemoveSuspend.setText("Login not found in base!");
            clearRemoveSuspend();
            ConnectionDAO.closeConnection(c);

        }

    }
}
