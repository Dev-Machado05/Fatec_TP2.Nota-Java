package Pck_Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;

@Controller
public class Control_Nota {


  @GetMapping("/notas")
    public String controlNotas(ModelMap nota) {
        
        nota.addAttribute("numPedido", getA02_numero);
        nota.addAttribute("cpf", getA01_cpf);
        nota.addAttribute("data", getA02_data);
        nota.addAttribute("codItem", getA04_codigo);
        nota.addAttribute("codProd", getA03_codigo);
        nota.addAttribute("quantidade", getA04_quantidade);
        nota.addAttribute("valUni", getA03_valorUnitario);
        nota.addAttribute("valItem", getA02_valorItem);
        return "notas";
    }


}

// public string nome (modelMap model) {
// model.addAtribute("nome", nome)
//}
