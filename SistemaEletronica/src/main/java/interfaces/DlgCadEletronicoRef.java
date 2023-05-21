package interfaces;

import dominio.TipoEletronico;
import gerenciadorTarefas.GerenciadorInterface;
import javax.swing.JOptionPane;

public class DlgCadEletronicoRef extends javax.swing.JDialog {

    private GerenciadorInterface gerenciadorI;
    
    public DlgCadEletronicoRef(java.awt.Frame parent, boolean modal, GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpTipo = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReparos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        cadTipoEletronico = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadEletronicoRef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Eletronico Reformado");
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        jButton4.setText("Limpar");
        jButton4.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Informações do eletronico reformado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, -1));

        txtReparos.setColumns(20);
        txtReparos.setLineWrap(true);
        txtReparos.setRows(3);
        txtReparos.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes e Reparos"));
        jScrollPane2.setViewportView(txtReparos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 190, 120));

        txtDescricao.setColumns(20);
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Especificações do eletrônico"));
        jScrollPane3.setViewportView(txtDescricao);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eletronico"));

        jLabel13.setText("Tipo:");

        cadTipoEletronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        cadTipoEletronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadTipoEletronicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(22, 22, 22)
                .addComponent(comboTipo, 0, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cadTipoEletronico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cadTipoEletronico))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 60));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadEletronicoRef.setBackground(new java.awt.Color(0, 102, 102));
        btnCadEletronicoRef.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadEletronicoRef.setForeground(new java.awt.Color(255, 255, 255));
        btnCadEletronicoRef.setText("Cadastrar");
        btnCadEletronicoRef.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCadEletronicoRef.setBorderPainted(false);
        btnCadEletronicoRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEletronicoRefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadEletronicoRef, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadEletronicoRef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorI. carregarComboTipoEletronicos(comboTipo);
    }//GEN-LAST:event_formComponentShown

    private void btnCadEletronicoRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEletronicoRefActionPerformed
        TipoEletronico tipo = (TipoEletronico) comboTipo.getSelectedItem();
        String descricao = txtDescricao.getText();
        String reparos = txtReparos.getText();
        int valor = Integer.parseInt(txtValor.getText());    
        
        int id = gerenciadorI.getGerDominio().inserirEletronicoReformado(descricao, reparos, valor, tipo);
        JOptionPane.showMessageDialog(this, "Eletronico Reformado " + id + " inserido com sucesso.", "Inserir Eletronico Reformado", JOptionPane.INFORMATION_MESSAGE  );
    }//GEN-LAST:event_btnCadEletronicoRefActionPerformed

    private void cadTipoEletronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadTipoEletronicoActionPerformed
        gerenciadorI.janelaCadTipo();
    }//GEN-LAST:event_cadTipoEletronicoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadEletronicoRef;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton cadTipoEletronico;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.ButtonGroup gpTipo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextArea txtReparos;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
