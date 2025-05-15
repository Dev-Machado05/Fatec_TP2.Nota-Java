package Pck_View;

import Pck_Model.Model_Cliente;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class View_Cliente extends javax.swing.JFrame {

    public View_Cliente() {
        initComponents();
        setLocationRelativeTo(null); // centraliza a janela
    }

    private void initComponents() {
        // Componentes básicos
        jLabelCodigo = new javax.swing.JLabel("Código:");
        jTextCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel("Nome:");
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel("Endereço:");
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel("Telefone:");
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel("CPF:");
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel("Crédito:");
        jTextField7 = new javax.swing.JTextField();

        jButton1 = new javax.swing.JButton("Inserir");
        jButton2 = new javax.swing.JButton("Excluir");
        jButton3 = new javax.swing.JButton("Alterar");
        jButton4 = new javax.swing.JButton("Consultar");
        jButton5 = new javax.swing.JButton("Limpar"); // Novo botão limpar

        jLabelTitulo = new javax.swing.JLabel("Cliente");
        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Adiciona componentes na tela
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(jTextCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 200, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, -1));

        // Botões
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        pack();
    }

    // Listeners de botões
    public void addInserirListener(ActionListener listener) { jButton1.addActionListener(listener); }
    public void addRemoverListener(ActionListener listener) { jButton2.addActionListener(listener); }
    public void addAlterarListener(ActionListener listener) { jButton3.addActionListener(listener); }
    public void addConsultarListener(ActionListener listener) { jButton4.addActionListener(listener); }

    // Getters para campos
    public int getCodigo() {
        try { 
            return Integer.parseInt(jTextCodigo.getText().trim()); 
        } catch (NumberFormatException e) {
             return 0; }
    }
    public String getNome() {
         return jTextField1.getText().trim(); }
    public String getEndereco() {
         return jTextField2.getText().trim(); }
    public String getTelefone() {
         return jTextField5.getText().trim(); }
    public String getCPF() {
         return jTextField6.getText().trim(); }
    public float getCredito() {
        try { 
            return Float.parseFloat(jTextField7.getText().trim());
        } catch (NumberFormatException e) {
             return 0f;
            }
    }

    // Limpa todos os campos da tela
    // public void clearFields() {
    //     jTextCodigo.setText("");
    //     jTextField1.setText("");
    //     jTextField2.setText("");
    //     jTextField5.setText("");
    //     jTextField6.setText("");
    //     jTextField7.setText("");
    // }

    // Mensagem de feedback
    // public void mostrarMensagem(String mensagem) {
    //     JOptionPane.showMessageDialog(this, mensagem);
    // }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new View_Cliente().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton jButton1, jButton2, jButton3, jButton4, jButton5;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabelTitulo, jLabelCodigo;
    private javax.swing.JTextField jTextField1, jTextField2, jTextField5, jTextField6, jTextField7, jTextCodigo;
    // End of variables declaration
