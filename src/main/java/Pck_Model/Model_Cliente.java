package Pck_Model;

public class Model_Cliente {

    private int		a01_codigo;
    private String	a01_nome;
    private String	a01_endereco;
    private String	a01_telefone;
    private String	a01_cpf;
    private float	a01_credito;

    public Model_Cliente(String cliente_nome, String cliente_endereco, String cliente_telefone, String cliente_cpf, Float cliente_credito) {

        this.setA01_nome(cliente_nome);
        this.setA01_endereco(cliente_endereco);
        this.setA01_telefone(cliente_telefone);
        this.setA01_cpf(cliente_cpf);
        this.setA01_credito(cliente_credito);
    }

    public int getA01_codigo() {
        return a01_codigo;
    }
    public String getA01_nome() {
        return a01_nome;
    }
    public String getA01_endereco() {
        return a01_endereco;
    }

    public String getA01_telefone() {
        return a01_telefone;
    }
    public String getA01_cpf() {
        return a01_cpf;
    }
    public float getA01_credito() {
        return a01_credito;
    }


    public void setA01_codigo(int a01_codigo) {
        this.a01_codigo = a01_codigo;
    }
    public void setA01_nome(String a01_nome) {
        if (a01_nome != null && a01_nome.length() <= 50) {
            this.a01_nome = a01_nome;
        }
    }
    public void setA01_endereco(String a01_endereco) {
        if (a01_endereco != null && a01_endereco.length() <= 50) {
            this.a01_endereco = a01_endereco;
        }
    }
    public void setA01_telefone(String a01_telefone) {
        if (a01_telefone != null && a01_telefone.length() == 11) {
            this.a01_telefone = a01_telefone;
        }
    }
    public void setA01_cpf(String a01_cpf) {
        if (a01_cpf != null && a01_cpf.length() == 11) {
            this.a01_cpf = a01_cpf;
        }
    }
    public void setA01_credito(float a01_credito) {
        this.a01_credito = a01_credito;
    }
}
