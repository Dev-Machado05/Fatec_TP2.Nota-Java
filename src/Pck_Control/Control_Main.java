package Pck_Control;

import java.util.List;
import java.util.Map;

import javax.swing.SwingUtilities;

import Pck_Control.Control_Cliente;

import Pck_Model.Model_Cliente;
import Pck_Model.Model_Item;
import Pck_Model.Model_Pedido;
import Pck_Model.Model_Produto;
import Pck_Persistencia.Persistencia_Cliente;
import Pck_View.View_Cliente;
import Pck_View.View_Item;
import Pck_View.View_Pedido;
import java.awt.event.ActionListener;


public class Control_Main {
	
	public static void Main_Control() {
		
	 String View_Action = showMainMenu();
		



		switch (View_Action) {
			case "Register_Act":
				Control_Cliente.Main_Cliente();
				//HandleClientes();
				break;
			case "AddProduct_Act":
				HandleAddProduct();
				break;
			case "CreateNote_Act":
				HandleCreateNote();
				break;
			default:
				System.out.println("Ação desconhecida...");
		}
	}
	


// public static void HandleRegister() {
// 		SwingUtilities.invokeLater(() -> {
// 			View_RegisterClient dialog = new View_RegisterClient(null);
// 			Model_Cliente cliente = dialog.registerClient_Call();

// 		});
// 	}
	 RegisterClient.addActionListener(e -> {
	View_RegisterClient dialog = new View_RegisterClient(null);
		dispose();
	});



   private static String showMainMenu() {
       
		startApp();		
		
		
		// Exemplo de menu para selecionar a ação, simulado via texto
        // Isso seria substituído por uma interface gráfica de escolha de ação
        return "Register_Act"; // Retorna o nome da ação escolhida
    }


public static void handleRegister() {
        SwingUtilities.invokeLater(() -> {
            // Cria a instância da view de cliente
            View_Cliente viewCliente = new View_Cliente();
            Model_Cliente modelCliente = new Model_Cliente();
            ClientePersistencia clienteDao = new ClientePersistencia();

            // Cria o controller que faz a ponte entre a view, model e persistência
            Control_Cliente controlCliente = new Control_Cliente(viewCliente, modelCliente, clienteDao);

            // Exibe a tela de cadastro
            viewCliente.setVisible(true);
        });
    }

	public static void HandleAddProduct() {
		View_ProductAction PrView = new View_ProductAction();
		String Pr_Action = PrView.ShowAction();
		
		switch (Pr_Action) {
			case "Cadastrar_Act":
				SwingUtilities.invokeLater(() -> {
					View_AdProduto dialog = new View_AdProduto(null);
					Model_Produto Product = dialog.AddProduct_Call();
					
					if (Product != null) {
						System.out.println("Produto cadastrado: " + Product.getA03_nome());
					} else {
						System.out.println("Cadastro cancelado.");
					}
				});
				
			case "Remover_act":
				System.out.println("Remover Produto");

			case "Alterar_act":
				System.out.println("Alterar Produto");
			
			case "Consultar_act":
				System.out.println("Consultar Produto");
			default:
				System.out.println("Ação desconhecida...");
		}
		
	}

	public static void HandleCreateNote() {
		View_NoteAction NtView = new View_NoteAction();
		String Nt_Action = NtView.ShowAction();
		
		switch (Nt_Action) {
			case "Criar_Act":
				SwingUtilities.invokeLater(() -> {
					// call the view and the receive the dictionary
					View_AdNota dialog = new View_AdNota();
					Map<String, Object> noteItens = dialog.addNote_Call();
					
					if (noteItens != null) {
						
						System.out.println(noteItens);
					} else {
						System.out.println("Cadastro cancelado.");
					}
				});
				
			case "Remover_Act":
				System.out.println("RM");
			case "Alterar_Act":
				System.out.println("AL");
			case "Consultar_Act":
				System.out.println("CS");
			default:
				System.out.println("Ação desconhecida...");
		}
		
	}
        
        def ControlItemProduto:
            valoresProduto = ControlProduto*();
            valoresItem = controlItem();
            
	
	/*public static void handleUserSet() {
		Model_Cliente objModelClient = new Model_Cliente();
		
		objModelClient.setA01_nome();
	}*/
}