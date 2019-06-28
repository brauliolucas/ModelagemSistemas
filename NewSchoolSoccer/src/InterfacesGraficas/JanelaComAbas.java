/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class JanelaComAbas extends javax.swing.JFrame {
    private Object label;
    private Object jTable1;

    /**
     * Creates new form JanelaComAbas
     */
    public JanelaComAbas() {
        initComponents();
        getContentPane().setBackground(new Color(94,109,252));
        setResizable(false);
        
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
        tabbedPane = new javax.swing.JTabbedPane();
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
        jButton2 = new javax.swing.JButton();
        abaProfessores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botaoCriarPerfil = new javax.swing.JButton();
        textoSelecao = new javax.swing.JLabel();
        selecioanrProfessor = new javax.swing.JTextField();
        abaFinanceiro = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        textoData1 = new javax.swing.JLabel();
        textoData4 = new javax.swing.JLabel();
        anoInicio1 = new javax.swing.JTextField();
        mesInicio1 = new javax.swing.JTextField();
        mesFim1 = new javax.swing.JTextField();
        anoFim1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        textoData5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imprimirRelatorioBotao = new javax.swing.JButton();
        abaMateriais = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        botaoSolicitarMaterial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TextoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setBackground(new java.awt.Color(153, 153, 255));

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

        tabbedPane.addTab("Home", home);

        editarAluno.setBackground(new java.awt.Color(153, 153, 255));
        editarAluno.setToolTipText("");

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nome", "Professor", "Escalação", "Aniversário", "Posição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
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
            tabelaAlunos.getColumnModel().getColumn(5).setResizable(false);
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

        botaoEdicao.setText("Editar Alunos");

        textoData3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData3.setForeground(new java.awt.Color(255, 255, 255));
        textoData3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData3.setText("Clique aqui para editar os");

        textoData6.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData6.setForeground(new java.awt.Color(255, 255, 255));
        textoData6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData6.setText("dados dos alunos");

        jButton2.setText("Novo Aluno");

        javax.swing.GroupLayout editarAlunoLayout = new javax.swing.GroupLayout(editarAluno);
        editarAluno.setLayout(editarAlunoLayout);
        editarAlunoLayout.setHorizontalGroup(
            editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarAlunoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editarAlunoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarAlunoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesFim, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(editarAlunoLayout.createSequentialGroup()
                                .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarAlunoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(botaoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textoData3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(editarAlunoLayout.createSequentialGroup()
                                        .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imprimirAniversariantes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(editarAlunoLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(textoData6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarAlunoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoData, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(textoData2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        editarAlunoLayout.setVerticalGroup(
            editarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(editarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(editarAlunoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
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
                .addGap(28, 28, 28)
                .addComponent(imprimirAniversariantes)
                .addGap(18, 18, 18)
                .addComponent(textoData3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(textoData6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Alunos", editarAluno);

        abaProfessores.setBackground(new java.awt.Color(153, 153, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Professor", "Núm. de Escalações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        botaoCriarPerfil.setText("Criar Novo Perfil");

        textoSelecao.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoSelecao.setForeground(new java.awt.Color(255, 255, 255));
        textoSelecao.setText("Digite qual professor você deseja visualizar:");

        javax.swing.GroupLayout abaProfessoresLayout = new javax.swing.GroupLayout(abaProfessores);
        abaProfessores.setLayout(abaProfessoresLayout);
        abaProfessoresLayout.setHorizontalGroup(
            abaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaProfessoresLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(abaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaProfessoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(abaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaProfessoresLayout.createSequentialGroup()
                                .addComponent(textoSelecao)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(abaProfessoresLayout.createSequentialGroup()
                                .addComponent(selecioanrProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(abaProfessoresLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botaoCriarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        abaProfessoresLayout.setVerticalGroup(
            abaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaProfessoresLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(abaProfessoresLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(botaoCriarPerfil)
                .addGap(80, 80, 80)
                .addComponent(textoSelecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecioanrProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Professores", abaProfessores);

        abaFinanceiro.setBackground(new java.awt.Color(153, 153, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mês", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
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

        textoData5.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        textoData5.setForeground(new java.awt.Color(255, 255, 255));
        textoData5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoData5.setText("Total para o período especificado:");

        jButton1.setText("Pesquisar");

        imprimirRelatorioBotao.setText("Imprimir relatório");

        javax.swing.GroupLayout abaFinanceiroLayout = new javax.swing.GroupLayout(abaFinanceiro);
        abaFinanceiro.setLayout(abaFinanceiroLayout);
        abaFinanceiroLayout.setHorizontalGroup(
            abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaFinanceiroLayout.createSequentialGroup()
                .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(abaFinanceiroLayout.createSequentialGroup()
                        .addComponent(textoData5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimirRelatorioBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 43, Short.MAX_VALUE))
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
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(imprimirRelatorioBotao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(abaFinanceiroLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(abaFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoData5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabbedPane.addTab("Financeiro", abaFinanceiro);

        abaMateriais.setBackground(new java.awt.Color(153, 153, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Bola",  new Short((short) 0),  new Short((short) 0)},
                { new Integer(2), "Cone",  new Short((short) 0),  new Short((short) 0)},
                { new Integer(3), "Colete",  new Short((short) 0),  new Short((short) 0)},
                { new Integer(4), "Uniforme",  new Short((short) 0),  new Short((short) 0)}
            },
            new String [] {
                "#", "Material", "Quantidade", "Solicitar novo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        botaoSolicitarMaterial.setText("Solicitar novos materiais");
        botaoSolicitarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSolicitarMaterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaMateriaisLayout = new javax.swing.GroupLayout(abaMateriais);
        abaMateriais.setLayout(abaMateriaisLayout);
        abaMateriaisLayout.setHorizontalGroup(
            abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaMateriaisLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(botaoSolicitarMaterial)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        abaMateriaisLayout.setVerticalGroup(
            abaMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaMateriaisLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(abaMateriaisLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(botaoSolicitarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Materiais", abaMateriais);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 710, 487));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfacesGraficas/EscudoMenor.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 189));

        TextoTitulo.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        TextoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        TextoTitulo.setText("getEscola()");
        getContentPane().add(TextoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 21, -1, -1));

        pack();
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

    private void imprimirAniversariantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirAniversariantesActionPerformed

    }//GEN-LAST:event_imprimirAniversariantesActionPerformed

    private void anoInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoInicio1ActionPerformed

    private void mesInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesInicio1ActionPerformed

    private void botaoSolicitarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSolicitarMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSolicitarMaterialActionPerformed

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
                new JanelaComAbas().setVisible(true);
                
            }
        });
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
    private javax.swing.JButton botaoCriarPerfil;
    private javax.swing.JButton botaoEdicao;
    private javax.swing.JButton botaoSolicitarMaterial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel campoAzulTranslucido;
    private javax.swing.JPanel editarAluno;
    private javax.swing.JPanel home;
    private javax.swing.JButton imprimirAniversariantes;
    private javax.swing.JButton imprimirRelatorioBotao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mesFim;
    private javax.swing.JTextField mesFim1;
    private javax.swing.JTextField mesInicio;
    private javax.swing.JTextField mesInicio1;
    private javax.swing.JTextField nomeDaEscola;
    private javax.swing.JTextField selecioanrProfessor;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JLabel textoData;
    private javax.swing.JLabel textoData1;
    private javax.swing.JLabel textoData2;
    private javax.swing.JLabel textoData3;
    private javax.swing.JLabel textoData4;
    private javax.swing.JLabel textoData5;
    private javax.swing.JLabel textoData6;
    private javax.swing.JLabel textoSelecao;
    // End of variables declaration//GEN-END:variables
}
