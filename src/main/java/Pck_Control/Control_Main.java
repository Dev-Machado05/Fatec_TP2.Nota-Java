package Pck_Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Control_Main {

    @GetMapping("/")
    public String controlMain() {
        return "index";
    }

    @PostMapping("/pagCliente")
    public String redirectClient() {
        // local para implementação de lógica
        return "redirect:/cliente";
    }

    @PostMapping("/pagCarrinho")
    public String redirectCarrinho() {
        // local para implementação de lógica
        return "redirect:/carrinho";
    }

    @PostMapping("/pagVitrine")
    public String redirectVitrine() {
        // local para implementação de lógica
        return "redirect:/vitrine";
    }
}