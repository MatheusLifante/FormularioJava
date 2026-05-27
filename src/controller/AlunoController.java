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

            aluno.setEstuda_etec(
                tela.getTxtEstudaEtec().getText().trim()
            );

            aluno.setEstuda_outra_etec(
                tela.getTxtOutraEtec().getText().trim()
            );

            aluno.setJa_estudou_etec(
                tela.getTxtJaEstudou().getText().trim()
            );

            aluno.setTerminou_ensmedio(
                tela.getTxtEnsinoMedio().getText().trim()
            );

            aluno.setEscola(
                tela.getTxtEscola().getText().trim()
            );

            aluno.setGenero(
                tela.getTxtGenero().getText().trim()
            );

            aluno.setNascimento(
                tela.getTxtData().getText().trim()
            );

            aluno.setLocal_nasc(
                tela.getTxtLocal().getText().trim()
            );

            aluno.setFiliacao_1(
                tela.getTxtFiliacao1().getText().trim()
            );

            aluno.setFiliacao_2(
                tela.getTxtFiliacao2().getText().trim()
            );

            aluno.setHabilitacao(
                tela.getTxtHabilitacao().getText().trim()
            );

            aluno.setAfrodescendente(
                tela.getTxtAfro().getText().trim()
            );

            aluno.setEscol_publica(
                tela.getTxtEscolaridade().getText().trim()
            );

            aluno.setPais_origem(
                tela.getTxtPais().getText().trim()
            );

            aluno.setRua_avenida(
                tela.getTxtRua().getText().trim()
            );

            aluno.setComplemento(
                tela.getTxtComplemento().getText().trim()
            );

            aluno.setBairro(
                tela.getTxtBairro().getText().trim()
            );

            aluno.setCidade(
                tela.getTxtCidade().getText().trim()
            );

            aluno.setAssitatura_pai(
                tela.getTxtAssinatura().getText().trim()
            );

            aluno.setReponsavel_legal(
                tela.getTxtResponsavel().getText().trim()
            );

            aluno.setGrau_parentesco(
                tela.getTxtParentesco().getText().trim()
            );

            aluno.setPeriodo(
                tela.getTxtPeriodo().getText().trim()
            );

            if (!tela.getTxtCpf().getText().trim().isEmpty()) {

                aluno.setCpf(
                    Integer.parseInt(
                        tela.getTxtCpf().getText().trim()
                    )
                );
            }

            if (!tela.getTxtCep().getText().trim().isEmpty()) {

                aluno.setCep(
                    Integer.parseInt(
                        tela.getTxtCep().getText().trim()
                    )
                );
            }

            if (!tela.getTxtTelefone().getText().trim().isEmpty()) {

                aluno.setTelefone(
                    Integer.parseInt(
                        tela.getTxtTelefone().getText().trim()
                    )
                );
            }

            if (!tela.getTxtCelular().getText().trim().isEmpty()) {

                aluno.seTtlf_celular(
                    Integer.parseInt(
                        tela.getTxtCelular().getText().trim()
                    )
                );
            }

            if (!tela.getTxtApto().getText().trim().isEmpty()) {

                aluno.setApt(
                    Integer.parseInt(
                        tela.getTxtApto().getText().trim()
                    )
                );
            }

            if (!tela.getTxtBloco().getText().trim().isEmpty()) {

                aluno.setBloco(
                    Integer.parseInt(
                        tela.getTxtBloco().getText().trim()
                    )
                );
            }

            if (!tela.getTxtSerie().getText().trim().isEmpty()) {

                aluno.setSerie_modulo(
                    Integer.parseInt(
                        tela.getTxtSerie().getText().trim()
                    )
                );
            }

            String idTexto =
                tela.getTxtId().getText().trim();

            if (idTexto.isEmpty()) {

                alunoDAO.salvar(aluno);

                JOptionPane.showMessageDialog(
                    tela,
                    "Aluno salvo com sucesso."
                );
            }
            else {

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
        }

        catch (Exception e) {

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

        try {

            int id =
                Integer.parseInt(
                    tela.getTxtId().getText()
                );

            alunoDAO.excluir(id);

            JOptionPane.showMessageDialog(
                tela,
                "Aluno excluído com sucesso."
            );

            limpar();

            carregarTabela();
        }

        catch (Exception e) {

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

        tela.getTxtData().setText("");

        tela.getTabelaAlunos().clearSelection();
    }

    public void carregarTabela() {

        DefaultTableModel modelo =
            (DefaultTableModel)
            tela.getTabelaAlunos().getModel();

        modelo.setRowCount(0);

        try {

            List<Aluno> lista =
                alunoDAO.listar();

            for (Aluno a : lista) {

                modelo.addRow(
                    new Object[] {

                        a.getId(),
                        a.getNome(),
                        a.getEmail()
                    }
                );
            }
        }

        catch (Exception e) {

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
        }
    }
}
