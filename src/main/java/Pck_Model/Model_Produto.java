package Pck_Model;

public class Model_Produto {
	
	private int		a03_codigo;
	private String	a03_nome;
	private float	a03_valorUnitario;
	private int		a03_estoque;
	
	public Model_Produto(int a03_codigo, String a03_nome, float a03_valorUnitario,
			int a03_estoque) {

			this.setA03_codigo(a03_codigo);
			this.setA03_nome(a03_nome);
			this.setA03_valorUnitario(a03_valorUnitario);
			this.setA03_estoque(a03_estoque);
	}

	public int getA03_codigo() {
		return a03_codigo;
	}
	public String getA03_nome() {
		return a03_nome;
	}
		public float getA03_valorUnitario() {
		return a03_valorUnitario;
	}
	public int getA03_estoque() {
		return a03_estoque;
	}

	public void setA03_codigo(int a03_codigo) {

		this.a03_codigo = a03_codigo;
	}
	
	public void setA03_nome(String a03_nome) {
		if (a03_nome != null && a03_nome.length() <= 50) {
			this.a03_nome = a03_nome;
		}
	}

	public void setA03_valorUnitario(float a03_valorUnitario) {
		this.a03_valorUnitario = a03_valorUnitario;
	}

	public void setA03_estoque(int a03_estoque) {
		this.a03_estoque = a03_estoque;
	}
	
}
