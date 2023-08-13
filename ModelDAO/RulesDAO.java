package ModelDAO;

import Conexao.ConnectionDAO;
import Model.*;
import static View.AttributeSearch.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RulesDAO {
    
    // Metodo que liste todas as regras da tabela radreply
    public static ArrayList<Rules> listarRules(String login) throws SQLException {

        ArrayList<Rules> listaRules = new ArrayList<>();

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = c.prepareStatement("SELECT * FROM radreply WHERE username ='" + login + "'");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Rules rules = new Rules();

                rules.setAttribute(rs.getString("ATTRIBUTE"));
                rules.setValue(rs.getString("VALUE"));

                listaRules.add(rules);

            }

        } catch (SQLException e) {
            jTextoSearch.setText("Login não encontrado na base!");
        } finally {
            ConnectionDAO.closeConnection(c, stmt);
        }
        return listaRules;

    }

}
