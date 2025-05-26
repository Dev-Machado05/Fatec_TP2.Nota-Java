package Pck_Control;

import java.util.ArrayList;
import java.util.List;
import Pck_Model.Model_Cliente;
import Pck_Persistencia.Persistencia_Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

@Controller
public class Control_Cliente {

    private List<Model_Cliente> armClientList = new ArrayList<>();
    private List<Model_Cliente> clientList = new ArrayList<>();

    Persistencia_Cliente persist = new Persistencia_Cliente();
    Model_Cliente modelC;

    @GetMapping("/cliente")
    public String controlCliente(ModelMap model) {
        model.addAttribute("clientList", clientList);
        return "cliente";
    }

    @PostMapping("/setClient")
    public String clientDTO(@RequestParam String action,
                            @RequestParam(name = "CPF") String rqCPF,
                            @RequestParam(name = "name") String rqName,
                            @RequestParam(name = "address") String rqAddress,
                            @RequestParam(name = "phone") String rqPhone,
                            @RequestParam(name = "mail") String rqMail,
                            ModelMap model, Model_Cliente modelC) {

        switch (action) {
            case "nota":
                return "redirect:/notas";

            case "remove":
                boolean removed = clientList.removeIf(client -> client.getA01_cpf().equals(rqCPF));
                if (removed) {
                    model.addAttribute("sucessMsg", "Cliente removido com sucesso!");
                } else {
                    model.addAttribute("erroMsg", "Cliente não encontrado!");
                }
                break;

            case "update":
                if (validateInputCli(action, rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
                    updateClient(rqCPF, rqName, rqAddress, rqPhone, rqMail);
                    model.addAttribute("sucessMsg", "Cliente atualizado com sucesso!");
                } else {
                    model.addAttribute("erroMsg", "Não foi possível atualizar os dados do cliente. Por favor, confira todos os campos.");
                }
                break;

            case "insert":
                if (validateInputCli(action, rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
                    view_insertClient(rqCPF, rqName, rqAddress, rqPhone, rqMail);
                    modelC = new Model_Cliente(rqName, rqAddress, rqCPF, rqPhone, rqMail);

                    persist.inserirCliente(modelC);
                    model.addAttribute("sucessMsg", "Cliente inserido com sucesso!");
                } else {
                    model.addAttribute("erroMsg", "Não foi possível inserir o cliente.");
                }
                break;

            case "consult":
                if (validateInputCli(action, rqCPF, rqName, rqAddress, rqPhone, rqMail)) {
                    view_consultClient(rqCPF, model);
                } else {
                    // ao invés de mandar a mensagem de erro, mostrar todos os clientes
                    clientList = armClientList;
                    model.addAttribute("erroMsg", "Não foi possível encontrar o cliente.");
                }
                break;

            default:
                System.out.println("Ação de botão incorreta.");
                break;
        }

        model.addAttribute("clientList", clientList);
        return "cliente";
    }

    @PostMapping("/returnMain")
    public String redirectIndex() {
        return "redirect:/";
    }

    public boolean validateInputCli(String action, String cpf, String name, String address, String phone, String mail) {
        boolean validInputAll = cpf != null && !cpf.isEmpty() &&
                name != null && !name.isEmpty() &&
                address != null && !address.isEmpty() &&
                phone != null && !phone.isEmpty() &&
                mail != null && !mail.isEmpty();

        boolean validInputCPF = cpf != null && !cpf.isEmpty();

        return switch (action) {
            case "consult" -> validInputCPF;
            case "update", "insert" -> validInputAll;
            default -> false;
        };
    }

    private void updateClient(String cpf, String name, String address, String phone, String mail) {
        for (Model_Cliente client : clientList) {
            if (client.getA01_cpf().equals(cpf)) {
                client.setA01_nome(name);
                client.setA01_endereco(address);
                client.setA01_telefone(phone);
                client.setA01_email(mail);
                break;
            }
        }
    }

    private void view_insertClient(String cpf, String name, String address, String phone, String mail) {
        Model_Cliente client = new Model_Cliente(cpf, name, address, phone,mail);
        //client.setA01_nome(name);
        //client.setA01_email(mail);
        //client.setA01_cpf(cpf);
        //client.setA01_telefone(phone);
        //client.setA01_endereco(address);

        clientList.add(client);
    }

    private void view_consultClient(String cpf, ModelMap model) {
        for (Model_Cliente client : clientList) {
            if (client.getA01_cpf().equals(cpf)) {
                model.addAttribute("cpf", client.getA01_cpf());
                model.addAttribute("name", client.getA01_nome());
                model.addAttribute("address", client.getA01_endereco());
                model.addAttribute("phone", client.getA01_telefone());
                model.addAttribute("mail", client.getA01_email());
                model.addAttribute("sucessMsg", "Cliente encontrado!");
                return;
            }
        }
        model.addAttribute("erroMsg", "Cliente não encontrado");
    }
}
