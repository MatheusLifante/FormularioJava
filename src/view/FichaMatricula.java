package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class FichaMatricula extends JFrame {

    private JTextField txtId;

    private JTextField txtNome;
    private JTextField txtNomeSocial;
    private JTextField txtCpf;
    private JTextField txtGenero;
    private JTextField txtAfro;
    private JTextField txtEscolaridade;
    private JTextField txtData;
    private JTextField txtLocal;
    private JTextField txtNacionalidade;
    private JTextField txtPais;
    private JTextField txtFiliacao1;
    private JTextField txtFiliacao2;
    private JTextField txtResponsavel;
    private JTextField txtParentesco;
    private JTextField txtHabilitacao;
    private JTextField txtSerie;
    private JTextField txtPeriodo;

    private JTextField txtRua;
    private JTextField txtBairro;
    private JTextField txtComplemento;
    private JTextField txtApto;
    private JTextField txtBloco;
    private JTextField txtCidade;
    private JTextField txtCep;
    private JTextField txtEmail;

    private JTextField txtAssinatura;

    private JTable tabelaAlunos;

    public FichaMatricula() {

        setTitle("Ficha de Matrícula");

        setSize(950, 950);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painelPrincipal = new JPanel();

        painelPrincipal.setLayout(null);

        painelPrincipal.setBackground(Color.WHITE);

        txtId = new JTextField();

        txtId.setVisible(false);

        painelPrincipal.add(txtId);

        JLabel tituloTopo =
            new JLabel("FICHA DE MATRÍCULA");

        tituloTopo.setFont(
            new Font("Arial", Font.BOLD, 18)
        );

        tituloTopo.setBounds(320, 20, 300, 30);

        painelPrincipal.add(tituloTopo);

        JPanel painelDados = new JPanel(null);

        painelDados.setBorder(
            BorderFactory.createTitledBorder(
                new LineBorder(Color.GRAY),
                "FICHA DE MATRÍCULA"
            )
        );

        painelDados.setBounds(40, 70, 850, 410);

        JLabel lblNome = new JLabel("Nome:");

        lblNome.setBounds(10, 30, 100, 25);

        txtNome = new JTextField();

        txtNome.setBounds(60, 30, 770, 25);

        JLabel lblNomeSocial =
            new JLabel("Nome Social:");

        lblNomeSocial.setBounds(10, 65, 100, 25);

        txtNomeSocial = new JTextField();

        txtNomeSocial.setBounds(100, 65, 730, 25);

    
        JLabel lblCpf = new JLabel("CPF:");

        lblCpf.setBounds(10, 100, 40, 25);

        txtCpf = new JTextField();

        txtCpf.setBounds(50, 100, 120, 25);

        JLabel lblGenero =
            new JLabel("Gênero:");

        lblGenero.setBounds(190, 100, 60, 25);

        txtGenero = new JTextField();

        txtGenero.setBounds(250, 100, 80, 25);

        JLabel lblAfro =
            new JLabel("Afrodescendente:");

        lblAfro.setBounds(350, 100, 120, 25);

        txtAfro = new JTextField();

        txtAfro.setBounds(470, 100, 70, 25);

        JLabel lblEscolaridade =
            new JLabel("Escolaridade pública:");

        lblEscolaridade.setBounds(
            560,
            100,
            130,
            25
        );

        txtEscolaridade = new JTextField();

        txtEscolaridade.setBounds(
            690,
            100,
            140,
            25
        );
       
        JLabel lblData =
            new JLabel("Data nascimento:");

        lblData.setBounds(10, 140, 140, 25);

        txtData = new JTextField();

        txtData.setBounds(150, 140, 150, 25);

  

        JLabel lblLocal =
            new JLabel("Local Nascimento:");

        lblLocal.setBounds(320, 140, 140, 25);

        txtLocal = new JTextField();

        txtLocal.setBounds(460, 140, 180, 25);

    
        JLabel lblNacionalidade =
            new JLabel("Nacionalidade:");

        lblNacionalidade.setBounds(
            10,
            180,
            100,
            25
        );

        txtNacionalidade = new JTextField();

        txtNacionalidade.setBounds(
            120,
            180,
            180,
            25
        );

        JLabel lblPais =
            new JLabel("País Origem:");

        lblPais.setBounds(320, 180, 100, 25);

        txtPais = new JTextField();

        txtPais.setBounds(430, 180, 180, 25);

        JLabel lblFiliacao1 =
            new JLabel("Filiação 1:");

        lblFiliacao1.setBounds(10, 220, 100, 25);

        txtFiliacao1 = new JTextField();

        txtFiliacao1.setBounds(
            90,
            220,
            740,
            25
        );

        JLabel lblFiliacao2 =
            new JLabel("Filiação 2:");

        lblFiliacao2.setBounds(10, 255, 100, 25);

        txtFiliacao2 = new JTextField();

        txtFiliacao2.setBounds(
            90,
            255,
            740,
            25
        );

        
        JLabel lblResponsavel =
            new JLabel("Responsável:");

        lblResponsavel.setBounds(
            10,
            290,
            100,
            25
        );

        txtResponsavel = new JTextField();

        txtResponsavel.setBounds(
            110,
            290,
            300,
            25
        );

        JLabel lblParentesco =
            new JLabel("Parentesco:");

        lblParentesco.setBounds(
            430,
            290,
            100,
            25
        );

        txtParentesco = new JTextField();

        txtParentesco.setBounds(
            530,
            290,
            180,
            25
        );

       
        JLabel lblHabilitacao =
            new JLabel("Habilitação:");

        lblHabilitacao.setBounds(
            10,
            325,
            100,
            25
        );

        txtHabilitacao = new JTextField();

        txtHabilitacao.setBounds(
            100,
            325,
            730,
            25
        );

        JLabel lblSerie =
            new JLabel("Série/Módulo:");

        lblSerie.setBounds(10, 360, 100, 25);

        txtSerie = new JTextField();

        txtSerie.setBounds(110, 360, 250, 25);

        JLabel lblPeriodo =
            new JLabel("Período:");

        lblPeriodo.setBounds(390, 360, 70, 25);

        txtPeriodo = new JTextField();

        txtPeriodo.setBounds(460, 360, 200, 25);

      
        painelDados.add(lblNome);
        painelDados.add(txtNome);

        painelDados.add(lblNomeSocial);
        painelDados.add(txtNomeSocial);

        painelDados.add(lblCpf);
        painelDados.add(txtCpf);

        painelDados.add(lblGenero);
        painelDados.add(txtGenero);

        painelDados.add(lblAfro);
        painelDados.add(txtAfro);

        painelDados.add(lblEscolaridade);
        painelDados.add(txtEscolaridade);

        painelDados.add(lblData);
        painelDados.add(txtData);

        painelDados.add(lblLocal);
        painelDados.add(txtLocal);

        painelDados.add(lblNacionalidade);
        painelDados.add(txtNacionalidade);

        painelDados.add(lblPais);
        painelDados.add(txtPais);

        painelDados.add(lblFiliacao1);
        painelDados.add(txtFiliacao1);

        painelDados.add(lblFiliacao2);
        painelDados.add(txtFiliacao2);

        painelDados.add(lblResponsavel);
        painelDados.add(txtResponsavel);

        painelDados.add(lblParentesco);
        painelDados.add(txtParentesco);

        painelDados.add(lblHabilitacao);
        painelDados.add(txtHabilitacao);

        painelDados.add(lblSerie);
        painelDados.add(txtSerie);

        painelDados.add(lblPeriodo);
        painelDados.add(txtPeriodo);

       
        JPanel painelEndereco = new JPanel(null);

        painelEndereco.setBorder(
            BorderFactory.createTitledBorder(
                new LineBorder(Color.GRAY),
                "ENDEREÇO"
            )
        );

        painelEndereco.setBounds(
            40,
            500,
            850,
            210
        );

        JLabel lblRua =
            new JLabel("Rua/Avenida:");

        lblRua.setBounds(10, 30, 100, 25);

        txtRua = new JTextField();

        txtRua.setBounds(110, 30, 500, 25);

        JLabel lblBairro =
            new JLabel("Bairro:");

        lblBairro.setBounds(620, 30, 60, 25);

        txtBairro = new JTextField();

        txtBairro.setBounds(680, 30, 150, 25);

        JLabel lblComplemento =
            new JLabel("Complemento:");

        lblComplemento.setBounds(
            10,
            70,
            100,
            25
        );

        txtComplemento = new JTextField();

        txtComplemento.setBounds(
            110,
            70,
            160,
            25
        );

        JLabel lblApto = new JLabel("Apto:");

        lblApto.setBounds(290, 70, 40, 25);

        txtApto = new JTextField();

        txtApto.setBounds(330, 70, 100, 25);

        JLabel lblBloco =
            new JLabel("Bloco:");

        lblBloco.setBounds(450, 70, 50, 25);

        txtBloco = new JTextField();

        txtBloco.setBounds(500, 70, 100, 25);

        JLabel lblCidade =
            new JLabel("Cidade:");

        lblCidade.setBounds(10, 105, 60, 25);

        txtCidade = new JTextField();

        txtCidade.setBounds(70, 105, 300, 25);

        JLabel lblCep = new JLabel("CEP:");

        lblCep.setBounds(390, 105, 40, 25);

        txtCep = new JTextField();

        txtCep.setBounds(430, 105, 150, 25);

        JLabel lblEmail =
            new JLabel("E-mail:");

        lblEmail.setBounds(10, 140, 60, 25);

        txtEmail = new JTextField();

        txtEmail.setBounds(70, 140, 760, 25);

        painelEndereco.add(lblRua);
        painelEndereco.add(txtRua);

        painelEndereco.add(lblBairro);
        painelEndereco.add(txtBairro);

        painelEndereco.add(lblComplemento);
        painelEndereco.add(txtComplemento);

        painelEndereco.add(lblApto);
        painelEndereco.add(txtApto);

        painelEndereco.add(lblBloco);
        painelEndereco.add(txtBloco);

        painelEndereco.add(lblCidade);
        painelEndereco.add(txtCidade);

        painelEndereco.add(lblCep);
        painelEndereco.add(txtCep);

        painelEndereco.add(lblEmail);
        painelEndereco.add(txtEmail);

        JLabel lblAssinatura =
            new JLabel(
                "Assinatura do Aluno:"
            );

        lblAssinatura.setBounds(
            330,
            720,
            200,
            25
        );

        txtAssinatura = new JTextField();

        txtAssinatura.setBounds(
            220,
            750,
            450,
            30
        );

        JButton btnNovo =
            new JButton("Novo");

        btnNovo.setBounds(180, 800, 100, 35);

        JButton btnSalvar =
            new JButton("Salvar");

        btnSalvar.setBounds(300, 800, 100, 35);

        JButton btnExcluir =
            new JButton("Excluir");

        btnExcluir.setBounds(420, 800, 100, 35);

        JButton btnLimpar =
            new JButton("Limpar");

        btnLimpar.setBounds(540, 800, 100, 35);



        tabelaAlunos = new JTable();

        tabelaAlunos.setModel(
            new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                    "ID",
                    "Nome",
                    "Email",
                    "CPF"
                }
            )
        );

        JScrollPane scroll =
            new JScrollPane(tabelaAlunos);

        scroll.setBounds(40, 850, 850, 120);

        painelPrincipal.add(painelDados);

        painelPrincipal.add(painelEndereco);

        painelPrincipal.add(lblAssinatura);

        painelPrincipal.add(txtAssinatura);

        painelPrincipal.add(btnNovo);

        painelPrincipal.add(btnSalvar);

        painelPrincipal.add(btnExcluir);

        painelPrincipal.add(btnLimpar);

        painelPrincipal.add(scroll);

        add(painelPrincipal);
    }

 
    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public JTextField getTxtGenero() {
        return txtGenero;
    }

    public JTextField getTxtAfro() {
        return txtAfro;
    }

    public JTextField getTxtEscolaridade() {
        return txtEscolaridade;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public JTextField getTxtLocal() {
        return txtLocal;
    }

    public JTextField getTxtPais() {
        return txtPais;
    }

    public JTextField getTxtFiliacao1() {
        return txtFiliacao1;
    }

    public JTextField getTxtFiliacao2() {
        return txtFiliacao2;
    }

    public JTextField getTxtResponsavel() {
        return txtResponsavel;
    }

    public JTextField getTxtParentesco() {
        return txtParentesco;
    }

    public JTextField getTxtHabilitacao() {
        return txtHabilitacao;
    }

    public JTextField getTxtSerie() {
        return txtSerie;
    }

    public JTextField getTxtPeriodo() {
        return txtPeriodo;
    }

    public JTextField getTxtRua() {
        return txtRua;
    }

    public JTextField getTxtBairro() {
        return txtBairro;
    }

    public JTextField getTxtComplemento() {
        return txtComplemento;
    }

    public JTextField getTxtApto() {
        return txtApto;
    }

    public JTextField getTxtBloco() {
        return txtBloco;
    }

    public JTextField getTxtCidade() {
        return txtCidade;
    }

    public JTextField getTxtCep() {
        return txtCep;
    }

    public JTextField getTxtAssinatura() {
        return txtAssinatura;
    }

    public JTable getTabelaAlunos() {
        return tabelaAlunos;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new FichaMatricula().setVisible(true);

        });
    }
}