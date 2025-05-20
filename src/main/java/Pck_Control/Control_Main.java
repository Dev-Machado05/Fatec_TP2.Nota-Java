package Pck_Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control_Main {

    @GetMapping("/")
    public String controlMain() {
        return "index";
    }

    @PostMapping("/paraCliente")
    public String RedirectClient() {
        // local para implementação de lógica
        return "redirect:/cliente";
    }

    @PostMapping("/paraCarrinho")
    public String RedirectCarrinho() {
        // local para implementação de lógica
        return "redirect:/carrinho";
    }

    @PostMapping("/paraEstoque")
    public String RedirectEstoque() {
        // local para implementação de lógica
        return "redirect:/estoque";
    }
}