package PCK_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO_Main {
    private Connection conexao;

    public Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // para MySQL 8+
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_banco", "root", "");
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