package Pck_Control;

import Pck_Model.Model_Item;
import Pck_View.View_Item;



public class Control_Item extends Control_Main {
        
        private final View_item view;
        private final Model_Item model;
        private final DAO_Main dao;

        public Control_Item(View_Item view, Model_Item model, DAO_Main dao) {
                this.view = view;
                this.model = model;
                this.dao = dao;

                view.addInserirListener(evento -> inserirCliente();)
                view.addAlterarListener(evento -> atualizarCliente());
                view.addExcluirListener(evento -> removerCliente());
        }
         
        
        public void inserirItem (int iQuantidade, double dValor_item) {
                objModelItem.setA04_quantidade(iQuantidade);
                objModelItem.setA04_valor_item(dValor_item);
                // objPersistenciaItem.inserirItem(objModelItem);


        }
        private void inserirItem() {
                try {
                        String nome = view.getNome();
                        String endereco = view.getEndereco();
                        String telefone = view.getTelefone();
                        String cpf = view.getCPF();
                        double credito = Double.parseDouble(view.getCredito());

                        model.setA01_nome(nome);
                        model.setA01_endereco(endereco);
                        model.setA01_telefone(telefone);
                        model.setA01_cpf(cpf);
                        model.setA01_credito(credito);

                        dao.inserirCliente(model);
 
                        view.mostrarMensagem("Cliente inserido com sucesso!");
                        } catch (Exception ex) {
                        view.mostrarMensagem("Erro ao inserir cliente: " + ex.getMessage());
                }
        }

        private void atualizarCliente() {
                try {
                        int codigo = Integer.parseInt(view.getCPF()); // ajuste conforme seu campo de código
                        String nome = view.getNome();
                        String endereco = view.getEndereco();
                        String telefone = view.getTelefone();
                        String cpf = view.getCPF();
                        double credito = Double.parseDouble(view.getCredito());

                        model.setA01_codigo(codigo);
                        model.setA01_nome(nome);
                        model.setA01_endereco(endereco);
                        model.setA01_telefone(telefone);
                        model.setA01_cpf(cpf);
                        model.setA01_credito(credito);

                        dao.alterarCliente(model);
                        view.mostrarMensagem("Cliente atualizado com sucesso!");
                } catch (Exception ex) {
                        view.mostrarMensagem("Erro ao atualizar cliente: " + ex.getMessage());
                }
        }

        
        private void removerCliente() {
                try {
                        int codigo = Integer.parseInt(view.getCPF());
                        model.setA01_codigo(codigo);
                        dao.removerCliente(model);
                        view.mostrarMensagem("Cliente removido com sucesso!");
                } catch (Exception ex) {
                  view.mostrarMensagem("Erro ao remover cliente: " + ex.getMessage());
                }
        }

    
        Model_Item objModelItem = new Model_Item();
                //PersistenciaItem objPersistenciaItem = new PersistenciaItem();


       

        public void atualizarItem (int iCodigo_04, int iQuantidade, double dValor_item) {
                objModelItem.setA04_codigo(iCodigo_04);
                objModelItem.setA04_quantidade(iQuantidade);
                objModelItem.setA04_valor_item(dValor_item);
                //	objPersistenciaItem.atualizarItem(objModelItem);
        }

        public void removerItem (int iCodigo_04) {
                objModelItem.setA04_codigo(iCodigo_04);
                //	objPersistenciaItem.removerItem(objModelItem);
        }

}
