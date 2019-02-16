package Telas.Resultado;

import Controles.Conexões.Conexao;
import Controles.DAOs.CandidatoDAO;
import Controles.DAOs.EleicaoDAO;
import Controles.DAOs.GerarPDF;
import Modelos.Candidato.Candidato;
import Modelos.Eleição.Eleicao;
import Telas.Principal.TelaPrincipal;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Resultado extends javax.swing.JInternalFrame {

    public Resultado() {
        initComponents();
        setSize(901, 583);
        limparExtras();
        jbListarEleicao.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbGerar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCandidatos = new javax.swing.JTable();
        lbBg3 = new javax.swing.JLabel();
        lbBg32 = new javax.swing.JLabel();
        jtfBrancos = new javax.swing.JLabel();
        jtfValidos = new javax.swing.JLabel();
        jtfNulos = new javax.swing.JLabel();
        jbListarCandidatos = new javax.swing.JButton();
        lbBg2 = new javax.swing.JLabel();
        jbListarEleicao = new javax.swing.JButton();
        lbBg1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Resultado da eleição");
        getContentPane().setLayout(null);

        jbGerar.setContentAreaFilled(false);
        jbGerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarActionPerformed(evt);
            }
        });
        jbGerar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbGerarKeyPressed(evt);
            }
        });
        getContentPane().add(jbGerar);
        jbGerar.setBounds(500, 440, 350, 80);

        jbVoltar.setContentAreaFilled(false);
        jbVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        jbVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbVoltarKeyPressed(evt);
            }
        });
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(40, 440, 230, 90);

        jScrollPane1.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N

        jTableCandidatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableCandidatos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jTableCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Votos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCandidatos.setPreferredSize(new java.awt.Dimension(300, 240));
        jTableCandidatos.setRowHeight(30);
        jTableCandidatos.setRowMargin(6);
        jTableCandidatos.setShowHorizontalLines(false);
        jTableCandidatos.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTableCandidatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 140, 490, 270);

        lbBg3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbBg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Resultado/bg_candidatos.png"))); // NOI18N
        getContentPane().add(lbBg3);
        lbBg3.setBounds(0, 0, 900, 554);

        lbBg32.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbBg32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Resultado/bg_candidatos2.png"))); // NOI18N
        getContentPane().add(lbBg32);
        lbBg32.setBounds(0, 0, 900, 554);

        jtfBrancos.setFont(new java.awt.Font("Impact", 0, 100)); // NOI18N
        jtfBrancos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtfBrancos.setText("0");
        jtfBrancos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jtfBrancos);
        jtfBrancos.setBounds(70, 230, 160, 120);

        jtfValidos.setFont(new java.awt.Font("Impact", 0, 100)); // NOI18N
        jtfValidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtfValidos.setText("0");
        jtfValidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jtfValidos);
        jtfValidos.setBounds(360, 230, 160, 120);

        jtfNulos.setFont(new java.awt.Font("Impact", 0, 100)); // NOI18N
        jtfNulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtfNulos.setText("0");
        jtfNulos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jtfNulos);
        jtfNulos.setBounds(640, 230, 160, 120);

        jbListarCandidatos.setContentAreaFilled(false);
        jbListarCandidatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbListarCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarCandidatosActionPerformed(evt);
            }
        });
        jbListarCandidatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbListarCandidatosKeyPressed(evt);
            }
        });
        getContentPane().add(jbListarCandidatos);
        jbListarCandidatos.setBounds(280, 420, 330, 110);

        lbBg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Resultado/bg_Votos.png"))); // NOI18N
        getContentPane().add(lbBg2);
        lbBg2.setBounds(0, 0, 900, 554);

        jbListarEleicao.setContentAreaFilled(false);
        jbListarEleicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbListarEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarEleicaoActionPerformed(evt);
            }
        });
        jbListarEleicao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbListarEleicaoKeyPressed(evt);
            }
        });
        getContentPane().add(jbListarEleicao);
        jbListarEleicao.setBounds(250, 410, 270, 110);

        lbBg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Resultado/bg_resultado.png"))); // NOI18N
        getContentPane().add(lbBg1);
        lbBg1.setBounds(0, 0, 900, 554);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbListarEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarEleicaoActionPerformed
        procurarEleicao();
    }//GEN-LAST:event_jbListarEleicaoActionPerformed

    private void jbListarCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarCandidatosActionPerformed
        aparecerResultado();
    }//GEN-LAST:event_jbListarCandidatosActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        retornarExtras();
        InserirDados(TelaPrincipal.numEleicao);
        jbListarCandidatos.requestFocus();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarActionPerformed
        lbBg32.setVisible(true);
        lbBg3.setVisible(false);
        gerarPdf();
    }//GEN-LAST:event_jbGerarActionPerformed

    private void jbListarEleicaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbListarEleicaoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            procurarEleicao();
        }
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_jbListarEleicaoKeyPressed

    private void jbListarCandidatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbListarCandidatosKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            aparecerResultado();
            
        }
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_jbListarCandidatosKeyPressed

    private void jbVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbVoltarKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            retornarExtras();
            InserirDados(TelaPrincipal.numEleicao);
            jbListarCandidatos.requestFocus();
        }
        if(evt.getKeyCode()== KeyEvent.VK_RIGHT){
            jbGerar.requestFocus();
            lbBg32.setVisible(true);
            lbBg3.setVisible(false);
        }
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_jbVoltarKeyPressed

    private void jbGerarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbGerarKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            gerarPdf();
        }
        if(evt.getKeyCode()== KeyEvent.VK_LEFT){
            jbVoltar.requestFocus();
            lbBg32.setVisible(false);
            lbBg3.setVisible(true);
        }
        if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_jbGerarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCandidatos;
    private javax.swing.JButton jbGerar;
    private javax.swing.JButton jbListarCandidatos;
    private javax.swing.JButton jbListarEleicao;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jtfBrancos;
    private javax.swing.JLabel jtfNulos;
    private javax.swing.JLabel jtfValidos;
    private javax.swing.JLabel lbBg1;
    private javax.swing.JLabel lbBg2;
    private javax.swing.JLabel lbBg3;
    private javax.swing.JLabel lbBg32;
    // End of variables declaration//GEN-END:variables

    private void limparExtras() {
        lbBg1.setVisible(true);
        jbListarEleicao.setVisible(true);

        lbBg2.setVisible(false);
        jbListarCandidatos.setVisible(false);
        jtfBrancos.setVisible(false);
        jtfNulos.setVisible(false);
        jtfValidos.setVisible(false);

        lbBg3.setVisible(false);
        lbBg32.setVisible(false);
        jScrollPane1.setVisible(false);
        jbVoltar.setVisible(false);
        jbGerar.setVisible(false);
    }

    private void retornarExtras() {
        lbBg1.setVisible(false);
        jbListarEleicao.setVisible(false);

        lbBg2.setVisible(true);
        jbListarCandidatos.setVisible(true);
        jtfBrancos.setVisible(true);
        jtfNulos.setVisible(true);
        jtfValidos.setVisible(true);

        lbBg3.setVisible(false);
        lbBg32.setVisible(false);
        jTableCandidatos.setVisible(false);
        jScrollPane1.setVisible(false);
        jbVoltar.setVisible(false);
        jbGerar.setVisible(false);
    }

    private void limparTudo() {
        lbBg1.setVisible(false);
        jbListarEleicao.setVisible(false);

        lbBg2.setVisible(false);
        jbListarCandidatos.setVisible(false);
        jtfBrancos.setVisible(false);
        jtfNulos.setVisible(false);
        jtfValidos.setVisible(false);
    }

    private void aparecerResultado() {
        limparTudo();
        lbBg3.setVisible(true);
        jScrollPane1.setVisible(true);
        jTableCandidatos.setVisible(true);
        jbVoltar.setVisible(true);
        jbGerar.setVisible(true);
        refreshtable();
        jbVoltar.requestFocus();
        arrumarTabela();
    }

    private void limparCampos() {
        jtfBrancos.setText("");
        jtfValidos.setText("");
        jtfNulos.setIcon(null);
    }

    //--------------------------------------------------------------------------
    private void procurarEleicao() {
        Connection con = Conexao.abrirConexao();
        EleicaoDAO sql = new EleicaoDAO(con);
        int cod = TelaPrincipal.numEleicao;
        if (cod == 0) {
            JOptionPane.showMessageDialog(null, "Cadastre uma eleição para ver algum resultado!", "JKLR Sistemas", JOptionPane.WARNING_MESSAGE);
            this.dispose();
        } else {
            retornarExtras();
            InserirDados(cod);
            jbListarCandidatos.requestFocus();
        }
        Conexao.fecharConexao(con);
    }

    private void InserirDados(int cod) {
        Connection con = Conexao.abrirConexao();
        EleicaoDAO sql = new EleicaoDAO(con);
        int brancos = sql.vB(cod);
        int nulos = sql.vN(cod);
        int validos = sql.vV(cod);
        jtfBrancos.setText("" + brancos);
        jtfNulos.setText("" + nulos);
        jtfValidos.setText("" + validos);
        Conexao.fecharConexao(con);
    }

    //-------------------------------------------------------
    
    private void refreshtable() {
        Connection con = Conexao.abrirConexao();
        CandidatoDAO adao = new CandidatoDAO(con);
        List<Candidato> lista = new ArrayList<>();
        lista = adao.listarCandidatos(TelaPrincipal.numEleicao);
        DefaultTableModel tbm = (DefaultTableModel) jTableCandidatos.getModel();

        //Limpa a tabela para inserir uma nova sem erros!
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        int i = 0;
        for (Candidato tab : lista) {
            tbm.addRow(new String[i]);
            jTableCandidatos.setValueAt(tab.getCod_candidato(), i, 0);
            jTableCandidatos.setValueAt(tab.getNome(), i, 1);
            jTableCandidatos.setValueAt(tab.getVotos(), i, 2);
            i++;
        }
        Conexao.fecharConexao(con);
    }

