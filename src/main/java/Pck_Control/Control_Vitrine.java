package Pck_Control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control_Vitrine {

    @GetMapping("/vitrine")
    
    public String controlVitrine() {
        return "vitrine";
    }

    @PostMapping("/inputQuantiaProduto/*")
    public String vitrineDTO(@RequestParam int product_qty) {
        return "vitrine";
    }


    /*public void requisitarProduto() {
      try {
        model.setA03_codigo(a03_codigo);
        model.setA03_nome(a03_nome);
        model.setA03_valorUnitario(a03_valorUnitario);
        model.setA04_quantidade(a04_quantidade);
        
          view.mostrarMensagem("Item Adicionado ao carrinho!");
      } catch (Exception ex) {
          view.mostrarMensagem("Erro ao inserir produto ao carrinho. " + ex.getMessage());
      }
    }*/

/*
    quantia que ta no input
    solicitação de compra (a03_codigo)

    ++model produtos
    --quantia do estoque
  
    
    

  

*/
}