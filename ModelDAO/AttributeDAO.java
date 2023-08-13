package ModelDAO;

import Conexao.ConnectionDAO;
import Model.*;
import static View.AttributeSearch.jTextoSearch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AttributeDAO {

    // Metodo que lista os atributos para inserção na tabela que é exibida ao usuário
    public static ArrayList<Attribute> listarAttribute(String attribute) throws SQLException {

        ArrayList<Attribute> listaAttribute = new ArrayList<>();

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = c.prepareStatement("SELECT * FROM radgroupreply WHERE groupname ='" + attribute + "'");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Attribute attr = new Attribute();

                attr.setAttribute(rs.getString("ATTRIBUTE"));
                attr.setValue(rs.getString("VALUE"));

                listaAttribute.add(attr);

            }

        } catch (SQLException e) {
            jTextoSearch.setText("Login não encontrado na base!");
        } finally {
            ConnectionDAO.closeConnection(c, stmt);
        }
        return listaAttribute;
    }

}
