/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import ClassesHelper.Controller;
import static ClassesHelper.Controller.escalacoes;
import static ClassesHelper.Controller.professores;
import ClassesHelper.CriadorPDF;
import ClassesHelper.MailSender;
import ClassesHelper.Util;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.mail.MessagingException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import newschoolsoccer.Aluno;
import newschoolsoccer.Escalacao;
import newschoolsoccer.FluxoCaixa;
import newschoolsoccer.Item;
import newschoolsoccer.Professor;
import newschoolsoccer.Transacao;
import org.apache.commons.mail.EmailException;

/**
 *
 * @author John
 */
public class JanelaComAbas extends javax.swing.JFrame {
    private Object label;
    private Object jTable1;
    public JFrame frameForm;
    private static JanelaComAbas instancia;
    String dataInicio;
    String dataFinal;
    String relatorioFinanceiro;
    /**
     * Creates new form JanelaComAbas
     */
    public JanelaComAbas(String login) {
        initComponents();
        iniciarTabelas();
        getContentPane().setBackground(new Color(94,109,252));
        setResizable(false);
        switch(login){
            case "admin":
                painelComAbas.remove(1);
                break;
            case "professor":
                painelComAbas.remove(2);
                painelComAbas.remove(2);
                this.criarMaterialBotao.setVisible(false);
                this.textoRemocao.setVisible(false);
                this.removerItemBotao.setVisible(false);
                break;
        }               
        }
    
    /**
     *  cria as tabelas de cada aba, exceto financeiro, que nao precisa ser inicializada
     */
    public void iniciarTabelas(){
        //iniciar tabelaAlunos
        for(int i = 0; i < Controller.escalacoes.size(); i++){
            for(int j = 0; j < Controller.escalacoes.get(i).alunos.size(); j++){
                Object[] linha = new Object[5];
                linha[0] = Controller.escalacoes.get(i).alunos.get(j).getNome();
                linha[1] = Controller.escalacoes.get(i).alunos.get(j).getTelefone();
                linha[2] = Controller.escalacoes.get(i).alunos.get(j).getAltura();
                linha[3] = Controller.escalacoes.get(i).alunos.get(j).getPosicao();
                linha[4] = Controller.escalacoes.get(i).alunos.get(j).getCategoria();
                atualizarTabelaAlunos(linha);
            }
        }
        // iniciarTabelaProfessores
        
        for(int i = 0; i < Controller.professores.size(); i++) {
                Object[] linha = new Object[4];
                linha[0] = Controller.professores.get(i).getNome();
                linha[1] = Controller.professores.get(i).getEndereco();
                linha[2] = Controller.professores.get(i).getSalario();
                linha[3] = Controller.professores.get(i).getTelefone();    
                System.out.println(Controller.professores.get(i).getNome()+" "+Controller.professores.get(i).getEndereco()+" "
                        +Controller.professores.get(i).getSalario()+" "+Controller.professores.get(i).getTelefone());
                atualizarTabelaProfs(linha);
        }
        //iniciar tabelaMateriais
        for (int i = 0; i < Controller.itens.size() ; i++){
            Object[] linha = new Object[3];
            linha[0] = Controller.itens.get(i).getNome();
            linha[1] = 0;
            linha[2] = 0;
            atualizarTabela(linha);
        }
        
    }
    
    public static JanelaComAbas getInstance(){ 
                return instancia;
        }
    
