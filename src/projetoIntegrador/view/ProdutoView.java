/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoIntegrador.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetoIntegrador.controller.ProdutoController;
import projetoIntegrador.utils.Validador;

/**
 *
 * @author fabiana.vsilva6
 */
public class ProdutoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProdutosView1
     */
    private String modoTela;

    private ProdutoController controller = new ProdutoController();

    public ProdutoView() {
        initComponents();
        desabilitarFormulario();

        LoadTable();
        //Oculta o ID
        lblPID.setVisible(false);
    }
    
    /**
     * Carrega a tabela produtos
     */

    public void LoadTable() {

        ArrayList<String[]> linhasProdutos = controller.getProdutos();

        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("ID");
        tmProdutos.addColumn("Nome do produto");
        tmProdutos.addColumn("Quantidade");
        tmProdutos.addColumn("Valor");

        tblProduto.setModel(tmProdutos);

        //Removo a coluna da View (JTable) mas mantenho na model para armazenar o ID
        tblProduto.removeColumn(tblProduto.getColumnModel().getColumn(0));

        for (String[] c : linhasProdutos) {
            tmProdutos.addRow(c);
        }

        //Defino o tamanho para cada coluna
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(300);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);

    }

    /**
     * limpa o formulario de produtos
     */
    
    public void limparFormulario() {

        txtNomeProduto.setText("");
        txtQuantidadeProduto.setText("");
        txtValorUnitario.setText("");

    }
    
    /**
     * Desabilita o formulario de produtos
     */

    public void desabilitarFormulario() {

        txtNomeProduto.setEditable(false);
        txtNomeProduto.setEnabled(false);

        txtQuantidadeProduto.setEditable(false);
        txtQuantidadeProduto.setEnabled(false);

        txtValorUnitario.setEditable(false);
        txtValorUnitario.setEnabled(false);

        btnSalvarProduto.setEnabled(false);

    }

    /**
     * habilita o formulario de produtos
     */
    public void habitarFormulario() {

        txtNomeProduto.setEditable(true);
        txtNomeProduto.setEnabled(true);

        txtQuantidadeProduto.setEditable(true);
        txtQuantidadeProduto.setEnabled(true);

        txtValorUnitario.setEditable(true);
        txtValorUnitario.setEnabled(true);

        btnSalvarProduto.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        CadastroCliente4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JTextField();
        lblNomeProduto = new javax.swing.JLabel();
        lblQuantidadeProduto = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        Botoes = new javax.swing.JPanel();
        btnSalvarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        lblPID = new javax.swing.JLabel();

        jPanel9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

        jPanel10.setBackground(new java.awt.Color(0, 51, 102));

        CadastroCliente4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        CadastroCliente4.setForeground(new java.awt.Color(255, 255, 255));
        CadastroCliente4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadastroCliente4.setText("Cadastro Produto");
        CadastroCliente4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroCliente4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(CadastroCliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

        txtNomeProduto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtNomeProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        lblNomeProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblNomeProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNomeProduto.setText("Nome do Produto:*");

        lblQuantidadeProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblQuantidadeProduto.setText("Quantidade:*");

        txtQuantidadeProduto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtQuantidadeProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtQuantidadeProduto.setName("quantidade"); // NOI18N
        txtQuantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdutoActionPerformed(evt);
            }
        });

        lblValorUnitario.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblValorUnitario.setText("Valor Unitario:*");

        txtValorUnitario.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtValorUnitario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtValorUnitario.setName("valor"); // NOI18N
        txtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorUnitario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeProduto)
                                .addGap(134, 134, 134))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNomeProduto)
                                .addGap(40, 40, 40)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidadeProduto)))
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(lblValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Botoes.setBackground(new java.awt.Color(153, 153, 153));
        Botoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Botoes.setForeground(new java.awt.Color(204, 204, 204));

        btnSalvarProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnEditarProduto.setText("Editar");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoesLayout = new javax.swing.GroupLayout(Botoes);
        Botoes.setLayout(BotoesLayout);
        BotoesLayout.setHorizontalGroup(
            BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        BotoesLayout.setVerticalGroup(
            BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblProduto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome:", "CPF:", "Data de cadastro:"
            }
        ));
        Tabela.setViewportView(tblProduto);

        lblPID.setText("PID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(lblPID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPID)))
                .addGap(18, 18, 18)
                .addComponent(Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        Validador objValidador = new Validador(); //Cria objeto do validador importando de outra classe
        objValidador.ValidarNumero(txtQuantidadeProduto); //Valida se o campo está vazio ou se o formato é correto
        objValidador.ValidarFloat(txtValorUnitario); //Valida se o campo está vazio ou se o formato é correto

        if (objValidador.hasErro()) {

            JOptionPane.showMessageDialog(this, objValidador.getMensagensErro());
            objValidador.limparMensagens(); //Limpa as mensagens para não aparecer infinito
        }

        if (ValidarFormulário()) {

            if (modoTela.equals("Criar")) {

                if (controller.salvar(txtNomeProduto.getText(), Integer.parseInt(txtQuantidadeProduto.getText()), Double.parseDouble(txtValorUnitario.getText()))) {

                    this.LoadTable();

                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                    limparFormulario();

                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar o produto!");
                }

            } else {

                if (controller.atualizar(Integer.parseInt(lblPID.getText()), txtNomeProduto.getText(), Integer.parseInt(txtQuantidadeProduto.getText()), Double.parseDouble(txtValorUnitario.getText()))) {

                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");

                } else {

                    JOptionPane.showMessageDialog(this, "Falha ao atualizar o produto!");
                }

            }

            limparFormulario();
            desabilitarFormulario();
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        if (tblProduto.getRowCount() > 0) {

            //Resgata o numero da linha pelo JTable
            int numeroLinha = tblProduto.getSelectedRow();

            //Resgata o ID (oculto) do produto JTableModel
            int IDProd = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());

            //Realiza a exclusão do cliente pelo ID
            if (controller.excluir(IDProd)) {

                this.LoadTable();
                JOptionPane.showMessageDialog(this, "Produto excluido da base de dados");

            } else {

                JOptionPane.showMessageDialog(this, "Falha ao excluir o produto!");

            }
        } else {

            JOptionPane.showMessageDialog(this, "Não há clientes para excluir na base de dados!");

        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        if (tblProduto.getRowCount() > 0) {

            if (tblProduto.getSelectedRow() >= 0) {

                habitarFormulario();

                modoTela = "Editar";

                lblPID.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 0).toString());
                txtNomeProduto.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 1).toString());
                txtQuantidadeProduto.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 2).toString());
                txtValorUnitario.setText(tblProduto.getModel().getValueAt(tblProduto.getSelectedRow(), 3).toString());

            } else {

                JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");

            }
        } else {

            JOptionPane.showMessageDialog(this, "Não há produtos para editar!");

        }
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:

        modoTela = "Criar";
        habitarFormulario();
        limparFormulario();

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtQuantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdutoActionPerformed

    private void txtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioActionPerformed

    /**
     * valida o formulario de produtos, verifica se tem campos em brancos
     * @return retorna false caso algum campo esteja em branco
     */
    private boolean ValidarFormulário() {

        if (this.txtNomeProduto.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(this, "Defina um nome para o produto!");

            return false;
        }

        if (this.txtQuantidadeProduto.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(this, "Defina uma quantidade para o produto!");

            return false;
        }

        if (this.txtValorUnitario.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(this, "Defina um valor para o produto!");

            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botoes;
    private javax.swing.JLabel CadastroCliente4;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPID;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
