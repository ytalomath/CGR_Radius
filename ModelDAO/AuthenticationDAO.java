package ModelDAO;

import Conexao.ConnectionDAO;
import Model.*;
import static View.Extract.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuthenticationDAO {
    
    
    // Metodo que lista o historico de autenticação de um login para ser exibido em uma tabela para o usuário
    public static ArrayList<Authentication> listarAuthentication(String login) throws SQLException {

        ArrayList<Authentication> listaAuthentication = new ArrayList<>();

        Connection c = ConnectionDAO.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = c.prepareStatement("SELECT DISTINCT `framedipaddress`, `framedipv6address` , `nasportid` , `callingstationid` , "
                    + "`nasipaddress` , `acctstarttime` , `acctstoptime` "
                    + "FROM `radacct`"
                    + "WHERE `username` = '" + login + "'"
                    + "ORDER BY acctstarttime DESC;");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Authentication auth = new Authentication();

                auth.setIp(rs.getString("FRAMEDIPADDRESS"));
                auth.setIpv6(rs.getString("FRAMEDIPV6ADDRESS"));
                auth.setVlan(rs.getString("NASPORTID"));
                auth.setMac(rs.getString("CALLINGSTATIONID"));
                auth.setGateway(rs.getString("NASIPADDRESS"));
                auth.setInicioSessao(rs.getString("ACCTSTARTTIME"));
                auth.setFinalSessao(rs.getString("ACCTSTOPTIME"));

                listaAuthentication.add(auth);

            }

        } catch (SQLException e) {

            jTextoExtract.setText("Login não encontrado na base!");
            //Search.jTextoSearch.setText("Login não encontrado na base!");
        } finally {
            ConnectionDAO.closeConnection(c, stmt);
        }
        return listaAuthentication;
    }

}
