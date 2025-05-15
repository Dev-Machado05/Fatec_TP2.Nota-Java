package Pck_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {
    private Connection conexao;

    public Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // para MySQL 8+
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco", "root", "");
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
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class DAO_Main {

//     private final String server = "localhost";        // ou IP/hostname real
//     private final String database = "meu_banco";     // nome do BD
//     private final String tipo = "local";              // local ou remoto

//     private final String connStr;
//     private Connection conn;

//     public DAO_Main() {
//         String host = tipo.equals("local") ? "localhost" : server;
//         this.connStr = "jdbc:mysql://" + host + ":3306/" + database + "?noAccessToProcedureBodies=true&useSSL=false";
//     }

//     // Método para conectar ao banco
//     public Connection getConexao(String login, String senha) throws SQLException {
//         try {
//             conn = DriverManager.getConnection(connStr, login, senha);
//             System.out.println("Conectado com sucesso");
//             return conn;
//         } catch (SQLException e) {
//             throw new SQLException("Erro ao obter a conexão: " + e.getMessage(), e);
//         }
//     }

//     // Método para desconectar do banco
//     public void desconectar() {
//         try {
//             if (conn != null && !conn.isClosed()) {
//                 conn.close();
//                 System.out.println("Desconectado");
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }

//     // Métodos de operação no banco (exemplo de inserir, alterar, consultar)

//     // Exemplo de inserir cliente
//     public boolean inserirCliente(String nome, String endereco, String telefone, String cpf, double credito) {
//         String query = "INSERT INTO cliente (nome, endereco, telefone, cpf, credito) VALUES (?, ?, ?, ?, ?)";
//         try (PreparedStatement ps = conn.prepareStatement(query)) {
//             ps.setString(1, nome);
//             ps.setString(2, endereco);
//             ps.setString(3, telefone);
//             ps.setString(4, cpf);
//             ps.setDouble(5, credito);
//             int rowsAffected = ps.executeUpdate();
//             return rowsAffected > 0;  // Retorna true se a inserção for bem-sucedida
//         } catch (SQLException e) {
//             e.printStackTrace();
//             return false;
//         }
//     }

//     // Exemplo de consultar cliente
//     public ResultSet consultarCliente(String cpf) {
//         String query = "SELECT * FROM cliente WHERE cpf = ?";
//         try (PreparedStatement ps = conn.prepareStatement(query)) {
//             ps.setString(1, cpf);
//             return ps.executeQuery();
//         } catch (SQLException e) {
//             e.printStackTrace();
//             return null;
//         }
//     }

//     // Exemplo de atualizar cliente
//     public boolean alterarCliente(int codigo, String nome, String endereco, String telefone, String cpf, double credito) {
//         String query = "UPDATE cliente SET nome = ?, endereco = ?, telefone = ?, cpf = ?, credito = ? WHERE codigo = ?";
//         try (PreparedStatement ps = conn.prepareStatement(query)) {
//             ps.setString(1, nome);
//             ps.setString(2, endereco);
//             ps.setString(3, telefone);
//             ps.setString(4, cpf);
//             ps.setDouble(5, credito);
//             ps.setInt(6, codigo);
//             int rowsAffected = ps.executeUpdate();
//             return rowsAffected > 0;
//         } catch (SQLException e) {
//             e.printStackTrace();
//             return false;
//         }
//     }

//     // Exemplo de remover cliente
//     public boolean removerCliente(int codigo) {
//         String query = "DELETE FROM cliente WHERE codigo = ?";
//         try (PreparedStatement ps = conn.prepareStatement(query)) {
//             ps.setInt(1, codigo);
//             int rowsAffected = ps.executeUpdate();
//             return rowsAffected > 0;
//         } catch (SQLException e) {
//             e.printStackTrace();
//             return false;
//         }
//     }
// }

