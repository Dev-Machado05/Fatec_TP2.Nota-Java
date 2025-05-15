package Pck_Model;

public class Model_Produto {
	
	private String	a03_codigo;
	private String	a03_nome;
	private String	a03_descricao;
	private float	a03_valorunitario;
	private int		a03_estoque;
	
	public Model_Produto(String a03_codigo, String a03_nome, String a03_descricao, float a03_valorunitario,
			int a03_estoque) {
		if (a03_codigo != null) {
			this.setA03_codigo(a03_codigo);
			this.setA03_nome(a03_nome);
			this.setA03_descricao(a03_descricao);
			this.setA03_valorunitario(a03_valorunitario);
			this.setA03_estoque(a03_estoque);
		}
	}
	public String getA03_codigo() {
		return a03_codigo;
	}
	public void setA03_codigo(String a03_codigo) {
		if (a03_codigo != null && a03_codigo.length() <= 12)
		this.a03_codigo = a03_codigo;
	}
	public String getA03_nome() {
		return a03_nome;
	}
	public void setA03_nome(String a03_nome) {
		if (a03_nome != null && a03_nome.length() <= 50) {
			this.a03_nome = a03_nome;
		}
	}
	public String getA03_descricao() {
		return a03_descricao;
	}
	public void setA03_descricao(String a03_descricao) {
		if (a03_descricao != null && a03_descricao.length() <= 100) {
			this.a03_descricao = a03_descricao;
		}
	}
	public float getA03_valorunitario() {
		return a03_valorunitario;
	}
	public void setA03_valorunitario(float a03_valorunitario) {
		this.a03_valorunitario = a03_valorunitario;
	}
	public int getA03_estoque() {
		return a03_estoque;
	}
	public void setA03_estoque(int a03_estoque) {
		this.a03_estoque = a03_estoque;
	}
	
}