    public void atualizarTabela(Object[] linha){
        ((DefaultTableModel) tabelaMateriais.getModel()).addRow(linha);
        /*incluir aqui funcao para atualizar o objeto de materiais*/
    }
    public void atualizarTabelaProfs(Object[] linha){
        ((DefaultTableModel) tabelaProfessores.getModel()).addRow(linha);
        /*incluir aqui funcao para atualizar o objeto de materiais*/
    }
    public void atualizarTabelaAlunos(Object[] linha){
        
        ((DefaultTableModel) tabelaAlunos.getModel()).addRow(linha);
        /*incluir aqui funcao para atualizar o objeto de materiais*/
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        painelComAbas = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        nomeDaEscola = new javax.swing.JTextField();
        campoAzulTranslucido = new javax.swing.JLabel();
        Capa = new javax.swing.JLabel();
        editarAluno = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        imprimirAniversariantes = new javax.swing.JButton();
        textoData = new javax.swing.JLabel();
        textoData2 = new javax.swing.JLabel();
        anoInicio = new javax.swing.JTextField();
        mesInicio = new javax.swing.JTextField();
        mesFim = new javax.swing.JTextField();
        anoFim = new javax.swing.JTextField();
        botaoEdicao = new javax.swing.JButton();
        textoData3 = new javax.swing.JLabel();
        textoData6 = new javax.swing.JLabel();
        imprimirEscalacao = new javax.swing.JButton();
        nomeEscalacao = new javax.swing.JTextField();
        textoData7 = new javax.swing.JLabel();
        textoData8 = new javax.swing.JLabel();
        erroAlunos = new javax.swing.JLabel();
        botaoEdicao1 = new javax.swing.JButton();
        botaoApagarAluno = new javax.swing.JButton();
        abaProfessores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProfessores = new javax.swing.JTable();
        botaoCriarPerfil = new javax.swing.JButton();
        botaoApagarPerfil = new javax.swing.JButton();
        abaFinanceiro = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaFinanceira = new javax.swing.JTable();
        textoData1 = new javax.swing.JLabel();
        textoData4 = new javax.swing.JLabel();
        anoInicio1 = new javax.swing.JTextField();
        mesInicio1 = new javax.swing.JTextField();
        mesFim1 = new javax.swing.JTextField();
        anoFim1 = new javax.swing.JTextField();
        pesquisarFinanceiroBotao = new javax.swing.JButton();
        imprimirRelatorioBotao = new javax.swing.JButton();
        abaMateriais = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaMateriais = new javax.swing.JTable();
        botaoSolicitarMaterial = new javax.swing.JButton();
        textoData9 = new javax.swing.JLabel();
        textoData10 = new javax.swing.JLabel();
        textoData11 = new javax.swing.JLabel();
        textoData12 = new javax.swing.JLabel();
        criarMaterialBotao = new javax.swing.JButton();
        textoData13 = new javax.swing.JLabel();
        textoData14 = new javax.swing.JLabel();
        removerItemBotao = new javax.swing.JButton();
        textoRemocao = new javax.swing.JLabel();
        escudo = new javax.swing.JLabel();
        TextoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New School Soccer");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelComAbas.setBackground(new java.awt.Color(153, 153, 255));

        home.setLayout(null);

        nomeDaEscola.setBackground(new java.awt.Color(0, 153, 204));
        nomeDaEscola.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        nomeDaEscola.setForeground(new java.awt.Color(255, 255, 255));
        nomeDaEscola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeDaEscola.setText("   Bem vindo, getNome()");
        nomeDaEscola.setBorder(null);
        nomeDaEscola.setFocusable(false);
        nomeDaEscola.setOpaque(false);
        nomeDaEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDaEscolaActionPerformed(evt);
            }
        });
        home.add(nomeDaEscola);
        nomeDaEscola.setBounds(-10, 0, 710, 110);

        campoAzulTranslucido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesGraficas/naoopaco.png"))); // NOI18N
        home.add(campoAzulTranslucido);
        campoAzulTranslucido.setBounds(-10, 0, 780, 110);

        Capa.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Capa.setForeground(new java.awt.Color(255, 255, 255));
        Capa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesGraficas/Capa.jpg"))); // NOI18N
        home.add(Capa);
        Capa.setBounds(0, 0, 690, 460);

        painelComAbas.addTab("Home", home);

        editarAluno.setBackground(new java.awt.Color(153, 153, 255));
        editarAluno.setToolTipText("");

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Altura (cm)", "Posição", "Escalação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAlunos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaAlunos);
        if (tabelaAlunos.getColumnModel().getColumnCount() > 0) {
            tabelaAlunos.getColumnModel().getColumn(0).setResizable(false);
            tabelaAlunos.getColumnModel().getColumn(1).setResizable(false);
            tabelaAlunos.getColumnModel().getColumn(2).setResizable(false);
            tabelaAlunos.getColumnModel().getColumn(3).setResizable(false);
            tabelaAlunos.getColumnModel().getColumn(4).setResizable(false);
        }

        imprimirAniversariantes.setText("Imprimir Aniversariantes");
        imprimirAniversariantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirAniversariantesActionPerformed(evt);
            }
        });

        textoData.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData.setForeground(new java.awt.Color(255, 255, 255));
        textoData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData.setText("Defina o período de busca");

        textoData2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData2.setForeground(new java.awt.Color(255, 255, 255));
        textoData2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData2.setText("(formato MM/AAAA)");

        anoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoInicioActionPerformed(evt);
            }
        });

        mesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesInicioActionPerformed(evt);
            }
        });

        botaoEdicao.setText("Editar Aluno");
        botaoEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEdicaoActionPerformed(evt);
            }
        });

        textoData3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData3.setForeground(new java.awt.Color(255, 255, 255));
        textoData3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData3.setText("Clique em um aluno para");

        textoData6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData6.setForeground(new java.awt.Color(255, 255, 255));
        textoData6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData6.setText("apagar/editar os dados");

        imprimirEscalacao.setText("Imprimir Escalação");
        imprimirEscalacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirEscalacaoActionPerformed(evt);
            }
        });

        nomeEscalacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEscalacaoActionPerformed(evt);
            }
        });

        textoData7.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData7.setForeground(new java.awt.Color(255, 255, 255));
        textoData7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData7.setText("Digite a categoria de");

        textoData8.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData8.setForeground(new java.awt.Color(255, 255, 255));
        textoData8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData8.setText("escalação");

        erroAlunos.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        erroAlunos.setForeground(new java.awt.Color(153, 153, 255));
        erroAlunos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erroAlunos.setText("Valor digitado inválido!");

        botaoEdicao1.setText("Criar Aluno");
        botaoEdicao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEdicao1ActionPerformed(evt);
            }
        });

        botaoApagarAluno.setText("Apagar Aluno");
        botaoApagarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editarAlunoLayout = new javax.swing.GroupLayout(editarAluno);
        editarAluno.setLayout(editarAlunoLayout);
        editarAlunoLayout.setHorizontalGroup(
            editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarAlunoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoData7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeEscalacao)
                    .addComponent(imprimirEscalacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoData3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoData8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editarAlunoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(textoData6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editarAlunoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(erroAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botaoEdicao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarAlunoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarAlunoLayout.createSequentialGroup()
                                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesFim, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoData2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(imprimirAniversariantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoApagarAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        editarAlunoLayout.setVerticalGroup(
            editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(editarAlunoLayout.createSequentialGroup()
                .addComponent(textoData, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(textoData2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimirAniversariantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoData3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(textoData6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoApagarAluno)
                .addGap(32, 32, 32)
                .addComponent(botaoEdicao1)
                .addGap(18, 18, 18)
                .addComponent(textoData7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(textoData8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEscalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imprimirEscalacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(erroAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(editarAlunoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Alunos", editarAluno);

        abaProfessores.setBackground(new java.awt.Color(153, 153, 255));
        abaProfessores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaProfessoresFocusGained(evt);
            }
        });

        tabelaProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Professor", "Endereço", "Salário", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProfessores.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaProfessores);
        if (tabelaProfessores.getColumnModel().getColumnCount() > 0) {
            tabelaProfessores.getColumnModel().getColumn(0).setResizable(false);
            tabelaProfessores.getColumnModel().getColumn(1).setResizable(false);
            tabelaProfessores.getColumnModel().getColumn(2).setResizable(false);
            tabelaProfessores.getColumnModel().getColumn(3).setResizable(false);
        }

        botaoCriarPerfil.setText("Criar Novo Perfil");
        botaoCriarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarPerfilActionPerformed(evt);
            }
        });

        botaoApagarPerfil.setText("Apagar Perfil");
        botaoApagarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaProfessoresLayout = new javax.swing.GroupLayout(abaProfessores);
        abaProfessores.setLayout(abaProfessoresLayout);
        abaProfessoresLayout.setHorizontalGroup(
            abaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
            .addGroup(abaProfessoresLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botaoCriarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoApagarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        abaProfessoresLayout.setVerticalGroup(
            abaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaProfessoresLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(abaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarPerfil)
                    .addComponent(botaoApagarPerfil))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );

        painelComAbas.addTab("Professores", abaProfessores);

        abaFinanceiro.setBackground(new java.awt.Color(153, 153, 255));

        tabelaFinanceira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Valor", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFinanceira.setColumnSelectionAllowed(true);
        tabelaFinanceira.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabelaFinanceira);
        tabelaFinanceira.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelaFinanceira.getColumnModel().getColumnCount() > 0) {
            tabelaFinanceira.getColumnModel().getColumn(0).setResizable(false);
            tabelaFinanceira.getColumnModel().getColumn(1).setResizable(false);
            tabelaFinanceira.getColumnModel().getColumn(2).setResizable(false);
        }

        textoData1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData1.setForeground(new java.awt.Color(255, 255, 255));
        textoData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData1.setText("Defina o período de busca");

        textoData4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData4.setForeground(new java.awt.Color(255, 255, 255));
        textoData4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData4.setText("(formato MM/AAAA)");

        anoInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoInicio1ActionPerformed(evt);
            }
        });

        mesInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesInicio1ActionPerformed(evt);
            }
        });

        pesquisarFinanceiroBotao.setText("Pesquisar");
        pesquisarFinanceiroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarFinanceiroBotaoActionPerformed(evt);
            }
        });

        imprimirRelatorioBotao.setText("Imprimir relatório");
        imprimirRelatorioBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirRelatorioBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaFinanceiroLayout = new javax.swing.GroupLayout(abaFinanceiro);
        abaFinanceiro.setLayout(abaFinanceiroLayout);
        abaFinanceiroLayout.setHorizontalGroup(
            abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaFinanceiroLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaFinanceiroLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesFim1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anoInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anoFim1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(abaFinanceiroLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textoData1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(textoData4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pesquisarFinanceiroBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimirRelatorioBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        abaFinanceiroLayout.setVerticalGroup(
            abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaFinanceiroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(textoData1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(textoData4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anoInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesFim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoFim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pesquisarFinanceiroBotao)
                .addGap(29, 29, 29)
                .addComponent(imprimirRelatorioBotao)
                .addContainerGap(230, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );

        painelComAbas.addTab("Financeiro", abaFinanceiro);

        abaMateriais.setBackground(new java.awt.Color(153, 153, 255));

        tabelaMateriais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Quantidade", "Solicitar novo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMateriais.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelaMateriais);
        if (tabelaMateriais.getColumnModel().getColumnCount() > 0) {
            tabelaMateriais.getColumnModel().getColumn(0).setResizable(false);
            tabelaMateriais.getColumnModel().getColumn(1).setResizable(false);
            tabelaMateriais.getColumnModel().getColumn(2).setResizable(false);
        }

        botaoSolicitarMaterial.setText("Solicitar mais materiais");
        botaoSolicitarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSolicitarMaterialActionPerformed(evt);
            }
        });

        textoData9.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData9.setForeground(new java.awt.Color(255, 255, 255));
        textoData9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData9.setText("Clique para solicitar materiais");

        textoData10.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData10.setForeground(new java.awt.Color(255, 255, 255));
        textoData10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData10.setText("ao fornecedor. Somente valores");

        textoData11.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData11.setForeground(new java.awt.Color(255, 255, 255));
        textoData11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData11.setText("positivos serão considerados.");

        textoData12.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData12.setForeground(new java.awt.Color(255, 255, 255));
        textoData12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData12.setText("Valores negativos serão apenas editados");

        criarMaterialBotao.setText("Adicionar Novo Material");
        criarMaterialBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarMaterialBotaoActionPerformed(evt);
            }
        });

        textoData13.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData13.setForeground(new java.awt.Color(255, 255, 255));
        textoData13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData13.setText("e desconsiderados caso a quantidade final");

        textoData14.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData14.setForeground(new java.awt.Color(255, 255, 255));
        textoData14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData14.setText("seja menor que zero.");

        removerItemBotao.setText("Remover Material");
        removerItemBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerItemBotaoActionPerformed(evt);
            }
        });

        textoRemocao.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoRemocao.setForeground(new java.awt.Color(255, 255, 255));
        textoRemocao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoRemocao.setText("Selecione uma linha para excluir o material.");

        javax.swing.GroupLayout abaMateriaisLayout = new javax.swing.GroupLayout(abaMateriais);
        abaMateriais.setLayout(abaMateriaisLayout);
        abaMateriaisLayout.setHorizontalGroup(
            abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaMateriaisLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaMateriaisLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(removerItemBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaMateriaisLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSolicitarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(criarMaterialBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(abaMateriaisLayout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addGroup(abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaMateriaisLayout.createSequentialGroup()
                        .addGroup(abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoData12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoData13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaMateriaisLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textoRemocao, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(abaMateriaisLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textoData9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(abaMateriaisLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(textoData11))
                                        .addComponent(textoData10)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(abaMateriaisLayout.createSequentialGroup()
                        .addComponent(textoData14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))))
        );
        abaMateriaisLayout.setVerticalGroup(
            abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaMateriaisLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(textoData9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoData10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoData11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoData12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoData13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoData14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSolicitarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(criarMaterialBotao)
                .addGap(32, 32, 32)
                .addComponent(textoRemocao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerItemBotao)
                .addGap(0, 13, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        painelComAbas.addTab("Materiais", abaMateriais);

        getContentPane().add(painelComAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 710, 487));

        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesGraficas/EscudoMenor.png"))); // NOI18N
        getContentPane().add(escudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 189));

        TextoTitulo.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        TextoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        TextoTitulo.setText("Escolinha Florminense");
        getContentPane().add(TextoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 21, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeDaEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDaEscolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDaEscolaActionPerformed

    private void mesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesInicioActionPerformed

    private void anoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoInicioActionPerformed

    private String criarStringAniversariantes(Date data1, Date data2){
        String aniversariantes = "";
        
        for(int i = 0; i < Controller.escalacoes.size(); i++){
            for(int j = 0; j < Controller.escalacoes.get(i).alunos.size(); j++){
                // Controller.escalacoes.get(i).alunos.get(j)
                if(data1.compareTo(Controller.escalacoes.get(i).alunos.get(j).getNascimento()) <= 0
                   && data2.compareTo(Controller.escalacoes.get(i).alunos.get(j).getNascimento()) >= 0){
                   String nascimento = Controller.escalacoes.get(i).alunos.get(j).getNascimento().getDay()+"/"+
                           Controller.escalacoes.get(i).alunos.get(j).getNascimento().getMonth()+"/"+
                           Controller.escalacoes.get(i).alunos.get(j).getNascimento().getYear();
                   aniversariantes+= Controller.escalacoes.get(i).alunos.get(j).getNome()+": "+
                           nascimento; 
                }
                
            }
            
        }
        
        return aniversariantes;
    }
    
    private void imprimirAniversariantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirAniversariantesActionPerformed
        
        Document arquivoPDF = new Document();
        try {
            int ano1 = Integer.parseInt(anoInicio.getText());
            int ano2 = Integer.parseInt(anoFim.getText());
            int mes1 = Integer.parseInt(mesInicio.getText());
            int mes2 = Integer.parseInt(mesFim.getText());
            Date dataInicio = new Date(ano1,mes1,1);
            Date dataFim = new Date(ano2,mes2,1);
            System.out.println(dataInicio.compareTo(dataFim));
            if(dataInicio.compareTo(dataFim) > 0){
                JOptionPane.showMessageDialog(null, "Data inválida!");
            }else{
                String aniversariantes = criarStringAniversariantes(dataInicio,dataFim);
                PdfWriter.getInstance(arquivoPDF, new FileOutputStream("Aniversariantes.pdf"));
                arquivoPDF.open();
                
                arquivoPDF.add(Image.getInstance(String.format("src/InterfacesGraficas/EscudoMenor.png")));
                arquivoPDF.add(new Paragraph("Lista de Aniversariantes: \n\n"+aniversariantes));
                try {
                    Desktop.getDesktop().open(new File("Aniversariantes.pdf"));
                } catch (IOException ex) {
                    System.out.println("Erro! "+ex);
                }
            }
            
            

        } catch (DocumentException | FileNotFoundException ex) {
            System.out.println("Erro! "+ex);
        } catch (IOException ex) {
            System.out.println("Erro! "+ex);
        } finally {
            arquivoPDF.close();
        }
        
        
    }//GEN-LAST:event_imprimirAniversariantesActionPerformed

    private void mesInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesInicio1ActionPerformed

    private void botaoSolicitarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSolicitarMaterialActionPerformed
        String texto = formarStringMateriais();
        if(texto.length() != 50){
            JOptionPane.showMessageDialog(null, "Pedido enviado ao fornecedor com sucesso!");
            try {
            MailSender.enviaEmailSimples(texto,"Solicitação de materiais","noreply.newschoolsoccer@gmail.com");
        } catch (EmailException ex) {
            System.out.println("Erro no envio do e-mail! "+ex.getMessage());
        }   catch (MessagingException ex) {
                System.out.println("Erro no envio do e-mail! "+ex.getMessage());
            }
        }
        


    }//GEN-LAST:event_botaoSolicitarMaterialActionPerformed

    private void imprimirEscalacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirEscalacaoActionPerformed
        String texto = "Escalação "+nomeEscalacao.getText()+"\n\n";
        int alunos = 0;
        String escalacao = nomeEscalacao.getText();
        for(int i = 0; i < tabelaAlunos.getModel().getRowCount(); i++){
            if(tabelaAlunos.getValueAt(i, 4).equals(escalacao))
            {
                texto+="\nNome: "+tabelaAlunos.getValueAt(i, 0)+
                        "\nPosição: "+tabelaAlunos.getValueAt(i, 3);
                alunos++;
            }
        }
        if(alunos > 0)
        {
            CriadorPDF.criarPDF(texto, "Escalação "+nomeEscalacao.getText()+".pdf");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foram identificados alunos com este parâmetro de busca de escalação!!");
        }
        
        
        
    }//GEN-LAST:event_imprimirEscalacaoActionPerformed

    private void nomeEscalacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEscalacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeEscalacaoActionPerformed

    private void imprimirRelatorioBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirRelatorioBotaoActionPerformed
        if(tabelaFinanceira.getRowCount() != -1){
            Document arquivoPDF = new Document();
        
            try {
                
                
                PdfWriter.getInstance(arquivoPDF, new FileOutputStream("Relatório Financeiro.pdf"));
                arquivoPDF.open();
                
                arquivoPDF.add(Image.getInstance(String.format("src/InterfacesGraficas/EscudoMenor.png")));
                arquivoPDF.add(new Paragraph("Relatório Financeiro \nPeríodo: "+dataInicio+" a "+dataFinal+"\n\n"+relatorioFinanceiro));


            } catch (DocumentException | FileNotFoundException ex) {
                System.out.println("Erro! "+ex);
            } catch (IOException ex) {
                System.out.println("Erro! "+ex);
            } finally {
                arquivoPDF.close();
            }

            try {
                Desktop.getDesktop().open(new File("Relatório Financeiro.pdf"));
            } catch (IOException ex) {
                System.out.println("Erro! Não localizado arquivo "+ex);
            }
        }
        
        
    }//GEN-LAST:event_imprimirRelatorioBotaoActionPerformed

    private void anoInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoInicio1ActionPerformed

    private void botaoEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEdicaoActionPerformed
        
        
        int i = tabelaAlunos.getSelectedRow();
        if(i != -1){
            try{
                if((int) tabelaAlunos.getValueAt(i, 1) < 0 ||
                    (float) tabelaAlunos.getValueAt(i, 2) < 50 ||
                    tabelaAlunos.getValueAt(i, 3) == "" ||
                    (int) tabelaAlunos.getValueAt(i, 4) < 0){
                    erroAlunos.setForeground(Color.white);
                 } else {

                JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
            }
            }
            catch (NumberFormatException e){
                erroAlunos.setForeground(Color.white);
            }
            
        }
    }//GEN-LAST:event_botaoEdicaoActionPerformed

    private void criarMaterialBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarMaterialBotaoActionPerformed
        this.setEnabled(false);
        instancia = this;
        frameForm = new FrameFormulario();
        frameForm.setVisible(true);
        
        
        
    }//GEN-LAST:event_criarMaterialBotaoActionPerformed

    private void removerItemBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerItemBotaoActionPerformed
        Controller.itens.remove(tabelaMateriais.getSelectedRow());
        Util.SaveDatabase("materiais.bin", Controller.itens);
        ((DefaultTableModel) tabelaMateriais.getModel()).removeRow(tabelaMateriais.getSelectedRow());
    }//GEN-LAST:event_removerItemBotaoActionPerformed

    private void botaoCriarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarPerfilActionPerformed
        this.setEnabled(false);
        instancia = this;
        frameForm = new FrameIncluirProfessor(tabelaProfessores.getRowCount());
        frameForm.setVisible(true);
    }//GEN-LAST:event_botaoCriarPerfilActionPerformed

    private void botaoApagarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarPerfilActionPerformed
        Controller.professores.remove(tabelaProfessores.getSelectedRow());
        Util.SaveDatabase("professores.bin", Controller.professores);
        ((DefaultTableModel) tabelaProfessores.getModel()).removeRow(tabelaProfessores.getSelectedRow());
    }//GEN-LAST:event_botaoApagarPerfilActionPerformed

    private void botaoEdicao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEdicao1ActionPerformed
        this.setEnabled(false);
        instancia = this;
        frameForm = new FrameIncluirAluno();
        frameForm.setVisible(true);
    }//GEN-LAST:event_botaoEdicao1ActionPerformed

    private void botaoApagarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarAlunoActionPerformed
        int z = (int) tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 4);

        switch(z){
            case 14:
                z = 0;
                break;
            case 17:
                z = 1;
                break;
            default:
                z = 2;
                break;
        }
        Controller.escalacoes.get(z).alunos.remove(tabelaAlunos.getSelectedRow());
        Util.SaveDatabase("escalacoes.bin", Controller.escalacoes);
        ((DefaultTableModel) tabelaAlunos.getModel()).removeRow(tabelaAlunos.getSelectedRow());
    }//GEN-LAST:event_botaoApagarAlunoActionPerformed

    private void pesquisarFinanceiroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarFinanceiroBotaoActionPerformed
        try{
            int ano1 = Integer.parseInt(anoInicio1.getText());
            int ano2 = Integer.parseInt(anoFim1.getText());
            int mes1 = Integer.parseInt(mesInicio1.getText());
            int mes2 = Integer.parseInt(mesFim1.getText());
            Date data1 = new Date(1,mes1,ano1);
            Date data2 = new Date(1,mes2+1,ano2);
            if(data1.compareTo(data2) > 0){
                JOptionPane.showMessageDialog(null, "Data inválida!");
            } else{
                dataInicio = mes1+"/"+ano1;
                dataFinal = mes1+"/"+ano1;
                FluxoCaixa fluxo = new FluxoCaixa();

                ArrayList<Transacao> listaTransacoes = fluxo.getPeriodo(data1, data2);
                relatorioFinanceiro = fluxo.gerarRelatorio(data1, data2);
                montarTabelaFinanceira(listaTransacoes);
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Data inválida!");
        }
        
    }//GEN-LAST:event_pesquisarFinanceiroBotaoActionPerformed

    private void abaProfessoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaProfessoresFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_abaProfessoresFocusGained
    
    public void montarTabelaFinanceira(ArrayList<Transacao> transacoes){
        for(Transacao obj : transacoes){
            Object[] linha = new Object[3];
            linha[0] = obj.getData();
            linha[1] = obj.getValor();
            linha[2] = obj.getTipo() == 0 ? "Crédito" : "Débito";
            ((DefaultTableModel) tabelaFinanceira.getModel()).addRow(linha);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(JanelaComAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaComAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaComAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaComAbas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    
    
    public String formarStringMateriais(){
        String texto = "Prezados, \nSegue lista de materiais a solicitar: \n";
        
        for(int i = 0; i < tabelaMateriais.getRowCount() ; i++)
        {
            Object obj = tabelaMateriais.getValueAt(i,2);
            if(obj!=null){
                int addMaterial = (int) obj;
                
                if(addMaterial > 0)
                {
                    texto+= (String) tabelaMateriais.getValueAt(i,0)+": "+addMaterial+"\n";
                }
                
                int novoValor = (int) tabelaMateriais.getValueAt(i, 1) + addMaterial;
                System.out.println(addMaterial);
                if(novoValor >= 0)
                {
                    tabelaMateriais.setValueAt((Object) novoValor, i, 1);
                }
            }
        }
        
        return texto;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Capa;
    private javax.swing.JLabel TextoTitulo;
    private javax.swing.JPanel abaFinanceiro;
    private javax.swing.JPanel abaMateriais;
    private javax.swing.JPanel abaProfessores;
    private javax.swing.JTextField anoFim;
    private javax.swing.JTextField anoFim1;
    private javax.swing.JTextField anoInicio;
    private javax.swing.JTextField anoInicio1;
    private javax.swing.JButton botaoApagarAluno;
    private javax.swing.JButton botaoApagarPerfil;
    private javax.swing.JButton botaoCriarPerfil;
    private javax.swing.JButton botaoEdicao;
    private javax.swing.JButton botaoEdicao1;
    private javax.swing.JButton botaoSolicitarMaterial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel campoAzulTranslucido;
    private javax.swing.JButton criarMaterialBotao;
    private javax.swing.JPanel editarAluno;
    private javax.swing.JLabel erroAlunos;
    private javax.swing.JLabel escudo;
    private javax.swing.JPanel home;
    private javax.swing.JButton imprimirAniversariantes;
    private javax.swing.JButton imprimirEscalacao;
    private javax.swing.JButton imprimirRelatorioBotao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField mesFim;
    private javax.swing.JTextField mesFim1;
    private javax.swing.JTextField mesInicio;
    private javax.swing.JTextField mesInicio1;
    private javax.swing.JTextField nomeDaEscola;
    private javax.swing.JTextField nomeEscalacao;
    private javax.swing.JTabbedPane painelComAbas;
    private javax.swing.JButton pesquisarFinanceiroBotao;
    private javax.swing.JButton removerItemBotao;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JTable tabelaFinanceira;
    private javax.swing.JTable tabelaMateriais;
    private javax.swing.JTable tabelaProfessores;
    private javax.swing.JLabel textoData;
    private javax.swing.JLabel textoData1;
    private javax.swing.JLabel textoData10;
    private javax.swing.JLabel textoData11;
    private javax.swing.JLabel textoData12;
    private javax.swing.JLabel textoData13;
    private javax.swing.JLabel textoData14;
    private javax.swing.JLabel textoData2;
    private javax.swing.JLabel textoData3;
    private javax.swing.JLabel textoData4;
    private javax.swing.JLabel textoData6;
    private javax.swing.JLabel textoData7;
    private javax.swing.JLabel textoData8;
    private javax.swing.JLabel textoData9;
    private javax.swing.JLabel textoRemocao;
    // End of variables declaration//GEN-END:variables
}
