package Pck_Persistencia;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Pck_DAO.DAO_Main;
import Pck_Model.Model_Cliente;

public class Persistencia_Cliente {
   CallableStatement objCall; // chama os procedimentos
   DAO_Main objConectar = new DAO_Main(); // <-- Conecta ao banco
   PreparedStatement objPrepared;
   ResultSet objResultSet;
   

   public void inserirCliente(Model_Cliente objModel_Cliente) {
       try {                                               //cada interrogacao e um campo
           objCall = objConectar.getConexao().prepareCall("CALL PROC_InsCliente(?, ?, ?, ?, ?)");
           objCall.setString(1, objModel_Cliente.getA01_nome());
           objCall.setString(2, objModel_Cliente.getA01_endereco());
           objCall.setString(3, objModel_Cliente.getA01_telefone());
           objCall.setString(4, objModel_Cliente.getA01_cpf());
           objCall.setString(5, objModel_Cliente.getA01_email());
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }
    public void alterarCliente(Model_Cliente objModel_Cliente) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_AltCliente(?, ?, ?, ?, ?, ?)");
           objCall.setInt(1, objModel_Cliente.getA01_codigo());
           objCall.setString(2, objModel_Cliente.getA01_nome());
           objCall.setString(3, objModel_Cliente.getA01_endereco());
           objCall.setString(4, objModel_Cliente.getA01_telefone());
           objCall.setString(5, objModel_Cliente.getA01_cpf());
           objCall.setString(6, objModel_Cliente.getA01_email());
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }

   public void deletarCliente(int a01_codigo) {
       try {
           objCall = objConectar.getConexao().prepareCall("CALL PROC_DelCliente(?)");
           objCall.setInt(1, a01_codigo);
           objCall.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           objConectar.desconectar();
       }
   }

   public Model_Cliente buscarCPF(String cpf) {
    Model_Cliente cliente = null;
    try {
        String sql = "SELECT * FROM CLIENTE_01 WHERE a01_cpf = ?";
        objPrepared = objConectar.getConexao().prepareStatement(sql);
        objPrepared.setString(1, cpf);
        objResultSet = objPrepared.executeQuery();
        
        //if (objResultSet.next()) {
        //    cliente = new Model_Cliente();
        //    cliente.setA01_codigo(objResultSet.getInt("a01_codigo"));
        //    cliente.setA01_nome(objResultSet.getString("a01_nome"));
        //    cliente.setA01_endereco(objResultSet.getString("a01_endereco"));
        //    cliente.setA01_telefone(objResultSet.getString("a01_telefone"));
        //    cliente.setA01_cpf(objResultSet.getString("a01_cpf"));
        //    cliente.setA01_credito(objResultSet.getFloat("a01_credito"));
//
        //}

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (objResultSet != null) objResultSet.close();
            if (objPrepared != null) objPrepared.close();
        } catch (SQLException e) {
        e.printStackTrace();
        }
        objConectar.desconectar();
    }
    return cliente;

   }

   /*public List<Model_Cliente> listarClientes() {
    List<Model_Cliente> listaClientes = new ArrayList<>();
    try {
        String sql = "SELECT * FROM CLIENTE_01";
        objPrepared = objConectar.getConexao().prepareStatement(sql);
        objResultSet = objPrepared.executeQuery();

        while (objResultSet.next()) {
            Model_Cliente cliente = new Model_Cliente();
            cliente.setA01_codigo(objResultSet.getInt("a01_codigo"));
            cliente.setA01_nome(objResultSet.getString("a01_nome"));
            cliente.setA01_endereco(objResultSet.getString("a01_endereco"));
            cliente.setA01_telefone(objResultSet.getString("a01_telefone"));
            cliente.setA01_cpf(objResultSet.getString("a01_cpf"));
            cliente.setA01_credito(objResultSet.getFloat("a01_credito"));
            listaClientes.add(cliente);
z
        }

    } catch (SQLException e) {
        e.printStackTrace();

    } finally {
        try {
            if (objResultSet != null) objResultSet.close();
            if (objPrepared != null) objPrepared.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        objConectar.desconectar();

    }
    return listaClientes;
    
   }*/

}