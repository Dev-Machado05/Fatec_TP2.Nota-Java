package Pck_Control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Control_Nota {

  @GetMapping("/notas")
  public String redirectNotas() {
    return "notas";
  }

  //   private String getA02_numero;
  //   private String getA01_cpf;
  //   private String getA02_data;
  //   private String getA02_valorItem;
  //   private String getA04_codigo;
  //   private String getA04_quantidade;
  //   private String getA03_codigo;
  //   private String getA03_valorUnitario;

  // @GetMapping("/notasdsad")
  //   public String controlNotas(ModelMap nota) {
        
  //       nota.addAttribute("numPedido", getA02_numero);
  //       nota.addAttribute("cpf", getA01_cpf);
  //       nota.addAttribute("data", getA02_data);
  //       nota.addAttribute("codItem", getA04_codigo);
  //       nota.addAttribute("codProd", getA03_codigo);
  //       nota.addAttribute("quantidade", getA04_quantidade);
  //       nota.addAttribute("valUni", getA03_valorUnitario);
  //       nota.addAttribute("valItem", getA02_valorItem);
  //       return "notas";
  //   }
}

// public string nome (modelMap model) {
// model.addAtribute("nome", nome)
//}
