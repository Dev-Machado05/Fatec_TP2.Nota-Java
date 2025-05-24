package Pck_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO_Main {
    private Connection conexao;

    public Connection getConexao() {
        try {// para MySQL 8+
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_banco", "root", "");//URL | Login | Senha
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
        return conexao;
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