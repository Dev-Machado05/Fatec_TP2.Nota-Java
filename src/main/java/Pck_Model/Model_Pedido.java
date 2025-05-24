package Pck_Model;

public class Model_Pedido {
	
	private int 	a02_numero;
	private String 	a02_data;
	private float 	a02_valorTotal;
	private int 	a01_codigo_fk; // User code EX:0001
	//Import model_cliente?
	
	public Model_Pedido(float a02_valorTotal, int a01_codigo_fk) {
		super();
		this.setA02_valorTotal(a02_valorTotal);
		this.setA01_codigo(a01_codigo_fk);
	}

	public int getA02_numero() {
		return a02_numero;
	}
	public String getA02_data() {
		return a02_data;
	}
	public float getA02_valorTotal() {
		return a02_valorTotal;
	}
	public int getA01_codigo() {
		return a01_codigo_fk;
	}

	public void setA02_numero(int a02_numero) {
		this.a02_numero = a02_numero;
	}
	public void setA02_data(String a02_data) {
		this.a02_data = a02_data;
	}
	public void setA02_valorTotal(float a02_valorTotal) {
		this.a02_valorTotal = a02_valorTotal;
	}	
	public void setA01_codigo(int a01_codigo) {
		this.a01_codigo_fk = a01_codigo;
	}
}
