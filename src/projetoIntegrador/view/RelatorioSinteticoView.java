/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoIntegrador.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetoIntegrador.controller.ClienteController;
import projetoIntegrador.controller.RelatorioSinteticoController;

/**
 *
 * @author fabiana.vsilva6
 */
public class RelatorioSinteticoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form RelatorioSinteticoView1
     */
    public RelatorioSinteticoView() {
        initComponents();
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
        lblRelatorioSintetico = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Tabela = new javax.swing.JScrollPane();
        tblSintetico = new javax.swing.JTable();
        lblValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        btnGerarRelatorioAnalitico = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        lblTipoExtrato = new javax.swing.JLabel();
        cmbTipoExtrato = new javax.swing.JComboBox<>();
        lblDataInicial = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblDataFinal = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        Botoes = new javax.swing.JPanel();
        btnGerarRelatorioSintetico = new javax.swing.JButton();

        jPanel9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

        jPanel10.setBackground(new java.awt.Color(0, 51, 102));

        lblRelatorioSintetico.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblRelatorioSintetico.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorioSintetico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorioSintetico.setText("Relatorio Sintético");
        lblRelatorioSintetico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRelatorioSintetico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(lblRelatorioSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tblSintetico.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tblSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data:", "Produto:", "Valor de Venda:"
            }
        ));
        Tabela.setViewportView(tblSintetico);

        lblValorTotal.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblValorTotal.setText("Valor Total:");

        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnGerarRelatorioAnalitico.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnGerarRelatorioAnalitico.setText("Relatório Analítico");
        btnGerarRelatorioAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioAnaliticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGerarRelatorioAnalitico)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(581, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGerarRelatorioAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(425, Short.MAX_VALUE)
                    .addComponent(lblValorTotal)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        txtBusca.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtBusca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBusca.setText("Busca Avançada...");

        lblTipoExtrato.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblTipoExtrato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTipoExtrato.setText("Tipo de extrato:*");

        cmbTipoExtrato.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cmbTipoExtrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDataInicial.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDataInicial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDataInicial.setText("Data Inicial:");

        lblDataFinal.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDataFinal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDataFinal.setText("Data Final:");

        btnBuscar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(cmbTipoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTipoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(257, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(cmbTipoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(lblTipoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        Botoes.setBackground(new java.awt.Color(153, 153, 153));
        Botoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Botoes.setForeground(new java.awt.Color(204, 204, 204));

        btnGerarRelatorioSintetico.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnGerarRelatorioSintetico.setText("Gerar Relatorio Sintetico");
        btnGerarRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioSinteticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotoesLayout = new javax.swing.GroupLayout(Botoes);
        Botoes.setLayout(BotoesLayout);
        BotoesLayout.setHorizontalGroup(
            BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGerarRelatorioSintetico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotoesLayout.setVerticalGroup(
            BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnGerarRelatorioSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addComponent(Botoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void carregarTabela() {
        //Controlador resgata as vendas do banco de dados
        ArrayList<String[]> listaVendas = RelatorioSinteticoController.buscaPorPeriodo(jDateChooser1.getDate(),jDateChooser2.getDate());
        //criar manualmente uma tabela para listar as vendas
        DefaultTableModel tabelaSintetico = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false;
            }
        };
        tabelaSintetico.addColumn("DATA");//0
        tabelaSintetico.addColumn("PRODUTO");//1
        tabelaSintetico.addColumn("VALOR");//2
       
        tblSintetico.setModel(tabelaSintetico);
            for (String[] vendas : listaVendas) {
                tabelaSintetico.addRow(vendas);
            }
//        }
        //definindo um tamanho para cada coluna
        tblSintetico.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblSintetico.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblSintetico.getColumnModel().getColumn(2).setPreferredWidth(200);
    }
    
    
    private void btnGerarRelatorioSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioSinteticoActionPerformed
              
       //Criar vaáriaveis pra receber data de inicio e de fim.     
       Date inicio;
       Date fim;
       
       // resgata datas do jcalendar
       inicio = jDateChooser1.getDate();
       fim = jDateChooser2.getDate();
       
       //verifico se os campos foram preeenchidos
       if(inicio == null){
            JOptionPane.showMessageDialog(this,"Data de inicio obrigatória!.");
            return;
        }
        
        if(fim == null){
            JOptionPane.showMessageDialog(this,"Data de término obrigatória!.");
            return;
        }
        // calcula a quantidade de dias que deve ser menor a 30 
        long diferencaMillisegundos = fim.getTime() - inicio.getTime();
        long dias = TimeUnit.DAYS.convert(diferencaMillisegundos, TimeUnit.MILLISECONDS);
        
        //Crio um objeto formatador para mudar o formato de apresentação da variável data
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        
         if(inicio.after(fim)){
            JOptionPane.showMessageDialog(this,"Data de inicio maior que a data fim. \n"
                                                + "Favor utilizar data de inicio inferior ao término!");
        }else{
            
            if(dias>30){
                JOptionPane.showMessageDialog(this,"Período superior a 30 dias");
            }else{
                 carregarTabela();
                
                JOptionPane.showMessageDialog(this,"Seleção correta!\n" 
                                        + "Dias Selecionados: " + dias + "\n" 
                                        + "Data inicio: " + formatador.format(inicio) + "\n"
                                        + "Data Fim: " + formatador.format(fim));
            }
        }             
        
    }//GEN-LAST:event_btnGerarRelatorioSinteticoActionPerformed

    private void btnGerarRelatorioAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioAnaliticoActionPerformed

    }//GEN-LAST:event_btnGerarRelatorioAnaliticoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botoes;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGerarRelatorioAnalitico;
    private javax.swing.JButton btnGerarRelatorioSintetico;
    private javax.swing.JComboBox<String> cmbTipoExtrato;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblRelatorioSintetico;
    private javax.swing.JLabel lblTipoExtrato;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTable tblSintetico;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
