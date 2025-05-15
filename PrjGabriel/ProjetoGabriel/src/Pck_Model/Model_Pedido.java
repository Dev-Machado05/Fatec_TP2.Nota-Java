package Pck_Model;

public class Model_Pedido {
	
	private int 	a02_numero;
	public Model_Pedido(float a02_valortotal, int a01_codigo_fk) {
		super();
		this.setA02_valortotal(a02_valortotal);
		this.setA01_codigo(a01_codigo_fk);;
	}
	private String 	a02_data;
	private float 	a02_valortotal;
	private int 	a01_codigo_fk; // User code EX:0001
	
	public int getA02_numero() {
		return a02_numero;
	}
	public void setA02_numero(int a02_numero) {
		this.a02_numero = a02_numero;
	}
	public String getA02_data() {
		return a02_data;
	}
	public void setA02_data(String a02_data) {
		this.a02_data = a02_data;
	}
	public float getA02_valortotal() {
		return a02_valortotal;
	}
	public void setA02_valortotal(float a02_valortotal) {
		this.a02_valortotal = a02_valortotal;
	}
	public int getA01_codigo() {
		return a01_codigo_fk;
	}
	public void setA01_codigo(int a01_codigo) {
		this.a01_codigo_fk = a01_codigo;
	}
	
}
