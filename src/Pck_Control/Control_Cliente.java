package Pck_Control;

import Pck_View.View_Cliente;
import Pck_Model.Model_Cliente;
import Pck_Persistencia.Persistencia_Cliente;
import java.awt.event.ActionListener;

public class Control_Cliente extends Control_Main {


	private final View_Cliente view;
    private final Model_Cliente model;
    private final Persistencia_Cliente persist;

    // static void Control_Cliente_Main(String[] args)

    public void Main_Cliente() {
        java.awt.EventQueue.invokeLater(() -> new View_Cliente().setVisible(true));
    }


    /**
     * Construtor que configura listeners e injeta dependências.
     */
    public Control_Cliente(View_Cliente view, Model_Cliente model, Persistencia_Cliente persist) {
        this.view  = view;
        this.model = model;
        this.persist = persist;

        // Registra os listeners da View nos métodos do Controller
        view.addInserirListener(event -> inserirCliente());
        view.addAlterarListener(event -> atualizarCliente());
        view.addRemoverListener(event -> removerCliente());
        view.addConsultarListener(event -> consultarCliente());
    }


	//	PersistenciaCliente objClientePersistencia = new PersistenciaCliente();

 private void inserirCliente() {
        try {
            String nome = view.getNome();
            String endereco = view.getEndereco();
            String telefone = view.getTelefone();
            String cpf = view.getCPF();
            double credito = Double.parseDouble(view.getCredito());

            model.setA01_nome(nome);
            model.setA01_endereco(endereco);
            model.setA01_telefone(telefone);
            model.setA01_cpf(cpf);
            model.setA01_credito(credito);

            persist.inserirCliente(model);

            view.mostrarMensagem("Cliente inserido com sucesso!");
        } catch (Exception ex) {
            view.mostrarMensagem("Erro ao inserir cliente: " + ex.getMessage());
        }
    }

    private void atualizarCliente() {
        try {
            // esse codigo é incerto
            int codigo = Integer.parseInt(view.getCodigo()); //codigo pk -view l75
            String nome = view.getNome();
            String endereco = view.getEndereco();
            String telefone = view.getTelefone();
            String cpf = view.getCPF();
            double credito = Double.parseDouble(view.getCredito());//parse -> string para double

            model.setA01_codigo(codigo);
            model.setA01_nome(nome);
            model.setA01_endereco(endereco);
            model.setA01_telefone(telefone);
            model.setA01_cpf(cpf);
            model.setA01_credito(credito);

            persist.alterarCliente(model);
            view.mostrarMensagem("Cliente atualizado com sucesso!");
        } catch (Exception ex) {
            view.mostrarMensagem("Erro ao atualizar cliente: " + ex.getMessage());
        }
    }

    private void removerCliente() {
        try {
            int codigo = Integer.parseInt(view.getCPF());
            model.setA01_codigo(codigo);
            persist.removerCliente(model);
            view.mostrarMensagem("Cliente removido com sucesso!");
        } catch (Exception ex) {
            view.mostrarMensagem("Erro ao remover cliente: " + ex.getMessage());
        }
    }

}