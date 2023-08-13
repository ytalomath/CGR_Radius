package ModelDAO;

import Conexao.ConnectionDAO;
import static Helper.HelperClear.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static View.Assign.*;
import static View.Delete.*;

public class ModifyDAO {

    // Metodo que adiciona ou altera as regras de IP fixo
    public static void modifyIP(String username, String value) throws SQLException {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;

        ResultSet rs = null;

        // Valida se o login inserido pelo usuário existe na tabela radreply, responsável pelas regras de IP 
        try {
            stmt = c.prepareStatement("SELECT * FROM radreply WHERE username ='" + username + "' AND attribute ='Framed-IP-Address'");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            jTextoAssign.setText("Login not found!");
            clearAssign();
        }

        // Caso o login exista, o programa avança para as verificações
        if (rs.next()) {

            // Caso já tenha uma regra de IP na tabela, ele atualiza com a informação do novo IP
            try {
                stmt1 = c.prepareStatement("UPDATE radreply SET value ='" + value + "' WHERE username ='" + username + "' AND attribute = 'Framed-IP-Address';");
                int rowsAffected = stmt1.executeUpdate();

                if (rowsAffected > 0) {
                    jTextoAssign.setText("Attribute updated successfully!");
                    clearAssign();
                } else {
                    jTextoAssign.setText("Error adding attribute!");
                    clearAssign();
                }

            } catch (SQLException e) {
                jTextoAssign.setText("Login not!");
                clearAssign();
            }

        } else {

            // Caso não exista uma regra de IP para o usuário informado, ele valida se o login existe na tabela radcheck
            try {
                stmt3 = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + username + "'");
                rs = stmt3.executeQuery();

                if (rs.next()) {

                    // Caso o usuário exista na tabela radcheck mas não possua uma regra de IP já criada, é inserido aqui
                    try {
                        stmt2 = c.prepareStatement("INSERT INTO radreply(username,attribute,value)VALUES (?,?,?)");
                        stmt2.setString(1, username);
                        stmt2.setString(2, "Framed-IP-Address");
                        stmt2.setString(3, value);

                        int rowsAffected = stmt2.executeUpdate();

                        if (rowsAffected > 0) {
                            jTextoAssign.setText("Attribute entered successfully!");
                            clearAssign();
                        } else {
                            jTextoAssign.setText("Error adding attribute!");
                            clearAssign();
                        }

                    } catch (SQLException e) {
                        jTextoAssign.setText("Login");
                        clearAssign();
                    } finally {
                        ConnectionDAO.closeConnection(c, stmt);
                    }

                } else {

                    jTextoAssign.setText("Login not found in base!");
                    clearAssign();
                    return;

                }
            } catch (SQLException e) {
                jTextoAssign.setText("Login not!");
                clearAssign();
            } finally {
                ConnectionDAO.closeConnection(c, stmt);
            }

        }
    }

    // Metodo que adiciona ou altera as regras de Pool
    public static void modifyPool(String username, String value) throws SQLException {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;
        PreparedStatement stmt3 = null;

        ResultSet rs = null;

        // Valida se o login inserido pelo usuário existe na tabela radreply, responsável pelas regras de Pool
        try {
            stmt = c.prepareStatement("SELECT * FROM radreply WHERE username ='" + username + "' AND attribute ='Framed-Pool'");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            jTextoAssign.setText("Login not found in base!");
            clearAssign();
        }

        // Caso o login exista, o programa avança para as verificações
        if (rs.next()) {

            // Caso já tenha uma regra de Pool na tabela, ele atualiza com a informação do novo Pool
            try {
                stmt1 = c.prepareStatement("UPDATE radreply SET value ='" + value + "' WHERE username ='" + username + "'AND attribute = 'Framed-Pool';");
                int rowsAffected = stmt1.executeUpdate();

                if (rowsAffected > 0) {
                    jTextoAssign.setText("Attribute updated successfully!");
                    clearAssign();
                    return;
                } else {
                    jTextoAssign.setText("Error adding attribute!");
                    clearAssign();
                }

            } catch (SQLException e) {
                jTextoAssign.setText("Login not!");
                clearAssign();
            }

        } else {

            // Caso não exista uma regra de Pool para o usuário informado, ele valida se o login existe na tabela radcheck
            try {
                stmt3 = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + username + "'");
                rs = stmt3.executeQuery();

                if (rs.next()) {

                    // Caso o usuário exista na tabela radcheck mas não possua uma regra de Pool já criada, é inserido aqui
                    try {
                        stmt2 = c.prepareStatement("INSERT INTO radreply(username,attribute,value)VALUES (?,?,?)");
                        stmt2.setString(1, username);
                        stmt2.setString(2, "Framed-Pool");
                        stmt2.setString(3, value);

                        int rowsAffected = stmt2.executeUpdate();

                        if (rowsAffected > 0) {
                            jTextoAssign.setText("Attribute entered successfully!");
                            clearAssign();
                            return;
                        } else {
                            jTextoAssign.setText("Error adding attribute!");
                            clearAssign();
                        }

                    } catch (SQLException e) {
                        jTextoAssign.setText("Login");
                        clearAssign();
                    } finally {
                        ConnectionDAO.closeConnection(c, stmt);
                    }
                } else {

                    jTextoAssign.setText("Login not found in base!");
                    clearAssign();
                    return;
                }
            } catch (SQLException e) {
                jTextoAssign.setText("Login not!");
                clearAssign();
            } finally {
                ConnectionDAO.closeConnection(c, stmt);
            }

        }

    }

    // Metodo que apagar uma regra de IP fixo
    public static void deleteIP(String username) throws SQLException {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt3 = null;

        ResultSet rs = null;
        ResultSet rs1 = null;

        // Valida se o login inserido pelo usuário existe na tabela radreply, responsável pelas regras de IP fixo
        try {
            stmt = c.prepareStatement("SELECT * FROM radreply WHERE username ='" + username + "' AND attribute ='Framed-IP-Address';");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            jTextoDelete.setText("Login not found in base!");
            clearDelete();
            return;
        }

        // Caso o login exista, o programa avança para as verificações
        if (rs.next()) {

            // Caso já tenha uma regra de IP na tabela para o login informado, o programa deleta esta regra
            try {
                stmt1 = c.prepareStatement("DELETE FROM radreply WHERE username ='" + username + "'AND attribute = 'Framed-IP-Address';");
                int rowsAffected = stmt1.executeUpdate();

                if (rowsAffected > 0) {
                    jTextoDelete.setText("Attribute deleted successfully!");
                    clearDelete();
                    return;
                } else {
                    jTextoDelete.setText("Error deleting attribute!");
                    clearDelete();
                    return;
                }

            } catch (SQLException e) {
                jTextoDelete.setText("Login not found!");
                clearDelete();
            }

        } else {

            // Caso exista o login na base, porem sem a regra de IP fixo para ser apagada
            try {
                stmt3 = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + username + "';");
                rs1 = stmt3.executeQuery();

                if (rs1.next()) {
                    jTextoDelete.setText("Login existing in the base, but without the attribute!");
                    clearDelete();
                    return;
                }

            } catch (SQLException e) {
                jTextoDelete.setText("Login not!");
                clearDelete();
            } finally {
                ConnectionDAO.closeConnection(c, stmt);
            }
        }
    }

    public static void deletePool(String username) throws SQLException {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt3 = null;

        ResultSet rs = null;
        ResultSet rs1 = null;

        // Valida se o login inserido pelo usuário existe na tabela radreply, responsável pelas regras de Pool
        try {
            stmt = c.prepareStatement("SELECT * FROM radreply WHERE username ='" + username + "' AND attribute ='Framed-Pool';");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            jTextoDelete.setText("Login not found in base!");
            clearDelete();
            return;
        }

        // Caso o login exista, o programa avança para as verificações
        if (rs.next()) {

            // Caso tenha uma regra de Pool na tabela para o login informado, o programa deleta esta regra
            try {
                stmt1 = c.prepareStatement("DELETE FROM radreply WHERE username ='" + username + "'AND attribute = 'Framed-Pool';");
                int rowsAffected = stmt1.executeUpdate();

                if (rowsAffected > 0) {
                    jTextoDelete.setText("Attribute deleted successfully!");
                    clearDelete();
                    ConnectionDAO.closeConnection(c);
                    return;
                } else {
                    jTextoDelete.setText("Error deleting attribute!");
                    clearDelete();
                    ConnectionDAO.closeConnection(c);
                    return;
                }

            } catch (SQLException e) {
                jTextoDelete.setText("Login not found!");
                clearDelete();
                ConnectionDAO.closeConnection(c);
            }

        } else {

            // Caso exista o login na base, porem sem a regra de Pool para ser apagada
            try {
                stmt3 = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + username + "';");
                rs1 = stmt3.executeQuery();

                if (rs1.next()) {
                    jTextoDelete.setText("Login existing in the base, but without the attribute!");
                    clearDelete();
                    ConnectionDAO.closeConnection(c);
                    return;
                }

            } catch (SQLException e) {
                jTextoDelete.setText("Login not!");
                clearDelete();
            } finally {
                ConnectionDAO.closeConnection(c);
            }
        }
    }
}
