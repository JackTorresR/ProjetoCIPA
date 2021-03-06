
package Telas.Eleicao;

import Telas.Votação.*;
import Telas.Cadastrar.*;
import Controles.Conexões.Conexao;
import Controles.DAOs.*;
import Modelos.Eleição.Eleicao;
import Modelos.TextosPadroes.Padroes;
import Telas.Principal.TelaPrincipal;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

public class JInternalEleicao extends javax.swing.JInternalFrame {

    public static boolean ctrl = false;

    public JInternalEleicao() {
        initComponents();
        capturarDia();
        setSize(901, 583);
        voltarMenuEleicao();
        jbContinuar.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbEdit1 = new javax.swing.JButton();
        jbEdit2 = new javax.swing.JButton();
        jtfCod = new javax.swing.JLabel();
        jtfData = new javax.swing.JFormattedTextField();
        jtfOrganizador = new javax.swing.JTextField();
        jtfPleito = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        bg1 = new javax.swing.JLabel();
        jbNew = new javax.swing.JButton();
        jbContinuar = new javax.swing.JButton();
        bg2 = new javax.swing.JLabel();
        bg21 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Eleições");
        getContentPane().setLayout(null);

        jbEdit1.setContentAreaFilled(false);
        jbEdit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEdit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbEdit1);
        jbEdit1.setBounds(770, 230, 80, 80);

