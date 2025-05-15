package Pck_Control;

import Pck_Model.Model_Pedido;


public class Control_Pedido extends Control_Main {
	
Model_Pedido objModelPedido = new Model_Pedido();
    	//PersistenciaPedido objPersistenciaPedido = new PersistenciaPedido();


public void inserirPedido (String sData, double dValor_total) {
	objModelPedido.setA02_data(sData);
	objModelPedido.setA02_valor_total(dValor_total);
	            // objPersistenciaPedido.inserirPedido(objModelPedido);

}

public void atualizarPedido (int iNumero_02, String sData, double dValor_total) {
	objModelPedido.setA02_numero(iNumero_02);
	objModelPedido.setA02_data(sData);
	objModelPedido.setA02_valor_total(dValor_total);
		            // objPersistenciaPedido.atualizarPedido(objModelPedido);

}

public void removerPedido (int iNumero_02) {
	objModelPedido.setA02_numero(iNumero_02);
		            // objPersistenciaPedido.removerPedido(objModelPedido);


}

}
