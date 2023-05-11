package interfaces;

import dominio.Marca;
import gerenciadorTarefas.GerenciadorInterface;

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
        jPanel2 = new javax.swing.JPanel();
        chkTelevisao = new javax.swing.JCheckBox();
        chkMonitor = new javax.swing.JCheckBox();
        chkSom = new javax.swing.JCheckBox();
        chkVG = new javax.swing.JCheckBox();
        chkDVD = new javax.swing.JCheckBox();
        chkControle = new javax.swing.JCheckBox();
        chkComputador = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        txtNomeTipo = new javax.swing.JTextField();
        btnAddMarca = new javax.swing.JButton();
        comboMarca = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReparos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
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
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Eletronico"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpTipo.add(chkTelevisao);
        chkTelevisao.setMnemonic('a');
        chkTelevisao.setText("Televisão");
        jPanel2.add(chkTelevisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        gpTipo.add(chkMonitor);
        chkMonitor.setMnemonic('b');
        chkMonitor.setText("Monitor");
        jPanel2.add(chkMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        gpTipo.add(chkSom);
        chkSom.setMnemonic('d');
        chkSom.setText("Aparelho de Som");
        jPanel2.add(chkSom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        gpTipo.add(chkVG);
        chkVG.setMnemonic('f');
        chkVG.setText("Video Game");
        jPanel2.add(chkVG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        gpTipo.add(chkDVD);
        chkDVD.setMnemonic('e');
        chkDVD.setText("DVD");
        jPanel2.add(chkDVD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        gpTipo.add(chkControle);
        chkControle.setMnemonic('c');
        chkControle.setText("Controle");
        jPanel2.add(chkControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        gpTipo.add(chkComputador);
        chkComputador.setMnemonic('g');
        chkComputador.setText("Computador");
        jPanel2.add(chkComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        gpTipo.add(jCheckBox8);
        jCheckBox8.setMnemonic('h');
        jCheckBox8.setText("Outro:");
        jPanel2.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));
        jPanel2.add(txtNomeTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, 20));

        btnAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 30, 20));

        jPanel2.add(comboMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, 20));

        jLabel15.setText("Marca:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 250));

        txtReparos.setColumns(20);
        txtReparos.setLineWrap(true);
        txtReparos.setRows(3);
        txtReparos.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes e Reparos"));
        jScrollPane2.setViewportView(txtReparos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 190, 110));

        txtDescricao.setColumns(20);
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Especificações do eletrônico"));
        jScrollPane3.setViewportView(txtDescricao);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 120));

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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
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
        gerenciadorI.carregarComboMarcas(comboMarca);
    }//GEN-LAST:event_formComponentShown

    private void btnAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcaActionPerformed
        gerenciadorI.janelaCadMarca();
    }//GEN-LAST:event_btnAddMarcaActionPerformed

    private void btnCadEletronicoRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEletronicoRefActionPerformed
        String descricao = txtDescricao.getText();
        String reparos = txtReparos.getText();
        int valor = Integer.parseInt(txtValor.getText());
        Marca marca = (Marca) comboMarca.getSelectedItem();
        String nomeTipo = "";
        
        char tipo = (char) gpTipo.getSelection().getMnemonic();
        switch (tipo) {
            case 'A' : nomeTipo = chkTelevisao.getText().toString(); break;
            case 'B' : nomeTipo = chkMonitor.getText().toString(); break;
            case 'C' : nomeTipo = chkControle.getText().toString(); break;
            case 'D' : nomeTipo = chkSom.getText().toString(); break;
            case 'E' : nomeTipo = chkDVD.getText().toString(); break;
            case 'F' : nomeTipo = chkVG.getText().toString(); break;
            case 'G' : nomeTipo = chkComputador.getText().toString(); break;
            case 'H' : nomeTipo = txtNomeTipo.getText(); break;
        }
        
        //gerenciadorI.getGerDominio().inserirTipoEletronico(nomeTipo, marca);
        //gerenciadorI.getGerDominio().inserirEletronicoReformado(descricao, reparos, valor, nomeTipo, marca);
    }//GEN-LAST:event_btnCadEletronicoRefActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMarca;
    private javax.swing.JButton btnCadEletronicoRef;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chkComputador;
    private javax.swing.JCheckBox chkControle;
    private javax.swing.JCheckBox chkDVD;
    private javax.swing.JCheckBox chkMonitor;
    private javax.swing.JCheckBox chkSom;
    private javax.swing.JCheckBox chkTelevisao;
    private javax.swing.JCheckBox chkVG;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.ButtonGroup gpTipo;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNomeTipo;
    private javax.swing.JTextArea txtReparos;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
