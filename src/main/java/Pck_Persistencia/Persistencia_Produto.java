package Pck_Persistencia;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Pck_DAO.DAO_Main;
import Pck_Model.Model_Produto;


public class Persistencia_Produto {
   CallableStatement objCall;
   DAO_Main objConectar = new DAO_Main(); // <-- Conecta ao banco
   PreparedStatement objPrepared;
   ResultSet objResultSet;

   public void inserirProduto(Model_Produto objModel_Produto) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_InsProduto(?, ?, ?)");
           objCall.setString(1, objModel_Produto.getA03_nome());
           objCall.setFloat(3, objModel_Produto.getA03_valorUnitario());
           objCall.setInt(4, objModel_Produto.getA03_estoque());
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }
public void alterarProduto(Model_Produto objModel_Produto) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_AltProduto(?, ?, ?, ?)");
           objCall.setInt(1, objModel_Produto.getA03_codigo());
           objCall.setString(2, objModel_Produto.getA03_nome());
           objCall.setFloat(4, objModel_Produto.getA03_valorUnitario());
           objCall.setInt(5, objModel_Produto.getA03_estoque());
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }

   public void deletarProduto(int a03_codigo) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_DelProduto(?)");
           objCall.setInt(1, a03_codigo);
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }

}
