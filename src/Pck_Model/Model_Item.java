package Pck_Model;

public class Model_Item {
	
	private int		a04_codigo;
	private int		a03_numero_fk;
	private String	a03_codigo_fk;
	private int		a04_quantidade;
	
	public int getA04_codigo() {
		return a04_codigo;
	}
	public Model_Item(int a02_numero_fk, String a03_codigo_fk, int a04_quantidade) {
		super();
		this.setA02_numero_fk(a02_numero_fk);
		this.setA03_codigo_fk(a03_codigo_fk);
		this.setA04_quantidade(a04_quantidade);
	}
	public void setA04_codigo(int a04_codigo) {
		this.a04_codigo = a04_codigo;
	}
	public int getA03_numero_fk() {
		return a03_numero_fk;
	}
	public void setA02_numero_fk(int a03_numero_fk) {
		this.a03_numero_fk = a03_numero_fk;
	}
	public String getA03_codigo_fk() {
		return a03_codigo_fk;
	}
	public void setA03_codigo_fk(String a03_codigo_fk) {
		this.a03_codigo_fk = a03_codigo_fk;
	}
	public int getA04_quantidade() {
		return a04_quantidade;
	}
	public void setA04_quantidade(int a04_quantidade) {
		this.a04_quantidade = a04_quantidade;
	}
}