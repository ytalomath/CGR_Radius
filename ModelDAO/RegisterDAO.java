package ModelDAO;

import Conexao.ConnectionDAO;
import static Helper.HelperClear.clearRegister;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static View.Add.*;

public class RegisterDAO {

    // Metodo para adicionar um novo usuário no banco
    public static void registerLogin(String user, String pass, String vel) {

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        try {

            stmt = c.prepareStatement("INSERT INTO radcheck (username,value)VALUES (?,?)");
            stmt.setString(1, user);
            stmt.setString(2, pass);
            int rowsAffected = stmt.executeUpdate();

            stmt1 = c.prepareStatement("INSERT INTO radusergroup (username,groupname)VALUES (?,?)");
            stmt1.setString(1, user);
            stmt1.setString(2, vel);
            int rowsAffected1 = stmt1.executeUpdate();

            if (rowsAffected > 0 && rowsAffected1 > 0) {
                jTextoAdd.setText("Login entered successfully!");
                clearRegister();
            } else {
                jTextoAdd.setText("Login not entered!");
                clearRegister();
            }
        } catch (SQLException e) {
            jTextoAdd.setText("Username already existing in the database!");
            clearRegister();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (stmt1 != null) {
                    stmt1.close();
                }
                if (c != null) {
                    c.close();
                }

            } catch (SQLException e) {
                jTextoAdd.setText("Erro com a query!");
                clearRegister();
            } finally {
                ConnectionDAO.closeConnection(c);
            }

        }
    }
}
