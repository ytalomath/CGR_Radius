package ModelDAO;

import Conexao.ConnectionDAO;
import Model.Group;
import static View.AttributeSearch.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GroupDAO {
    
    // Metodo que lista o grupo atrelado a um login para exibição em uma tabela para o usuário
    public static ArrayList<Group> listarGroup(String login) throws SQLException {

        ArrayList<Group> listaGroup = new ArrayList<>();

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = c.prepareStatement("SELECT * FROM radusergroup WHERE username ='" + login + "'");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Group group = new Group();

                group.setGroup(rs.getString("GROUPNAME"));

                listaGroup.add(group);

            }

        } catch (SQLException e) {
            jTextoSearch.setText("Login não encontrado na base!");
            //Search.jTextoSearch.setText("Login não encontrado na base!");
        } finally {
            ConnectionDAO.closeConnection(c, stmt);
        }
        return listaGroup;
    }

}
