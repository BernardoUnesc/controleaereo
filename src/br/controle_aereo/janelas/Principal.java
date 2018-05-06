package br.controle_aereo.janelas;

import br.controle_aereo.classes.Calculos;
import br.controle_aereo.classes.Pontos;
import br.controle_aereo.classes.ThreadGrafico;
import br.controle_aereo.classes.Verifica;
import exception.ExceptionCoord;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private boolean ativo = true, acaoExclusao = false;
    private final Calculos cal = new Calculos();
    private double[] resultado = new double[2];
    private final Graphics graph;
    private final Thread thread = new Thread(new ThreadGrafico(this));
    private final DefaultTableModel model;
    private double x, y, r, ang, vel, dir;
    private final Queue<Pontos> filaAcao = new LinkedList<>();
    private final Queue<Pontos> filaCalculo = new LinkedList<>();
    private final Verifica v = new Verifica();
    private ArrayList<Pontos> arrayPontos;

    public JPanel GetPainel() {
        return Painel_Radar;
    }

    public void setAcaoExclusao(boolean acaoExclusao) {
        this.acaoExclusao = acaoExclusao;
    }

    public boolean isAlive() {
        return ativo;
    }

    public boolean isAcaoExclusao() {
        return acaoExclusao;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        radiobutton_Cartesiana.setSelected(true);
        graph = Painel_Radar.getGraphics();
        model = (DefaultTableModel) tabela_Datagrid.getModel();
    }

    public void iniciaThread() {
        try {
            thread.start();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painel_principal = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Datagrid = new javax.swing.JTable();
        btn_excluir = new javax.swing.JButton();
        btn_selecionar_todos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        radiobutton_Cartesiana = new javax.swing.JRadioButton();
        label_X = new javax.swing.JLabel();
        txt_X = new javax.swing.JTextField();
        label_Y = new javax.swing.JLabel();
        txt_Y = new javax.swing.JTextField();
        label_Raio = new javax.swing.JLabel();
        radiobutton_Polar = new javax.swing.JRadioButton();
        txt_Raio = new javax.swing.JTextField();
        label_Angulo = new javax.swing.JLabel();
        txt_Angulo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        label_Velocidade = new javax.swing.JLabel();
        label_Direcao = new javax.swing.JLabel();
        txt_Velocidade = new javax.swing.JTextField();
        txt_Direcao = new javax.swing.JTextField();
        Painel_Radar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Aéreo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        painel_principal.setBackground(new java.awt.Color(0, 51, 102));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas"));

        tabela_Datagrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecionar", "Id", "X", "Y", "Raio", "Ângulo", "Velocidade", "Direção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_Datagrid);
        if (tabela_Datagrid.getColumnModel().getColumnCount() > 0) {
            tabela_Datagrid.getColumnModel().getColumn(0).setResizable(false);
            tabela_Datagrid.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_selecionar_todos.setText("Selecionar Todos");
        btn_selecionar_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionar_todosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_selecionar_todos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_excluir)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_excluir)
                    .addComponent(btn_selecionar_todos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        radiobutton_Cartesiana.setBackground(new java.awt.Color(0, 51, 102));
        buttonGroup1.add(radiobutton_Cartesiana);
        radiobutton_Cartesiana.setForeground(new java.awt.Color(255, 255, 255));
        radiobutton_Cartesiana.setText("Cartesiana");
        radiobutton_Cartesiana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_CartesianaActionPerformed(evt);
            }
        });

        label_X.setForeground(new java.awt.Color(255, 255, 255));
        label_X.setText("X:");

        label_Y.setForeground(new java.awt.Color(255, 255, 255));
        label_Y.setText("Y:");

        txt_Y.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_YFocusLost(evt);
            }
        });

        label_Raio.setForeground(new java.awt.Color(255, 255, 255));
        label_Raio.setText("Raio:");

        radiobutton_Polar.setBackground(new java.awt.Color(0, 51, 102));
        buttonGroup1.add(radiobutton_Polar);
        radiobutton_Polar.setForeground(new java.awt.Color(255, 255, 255));
        radiobutton_Polar.setText("Polar");
        radiobutton_Polar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_PolarActionPerformed(evt);
            }
        });

        txt_Raio.setEnabled(false);

        label_Angulo.setForeground(new java.awt.Color(255, 255, 255));
        label_Angulo.setText("Ângulo:");

        txt_Angulo.setEnabled(false);
        txt_Angulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_AnguloFocusLost(evt);
            }
        });

        jButton2.setText("Inserir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label_Velocidade.setForeground(new java.awt.Color(255, 255, 255));
        label_Velocidade.setText("Velocidade:");

        label_Direcao.setForeground(new java.awt.Color(255, 255, 255));
        label_Direcao.setText("Direção:");

        txt_Direcao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_DirecaoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(label_Y)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(label_X)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_X, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(radiobutton_Cartesiana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiobutton_Polar)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_Raio)
                            .addComponent(label_Angulo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Angulo)
                            .addComponent(txt_Raio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(label_Direcao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Direcao))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(label_Velocidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Velocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(radiobutton_Cartesiana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_X)
                            .addComponent(txt_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Y)
                            .addComponent(txt_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(radiobutton_Polar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_Velocidade)
                                    .addComponent(txt_Velocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Direcao)
                                    .addComponent(txt_Direcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_Raio)
                                    .addComponent(txt_Raio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Angulo))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        Painel_Radar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Painel_Radar.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout Painel_RadarLayout = new javax.swing.GroupLayout(Painel_Radar);
        Painel_Radar.setLayout(Painel_RadarLayout);
        Painel_RadarLayout.setHorizontalGroup(
            Painel_RadarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        Painel_RadarLayout.setVerticalGroup(
            Painel_RadarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Funções"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Escalar"));

        jLabel6.setText("X:");

        jLabel7.setText("Y:");

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Rotacionar"));

        jLabel8.setText("Ângulo:");

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Centro de Rotação");

        jLabel13.setText("X:");

        jLabel14.setText("Y:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Transladar"));

        jLabel9.setText("X:");

        jLabel10.setText("Y:");

        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });

        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Painel_Radar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Painel_Radar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Relatórios");

        jMenuItem1.setText("Aviões Próximos ao Aeroporto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Aviões Próximos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Tangente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Colisões");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiobutton_CartesianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_CartesianaActionPerformed
        // TODO add your handling code here:
        txt_X.setEnabled(true);
        txt_Y.setEnabled(true);
        txt_Raio.setEnabled(false);
        txt_Angulo.setEnabled(false);
    }//GEN-LAST:event_radiobutton_CartesianaActionPerformed

    private void radiobutton_PolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_PolarActionPerformed
        // TODO add your handling code here:
        txt_X.setEnabled(false);
        txt_Y.setEnabled(false);
        txt_Raio.setEnabled(true);
        txt_Angulo.setEnabled(true);
    }//GEN-LAST:event_radiobutton_PolarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        iniciaThread();
        try {
            vel = v.verificaDouble(txt_Velocidade.getText().replaceAll(",", "."));
            dir = v.verificaDouble(txt_Direcao.getText().replaceAll(",", "."));
            Object data[] = new Object[]{false, model.getRowCount(), String.valueOf(new DecimalFormat("#.00").format(x)), String.valueOf(new DecimalFormat("#.00").format(y)), String.valueOf(new DecimalFormat("#.00").format(r)), String.valueOf(new DecimalFormat("#.00").format(ang)), String.valueOf(new DecimalFormat("#.00").format(vel)), String.valueOf(new DecimalFormat("#.00").format(dir))};
            insereTabela(data);
        } catch (ExceptionCoord e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    public Queue<Pontos> getFilaAcao() {
        return filaAcao;
    }

    public void insereTabela(Object data[]) {
        model.addRow(data);
    }

    private void txt_YFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_YFocusLost
        // TODO add your handling code here:
        try {
            x = v.verificaDouble(txt_X.getText().replaceAll(",", "."));
            y = v.verificaDouble(txt_Y.getText().replaceAll(",", "."));

            resultado = cal.calculaPolar(x, y);
            r = resultado[0];
            ang = resultado[1];
            txt_Raio.setText(String.valueOf(new DecimalFormat("#.00").format(resultado[0])));
            txt_Angulo.setText(String.valueOf(new DecimalFormat("#.00").format(resultado[1])));
        } catch (ExceptionCoord e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_YFocusLost

    private void txt_AnguloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_AnguloFocusLost

        try {
            r = v.verificaDouble(txt_Raio.getText().replaceAll(",", "."));
            ang = v.verificaDouble(txt_Angulo.getText().replaceAll(",", "."));

            resultado = cal.calculaCartesiano(r, ang);
            txt_X.setText(String.valueOf(new DecimalFormat("#.00").format(resultado[0])));
            txt_Y.setText(String.valueOf(new DecimalFormat("#.00").format(resultado[1])));

            x = resultado[0];
            y = resultado[1];
        } catch (ExceptionCoord e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_AnguloFocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            getSelecionados();
            double Sx = v.verificaDouble(jTextField5.getText().replaceAll(",", "."));
            double Sy = v.verificaDouble(jTextField6.getText().replaceAll(",", "."));

            for (Pontos p : filaCalculo) {
                resultado = cal.calculaEscala(p.getX(), p.getY(), Sx, Sy);
                insereValorFormatado(resultado[0], p.getLinha(), 2);
                insereValorFormatado(resultado[1], p.getLinha(), 3);
                resultado = cal.calculaPolar(resultado[0], resultado[1]);
                insereValorFormatado(resultado[0], p.getLinha(), 4);
                insereValorFormatado(resultado[1], p.getLinha(), 5);
            }
        } catch (ExceptionCoord e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            getSelecionados();
            double ang = v.verificaDouble(jTextField7.getText().replaceAll(",", "."));
            for (Pontos p : filaCalculo) {
                resultado = cal.calculaRotacao(p.getX(), p.getY(), ang);
                insereValorFormatado(resultado[0], p.getLinha(), 2);
                insereValorFormatado(resultado[1], p.getLinha(), 3);
                resultado = cal.calculaPolar(resultado[0], resultado[1]);
                insereValorFormatado(resultado[0], p.getLinha(), 4);
                insereValorFormatado(resultado[1], p.getLinha(), 5);
            }
        } catch (ExceptionCoord e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ativo = false;
    }//GEN-LAST:event_formWindowClosing

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        getSelecionados();
        int size = filaCalculo.size();
        for (int i = 0; i < size; i++) {
            model.removeRow(filaCalculo.poll().getLinha() - i);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            getSelecionados();
            double Tx = v.verificaDouble(jTextField8.getText().replaceAll(",", "."));
            double Ty = v.verificaDouble(jTextField9.getText().replaceAll(",", "."));

            for (Pontos p : filaCalculo) {
                resultado = cal.calculaTranslacao(p.getX(), p.getY(), Tx, Ty);
                insereValorFormatado(resultado[0], p.getLinha(), 2);
                insereValorFormatado(resultado[1], p.getLinha(), 3);
                resultado = cal.calculaPolar(resultado[0], resultado[1]);
                insereValorFormatado(resultado[0], p.getLinha(), 4);
                insereValorFormatado(resultado[1], p.getLinha(), 5);
            }
        } catch (ExceptionCoord e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        double par = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a distância de parâmetro em km.", "Informe", JOptionPane.QUESTION_MESSAGE).replaceAll(",", "."));
        getTodos();
        String str = "";
        for (Pontos p : arrayPontos) {
            if (p.getR() < par) {
                str += p.getId() + " - " + p.getR() + " km\n";
            }
        }
        JOptionPane.showMessageDialog(null, "Os aviões abaixo estão próximos do aeroporto:\n" + str, "Relatório", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        getTodos();
        String str = "", str2 = "";
        Pontos p1, p2;
        double dist;

        for (int i = 0; i < arrayPontos.size() - 1; i++) {
            p1 = arrayPontos.get(i);
            str2 = p1.getId() + ":\n";
            for (int j = i + 1; j < arrayPontos.size(); j++) {
                p2 = arrayPontos.get(j);
                dist = cal.calculaDistanciaPontos(p1.getX(), p1.getY(), p2.getX(), p2.getY());
                str2 += p2.getId() + " - " + dist + " km\n";

            }
            str += str2;
        }

        System.out.println(str);
        JOptionPane.showMessageDialog(null, str, "Relatório", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        double par = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o angulo.", "Informe", JOptionPane.QUESTION_MESSAGE).replaceAll(",", "."));

        JOptionPane.showMessageDialog(null, Math.tan(Math.toRadians(par)));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txt_DirecaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DirecaoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DirecaoFocusLost

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        double par = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o tempo.", "Informe", JOptionPane.QUESTION_MESSAGE).replaceAll(",", "."));

        getTodos();
        String str = "", str2 = "";
        Pontos p1, p2;
        double t1, t2, dif;

        for (int i = 0; i < arrayPontos.size() - 1; i++) {
            p1 = arrayPontos.get(i);
            str2 = p1.getId() + ":\n";
            for (int j = i + 1; j < arrayPontos.size(); j++) {
                p2 = arrayPontos.get(j);
                resultado = cal.calculaIntersecacao(p1.getX(), p1.getY(), p1.getAng(), p2.getX(), p2.getY(), p2.getAng());
                if (resultado == null) {
                    str2 += p2.getId() + " - Não se cruzam.\n";
                } else {
                    t1 = cal.calculaTempo(p1.getX(), p1.getY(), p1.getVel(), resultado[0], resultado[1]);
                    t2 = cal.calculaTempo(p2.getX(), p2.getY(), p2.getVel(), resultado[0], resultado[1]);

                    dif = t1 - t2;

                    System.out.println(t1);
                    System.out.println(t2);
                    System.out.println(dif);
                    if (Math.abs(dif) < par) {
                        str2 += p2.getId() + " - Vão passar pelo mesmo ponto com intervalo de " + Math.abs(dif) + "s.\n";
                    }
                }

            }
            str += str2;
        }
        JOptionPane.showMessageDialog(null, str, "Relatório", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btn_selecionar_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionar_todosActionPerformed

        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(true, i, 0);
    }//GEN-LAST:event_btn_selecionar_todosActionPerformed
    }

    public void insereValorFormatado(double valor, int row, int column) {
        String vForm = String.valueOf(new DecimalFormat("#.00").format(valor));
        model.setValueAt(vForm, row, column);
    }

    public void getSelecionados() {
        Pontos ponto;
        for (int i = 0; i < model.getRowCount(); i++) {
            if ((Boolean) model.getValueAt(i, 0)) {
                ponto = new Pontos();
                ponto.setLinha(i);
                ponto.setX(Double.parseDouble(model.getValueAt(i, 2).toString().replace(",", ".")));
                ponto.setY(Double.parseDouble(model.getValueAt(i, 3).toString().replace(",", ".")));

                filaAcao.add(ponto);
                filaCalculo.add(ponto);

            }
        }
        if (!filaAcao.isEmpty()) {
            acaoExclusao = true;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void getTodos() {
        Pontos ponto;
        arrayPontos = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {

            ponto = new Pontos();
            ponto.setLinha(i);
            ponto.setX(Double.parseDouble(model.getValueAt(i, 2).toString().replace(",", ".")));
            ponto.setY(Double.parseDouble(model.getValueAt(i, 3).toString().replace(",", ".")));
            ponto.setR(Double.parseDouble(model.getValueAt(i, 4).toString().replace(",", ".")));
            ponto.setAng(Double.parseDouble(model.getValueAt(i, 5).toString().replace(",", ".")));
            ponto.setVel(Double.parseDouble(model.getValueAt(i, 6).toString().replace(",", ".")));
            ponto.setDir(Double.parseDouble(model.getValueAt(i, 7).toString().replace(",", ".")));
            ponto.setId((int) model.getValueAt(i, 1));

            arrayPontos.add(ponto);
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
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Radar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_selecionar_todos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel label_Angulo;
    private javax.swing.JLabel label_Direcao;
    private javax.swing.JLabel label_Raio;
    private javax.swing.JLabel label_Velocidade;
    private javax.swing.JLabel label_X;
    private javax.swing.JLabel label_Y;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JRadioButton radiobutton_Cartesiana;
    private javax.swing.JRadioButton radiobutton_Polar;
    private javax.swing.JTable tabela_Datagrid;
    private javax.swing.JTextField txt_Angulo;
    private javax.swing.JTextField txt_Direcao;
    private javax.swing.JTextField txt_Raio;
    private javax.swing.JTextField txt_Velocidade;
    private javax.swing.JTextField txt_X;
    private javax.swing.JTextField txt_Y;
    // End of variables declaration//GEN-END:variables
}