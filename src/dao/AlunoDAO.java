package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import util.Conexao;

public class AlunoDAO {

    public void salvar(Aluno aluno) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql =
            "INSERT INTO aluno (" +
            "nome, email, estuda_etec, estuda_outra_etec, " +
            "terminou_ensmedio, escola, cpf, genero, " +
            "data_nasc, nascimento, filiacao_1, filiacao_2, " +
            "habilitacao, afrodescendente, escol_public, " +
            "local_nasc, pais_origem, rua_avenida, " +
            "complemento, apt, bloco, bairro, cidade, cep, " +
            "telefone, tlf_celular, assinatura_pai, " +
            "responsavel_legal, grau_parentesco, " +
            "serie_modulo, periodo" +
            ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            conn = Conexao.conectar();

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.setString(3, aluno.getEstuda_etec());
            stmt.setString(4, aluno.getEstuda_outra_etec());
            stmt.setString(5, aluno.getTerminou_ensmedio());
            stmt.setString(6, aluno.getEscola());
            stmt.setString(7, aluno.getCpf());
            stmt.setString(8, aluno.getGenero());
            stmt.setString(9, aluno.getData_nasc());
            stmt.setString(10, aluno.getNascimento());

            stmt.setString(11, aluno.getFiliacao_1());
            stmt.setString(12, aluno.getFiliacao_2());
            stmt.setString(13, aluno.getHabilitacao());
            stmt.setString(14, aluno.getAfrodescendente());
            stmt.setString(15, aluno.getEscol_public());

            stmt.setString(16, aluno.getLocal_nasc());
            stmt.setString(17, aluno.getPais_origem());
            stmt.setString(18, aluno.getRua_avenida());
            stmt.setString(19, aluno.getComplemento());
            stmt.setString(20, aluno.getApt());

            stmt.setString(21, aluno.getBloco());
            stmt.setString(22, aluno.getBairro());
            stmt.setString(23, aluno.getCidade());
            stmt.setString(24, aluno.getCep());
            stmt.setString(25, aluno.getTelefone());

            stmt.setString(26, aluno.getTlf_celular());
            stmt.setString(27, aluno.getAssinatura_pai());
            stmt.setString(28, aluno.getResponsavel_legal());
            stmt.setString(29, aluno.getGrau_parentesco());
            stmt.setString(30, aluno.getSerie_modulo());

            stmt.setString(31, aluno.getPeriodo());

