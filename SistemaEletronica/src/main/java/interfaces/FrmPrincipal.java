package interfaces;

import gerenciadorTarefas.GerenciadorInterface;
import javax.swing.JDialog;

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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnCadCliente = new javax.swing.JMenuItem();
        btnCadServico = new javax.swing.JMenuItem();
        btnCadProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de controle");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços recentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Produto", "Data", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 400, 610));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        jButton1.setText("Novo");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 23, 100, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jButton2.setText("Procurar");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 23, 100, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/remove.png"))); // NOI18N
        jButton3.setText("Excluir");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 100, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendas recentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Produto", "Data", "Valor"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, 330));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        jButton4.setText("Nova");
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 23, 100, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jButton5.setText("Procurar");
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 23, 100, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/remove.png"))); // NOI18N
        jButton6.setText("Excluir");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 100, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Área de produtos reformados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Área do cliente e serviços");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Descrição", "Qualidade", "Valor"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 220));

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

        btnCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnCadProduto.setText("Produto");
        btnCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadProduto);
        jMenu2.add(jSeparator1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        jMenuItem3.setText("Tipo de reparo");
        jMenu2.add(jMenuItem3);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        jMenuItem13.setText("Marca");
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Procurar");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jMenu4.setText("Cliente");

        jMenuItem8.setText("Pelo nome");
        jMenu4.add(jMenuItem8);

        jMenuItem11.setText("Pela cidade");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Pelo produto");
        jMenu4.add(jMenuItem12);

        jMenu5.add(jMenu4);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jMenu7.setText("Produto");

        jMenuItem9.setText("Pela categoria/marca");
        jMenu7.add(jMenuItem9);

        jMenu5.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jMenu8.setText("Serviço");

        jMenuItem4.setText("Pela data");
        jMenu8.add(jMenuItem4);

        jMenuItem5.setText("Pelo status");
        jMenu8.add(jMenuItem5);

        jMenu5.add(jMenu8);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jMenuItem10.setText("Teclas de atalho");
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("Sair");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/remove.png"))); // NOI18N
        jMenuItem2.setText("Sair do sistema");
        jMenu3.add(jMenuItem2);

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
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        gerenciadorI.janelaCadCliente();
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadServicoActionPerformed
        gerenciadorI.janelaCadServico();
    }//GEN-LAST:event_btnCadServicoActionPerformed

    private void btnCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProdutoActionPerformed
        gerenciadorI.janelaCadProdutoRef();
    }//GEN-LAST:event_btnCadProdutoActionPerformed

    
    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadCliente;
    private javax.swing.JMenuItem btnCadProduto;
    private javax.swing.JMenuItem btnCadServico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
