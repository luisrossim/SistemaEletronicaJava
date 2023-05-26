package interfaces;


import dominio.EletronicoReformado;
import dominio.Servico;
import dominio.VendaReformado;
import gerenciadorTarefas.GerenciadorInterface;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class FrmPrincipal extends javax.swing.JFrame {

    private GerenciadorInterface gerenciadorI;
    
    public FrmPrincipal(GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicosEmAndamento = new javax.swing.JTable();
        btnNovoServico = new javax.swing.JButton();
        btnProcurarServico2 = new javax.swing.JButton();
        btnProcurarEmAndamento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnVender = new javax.swing.JButton();
        btnProcurarVenda = new javax.swing.JButton();
        btnProcurarVenda2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEletronicos = new javax.swing.JTable();
        btnProcurarEletronicosRef = new javax.swing.JButton();
        btnCadastrarRef = new javax.swing.JButton();
        btnProcurarEletronico2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnCadCliente = new javax.swing.JMenuItem();
        btnCadServico = new javax.swing.JMenuItem();
        btnCadEletronico = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnProcurarCliente = new javax.swing.JMenuItem();
        btnProcurarServico = new javax.swing.JMenuItem();
        btnProcurarEletronico = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de controle");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços em andamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblServicosEmAndamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Tipo Eletronico", "Data Inicio", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicosEmAndamento);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 540, 500));

        btnNovoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/logo16px.png"))); // NOI18N
        btnNovoServico.setText("Novo");
        btnNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoServicoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNovoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        btnProcurarServico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarServico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarServico2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnProcurarServico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 40, 30));

        btnProcurarEmAndamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnProcurarEmAndamento.setText("Listar");
        btnProcurarEmAndamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEmAndamentoActionPerformed(evt);
            }
        });
        jPanel3.add(btnProcurarEmAndamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 100, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/accept.png"))); // NOI18N
        jButton1.setText("Finalizar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 100, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendas recentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Eletronico", "Data", "Telefone", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVendas);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 490, 210));

        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/sell.png"))); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jPanel4.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        btnProcurarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarVendaActionPerformed(evt);
            }
        });
        jPanel4.add(btnProcurarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 40, 30));

        btnProcurarVenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnProcurarVenda2.setText("Listar");
        btnProcurarVenda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarVenda2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnProcurarVenda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 100, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Área de aparelhos eletronicos reformados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Área do cliente e serviços");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aparelhos cadastrados disponíveis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEletronicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Eletronico", "Detalhes", "Reparos", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblEletronicos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 490, 200));

        btnProcurarEletronicosRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnProcurarEletronicosRef.setText("Listar");
        btnProcurarEletronicosRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEletronicosRefActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcurarEletronicosRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 100, 30));

        btnCadastrarRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadastrarRef.setText("Cadastrar");
        btnCadastrarRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarRefActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrarRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        btnProcurarEletronico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarEletronico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEletronico2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcurarEletronico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 40, 30));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/logo16px.png"))); // NOI18N
        jMenu1.setDisabledSelectedIcon(null);
        jMenu1.setEnabled(false);
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastrar");

        btnCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadCliente.setText("Cliente");
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadCliente);

        btnCadServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadServico.setText("Serviço");
        btnCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadServicoActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadServico);

        btnCadEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadEletronico.setText("Eletronico");
        btnCadEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEletronicoActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadEletronico);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Procurar");

        btnProcurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarCliente.setText("Cliente");
        btnProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarClienteActionPerformed(evt);
            }
        });
        jMenu5.add(btnProcurarCliente);

        btnProcurarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarServico.setText("Serviço");
        btnProcurarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarServicoActionPerformed(evt);
            }
        });
        jMenu5.add(btnProcurarServico);

        btnProcurarEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        btnProcurarEletronico.setText("Eletronico");
        btnProcurarEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEletronicoActionPerformed(evt);
            }
        });
        jMenu5.add(btnProcurarEletronico);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jMenuItem10.setText("Teclas de atalho");
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("Sair");

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/remove.png"))); // NOI18N
        menuSair.setText("Sair do sistema");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu3.add(menuSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        gerenciadorI.janelaCadCliente();
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadServicoActionPerformed
        gerenciadorI.janelaCadServico();
    }//GEN-LAST:event_btnCadServicoActionPerformed

    private void btnCadEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEletronicoActionPerformed
        gerenciadorI.janelaCadEletronicoRef();
    }//GEN-LAST:event_btnCadEletronicoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        gerenciadorI.janelaVendaEletronicoRef();
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarClienteActionPerformed
        gerenciadorI.janelaProcurarCliente();
    }//GEN-LAST:event_btnProcurarClienteActionPerformed

    private void btnProcurarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarServicoActionPerformed
        gerenciadorI.janelaProcurarServico();
    }//GEN-LAST:event_btnProcurarServicoActionPerformed

    private void btnProcurarEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEletronicoActionPerformed
        gerenciadorI.janelaProcurarEletronico();
    }//GEN-LAST:event_btnProcurarEletronicoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoServicoActionPerformed
        gerenciadorI.janelaCadServico();
    }//GEN-LAST:event_btnNovoServicoActionPerformed

    private void btnProcurarEletronicosRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEletronicosRefActionPerformed
        try {
            List<EletronicoReformado> lista = gerenciadorI.getGerDominio().pesquisarEletronico("", 0);
            
            ( (DefaultTableModel) tblEletronicos.getModel() ).setNumRows(0);
            
            for (EletronicoReformado eletronicoRef : lista ) {     
                ( (DefaultTableModel) tblEletronicos.getModel() ).addRow( eletronicoRef.toArray2() );
            }
            
        } catch (ClassNotFoundException | HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao LISTAR Eletronicos", JOptionPane.ERROR_MESSAGE  );
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnProcurarEletronicosRefActionPerformed

    private void btnProcurarServico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarServico2ActionPerformed
        gerenciadorI.janelaProcurarServico();
    }//GEN-LAST:event_btnProcurarServico2ActionPerformed

    private void btnProcurarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarVendaActionPerformed
        gerenciadorI.janelaProcurarVenda();
    }//GEN-LAST:event_btnProcurarVendaActionPerformed

    private void btnCadastrarRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarRefActionPerformed
        gerenciadorI.janelaCadEletronicoRef();
    }//GEN-LAST:event_btnCadastrarRefActionPerformed

    private void btnProcurarEmAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEmAndamentoActionPerformed
        try {
            List<Servico> lista = gerenciadorI.getGerDominio().pesquisarServicos();
            
            ( (DefaultTableModel) tblServicosEmAndamento.getModel() ).setNumRows(0);
            
            for (Servico servico : lista ) {     
                ( (DefaultTableModel) tblServicosEmAndamento.getModel() ).addRow( servico.toArray2() );
            }
            
        } catch (ClassNotFoundException | HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao LISTAR Servicos", JOptionPane.ERROR_MESSAGE  );
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnProcurarEmAndamentoActionPerformed

    private void btnProcurarEletronico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEletronico2ActionPerformed
        gerenciadorI.janelaProcurarEletronico();
    }//GEN-LAST:event_btnProcurarEletronico2ActionPerformed

    private void btnProcurarVenda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarVenda2ActionPerformed
        try {
            List<VendaReformado> lista = gerenciadorI.getGerDominio().pesquisarVendas();
            
            ( (DefaultTableModel) tblVendas.getModel() ).setNumRows(0);
            
            for (VendaReformado venda : lista ) {     
                ( (DefaultTableModel) tblVendas.getModel() ).addRow( venda.toArray() );
            }
            
        } catch (ClassNotFoundException | HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao LISTAR Vendas", JOptionPane.ERROR_MESSAGE  );
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnProcurarVenda2ActionPerformed

    
    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadCliente;
    private javax.swing.JMenuItem btnCadEletronico;
    private javax.swing.JMenuItem btnCadServico;
    private javax.swing.JButton btnCadastrarRef;
    private javax.swing.JButton btnNovoServico;
    private javax.swing.JMenuItem btnProcurarCliente;
    private javax.swing.JMenuItem btnProcurarEletronico;
    private javax.swing.JButton btnProcurarEletronico2;
    private javax.swing.JButton btnProcurarEletronicosRef;
    private javax.swing.JButton btnProcurarEmAndamento;
    private javax.swing.JMenuItem btnProcurarServico;
    private javax.swing.JButton btnProcurarServico2;
    private javax.swing.JButton btnProcurarVenda;
    private javax.swing.JButton btnProcurarVenda2;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JTable tblEletronicos;
    private javax.swing.JTable tblServicosEmAndamento;
    private javax.swing.JTable tblVendas;
    // End of variables declaration//GEN-END:variables
}
