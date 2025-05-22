package Pck_Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Control_Carrinho {
    @GetMapping("carrinho")

    public String controlCarrinho() {
        return "carrinho";
    }


}