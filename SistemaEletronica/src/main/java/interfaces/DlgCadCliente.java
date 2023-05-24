package interfaces;

import dominio.Cidade;
import dominio.Cliente;
import gerenciadorTarefas.GerenciadorInterface;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class DlgCadCliente extends javax.swing.JDialog {

    private GerenciadorInterface gerenciadorI;
    private Cliente cliSelecionado;    
    
    public DlgCadCliente(java.awt.Frame parent, boolean modal, GerenciadorInterface gerenciadorI) {
        initComponents();
        this.gerenciadorI = gerenciadorI;
        this.cliSelecionado = null;
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdbFem = new javax.swing.JRadioButton();
        rdbMasc = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        comboCidade = new javax.swing.JComboBox<>();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnAddCidade = new javax.swing.JButton();
        btnAttComboCidades = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setModal(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Informações do cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        btngrpSexo.add(rdbFem);
        rdbFem.setMnemonic('F');
        rdbFem.setText("Feminino");

        btngrpSexo.add(rdbMasc);
        rdbMasc.setMnemonic('M');
        rdbMasc.setSelected(true);
        rdbMasc.setText("Masculino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbFem)
                    .addComponent(rdbMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbMasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbFem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 100, 80));

        jLabel11.setText("Telefone:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel1.add(comboCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 170, -1));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 170, -1));

        jLabel13.setText("Cidade:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        jLabel6.setText("CPF:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, 260, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/search.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));

        jLabel12.setText("Email:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnAddCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/add.png"))); // NOI18N
        btnAddCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        btnAttComboCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces.imgs/repeat.png"))); // NOI18N
        btnAttComboCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttComboCidadesActionPerformed(evt);
            }
        });
        jPanel1.add(btnAttComboCidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

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

        btnCadastrarCliente.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCadastrarCliente.setBorderPainted(false);
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorI.carregarComboBox(comboCidade, Cidade.class);
    }//GEN-LAST:event_formComponentShown

    private void btnAddCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCidadeActionPerformed
        gerenciadorI.janelaCadCidade();
    }//GEN-LAST:event_btnAddCidadeActionPerformed

    private void btnAttComboCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttComboCidadesActionPerformed
        gerenciadorI.carregarComboBox(comboCidade, Cidade.class);
    }//GEN-LAST:event_btnAttComboCidadesActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        String nome = txtNome.getText();
        String telefone = txtTelefone.getText();
        String cpf = txtCpf.getText();
        Cidade cidade = (Cidade) comboCidade.getSelectedItem();
        char sexo = (char) btngrpSexo.getSelection().getMnemonic();
        String email = txtEmail.getText();
        
        if(validarCampos()) {
            try {
                if(cliSelecionado == null) {
                    // INSERIR
                    int id = gerenciadorI.getGerDominio().inserirCliente(nome, telefone, cpf, cidade, sexo, email);
                    JOptionPane.showMessageDialog(this, "Cliente " + id + "inserido com sucesso.", "Inserir Cliente", JOptionPane.INFORMATION_MESSAGE  );
                }else{
                    // ALTERAR                
                }
                
            } catch(HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            }
        }
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private boolean validarCampos() {
        String msgErro = "";
        
        //VALIDAR CAMPOS
        
        if(msgErro.isEmpty()) {
            return true;
        }else{            
            JOptionPane.showMessageDialog(this, msgErro, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCidade;
    private javax.swing.JButton btnAttComboCidades;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btngrpSexo;
    private javax.swing.JComboBox<String> comboCidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdbFem;
    private javax.swing.JRadioButton rdbMasc;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
