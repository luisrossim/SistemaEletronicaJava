package gerenciadorTarefas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import interfaces.DlgCadCliente;
import interfaces.DlgCadProdutoRef;
import interfaces.DlgCadServico;
import interfaces.DlgLogin;
import interfaces.DlgPesqCliente;
import interfaces.DlgPesqProduto;
import interfaces.DlgPesqServico;
import interfaces.DlgPesqVenda;
import interfaces.DlgVendaProdutoRef;
import interfaces.FrmPrincipal;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GerenciadorInterface {
    
    private DlgLogin janLogin = null;
    private FrmPrincipal janPrincipal = null;
    private DlgCadCliente janCadCliente = null;
    private DlgCadServico janCadServico = null;
    private DlgCadProdutoRef janCadProdutoRef = null;
    private DlgVendaProdutoRef janVendaProdutoRef = null;
    private DlgPesqCliente janelaProcurarCliente = null;
    private DlgPesqServico janelaProcurarServico = null;
    private DlgPesqProduto janelaProcurarProduto = null;
    private DlgPesqVenda janelaProcurarVenda = null;
    
    
    
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
    
    
    public void janelaLogin() {
        janLogin = (DlgLogin) abrirJanela(null, janLogin, DlgLogin.class);
    }
   
    public void janelaPrincipal(){
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
    
    public void janelaVendaProdutoRef(){
        janVendaProdutoRef = (DlgVendaProdutoRef) abrirJanela(janPrincipal, janVendaProdutoRef, DlgVendaProdutoRef.class);
    }
    
    public void janelaProcurarCliente(){
        janelaProcurarCliente = (DlgPesqCliente) abrirJanela(janPrincipal, janelaProcurarCliente, DlgPesqCliente.class);
    }
    
    public void janelaProcurarServico(){
        janelaProcurarServico = (DlgPesqServico) abrirJanela(janPrincipal, janelaProcurarServico, DlgPesqServico.class);
    }
    
    public void janelaProcurarProduto(){
        janelaProcurarProduto = (DlgPesqProduto) abrirJanela(janPrincipal, janelaProcurarProduto, DlgPesqProduto.class);
    }
    
    public void janelaProcurarVenda(){
        janelaProcurarVenda = (DlgPesqVenda) abrirJanela(janPrincipal, janelaProcurarVenda, DlgPesqVenda.class);
    }
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the FlatLighLaf and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        //Setando um tema de um repositório externo
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "Falha ao iniciar tema FlatDarkLaf" );
        }catch (Exception ex) {
            System.err.println( "Falha ao definir tema" );
        } 
        //</editor-fold>

        GerenciadorInterface gerIG = new GerenciadorInterface();
        gerIG.janelaLogin();
    }    
}