            stmt.executeUpdate();

        } catch (Exception e) {

            throw new RuntimeException(
                "Erro ao salvar aluno: " + e.getMessage()
            );

        } finally {

            try {

                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public void atualizar(Aluno aluno) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql =
            "UPDATE aluno SET " +
            "nome = ?, " +
            "email = ?, " +
            "estuda_etec = ?, " +
            "estuda_outra_etec = ?, " +
            "terminou_ensmedio = ?, " +
            "escola = ?, " +
            "cpf = ?, " +
            "genero = ?, " +
            "data_nasc = ?, " +
            "nascimento = ?, " +
            "filiacao_1 = ?, " +
            "filiacao_2 = ?, " +
            "habilitacao = ?, " +
            "afrodescendente = ?, " +
            "escol_public = ?, " +
            "local_nasc = ?, " +
            "pais_origem = ?, " +
            "rua_avenida = ?, " +
            "complemento = ?, " +
            "apt = ?, " +
            "bloco = ?, " +
            "bairro = ?, " +
            "cidade = ?, " +
            "cep = ?, " +
            "telefone = ?, " +
            "tlf_celular = ?, " +
            "assinatura_pai = ?, " +
            "responsavel_legal = ?, " +
            "grau_parentesco = ?, " +
            "serie_modulo = ?, " +
            "periodo = ? " +
            "WHERE id = ?";

        try {

            conn = Conexao.conectar();

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.setString(3, aluno.getEstuda_etec());
            stmt.setString(4, aluno.getEstuda_outra_etec());
            stmt.setString(5, aluno.getTerminou_ensmedio());
            stmt.setString(6, aluno.getEscola());
            stmt.setString(7, aluno.getCpf());
            stmt.setString(8, aluno.getGenero());
            stmt.setString(9, aluno.getData_nasc());
            stmt.setString(10, aluno.getNascimento());

            stmt.setString(11, aluno.getFiliacao_1());
            stmt.setString(12, aluno.getFiliacao_2());
            stmt.setString(13, aluno.getHabilitacao());
            stmt.setString(14, aluno.getAfrodescendente());
            stmt.setString(15, aluno.getEscol_public());

            stmt.setString(16, aluno.getLocal_nasc());
            stmt.setString(17, aluno.getPais_origem());
            stmt.setString(18, aluno.getRua_avenida());
            stmt.setString(19, aluno.getComplemento());
            stmt.setString(20, aluno.getApt());

            stmt.setString(21, aluno.getBloco());
            stmt.setString(22, aluno.getBairro());
            stmt.setString(23, aluno.getCidade());
            stmt.setString(24, aluno.getCep());
            stmt.setString(25, aluno.getTelefone());

            stmt.setString(26, aluno.getTlf_celular());
            stmt.setString(27, aluno.getAssinatura_pai());
            stmt.setString(28, aluno.getResponsavel_legal());
            stmt.setString(29, aluno.getGrau_parentesco());
            stmt.setString(30, aluno.getSerie_modulo());

            stmt.setString(31, aluno.getPeriodo());

            stmt.setInt(32, aluno.getId());

            stmt.executeUpdate();

        } catch (Exception e) {

            throw new RuntimeException(
                "Erro ao atualizar aluno: " + e.getMessage()
            );

        } finally {

            try {

                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

  
    public void excluir(int id) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM aluno WHERE id = ?";

        try {

            conn = Conexao.conectar();

            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

        } catch (Exception e) {

            throw new RuntimeException(
                "Erro ao excluir aluno: " + e.getMessage()
            );

        } finally {

            try {

                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

   
    public List<Aluno> listar() {

        List<Aluno> lista = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql =
            "SELECT * FROM aluno ORDER BY id DESC";

        try {

            conn = Conexao.conectar();

            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {

                Aluno aluno = new Aluno();

                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));

                aluno.setEstuda_etec(
                    rs.getString("estuda_etec")
                );

                aluno.setEstuda_outra_etec(
                    rs.getString("estuda_outra_etec")
                );

                aluno.setTerminou_ensmedio(
                    rs.getString("terminou_ensmedio")
                );

                aluno.setEscola(
                    rs.getString("escola")
                );

                aluno.setCpf(
                    rs.getString("cpf")
                );

                aluno.setGenero(
                    rs.getString("genero")
                );

                aluno.setData_nasc(
                    rs.getString("data_nasc")
                );

                aluno.setNascimento(
                    rs.getString("nascimento")
                );

                aluno.setFiliacao_1(
                    rs.getString("filiacao_1")
                );

                aluno.setFiliacao_2(
                    rs.getString("filiacao_2")
                );

                aluno.setHabilitacao(
                    rs.getString("habilitacao")
                );

                aluno.setAfrodescendente(
                    rs.getString("afrodescendente")
                );

                aluno.setEscol_public(
                    rs.getString("escol_public")
                );

                aluno.setLocal_nasc(
                    rs.getString("local_nasc")
                );

                aluno.setPais_origem(
                    rs.getString("pais_origem")
                );

                aluno.setRua_avenida(
                    rs.getString("rua_avenida")
                );

                aluno.setComplemento(
                    rs.getString("complemento")
                );

                aluno.setApt(
                    rs.getString("apt")
                );

                aluno.setBloco(
                    rs.getString("bloco")
                );

                aluno.setBairro(
                    rs.getString("bairro")
                );

                aluno.setCidade(
                    rs.getString("cidade")
                );

                aluno.setCep(
                    rs.getString("cep")
                );

                aluno.setTelefone(
                    rs.getString("telefone")
                );

                aluno.setTlf_celular(
                    rs.getString("tlf_celular")
                );

                aluno.setAssinatura_pai(
                    rs.getString("assinatura_pai")
                );

                aluno.setResponsavel_legal(
                    rs.getString("responsavel_legal")
                );

                aluno.setGrau_parentesco(
                    rs.getString("grau_parentesco")
                );

                aluno.setSerie_modulo(
                    rs.getString("serie_modulo")
                );

                aluno.setPeriodo(
                    rs.getString("periodo")
                );

                lista.add(aluno);
            }

        } catch (Exception e) {

            throw new RuntimeException(
                "Erro ao listar alunos: " + e.getMessage()
            );

        } finally {

            try {

                if (rs != null) {
                    rs.close();
                }

                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return lista;
    }
}