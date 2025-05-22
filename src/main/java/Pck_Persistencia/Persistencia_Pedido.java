package Pck_Persistencia;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Pck_DAO.DAO_Main;
import Pck_Model.Model_Pedido;


public class Persistencia_Pedido {
   CallableStatement objCall;
   DAO_Main objConectar = new DAO_Main(); // <-- Conecta ao banco
   PreparedStatement objPrepared;
   ResultSet objResultSet;

   public void inserirPedido(Model_Pedido objModel_Pedido) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_InsPedido(?, ?)");
           objCall.setString(1, objModel_Pedido.getA02_data());
           objCall.setFloat(2, objModel_Pedido.getA02_valorTotal());
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }
public void alterarPedido(Model_Pedido objModel_Pedido) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_AltPedido(?, ?, ?)");
           objCall.setInt(1, objModel_Pedido.getA02_numero());
           objCall.setString(2, objModel_Pedido.getA02_data());
           objCall.setFloat(3, objModel_Pedido.getA02_valorTotal());
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }

   public void deletarPedido(int a02_numero) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_DelPedido(?)");
           objCall.setInt(1, a02_numero);
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }

}