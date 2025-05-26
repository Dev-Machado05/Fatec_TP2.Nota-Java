package Pck_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO_Main {
    private Connection conexao;
    private final String url = "jdbc:mysql://localhost:3306/notetp2";
    private final String user = "root";
    private final String password = "2511";

    public Connection getConexao() {
        try {// para MySQL 8+
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver
            return DriverManager.getConnection(url, user, password);//URL | Login | Senha
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Falha ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }

    public void desconectar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}