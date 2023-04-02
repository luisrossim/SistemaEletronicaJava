package gerenciadorTarefas;

import interfaces.DlgCadCliente;
import interfaces.DlgCadProdutoRef;
import interfaces.DlgCadServico;
import interfaces.FrmLogin;
import interfaces.FrmPrincipal;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class GerenciadorInterface {
    
    private FrmLogin janLogin = null;
    private FrmPrincipal janPrincipal = null;
    private DlgCadCliente janCadCliente = null;
    private DlgCadServico janCadServico = null;
    private DlgCadProdutoRef janCadProdutoRef = null;
    
    
    
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerenciadorInterface.class ).newInstance(parent,true,this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() );
            }
        }        
        dlg.setVisible(true); 
        return dlg;
    }
    
    
    public void janelaLogin(){
        janLogin = new FrmLogin(this);
        janLogin.setVisible(true);
    }
    
    
    public void janelaPrincipal(){
        janLogin.setVisible(false);
        janPrincipal = new FrmPrincipal(this);
        janPrincipal.setVisible(true);
    }
    
    
    public void janelaCadCliente() {
        janCadCliente = (DlgCadCliente) abrirJanela(janPrincipal, janCadCliente, DlgCadCliente.class);
    }
    
    
    public void janelaCadServico(){
        janCadServico = (DlgCadServico) abrirJanela(janPrincipal, janCadServico, DlgCadServico.class);
    }
    
    
    public void janelaCadProdutoRef(){
        janCadProdutoRef = (DlgCadProdutoRef) abrirJanela(janPrincipal, janCadProdutoRef, DlgCadProdutoRef.class);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // System.out.println( info.getName() );
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        GerenciadorInterface gerIG = new GerenciadorInterface();
        gerIG.janelaLogin();
    }    
}

