package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDAO {
    
    //ATRIBUTOS PARA CONEX�O COM O BANCO DE DADOS, DRIVER, URL, USUARIO, SENHA
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "URL_BD";
    private static final String USER = "USER_BD";
    private static final String PASS = "PASSWORD_BD";
    
    //METODO PARA ESTABELECER CONEX�O COM O BANCO DE DADOS
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conex�o: ", e);
        }
    }
    
    //METODO PARA ENCERRAR A CONEX�O COM O BANCO DE DADOS
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //METODO REDUDANTE PARA ENCERRAR A CONEX�O COM O BANCO DE DADOS
    public static void closeConnection(Connection c, PreparedStatement stmt) {

        closeConnection(c);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //METODO REDUNDANTE PARA ENCERRAR A CONEX�O COM O BANCO DE DADOS
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
