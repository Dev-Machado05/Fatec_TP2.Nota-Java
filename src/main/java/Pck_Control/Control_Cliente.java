package Pck_Control;

import java.util.ArrayList;
import java.util.List;
//import model_cliente

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

// import Pck_Model.array;
// import ch.qos.logback.core.net.server.Client;


@Controller
public class Control_Cliente {

    @GetMapping("/cliente")
    public String controlCliente() {
        return "cliente";
    }



    //private List<arrayCliente> clientList = new ArrayList<>();
    

    @PostMapping("/setClient")
    public String ClientDTO(@RequestParam String action,
                            @RequestParam(name = "CPF") String rqCPF,
                            @RequestParam(name = "name") String rqName,
                            @RequestParam(name = "address") String rqAddress,
                            @RequestParam(name = "phone") String rqPhone,
                            @RequestParam(name = "mail") String rqMail,
                            ModelMap model) {
   
   
        switch(action) {
            case "nota":
                return "redirect:/notas";
                
                case "remove":
                if (validateInputCli(action, rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
                    System.out.println("");
                } else {
                    model.addAttribute("erroMsg", true);
                }
                return "cliente";

            case "update":
                if (validateInputCli(action, rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
                    System.out.println("adicionar função de update aqui");
                } else {
                    model.addAttribute("erroMsg", true);
                }

                return "cliente";
                
                case "insert":
                if (validateInputCli(action, rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
                    model.addAttribute("sucessMsg", true);
                    //        arrayCliente client = new arrayCliente();
                    
                    //                    client.setCpf(rqCPF);
                    //                  client.setName(rqName);
                    //                client.setAddress(rqAddress);
                    //              client.setPhone(rqPhone);
                    //            client.setMail(rqMail);
                    //
                    //                  clientList.add(client);
                    
     //               model.addAttribute("clientList", clientList);
                model.addAttribute("sucessMsg", true);
                } else {
                    model.addAttribute("erroMsg", true);
                }
                return "cliente";

            case "consult":
                if (validateInputCli(action, rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
                    System.out.println("adicionar função de consulta aqui");
                } else {
                    model.addAttribute("erroMsg", true);
                }
            
            default:
                System.out.println("Ação de botão incorreta.");
            }
            return "cliente";
        }
       // else {
       //     model.addAttribute("erroMsg", true);
       //     
        
        // if (validateInputCli(rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
        //    model.addAttribute("sucessMsg", true);
        //}
        //else {
        //    model.addAttribute("erroMsg", true);
        //    model.addAttribute("cpf", rqCPF);
        //    model.addAttribute("name", rqName);
        //    model.addAttribute("address", rqAddress);
        //    model.addAttribute("phone", rqPhone);
        //    model.addAttribute("main", rqMail);
        //}
        //return "cliente";

    @PostMapping("/returnMain")
    public String redirectIndex() {
        return "redirect:/";
    }

    public boolean validateInputCli(String action, String cpf, String name, String address, String phone, String mail) {
        switch(action) {
            case "remove":
                return cpf != null && !cpf.isEmpty();
            case "update":
                return cpf != null && !cpf.isEmpty() &&
                    name != null && !name.isEmpty() &&
                    address != null && !address.isEmpty() &&
                    phone != null && !phone.isEmpty() &&
                    mail != null && !mail.isEmpty();
            case "submit":
                return cpf != null && !cpf.isEmpty() &&
                    name != null && !name.isEmpty() &&
                    address != null && !address.isEmpty() &&
                    phone != null && !phone.isEmpty() &&
                    mail != null && !mail.isEmpty();
            case "consult":
                return cpf != null && !cpf.isEmpty();
            default:
                return false;
        }
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