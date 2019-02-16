
package Telas.Config;

import Controles.Conexões.Conexao;
import Controles.DAOs.AdminDAO;
import Telas.Credits.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Modelos.Administrador.Administrador;
import java.sql.Connection;

public class JInternalConfig extends javax.swing.JInternalFrame {

    public JInternalConfig() {
        initComponents();
        setSize(512, 351);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSenha = new javax.swing.JPasswordField();
        bg = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Configurações");
        getContentPane().setLayout(null);

        jpSenha.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jpSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpSenha.setBorder(null);
        jpSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jpSenha);
        jpSenha.setBounds(130, 200, 240, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Config/config.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 500, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpSenhaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            atualizar();
        }
    }//GEN-LAST:event_jpSenhaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPasswordField jpSenha;
    // End of variables declaration//GEN-END:variables

    private void atualizar() {
        if(jpSenha.equals("")){
            JOptionPane.showMessageDialog(null, "Você quer adicionar que senha?","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
        }else{
            String senha = verificarCaracteres();
            
            Administrador a = new Administrador();
            
            a.setSenha(senha);
            
            Connection con = Conexao.abrirConexao();
            AdminDAO sql = new AdminDAO(con);
            String reg = sql.atualizarSenha(a);
                if(reg.equals("ok")){
                    JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso.","JKLR Sistemas",JOptionPane.INFORMATION_MESSAGE);
                    jpSenha.setText("");
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Falha ao atualizar a senha.","JKLR Sistemas",JOptionPane.ERROR_MESSAGE);
                }
            Conexao.fecharConexao(con);  
        }
    }

    private String verificarCaracteres() {
        String text = jpSenha.getText().replaceAll("[-/?!|:;()*<>]", " ");        
        
        return text;
        
    }

   
}
