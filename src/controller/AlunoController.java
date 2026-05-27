package controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.AlunoDAO;
import model.Aluno;
import view.FichaMatricula;

public class AlunoController {

    private FichaMatricula tela;

    private AlunoDAO alunoDAO;

    public AlunoController(FichaMatricula tela) {

        this.tela = tela;

        this.alunoDAO = new AlunoDAO();

        carregarTabela();
    }


    public void salvar() {

        try {

            Aluno aluno = new Aluno();

            aluno.setNome(
                tela.getTxtNome().getText().trim()
            );

            aluno.setEmail(
                tela.getTxtEmail().getText().trim()
            );

            aluno.setCpf(
                tela.getTxtCpf().getText().trim()
            );

            aluno.setGenero(
                tela.getTxtGenero().getText().trim()
            );

            aluno.setAfrodescendente(
                tela.getTxtAfro().getText().trim()
            );

            aluno.setEscol_public(
                tela.getTxtEscolaridade().getText().trim()
            );

            aluno.setData_nasc(
                tela.getTxtData().getText().trim()
            );

            aluno.setLocal_nasc(
                tela.getTxtLocal().getText().trim()
            );

            aluno.setNascimento(
                tela.getTxtLocal().getText().trim()
            );

            aluno.setPais_origem(
                tela.getTxtPais().getText().trim()
            );

            aluno.setFiliacao_1(
                tela.getTxtFiliacao1().getText().trim()
            );

            aluno.setFiliacao_2(
                tela.getTxtFiliacao2().getText().trim()
            );

            aluno.setResponsavel_legal(
                tela.getTxtResponsavel().getText().trim()
            );

            aluno.setGrau_parentesco(
                tela.getTxtParentesco().getText().trim()
            );

            aluno.setHabilitacao(
                tela.getTxtHabilitacao().getText().trim()
            );

            aluno.setSerie_modulo(
                tela.getTxtSerie().getText().trim()
            );

            aluno.setPeriodo(
                tela.getTxtPeriodo().getText().trim()
            );

            aluno.setRua_avenida(
                tela.getTxtRua().getText().trim()
            );

            aluno.setBairro(
                tela.getTxtBairro().getText().trim()
            );

            aluno.setComplemento(
                tela.getTxtComplemento().getText().trim()
            );

            aluno.setApt(
                tela.getTxtApto().getText().trim()
            );

            aluno.setBloco(
                tela.getTxtBloco().getText().trim()
            );

            aluno.setCidade(
                tela.getTxtCidade().getText().trim()
            );

            aluno.setCep(
                tela.getTxtCep().getText().trim()
            );

            aluno.setAssinatura_pai(
                tela.getTxtAssinatura().getText().trim()
            );

            String idTexto =
                tela.getTxtId().getText().trim();

            if (idTexto.isEmpty()) {

                alunoDAO.salvar(aluno);

                JOptionPane.showMessageDialog(
                    tela,
                    "Aluno salvo com sucesso."
                );

            } else {

                aluno.setId(
                    Integer.parseInt(idTexto)
                );

                alunoDAO.atualizar(aluno);

                JOptionPane.showMessageDialog(
                    tela,
                    "Aluno atualizado com sucesso."
                );
            }

            limpar();

            carregarTabela();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                tela,
                "Erro ao salvar: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }



    public void excluir() {

        int linha =
            tela.getTabelaAlunos().getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(
                tela,
                "Selecione um aluno.",
                "Atenção",
                JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        int confirmacao =
            JOptionPane.showConfirmDialog(
                tela,
                "Deseja realmente excluir?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
            );

        if (confirmacao != JOptionPane.YES_OPTION) {

            return;
        }

        try {

            int id = Integer.parseInt(
                tela.getTxtId().getText()
            );

            alunoDAO.excluir(id);

            JOptionPane.showMessageDialog(
                tela,
                "Aluno excluído com sucesso."
            );

            limpar();

            carregarTabela();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                tela,
                "Erro ao excluir: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }


    public void limpar() {

        tela.getTxtId().setText("");

        tela.getTxtNome().setText("");

        tela.getTxtEmail().setText("");

        tela.getTxtCpf().setText("");

        tela.getTxtGenero().setText("");

        tela.getTabelaAlunos().clearSelection();

        tela.getTxtNome().requestFocus();
    }


    public void carregarTabela() {

        DefaultTableModel modelo =
            (DefaultTableModel)
            tela.getTabelaAlunos().getModel();

        modelo.setRowCount(0);

        try {

            List<Aluno> alunos =
                alunoDAO.listar();

            for (Aluno a : alunos) {

                modelo.addRow(
                    new Object[] {

                        a.getId(),
                        a.getNome(),
                        a.getEmail(),
                        a.getCpf()
                    }
                );
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                tela,
                "Erro ao carregar tabela: "
                + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void preencherFormulario() {

        int linha =
            tela.getTabelaAlunos().getSelectedRow();

        if (linha != -1) {

            tela.getTxtId().setText(
                tela.getTabelaAlunos()
                    .getValueAt(linha, 0)
                    .toString()
            );

            tela.getTxtNome().setText(
                tela.getTabelaAlunos()
                    .getValueAt(linha, 1)
                    .toString()
            );

            tela.getTxtEmail().setText(
                tela.getTabelaAlunos()
                    .getValueAt(linha, 2)
                    .toString()
            );

            tela.getTxtCpf().setText(
                tela.getTabelaAlunos()
                    .getValueAt(linha, 3)
                    .toString()
            );
        }
    }
}