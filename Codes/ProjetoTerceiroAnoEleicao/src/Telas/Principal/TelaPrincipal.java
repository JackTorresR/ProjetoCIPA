
package Telas.Principal;

import Telas.Eleicao.JInternalEleicao;
import Controles.Conexões.Conexao;
import Controles.DAOs.*;
import Telas.Cadastrar.*;
import Telas.Config.JInternalConfig;
import Telas.Credits.JInternalCredits;
import Telas.Resultado.*;
import Telas.Tips.JInternalTips;
import Telas.Visualização.JInternalVisualizarCandidatos;
import Telas.Votação.*;
import java.awt.*;
import javax.swing.*;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipal extends javax.swing.JFrame {

    public static Boolean votar = false;
    public static int numEleicao=0;

    public TelaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Votar.setVisible(false);
        Encerrar.setVisible(false);
        setIcon();
        LimparCandidatos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        PainelDesktop = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Img/Menu/bg.png"));
            final Image image = icon.getImage();
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
            }
        };
        BarraMenu = new javax.swing.JMenuBar();
        Votacao = new javax.swing.JMenu();
        Votar = new javax.swing.JMenuItem();
        Iniciate = new javax.swing.JMenuItem();
        Encerrar = new javax.swing.JMenuItem();
        Candidatos = new javax.swing.JMenu();
        VerListaCandidatos = new javax.swing.JMenuItem();
        CadastrarCandidatos = new javax.swing.JMenuItem();
        LimparCandidatos = new javax.swing.JMenuItem();
        Resultado = new javax.swing.JMenu();
        howUse = new javax.swing.JMenu();
        Config = new javax.swing.JMenu();
        Creditos = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        javax.swing.GroupLayout PainelDesktopLayout = new javax.swing.GroupLayout(PainelDesktop);
        PainelDesktop.setLayout(PainelDesktopLayout);
        PainelDesktopLayout.setHorizontalGroup(
            PainelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        PainelDesktopLayout.setVerticalGroup(
            PainelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        BarraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        Votacao.setText("Eleição");
        Votacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Votacao.setDelay(50);
        Votacao.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        Votacao.setPreferredSize(new java.awt.Dimension(130, 45));

        Votar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Votar.setText("Votar");
        Votar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Votar.setPreferredSize(new java.awt.Dimension(145, 50));
        Votar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotarActionPerformed(evt);
            }
        });
        Votacao.add(Votar);

        Iniciate.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Iniciate.setText("Iniciar");
        Iniciate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciate.setPreferredSize(new java.awt.Dimension(145, 50));
        Iniciate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciateActionPerformed(evt);
            }
        });
        Votacao.add(Iniciate);

        Encerrar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Encerrar.setText("Encerrar");
        Encerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Encerrar.setPreferredSize(new java.awt.Dimension(145, 50));
        Encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncerrarActionPerformed(evt);
            }
        });
        Votacao.add(Encerrar);

        BarraMenu.add(Votacao);

        Candidatos.setText("Candidatos  ");
        Candidatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Candidatos.setDelay(50);
        Candidatos.setEnabled(false);
        Candidatos.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        Candidatos.setPreferredSize(new java.awt.Dimension(190, 45));

        VerListaCandidatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        VerListaCandidatos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        VerListaCandidatos.setText("Listar");
        VerListaCandidatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerListaCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerListaCandidatosActionPerformed(evt);
            }
        });
        Candidatos.add(VerListaCandidatos);

        CadastrarCandidatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        CadastrarCandidatos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        CadastrarCandidatos.setText("Cadastrar");
        CadastrarCandidatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCandidatosActionPerformed(evt);
            }
        });
        Candidatos.add(CadastrarCandidatos);

        LimparCandidatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        LimparCandidatos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        LimparCandidatos.setText("Excluir Dados");
        LimparCandidatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LimparCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCandidatosActionPerformed(evt);
            }
        });
        Candidatos.add(LimparCandidatos);

        BarraMenu.add(Candidatos);

        Resultado.setText("Resultado");
        Resultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resultado.setDelay(50);
        Resultado.setEnabled(false);
        Resultado.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        Resultado.setPreferredSize(new java.awt.Dimension(166, 45));
        Resultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultadoMouseClicked(evt);
            }
        });
        BarraMenu.add(Resultado);

        howUse.setText("Ajuda");
        howUse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        howUse.setDelay(50);
        howUse.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        howUse.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        howUse.setPreferredSize(new java.awt.Dimension(110, 45));
        howUse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                howUseMouseClicked(evt);
            }
        });
        BarraMenu.add(howUse);

        Config.setText("Config");
        Config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Config.setDelay(50);
        Config.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        Config.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Config.setPreferredSize(new java.awt.Dimension(120, 45));
        Config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfigMouseClicked(evt);
            }
        });
        BarraMenu.add(Config);

        Creditos.setText("Créditos");
        Creditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Creditos.setDelay(50);
        Creditos.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        Creditos.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Creditos.setPreferredSize(new java.awt.Dimension(145, 45));
        Creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreditosMouseClicked(evt);
            }
        });
        BarraMenu.add(Creditos);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerListaCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerListaCandidatosActionPerformed
        Connection con = Conexao.abrirConexao();
        CandidatoDAO adao = new CandidatoDAO(con);
        boolean resp = adao.verificarConteudo(numEleicao);
            if(resp==true){
                JInternalVisualizarCandidatos obj = new JInternalVisualizarCandidatos();
                PainelDesktop.add(obj);
                obj.setVisible(true);
                centralizaForm(obj);  
            }else{
                JOptionPane.showMessageDialog(null, "Cadastre algum candidato antes!", "JKLR Sistemas", JOptionPane.WARNING_MESSAGE);
            }
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_VerListaCandidatosActionPerformed

    private void ResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultadoMouseClicked
        if(numEleicao!=0){
            String confirm = verificarSenha();
            if(confirm.equalsIgnoreCase("Yes")){
                Resultado obj = new Resultado();
                PainelDesktop.add(obj);
                obj.setVisible(true);
                centralizaForm(obj);
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Você só pode ver o resultado se tiver com uma eleição aberta!", "JKLR Sistemas", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ResultadoMouseClicked

    private void CadastrarCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCandidatosActionPerformed
        String confirm = verificarSenha();
        if(confirm.equalsIgnoreCase("Yes")){
            JInternalCadastrarCandidato obj = new JInternalCadastrarCandidato();
            PainelDesktop.add(obj);
            obj.setVisible(true);
            centralizaForm(obj);
        }
    }//GEN-LAST:event_CadastrarCandidatosActionPerformed

    private void VotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotarActionPerformed
        Connection con = Conexao.abrirConexao();
        CandidatoDAO adao = new CandidatoDAO(con);
        boolean resp = adao.verificarConteudo(numEleicao);
            if(resp==true){
                JInternalVotar obj = new JInternalVotar();
                PainelDesktop.add(obj);
                obj.setVisible(true);
                centralizaForm(obj);
            }else{
                JOptionPane.showMessageDialog(null, "Você só pode votar se tiver algum candidato cadastrado!", "JKLR Sistemas", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_VotarActionPerformed

    private void IniciateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciateActionPerformed
        ligarVotacao();
    }//GEN-LAST:event_IniciateActionPerformed

    private void EncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncerrarActionPerformed
        DesligarVotacao();
    }//GEN-LAST:event_EncerrarActionPerformed

    private void CreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditosMouseClicked
        JInternalCredits obj = new JInternalCredits();
        PainelDesktop.add(obj);
        obj.setVisible(true);
        centralizaForm(obj);
    }//GEN-LAST:event_CreditosMouseClicked

    private void ConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigMouseClicked
        String confirm = verificarSenha();
        if(confirm.equalsIgnoreCase("Yes")){
            JInternalConfig obj = new JInternalConfig();
            PainelDesktop.add(obj);
            obj.setVisible(true);
            centralizaForm(obj);
        }
    }//GEN-LAST:event_ConfigMouseClicked

    //Quando clicar na opção cadastrar, passar o mouse pelo nome candidato e clicar no nome limparDados irá resetar os candidatos do BD
    private void LimparCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCandidatosActionPerformed
        String confirm = verificarSenha();
        if(confirm.equalsIgnoreCase("Yes")){
            Object[] options = { "Sim", "Não" };
            int opcao = JOptionPane.showOptionDialog(null, "Tem certeza disso?", "JKLR Sistemas", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options,options[0]);
            if(opcao==0){
                //Variavél de confirmação
                deleteCandidatos();
                JOptionPane.showMessageDialog(null, "Sucesso ao deletar os dados!", "JKLR Sistemas", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_LimparCandidatosActionPerformed

    private void howUseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_howUseMouseClicked
        JInternalTips obj = new JInternalTips();
        PainelDesktop.add(obj);
        obj.setVisible(true);
        centralizaForm(obj);
    }//GEN-LAST:event_howUseMouseClicked

   
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               TelaPrincipal tp = new TelaPrincipal();
               tp.setLocationRelativeTo(null);
               tp.pack();
               tp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    public static javax.swing.JMenuItem CadastrarCandidatos;
    public static javax.swing.JMenu Candidatos;
    public static javax.swing.JMenu Config;
    public static javax.swing.JMenu Creditos;
    public static javax.swing.JMenuItem Encerrar;
    public static javax.swing.JMenuItem Iniciate;
    public static javax.swing.JMenuItem LimparCandidatos;
    private javax.swing.JDesktopPane PainelDesktop;
    public static javax.swing.JMenu Resultado;
    public static javax.swing.JMenuItem VerListaCandidatos;
    public static javax.swing.JMenu Votacao;
    public static javax.swing.JMenuItem Votar;
    public static javax.swing.JMenu howUse;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    private void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = PainelDesktop.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    private void deleteCandidatos() {
        Connection con = Conexao.abrirConexao();
        CandidatoDAO adao = new CandidatoDAO(con);
        adao.deletarDados();
        Conexao.fecharConexao(con);
    }

    private void ligarVotacao(){
        if(votar==true){
            JOptionPane.showMessageDialog(null, "A votação já começou!", "JKLR Sistemas", JOptionPane.ERROR_MESSAGE);
        }else{
            cadastrarEleicao();
        }
        
    }
    
    private void cadastrarEleicao(){
        JInternalEleicao obj = new JInternalEleicao();
        PainelDesktop.add(obj);
        obj.setVisible(true);
        centralizaForm(obj);
    }
    
    public void DesligarVotacao() {
        if(votar==true){
            votar=false;
            numEleicao=0;
            Encerrar.setVisible(false);
            Iniciate.setVisible(true);
            Votar.setVisible(false);
            Resultado.setEnabled(false);
            Candidatos.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Fechada a votação!", "JKLR Sistemas", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Já não está acontecendo votação!", "JKLR Sistemas", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/Menu/logo.png")));
    }
    
    //--------------------------------------------------------------------------
    
    private String verificarSenha(){
        String dig = senha();
        String c="";
        String ret = verificarCod(dig);
        
        return ret;
    }
    
    private String verificarCod(String cod) {
        String retorno="";
        Connection con = Conexao.abrirConexao();
        AdminDAO sql = new AdminDAO(con);
            if(cod.equalsIgnoreCase("") || cod==null){
                
            }else{
                    if(sql.VerificarSenha(cod)==false){
                        retorno= "no";
                        JOptionPane.showMessageDialog(null, "Senha incorreta.", "JKLR Sistemas", JOptionPane.WARNING_MESSAGE);
                    }else{
                        retorno= "yes";
                    }
                
            }
        Conexao.fecharConexao(con);    
        return retorno;
    }
    
    private String senha(){
        JPasswordField senha = new JPasswordField(10);
        senha.setEchoChar('*');
        
        JLabel rotulo = new JLabel("Digite a senha:");
        
        JPanel entUsuario = new JPanel();
        entUsuario.add(rotulo);
        entUsuario.add(senha);
        
        JOptionPane.showMessageDialog(null, entUsuario, "JKLR Sistemas", JOptionPane.PLAIN_MESSAGE);
        senha.requestFocus();
        String s = senha.getText();
        
        return s;
    }
    
}
