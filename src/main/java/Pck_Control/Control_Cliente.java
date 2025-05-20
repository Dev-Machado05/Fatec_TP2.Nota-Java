package Pck_Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Control_Cliente {

    @GetMapping("/cliente")
    public String controlCliente() {
        return "cliente";
    }
}

/*
import PCK_View.View_Cliente;
import PCK_Model.Model_Cliente;
import PCK_Persistencia.Persistencia_Cliente;
import java.awt.event.ActionListener;

public class Control_Cliente extends Control_Main {

    private view_Cliente view;

   public void Main_Cliente() {
       View_Cliente().setVisible(true);
   }

    public Control_Cliente(View_Cliente view, Model_Cliente model, Persistencia_Cliente persist) {
        this.model = model;
        this.persist = persist;
    }

    private void inserirCliente() {
        try {
            String nome = view.getNome();
            String endereco = view.getEndereco();
            String telefone = view.getTelefone();
            String cpf = view.getCPF();
            double credito = Double.parseDouble(view.getCredito());

            Model_Cliente.setA01_nome(nome);
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
*/