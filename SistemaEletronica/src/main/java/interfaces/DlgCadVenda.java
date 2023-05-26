package interfaces;

import dominio.Cliente;
import dominio.EletronicoReformado;
import gerenciadorTarefas.FuncoesUteis;
import gerenciadorTarefas.GerenciadorInterface;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCadVenda extends javax.swing.JDialog {

    GerenciadorInterface gerenciadorI;
    private Cliente cliSelecionado;
    private EletronicoReformado eletSelecionado;
    
    
    public DlgCadVenda(java.awt.Frame parent, boolean modal, GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
        this.cliSelecionado = null;
        this.eletSelecionado = null;
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNomeCliente = new javax.swing.JTextField();
        btnProcurarCliente = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeEletronico = new javax.swing.JTextField();
        btnProcurarEletronico = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vender Eletronico Reformado");
        setModal(true);
        setResizable(false);

        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/sell.png"))); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Vender Eletrônico Reformado");

        btnProcurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarClienteActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente:");

        jLabel3.setText("Eletrônico:");

        btnProcurarEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEletronicoActionPerformed(evt);
            }
        });

        jLabel4.setText("Data:");

        jLabel5.setText("Valor:");

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVenda.setToolTipText("");

        txtDescricao.setColumns(20);
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(3);
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes"));
        jScrollPane2.setViewportView(txtDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDataVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                        .addComponent(txtValor)))
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNomeEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnProcurarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnProcurarEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnVoltar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProcurarCliente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNomeEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProcurarEletronico))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarClienteActionPerformed
        cliSelecionado = gerenciadorI.janelaProcurarCliente();
        if (cliSelecionado != null) {
            txtNomeCliente.setText(cliSelecionado.getNome());
        }
    }//GEN-LAST:event_btnProcurarClienteActionPerformed

    private void btnProcurarEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEletronicoActionPerformed
        eletSelecionado = gerenciadorI.janelaProcurarEletronico();
        if (eletSelecionado != null) {
            txtNomeEletronico.setText(eletSelecionado.getTipo().toString());
        }
    }//GEN-LAST:event_btnProcurarEletronicoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        String descricaoVenda = txtDescricao.getText();
        String dataVendaStr = txtDataVenda.getText();
        int valor = Integer.parseInt(txtValor.getText());
        
        try {
            Date dataVenda = FuncoesUteis.strToDate(dataVendaStr);
            int idVenda = gerenciadorI.getGerDominio().inserirVenda(dataVenda, descricaoVenda, valor, cliSelecionado, eletSelecionado);
            JOptionPane.showMessageDialog(this, "Venda " + idVenda + " realizada com sucesso.");
            this.dispose();
                
        } catch (ParseException | HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Servico", JOptionPane.ERROR_MESSAGE  );
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Servico", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnVenderActionPerformed

  
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcurarCliente;
    private javax.swing.JButton btnProcurarEletronico;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeEletronico;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
