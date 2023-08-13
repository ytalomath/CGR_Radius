package ModelDAO;

import java.util.ArrayList;
import Model.User;
import Conexao.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserDAO {

    public UserDAO() {

    }

    // Metodo para listar os dados de autenticação de um login especifico
    public static ArrayList<User> listarUser(String login) throws SQLException {

        ArrayList<User> listaUser = new ArrayList<>();

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = c.prepareStatement("SELECT * FROM radcheck WHERE username ='" + login + "'");
            rs = stmt.executeQuery();

            while (rs.next()) {

                User user = new User();

                user.setUsername(rs.getString("USERNAME"));
                user.setAttribute(rs.getString("ATTRIBUTE"));
                user.setOp(rs.getString("OP"));
                user.setValue(rs.getString("Value"));

                listaUser.add(user);

            }

        } catch (SQLException e) {
        } finally {
            ConnectionDAO.closeConnection(c, stmt);
        }
        return listaUser;
    }

}