//------------------------------------------------------------------------------
    
    private void gerarPdf(){
        Connection con = Conexao.abrirConexao();
        GerarPDF adao = new GerarPDF(con);
        Candidato a = new Candidato();
        String nomeEleicao = adao.selecionarNomeEleicao(TelaPrincipal.numEleicao); //Coleta o nome da eleição
        
        List<Candidato> lista = new ArrayList<>();
        lista = adao.listarCandidatos(TelaPrincipal.numEleicao);
        
        List<Eleicao> listaEleicao = new ArrayList<>();
        listaEleicao = adao.listarEleicao(TelaPrincipal.numEleicao);
        
        Document document=null;
        OutputStream outPutStream = null;
            try{
                document = new Document(PageSize.A4,30,20,20,30);
                outPutStream = new FileOutputStream(nomeEleicao+".pdf");
                try {
                    PdfWriter.getInstance(document, outPutStream);
                    document.open();
                    document.setPageSize(PageSize.A4);
                    //------------------------------------------------------------------     

                    //Cria a tabela
                    PdfPTable tabela = new PdfPTable(3);
                    
                    //----------------------------------------------------------
                    
                    Paragraph esp = new Paragraph("             ");
                    PdfPCell espaco = new PdfPCell(esp);
                    espaco.setHorizontalAlignment(Element.ALIGN_CENTER);
                    espaco.setBorder(PdfPCell.NO_BORDER); // Tirar a borda do espaço
                    espaco.setColspan(6); // Define que a célula ocupará 3 colunas
                    
                    //----------------------------------------------------------
                  
                    //----------------------------------------------------------
                    
                    //Cria a celula num_Eleicao
                    Paragraph num = new Paragraph("Nº Eleição",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell num_eleicao = new PdfPCell(num);
                    num_eleicao.setHorizontalAlignment(Element.ALIGN_CENTER);     
                    
                    //Cria a celula nome_eleicao
                    Paragraph nomee = new Paragraph("Nome",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell nome_eleicao = new PdfPCell(nomee);
                    nome_eleicao.setColspan(2); // Define que a célula ocupará 2 colunas
                    nome_eleicao.setHorizontalAlignment(Element.ALIGN_CENTER);   

                    //Cria a celula organizador
                    Paragraph org = new Paragraph("Organizador",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell organizador = new PdfPCell(org);
                    organizador.setColspan(2); // Define que a célula ocupará 2 colunas
                    organizador.setHorizontalAlignment(Element.ALIGN_CENTER);   
                    
                    //Cria a celula data
                    Paragraph data = new Paragraph("Data",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell date = new PdfPCell(data);
                    date.setHorizontalAlignment(Element.ALIGN_CENTER);
                    
                    //Cria a celula nulos
                    Paragraph nul = new Paragraph("Nulos",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell nulos = new PdfPCell(nul);
                    nulos.setHorizontalAlignment(Element.ALIGN_CENTER);
                    
                    //Cria a celula Brancos
                    Paragraph bran = new Paragraph("Brancos",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell brancos = new PdfPCell(bran);
                    brancos.setHorizontalAlignment(Element.ALIGN_CENTER);  
                    
                    //Cria a celula validos
                    Paragraph val = new Paragraph("Válidos",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell validos = new PdfPCell(val);
                    validos.setHorizontalAlignment(Element.ALIGN_CENTER);  
                    
                    //----------------------------------------------------------
                    
                    //Cria a celula cabecalho(head)
                    Paragraph cabecalho = new Paragraph(nomeEleicao,FontFactory.getFont(FontFactory.TIMES_ROMAN,35,BaseColor.BLACK));
                    PdfPCell head = new PdfPCell(cabecalho); // Cria-se a célula
                    head.setBorder(PdfPCell.BOTTOM); // Tirar a borda do cabeçalho
                    head.setHorizontalAlignment(Element.ALIGN_CENTER); // Modifica para o texto centralizar
                    head.setColspan(3); // Define que a célula ocupará 3 colunas

                    tabela.addCell(head);
                    
                    //Adiciona o espaço
                        tabela.addCell(espaco); 
                        tabela.addCell(espaco);   
                    
                    //Cria a celula Código
                    Paragraph cod = new Paragraph("Código",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell codigo = new PdfPCell(cod);
                    codigo.setHorizontalAlignment(Element.ALIGN_CENTER);
                    
                    //Cria a celula nome(name)
                    Paragraph nome = new Paragraph("Nome",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell name = new PdfPCell(nome);
                    name.setHorizontalAlignment(Element.ALIGN_CENTER);
                    
                    //Cria a celula votos
                    Paragraph v = new Paragraph("Votos",FontFactory.getFont(FontFactory.TIMES_ROMAN,18,Font.BOLD));
                    PdfPCell votos = new PdfPCell(v);
                    votos.setHorizontalAlignment(Element.ALIGN_CENTER);
                    
                    //----------------------------------------------------------

                        for (Eleicao tab : listaEleicao) {
                            Paragraph tabelaEl= new Paragraph("Informações da eleição",FontFactory.getFont(FontFactory.TIMES_ROMAN,25,BaseColor.BLACK));
                            PdfPCell tabelaEleicao = new PdfPCell(tabelaEl); // Cria-se a célula
                            tabelaEleicao.setHorizontalAlignment(Element.ALIGN_CENTER); // Modifica para o texto centralizar
                            tabelaEleicao.setBorder(PdfPCell.NO_BORDER); // Tirar a borda do cabeçalho
                            tabelaEleicao.setColspan(9); // Define que a célula ocupará 3 colunas

                            tabela.addCell(tabelaEleicao);
                    
                            
                            //Adiciona o dado da eleição
                                tabela.addCell(num_eleicao);
                                tabela.addCell(nome_eleicao);
                            
                            Paragraph codE = new Paragraph(""+tab.getNum_eleicao(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell cod_Eleicao = new PdfPCell(codE);
                            cod_Eleicao.setHorizontalAlignment(Element.ALIGN_CENTER);
                            
                            Paragraph nom = new Paragraph(tab.getNome_eleicao(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell nomeList = new PdfPCell(nom);
                            nomeList.setHorizontalAlignment(Element.ALIGN_CENTER);
                            nomeList.setColspan(2); // Define que a célula ocupará 2 colunas
                            
                            //Adiciona os dados
                                tabela.addCell(cod_Eleicao);
                                tabela.addCell(nomeList);

                            //Adiciona o espaço
                                tabela.addCell(espaco);    
                                
                            //Adiciona o dado organizador e data
                                tabela.addCell(organizador);
                                tabela.addCell(date);
                                
                            Paragraph orga = new Paragraph(tab.getOrganizador(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell organiz = new PdfPCell(orga);
                            organiz.setHorizontalAlignment(Element.ALIGN_CENTER);
                            organiz.setColspan(2); // Define que a célula ocupará 2 colunas
                            
                            Paragraph dat = new Paragraph(tab.getData(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell datae = new PdfPCell(dat);
                            datae.setHorizontalAlignment(Element.ALIGN_CENTER);
                            
                            //Adiciona os dados
                                tabela.addCell(organiz);
                                tabela.addCell(datae);
                            
                            //Adiciona o espaço
                                tabela.addCell(espaco);        
                                
                            //adiciona os votos
                                tabela.addCell(nulos);
                                tabela.addCell(brancos);
                                tabela.addCell(validos);
                            
                            Paragraph nuls = new Paragraph(""+tab.getNulos(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell nuloss = new PdfPCell(nuls);
                            nuloss.setHorizontalAlignment(Element.ALIGN_CENTER);
                            
                            Paragraph bla = new Paragraph(""+tab.getBrancos(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell blank = new PdfPCell(bla);
                            blank.setHorizontalAlignment(Element.ALIGN_CENTER);
                            
                            Paragraph vali = new Paragraph(""+tab.getValidos(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell valid = new PdfPCell(vali);
                            valid.setHorizontalAlignment(Element.ALIGN_CENTER);

                            //Adiciona os dados
                                tabela.addCell(nuloss);
                                tabela.addCell(blank);
                                tabela.addCell(valid);      
                             
                            //Adiciona o espaço
                                tabela.addCell(espaco);
                                tabela.addCell(espaco);   
                        }
                    
                            Paragraph tabelaCan= new Paragraph("Lista dos candidatos",FontFactory.getFont(FontFactory.TIMES_ROMAN,25,BaseColor.BLACK));
                            PdfPCell tabelaCandidato = new PdfPCell(tabelaCan); // Cria-se a célula
                            tabelaCandidato.setHorizontalAlignment(Element.ALIGN_CENTER); // Modifica para o texto centralizar
                            tabelaCandidato.setBorder(PdfPCell.NO_BORDER); // Tirar a borda do cabeçalho
                            tabelaCandidato.setColspan(9); // Define que a célula ocupará 3 colunas

                            tabela.addCell(tabelaCandidato);    
                        
                    //Adiciona os dados dos candidatos
                    tabela.addCell(codigo);
                    tabela.addCell(name);
                    tabela.addCell(votos);

                        for (Candidato tab : lista) {
                            Paragraph codC = new Paragraph(""+tab.getCod_candidato(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell cod_candidato = new PdfPCell(codC);
                            cod_candidato.setHorizontalAlignment(Element.ALIGN_CENTER);
                            
                            Paragraph nom = new Paragraph(tab.getNome(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell nomeList = new PdfPCell(nom);
                            nomeList.setHorizontalAlignment(Element.ALIGN_CENTER);
                            
                            Paragraph vot = new Paragraph(""+tab.getVotos(),FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
                            PdfPCell votList = new PdfPCell(vot);
                            votList.setHorizontalAlignment(Element.ALIGN_CENTER);
                            
                            tabela.addCell(cod_candidato);
                            tabela.addCell(nomeList);
                            tabela.addCell(votList);
                        }

                    document.add(tabela);
                    
                    document.newPage();
                    
                    JOptionPane.showMessageDialog(null, "Arquivo criado", "JKLR Sistemas",JOptionPane.PLAIN_MESSAGE);
                    //------------------------------------------------------------------

            } catch (DocumentException ex) {
                System.out.println("Error: "+ex);
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                document.close();
            }
            
            try {
                Desktop.getDesktop().open(new File(nomeEleicao+".pdf"));
            } catch (IOException ex) {
                Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private void arrumarTabela() {
        jTableCandidatos.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTableCandidatos.getColumnModel().getColumn(0).setResizable(false);
        jTableCandidatos.getColumnModel().getColumn(1).setPreferredWidth(340);
        jTableCandidatos.getColumnModel().getColumn(1).setResizable(false);
        jTableCandidatos.getColumnModel().getColumn(2).setPreferredWidth(15);
        jTableCandidatos.getColumnModel().getColumn(2).setResizable(false);
        
    }
    
}
