//package PCK_Persistencia;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import PCK_DAO.ConexaoMySql;
//import PCK_Model.Model_Item;
//
//
//
//public class Persistencia_Item {
//    CallableStatement objCall;
//    ConexaoMySql objConectar = new ConexaoMySql(); // <-- Conecta ao banco
//    PreparedStatement objPrepared;
//    ResultSet objResultSet;
//
//    public void inserirItem(Model_Item objModel_Item) {
//        try {
//            objCall = objConectar.getConexao().prepareCall("CALL PROC_InsItem(?, ?)");
//            objCall.setInt(1, objModel_Item.getA04_quantidade());
//            objCall.setFloat(2, objModel_Item.getA04_valoritem());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            objConectar.desconectar();
//        }
//    }
//public void alterarItem(Model_Item objModel_Item) {
//        try {
//            objCall = objConectar.getConexao().prepareCall("CALL PROC_AltItem(?, ?, ?)");
//            objCall.setInt(1, objModel_Item.getA04_codigo());
//            objCall.setInt(2, objModel_Item.getA04_quantidade());
//            objCall.setFloat(3, objModel_Item.getA04_valoritem());
//            objCall.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            objConectar.desconectar();
//        }
//    }
//
//    public void deletarItem(int a04_codigo) {
//        try {
//            objCall = objConectar.getConexao().prepareCall("CALL PROC_DelItem(?)");
//            objCall.setInt(1, a04_codigo);
//            objCall.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            objConectar.desconectar();
//        }
//    }

