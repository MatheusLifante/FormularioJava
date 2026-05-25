package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class FichaMatricula extends JFrame {

   public FichaMatricula() {

    setTitle("Ficha de Matrícula");
    setSize(900, 900);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JPanel painelPrincipal = new JPanel();
    painelPrincipal.setLayout(null);
    painelPrincipal.setBackground(Color.WHITE);


    JLabel tituloTopo = new JLabel("FICHA DE MATRÍCULA");
    tituloTopo.setFont(new Font("Arial", Font.BOLD, 18));
    tituloTopo.setBounds(320, 20, 300, 30);

    painelPrincipal.add(tituloTopo);


    JPanel painelDados = new JPanel(null);

    painelDados.setBorder(
        BorderFactory.createTitledBorder(
            new LineBorder(Color.GRAY),
            "FICHA DE MATRÍCULA"
        )
    );

    painelDados.setBounds(40, 70, 800, 410);



    JLabel lblNome = new JLabel("Nome:");
    lblNome.setBounds(10, 30, 100, 25);

    JTextField txtNome = new JTextField();
    txtNome.setBounds(60, 30, 720, 25);



    JLabel lblNomeSocial = new JLabel("Nome Social:");
    lblNomeSocial.setBounds(10, 65, 100, 25);

    JTextField txtNomeSocial = new JTextField();
    txtNomeSocial.setBounds(100, 65, 680, 25);


JLabel lblCpf = new JLabel("CPF:");
lblCpf.setBounds(10, 100, 40, 25);

JTextField txtCpf = new JTextField();
txtCpf.setBounds(50, 100, 120, 25);



JLabel lblGenero = new JLabel("Gênero:");
lblGenero.setBounds(190, 100, 60, 25);

JTextField txtGenero = new JTextField();
txtGenero.setBounds(250, 100, 80, 25);



JLabel lblAfro = new JLabel("Afrodescendente:");
lblAfro.setBounds(350, 100, 120, 25);

JTextField txtAfro = new JTextField();
txtAfro.setBounds(470, 100, 70, 25);



JLabel lblEscolaridade = new JLabel("Escolaridade pública:");
lblEscolaridade.setBounds(560, 100, 130, 25);

JTextField txtEscolaridade = new JTextField();
txtEscolaridade.setBounds(690, 100, 90, 25);



    JLabel lblData = new JLabel("Data de nascimento:");
    lblData.setBounds(10, 140, 140, 25);

    JTextField txtData = new JTextField();
    txtData.setBounds(150, 140, 150, 25);



    JLabel lblLocal = new JLabel("Local de Nascimento:");
    lblLocal.setBounds(320, 140, 150, 25);

    JTextField txtLocal = new JTextField();
    txtLocal.setBounds(470, 140, 150, 25);

  

    JLabel lblNacionalidade = new JLabel("Nacionalidade:");
    lblNacionalidade.setBounds(10, 180, 120, 25);

    JTextField txtNacionalidade = new JTextField();
    txtNacionalidade.setBounds(120, 180, 180, 25);

    JLabel lblPais = new JLabel("País de Origem:");
    lblPais.setBounds(320, 180, 120, 25);

    JTextField txtPais = new JTextField();
    txtPais.setBounds(430, 180, 180, 25);



    JLabel lblFiliacao1 = new JLabel("Filiação 1:");
    lblFiliacao1.setBounds(10, 220, 100, 25);

    JTextField txtFiliacao1 = new JTextField();
    txtFiliacao1.setBounds(90, 220, 690, 25);



    JLabel lblFiliacao2 = new JLabel("Filiação 2:");
    lblFiliacao2.setBounds(10, 255, 100, 25);

    JTextField txtFiliacao2 = new JTextField();
    txtFiliacao2.setBounds(90, 255, 690, 25);



    JLabel lblResponsavel = new JLabel("Responsável Legal:");
    lblResponsavel.setBounds(10, 290, 130, 25);

    JTextField txtResponsavel = new JTextField();
    txtResponsavel.setBounds(140, 290, 350, 25);

    JLabel lblParentesco = new JLabel("Grau de Parentesco:");
    lblParentesco.setBounds(510, 290, 140, 25);

    JTextField txtParentesco = new JTextField();
    txtParentesco.setBounds(650, 290, 130, 25);



    JLabel lblHabilitacao = new JLabel("Habilitação:");
    lblHabilitacao.setBounds(10, 325, 100, 25);

    JTextField txtHabilitacao = new JTextField();
    txtHabilitacao.setBounds(100, 325, 680, 25);



    JLabel lblSerie = new JLabel("Série/Módulo:");
    lblSerie.setBounds(10, 360, 100, 25);

    JTextField txtSerie = new JTextField();
    txtSerie.setBounds(110, 360, 300, 25);


    JLabel lblPeriodo = new JLabel("Período:");
    lblPeriodo.setBounds(430, 360, 70, 25);

    JTextField txtPeriodo = new JTextField();
    txtPeriodo.setBounds(500, 360, 280, 25);


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

    painelEndereco.setBounds(40, 500, 800, 210);

    JLabel lblRua = new JLabel("Rua/Avenida:");
    lblRua.setBounds(10, 30, 100, 25);

    JTextField txtRua = new JTextField();
    txtRua.setBounds(110, 30, 500, 25);

    JLabel lblBairro = new JLabel("Bairro:");
    lblBairro.setBounds(620, 30, 60, 25);

    JTextField txtBairro = new JTextField();
    txtBairro.setBounds(680, 30, 100, 25);

    JLabel lblComplemento = new JLabel("Complemento:");
    lblComplemento.setBounds(10, 70, 100, 25);

    JTextField txtComplemento = new JTextField();
    txtComplemento.setBounds(110, 70, 160, 25);

    JLabel lblApto = new JLabel("Apto:");
    lblApto.setBounds(290, 70, 40, 25);

    JTextField txtApto = new JTextField();
    txtApto.setBounds(330, 70, 100, 25);

    JLabel lblBloco = new JLabel("Bloco:");
    lblBloco.setBounds(450, 70, 50, 25);

    JTextField txtBloco = new JTextField();
    txtBloco.setBounds(500, 70, 100, 25);

    JLabel lblCidade = new JLabel("Cidade:");
    lblCidade.setBounds(10, 105, 60, 25);

    JTextField txtCidade = new JTextField();
    txtCidade.setBounds(70, 105, 300, 25);

    JLabel lblCep = new JLabel("CEP:");
    lblCep.setBounds(390, 105, 40, 25);

    JTextField txtCep = new JTextField();
    txtCep.setBounds(430, 105, 150, 25);

    JLabel lblEmail = new JLabel("E-mail:");
    lblEmail.setBounds(10, 140, 60, 25);

    JTextField txtEmail = new JTextField();
    txtEmail.setBounds(70, 140, 710, 25);

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



   JLabel lblAssinatura = new JLabel("Assinatura do Aluno ou Responsável:");
lblAssinatura.setBounds(280, 720, 260, 25);

JTextField txtAssinatura = new JTextField();
txtAssinatura.setBounds(180, 750, 462, 30);

JButton btnNovo = new JButton("Novo");
btnNovo.setBounds(180, 790, 100, 35);

JButton btnSalvar = new JButton("Salvar");
btnSalvar.setBounds(300, 790, 100, 35);

JButton btnExcluir = new JButton("Excluir");
btnExcluir.setBounds(420, 790, 100, 35);

JButton btnLimpar = new JButton("Limpar");
btnLimpar.setBounds(540, 790, 100, 35);

painelPrincipal.add(btnNovo);
painelPrincipal.add(btnSalvar);
painelPrincipal.add(btnExcluir);
painelPrincipal.add(btnLimpar);

painelPrincipal.add(lblAssinatura);
painelPrincipal.add(txtAssinatura);



    painelPrincipal.add(painelDados);
    painelPrincipal.add(painelEndereco);

    add(painelPrincipal);
}

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new FichaMatricula().setVisible(true);
            }
        });
    }
}
