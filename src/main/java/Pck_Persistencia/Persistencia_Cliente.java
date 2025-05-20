//package PCK_Persistencia;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import Pck_DAO.ConexaoMySql;// dao_main - conexaomysql
//import PCK_Model.Model_Cliente;
//
//public class Persistencia_Cliente {
//    CallableStatement objCall;
//    ConexaoMySql objConectar = new ConexaoMySql(); // <-- Conecta ao banco
//    PreparedStatement objPrepared;
//    ResultSet objResultSet;
//
//    public void inserirCliente(Model_Cliente objModel_Cliente) {
//        try {                                               //cada interrogacao e um campo
//            objCall = objConectar.getConexao().prepareCall("CALL PROC_InsCliente(?, ?, ?, ?, ?)");
//            objCall.setString(1, objModel_Cliente.getA01_nome());
//            objCall.setString(2, objModel_Cliente.getA01_endereco());
//            objCall.setString(3, objModel_Cliente.getA01_telefone());
//            objCall.setString(4, objModel_Cliente.getA01_cpf());
//            objCall.setFloat(5, objModel_Cliente.getA01_credito());
//            objCall.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            objConectar.desconectar();
//        }
//    }
//public void alterarCliente(Model_Cliente objModel_Cliente) {
//        try {
//            objCall = objConectar.getConexao().prepareCall("CALL PROC_AltCliente(?, ?, ?, ?, ?, ?)");
//            objCall.setInt(1, objModel_Cliente.getA01_codigo());
//            objCall.setString(2, objModel_Cliente.getA01_nome());
//            objCall.setString(3, objModel_Cliente.getA01_endereco());
//            objCall.setString(4, objModel_Cliente.getA01_telefone());
//            objCall.setString(5, objModel_Cliente.getA01_cpf());
//            objCall.setFloat(6, objModel_Cliente.getA01_credito());
//            objCall.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            objConectar.desconectar();
//        }
//    }
//
//    public void deletarCliente(int a01_codigo) {
//        try {
//            objCall = objConectar.getConexao().prepareCall("CALL PROC_DelCliente(?)");
//            objCall.setInt(1, a01_codigo);
//            objCall.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            objConectar.desconectar();
//        }
//    }
//
//}