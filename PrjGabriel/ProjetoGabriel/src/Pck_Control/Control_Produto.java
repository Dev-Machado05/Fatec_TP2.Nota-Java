package Pck_Control;

import Pck_Model.Model_Produto;

public class Control_Produto extends Control_Main {

Model_Produto objModelProduto =  new Model_Produto();
//PersistenciaProduto objPersistenciaProduto = new PersistenciaProduto();

public void inserirProduto (String sDescricao, double dValor_unitario, int iEstoque) {
	objModelProduto.setA03_descricao(sDescricao);
	objModelProduto.setA03_valor_unitario(dValor_unitario);
	objModelProduto.setA03_estoque(iEstoque);
	            // objPersistenciaProduto.inserirProduto(objModelProduto);
}

public void atualizarProduto (int iCodigo_03, String sDescricao, double dValor_unitario, int iEstoque) {
	objModelProduto.setA03_codigo(iCodigo_03);
	objModelProduto.setA03_descricao(sDescricao);
	objModelProduto.setA03_valor_unitario(dValor_unitario);
	objModelProduto.setA03_estoque(iEstoque);
	// objPersistenciaProduto.atualizarProduto(objModelProduto);
}

public void removerProduto (int iCodigo_03) {
	objModelProduto.setA03_codigo(iCodigo_03);
	// objPersistenciaProduto.removerProduto(objModelProduto);
}
    
}