        jbEdit2.setContentAreaFilled(false);
        jbEdit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEdit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbEdit2);
        jbEdit2.setBounds(770, 360, 90, 80);

        jtfCod.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        jtfCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtfCod.setText("0");
        jtfCod.setFocusable(false);
        getContentPane().add(jtfCod);
        jtfCod.setBounds(100, 70, 170, 90);

        jtfData.setEditable(false);
        jtfData.setBorder(null);
        try {
            jtfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfData.setText("");
        jtfData.setFocusable(false);
        jtfData.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jtfData.setOpaque(false);
        jtfData.setRequestFocusEnabled(false);
        getContentPane().add(jtfData);
        jtfData.setBounds(620, 100, 200, 50);

        jtfOrganizador.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jtfOrganizador.setBorder(null);
        jtfOrganizador.setOpaque(false);
        jtfOrganizador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfOrganizadorKeyPressed(evt);
            }
        });
        getContentPane().add(jtfOrganizador);
        jtfOrganizador.setBounds(80, 250, 680, 40);

        jtfPleito.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jtfPleito.setBorder(null);
        jtfPleito.setOpaque(false);
        jtfPleito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPleitoKeyPressed(evt);
            }
        });
        getContentPane().add(jtfPleito);
        jtfPleito.setBounds(80, 380, 680, 40);

        jbCadastrar.setContentAreaFilled(false);
        jbCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCadastrar);
        jbCadastrar.setBounds(190, 460, 180, 60);

        jbCancelar.setContentAreaFilled(false);
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(520, 460, 200, 60);

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Eleicao/bgCadastrarEleicao.png"))); // NOI18N
        getContentPane().add(bg1);
        bg1.setBounds(0, 0, 900, 550);

        jbNew.setContentAreaFilled(false);
        jbNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });
        jbNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbNewKeyPressed(evt);
            }
        });
        getContentPane().add(jbNew);
        jbNew.setBounds(270, 320, 370, 140);

        jbContinuar.setContentAreaFilled(false);
        jbContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinuarActionPerformed(evt);
            }
        });
        jbContinuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbContinuarKeyPressed(evt);
            }
        });
        getContentPane().add(jbContinuar);
        jbContinuar.setBounds(270, 100, 370, 140);

        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Eleicao/bgContinuarEleicao1.png"))); // NOI18N
        getContentPane().add(bg2);
        bg2.setBounds(0, 0, 900, 550);

        bg21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Eleicao/bgContinuarEleicao2.png"))); // NOI18N
        getContentPane().add(bg21);
        bg21.setBounds(0, 0, 900, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfOrganizadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfOrganizadorKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            salvar();
        }
        
        if(evt.getKeyCode()== KeyEvent.VK_CONTROL){
            ctrl=true;
        }
        if(evt.getKeyCode()== KeyEvent.VK_S){
            if (ctrl==true) {
                salvar();
                ctrl=false;
            }
        }
        
        if(evt.getKeyCode()== KeyEvent.VK_DOWN){
            jtfPleito.requestFocus();
        }
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_jtfOrganizadorKeyPressed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        salvar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        voltarMenuEleicao();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfPleitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPleitoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            salvar();
        }
        
        if(evt.getKeyCode()== KeyEvent.VK_CONTROL){
            ctrl=true;
        }
        if(evt.getKeyCode()== KeyEvent.VK_S){
            if (ctrl==true) {
                salvar();
                ctrl=false;
            }
        }
        
        
        if(evt.getKeyCode()== KeyEvent.VK_UP){
            jtfOrganizador.requestFocus();
        }
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_jtfPleitoKeyPressed

    private void jbContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinuarActionPerformed
        continuar();
    }//GEN-LAST:event_jbContinuarActionPerformed

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        bg2.setVisible(false);
        jbContinuar.setVisible(false);
        jbNew.setVisible(false);
        novo();
        jtfOrganizador.requestFocus();
    }//GEN-LAST:event_jbNewActionPerformed

    private void jbEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEdit1ActionPerformed
        Connection con = Conexao.abrirConexao();
        PadroesDAO adao = new PadroesDAO(con);
        Padroes a = new Padroes();
        String resp = JOptionPane.showInputDialog(this,"Digite o novo padrão","JKLR Sistemas", JOptionPane.PLAIN_MESSAGE);
        a.setTpOrganizador(resp);
        String resposta = adao.atualizaTpOrganizador(a);
            if(resposta.equalsIgnoreCase("ok")){
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso.","JKLR Sistemas",JOptionPane.INFORMATION_MESSAGE);
                jtfOrganizador.setText(resp);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi atualizado.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
            }
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_jbEdit1ActionPerformed

    private void jbEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEdit2ActionPerformed
        Connection con = Conexao.abrirConexao();
        PadroesDAO adao = new PadroesDAO(con);
        Padroes a = new Padroes();
        String resp = JOptionPane.showInputDialog(this,"Digite o novo padrão","JKLR Sistemas", JOptionPane.PLAIN_MESSAGE);
        a.setTpPleito(resp);
        String resposta = adao.atualizaTpPleito(a);
            if(resposta.equalsIgnoreCase("ok")){
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso.","JKLR Sistemas",JOptionPane.INFORMATION_MESSAGE);
                jtfPleito.setText(resp);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi atualizado.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
            }
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_jbEdit2ActionPerformed

    private void jbContinuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbContinuarKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            continuar();
        }
        if(evt.getKeyCode()== KeyEvent.VK_DOWN){
            jbNew.requestFocus();
            bg2.setVisible(false);
            bg21.setVisible(true);
        }
    }//GEN-LAST:event_jbContinuarKeyPressed

    private void jbNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbNewKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            novo();
            jtfOrganizador.requestFocus();
        }
        if(evt.getKeyCode()== KeyEvent.VK_UP){
            jbContinuar.requestFocus();
            bg21.setVisible(false);
            bg2.setVisible(true);
        }
    }//GEN-LAST:event_jbNewKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JLabel bg21;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbContinuar;
    private javax.swing.JButton jbEdit1;
    private javax.swing.JButton jbEdit2;
    private javax.swing.JButton jbNew;
    private javax.swing.JLabel jtfCod;
    private javax.swing.JFormattedTextField jtfData;
    private javax.swing.JTextField jtfOrganizador;
    private javax.swing.JTextField jtfPleito;
    // End of variables declaration//GEN-END:variables

    private void novo() {
        Calendar cal =new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        
        Connection con = Conexao.abrirConexao();
        EleicaoDAO adao = new EleicaoDAO(con);
        int cod = adao.verificarCod();
        jtfCod.setText(Integer.toString(cod));
        Conexao.fecharConexao(con);
            
        //Foco (IN)
        jtfOrganizador.requestFocus();
        //Foco (OUT)
        trazerMenu();
    }

    private void salvar(){
        Connection con = Conexao.abrirConexao();
        EleicaoDAO adao = new EleicaoDAO(con);
        
            if(jtfPleito.getText().equalsIgnoreCase("") || jtfOrganizador.getText().equalsIgnoreCase("") || jtfData.getText().equalsIgnoreCase("") || jtfCod.getText().equalsIgnoreCase("0")){
                JOptionPane.showMessageDialog(null, "Insira todos os dados nos campos de texto.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);            }else{    
                //if para limitar dados
                if(jtfOrganizador.getText().length()>=46 || jtfPleito.getText().length()>=101){
                    JOptionPane.showMessageDialog(null, "Caracteres a mais: Pleito Max:100 e Organizado Max:45.","JKLR Sistemas",JOptionPane.WARNING_MESSAGE);
                }else{
                    //coletei os dos camppos de texto do formulário
                    int cod = Integer.parseInt(jtfCod.getText());
                    String organizador = jtfOrganizador.getText();
                    String nome_eleicao = verificarCaracteres();
                    String data = jtfData.getText();
                    int nulos=0;
                    int brancos=0;
                    int validos=0;

                    //Instanciei um objeto Candidato
                    Eleicao a = new Eleicao();

                    //Atribui os valores dos campos de texto ao objeto criado
                    a.setNum_eleicao(cod);
                    a.setNome_eleicao(nome_eleicao);
                    a.setData(data);
                    a.setOrganizador(organizador);
                    a.setNulos(nulos);
                    a.setBrancos(brancos);
                    a.setValidos(validos);

                    String reg = adao.inserirEleicao(a);
                    Conexao.fecharConexao(con);
                        if(reg.equals("ok")){
                            this.dispose();
                            JOptionPane.showMessageDialog(null, "Aberta a votação! (Qualquer caractere especial sumiu)", "JKLR Sistemas", JOptionPane.PLAIN_MESSAGE);
                            TelaPrincipal.votar=true;
                            TelaPrincipal.Candidatos.setEnabled(true);
                            TelaPrincipal.Resultado.setEnabled(true);
                            TelaPrincipal.Votar.setVisible(true);
                            TelaPrincipal.Encerrar.setVisible(true);
                            TelaPrincipal.Iniciate.setVisible(false);
                            TelaPrincipal.numEleicao=cod;
                        }else{
                            JOptionPane.showMessageDialog(null, "Falha ao inserir as informações da eleição.","JKLR Sistemas",JOptionPane.ERROR_MESSAGE);
                        }
                }
            }
                
    }

    private void capturarDia() {
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        String dia;
        String mes;
        String ano = ""+year;

        if(month==1 || month==2 || month==3 || month==4 || month==5 || month==6 || month==7 || month==8 || month==9){
            mes="0"+month;
        }else{
            mes=""+month;
        }
        
        if (day==1 || day==2 || day==3 || day==4 || day==5 || day==6 || day==7 || day==8 || day==9) {
            dia = "0"+day;
        } else {
            dia=""+day;
        }
        
        jtfData.setText(dia+mes+ano);

        System.out.println(dia+"/"+mes+"/"+ano);
        
    }

    private void continuar() {
        Connection con = Conexao.abrirConexao();
        EleicaoDAO sql = new EleicaoDAO(con);
        int num = sql.verificarEleicao();
        TelaPrincipal.numEleicao=num;
            if(num==0 || TelaPrincipal.numEleicao==0){
                JOptionPane.showMessageDialog(null, "Não há eleição cadastrada para continuar!", "JKLR Sistemas", JOptionPane.WARNING_MESSAGE);
                bg2.setVisible(false);
                jbContinuar.setVisible(false);
                jbNew.setVisible(false);
                novo();
            }else{
                this.dispose();
                JOptionPane.showMessageDialog(null, "Reaberta a votação!", "JKLR Sistemas", JOptionPane.PLAIN_MESSAGE);
                TelaPrincipal.votar=true;
                TelaPrincipal.Candidatos.setEnabled(true);
                TelaPrincipal.Resultado.setEnabled(true);
                TelaPrincipal.Votar.setVisible(true);
                TelaPrincipal.Encerrar.setVisible(true);
                TelaPrincipal.Iniciate.setVisible(false);
                Conexao.fecharConexao(con); 
            }
        
    }

    private void voltarMenuEleicao() {
        bg1.setVisible(false);
        jbCadastrar.setVisible(false);
        jbCancelar.setVisible(false);
        jbEdit1.setVisible(false);
        jbEdit2.setVisible(false);
        jtfCod.setVisible(false);
        jtfData.setVisible(false);
        jtfPleito.setVisible(false);
        jtfOrganizador.setVisible(false);        
        
        bg21.setVisible(false);
        
        bg2.setVisible(true);
        jbContinuar.setVisible(true);
        jbNew.setVisible(true);
        
    }

    private void trazerMenu() {
        bg1.setVisible(true);
        jbCadastrar.setVisible(true);
        jbCancelar.setVisible(true);
        jbEdit1.setVisible(true);
        jbEdit2.setVisible(true);
        jtfCod.setVisible(true);
        jtfData.setVisible(true);
        jtfPleito.setVisible(true);
        jtfOrganizador.setVisible(true);        
        
        bg21.setVisible(false);
        
        bg2.setVisible(false);
        jbContinuar.setVisible(false);
        jbNew.setVisible(false);
        
        verificarPadroes();
    }

    private void verificarPadroes() {
        Connection con = Conexao.abrirConexao();
        PadroesDAO adao = new PadroesDAO(con);
        List<Padroes> lista = new ArrayList<>();
        lista=adao.buscarPadroes();
            for(Padroes tab:lista){
                jtfOrganizador.setText(tab.getTpOrganizador());
                jtfPleito.setText(tab.getTpPleito());
            }
    }

    private String verificarCaracteres() {
        String text = jtfPleito.getText().replaceAll("[-/?!|:;()*<>]", " ");        
        
        return text;
        
    }

}
