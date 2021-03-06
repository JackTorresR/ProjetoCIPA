
package Telas.Cadastrar;

import Controles.Conexões.Conexao;
import Controles.DAOs.CandidatoDAO;
import Controles.DAOs.EleicaoDAO;
import Modelos.Candidato.Candidato;
import Modelos.Eleição.Eleicao;
import Telas.Principal.TelaPrincipal;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JInternalCadastrarCandidato extends javax.swing.JInternalFrame {

    private static String path="null";
    
    public JInternalCadastrarCandidato() {
        initComponents();
        jbNovo.requestFocus();
        setSize(901, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNome = new javax.swing.JTextField();
        jbFoto = new javax.swing.JButton();
        lbFoto = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jtfCod = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmImagem = new javax.swing.JMenu();
        jmiSelecionarFoto = new javax.swing.JMenuItem();

        setClosable(true);
        setTitle("Cadastrar Candidato");
        getContentPane().setLayout(null);

        jtfNome.setEditable(false);
        jtfNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfNome.setBorder(null);
        jtfNome.setOpaque(false);
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNomeKeyPressed(evt);
            }
        });
        getContentPane().add(jtfNome);
        jtfNome.setBounds(410, 310, 410, 40);

        jbFoto.setContentAreaFilled(false);
        jbFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbFoto.setEnabled(false);
        jbFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFotoActionPerformed(evt);
            }
        });
        getContentPane().add(jbFoto);
        jbFoto.setBounds(73, 63, 290, 300);

        lbFoto.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbFotoKeyPressed(evt);
            }
        });
        getContentPane().add(lbFoto);
        lbFoto.setBounds(80, 70, 270, 280);

        jbSalvar.setContentAreaFilled(false);
        jbSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvar.setEnabled(false);
        jbSalvar.setFocusable(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar);
        jbSalvar.setBounds(360, 460, 180, 60);

        jbLimpar.setContentAreaFilled(false);
        jbLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpar.setEnabled(false);
        jbLimpar.setFocusable(false);
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar);
        jbLimpar.setBounds(610, 460, 200, 60);

        jbNovo.setContentAreaFilled(false);
        jbNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNovo.setFocusable(false);
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jbNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbNovoKeyPressed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(80, 460, 200, 60);

        jtfCod.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        jtfCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtfCod.setText("0");
        getContentPane().add(jtfCod);
        jtfCod.setBounds(420, 110, 110, 80);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cadastros/Candidato/bgCadastrarCandidato.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 900, 550);

        jmImagem.setText("Arquivo");
        jmImagem.setEnabled(false);

        jmiSelecionarFoto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmiSelecionarFoto.setText("Selecionar Foto");
        jmiSelecionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSelecionarFotoActionPerformed(evt);
            }
        });
        jmImagem.add(jmiSelecionarFoto);

        jMenuBar1.add(jmImagem);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSelecionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSelecionarFotoActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Inserir imagem");
        
        //No JFileChooser Aparece apenas pastas
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        //No JFileChooser Aparece apenas as extenções jpg e png
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Somente imagens", "jpg","png", "jpeg");
        jfc.setFileFilter(filter);

        //Entrar diretamente em uma pasta
        String caminho = "C:\\Users\\info3\\Desktop";
        File dir = new File(caminho);
        jfc.setCurrentDirectory(dir);
        
        int retorno = jfc.showOpenDialog(this);
            if(retorno==JFileChooser.APPROVE_OPTION){
                File file = jfc.getSelectedFile();
                
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(file.getPath()).getImage().getScaledInstance(lbFoto.getWidth(), lbFoto.getHeight(), Image.SCALE_DEFAULT));
                lbFoto.setIcon(imageIcon);
                path=file.getPath();
            }
    }//GEN-LAST:event_jmiSelecionarFotoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        novo();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtfCod.setText("0");
        jtfNome.setText("");
        lbFoto.setIcon(null);
        
        jbSalvar.setEnabled(false);
        jbLimpar.setEnabled(false);
        jbNovo.setEnabled(true);
        jmImagem.setEnabled(false);
        jtfNome.setEditable(false);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(Integer.parseInt(jtfCod.getText())==0){
                JOptionPane.showMessageDialog(null, "Lembre-se de colocar um nome e selecionar uma foto para poder salvar.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
            }else{
                salvar();
            }
        }
    }//GEN-LAST:event_jtfNomeKeyPressed

    private void jbNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbNovoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            novo();
        }
    }//GEN-LAST:event_jbNovoKeyPressed

    private void lbFotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbFotoKeyPressed

    }//GEN-LAST:event_lbFotoKeyPressed

    private void jbFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFotoActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Inserir imagem");
        
        //No JFileChooser Aparece apenas pastas
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        //No JFileChooser Aparece apenas as extenções jpg e png
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Somente imagens", "jpg","png", "jpeg");
        jfc.setFileFilter(filter);

        //Entrar diretamente em uma pasta
        String caminho = "C:\\Users\\info3\\Desktop";
        File dir = new File(caminho);
        jfc.setCurrentDirectory(dir);
        
        int retorno = jfc.showOpenDialog(this);
            if(retorno==JFileChooser.APPROVE_OPTION){
                File file = jfc.getSelectedFile();
                
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(file.getPath()).getImage().getScaledInstance(lbFoto.getWidth(), lbFoto.getHeight(), Image.SCALE_DEFAULT));
                lbFoto.setIcon(imageIcon);
                path=file.getPath();
            }
    }//GEN-LAST:event_jbFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbFoto;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JMenu jmImagem;
    private javax.swing.JMenuItem jmiSelecionarFoto;
    private javax.swing.JLabel jtfCod;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JLabel lbFoto;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        Connection con = Conexao.abrirConexao();
        CandidatoDAO adao = new CandidatoDAO(con);
        
        
            if(jtfNome.getText().equals("") || jtfCod.getText().equals("") || lbFoto.getIcon()==null){
                JOptionPane.showMessageDialog(null, "Coloque um nome para poder salvar e/ou uma foto.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
            }else{
                //if para limitar dados
                if(jtfNome.getText().length()>=46){
                    JOptionPane.showMessageDialog(null, "O número máximo de caracteres no nome e 45.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
                }else{
                    //coletei os dos camppos de texto do formulário
                    int cod = Integer.parseInt(jtfCod.getText());
                    String nome = verificarCaracteres();
                    String caminho = this.path;
                    System.out.println("Cadastrar candidato: "+caminho);
                    int votos=0;
                    int num_eleicao = TelaPrincipal.numEleicao;

                    //Instanciei um objeto Candidato
                    Candidato a = new Candidato();

                    //Atribui os valores dos campos de texto ao objeto criado
                    a.setCod_candidato(cod);
                    a.setNome(nome);
                    a.setFoto(caminho);
                    a.setVotos(votos);
                    a.setNum_eleicao(num_eleicao);

                    String reg = adao.inserirCandidato(a);
                    Conexao.fecharConexao(con);
                        if(reg.equals("ok")){
                            JOptionPane.showMessageDialog(null, "Candidato inserido com sucesso.","JKLR Sistemas",JOptionPane.INFORMATION_MESSAGE);
                            voltarAoZero();
                        }else{
                            JOptionPane.showMessageDialog(null, "Falha ao inserir o candidato.","JKLR Sistemas",JOptionPane.ERROR_MESSAGE);
                        }
                }
            }
    }

    public void novo(){
        Connection con = Conexao.abrirConexao();
        CandidatoDAO adao = new CandidatoDAO(con);
        int numEleicao = TelaPrincipal.numEleicao;
        int cod = adao.verificarCod(""+numEleicao);
        System.out.println("O código é: " + cod );
        boolean teste = adao.TestarCod(numEleicao,cod);
            if(teste!=true){
                if(cod>15){
                    JOptionPane.showMessageDialog(null,"Código passou do limite, de 15.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
                    this.dispose();
                }else{
                    jtfCod.setText(Integer.toString(cod));
                    Conexao.fecharConexao(con);

                    //Foco (IN)
                    jtfNome.requestFocus();
                    //Foco (OUT)

                    jbSalvar.setEnabled(true);
                    jbLimpar.setEnabled(true);
                    jbNovo.setEnabled(false);
                    jmImagem.setEnabled(true);
                    jbFoto.setEnabled(true);
                    jtfNome.setEditable(true);
                    jtfNome.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null,"Número da eleição não encontrado","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
            }
    }
    
    public void voltarAoZero(){
        jtfCod.setText("0");
        jtfNome.setText("");
        lbFoto.setIcon(null);

        jbNovo.setEnabled(true);
        jbLimpar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jmImagem.setEnabled(false);
        jbFoto.setEnabled(false);
        jtfNome.setEditable(false);
        
        jbNovo.requestFocus();
    }

    private String verificarCaracteres() {
        String text = jtfNome.getText().replaceAll("[-/?!|:;()*<>]", " ");        
        
        return text;
        
    }

    
}
