package Pck_Control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Control_Carrinho {

    private double totalValue = 0.00;

    @GetMapping("carrinho")
    public String controlCarrinho(ModelMap model) {
        model.addAttribute("totalValue", totalValue);
        return "carrinho";
    }
}