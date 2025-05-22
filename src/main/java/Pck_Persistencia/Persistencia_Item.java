package Pck_Persistencia;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Pck_DAO.DAO_Main;
import Pck_Model.Model_Item;



public class Persistencia_Item {
   CallableStatement objCall;
   DAO_Main objConectar = new DAO_Main(); // <-- Conecta ao banco
   PreparedStatement objPrepared;
   ResultSet objResultSet;

   public void inserirItem(Model_Item objModel_Item) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_InsItem(?, ?)");
           objCall.setInt(1, objModel_Item.getA04_quantidade());
           objCall.setFloat(2, objModel_Item.getA04_valorItem());
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }
    public void alterarItem(Model_Item objModel_Item) {
        try {
            objCall = objConectar.getConexao().prepareCall("CALL PROC_AltItem(?, ?, ?)");
            objCall.setInt(1, objModel_Item.getA04_codigo());
            objCall.setInt(2, objModel_Item.getA04_quantidade());
            objCall.setFloat(3, objModel_Item.getA04_valorItem());
            objCall.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            objConectar.desconectar();
        }
    }

   public void deletarItem(int a04_codigo) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_DelItem(?)");
           objCall.setInt(1, a04_codigo);
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }
}

