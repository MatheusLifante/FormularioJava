package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import util.Conexao;

public class AlunoDAO {

    public void salvar(Aluno aluno){
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "INSERT INTO  aluno (estuda_etec, estuda_outra_etec, ja_estudou_etec, terminou_ensmedio, escola, nome, cpf, genero, data_nasc, nascimento, filiacao_1, filiacao_2, habilitacao, afrodescendente, escol_publica, local_nasc, pais_origem, rua_avenida, complemento, apt, bloco, bairo, cidade, cep, telefone, tlf_celular, email, assitatura_pai, responsavel_legal, grau_parentesco, serie_modulo, periodo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
       try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.estuda_etec());
            stmt.setString(2, aluno.estuda_outra_etec());
            stmt.setString(3, aluno.ja_estudou_etec());
            stmt.setString(4, aluno.terminou_ensmedio());
            stmt.setString(5, aluno.escola());
            stmt.setString(6, aluno.nome());
            stmt.setInt(7, aluno.cpf());
            stmt.setString(8, aluno.genero());
            stmt.setInt(9, aluno.data_nasc());
            stmt.setString(10, aluno.nascimento());

            stmt.setString(11, aluno.filiacao_1());
            stmt.setString(12, aluno.filiacao_2());
            stmt.setString(13, aluno.habilitacao());
            stmt.setString(14, aluno.afrodescendente());
            stmt.setInt(15, aluno.escol_publica());
            stmt.setString(16, aluno.local_nasc());
            stmt.setString(17, aluno.pais_origem());
            stmt.setString(18, aluno.rua_avenida());
            stmt.setString(19, aluno.complemento());
            stmt.setString(20, aluno.apt());

            stmt.setInt(21, aluno.bloco());
            stmt.setString(22, aluno.bairro());
            stmt.setString(23, aluno.cidade());
            stmt.setInt(24, aluno.cep());
            stmt.setInt(25, aluno.telefone());
            stmt.setInt(26, aluno.tlf_celular());
            stmt.setString(27, aluno.email());
            stmt.setString(28, aluno.assitatura_pai());
            stmt.setString(29, aluno.responsavel_legal());
            stmt.setInt(30, aluno.grau_parentesco());
            stmt.setInt(31, aluno.serie_modulo());
            stmt.setString(32, aluno.periodo());
            stmt.executeUpdate();
            
       }catch (Exception e) {
            throw new RuntimeException("Erro ao salvar aluno: " + e.getMessage());
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
    
 public void atualizar (Aluno aluno) {
    Connection conn = null;
    Prepared stmt = null;

    String sql = "UPDATE aluno SET estuda_etec= ?, estuda_outra_etec = ?, ja_estudou_etec = ?, terminou_ensmedio = ?, escola = ?, nome = ?, cpf = ?, genero = ?, data_nasc = ?, nascimento = ?, filiacao_1 = ?, filiacao_2 = ?, habilitacao = ?, afrodescendente = ?, escol_publica = ?, local_nasc = ?, pais_origem = ?, rua_avenida = ?, complemento = ?, apt = ?, bloco = ?, bairro = ?, cidade = ?, cep = ?, telefone = ?, tlf_celular = ?, email = ?, assinatura_pai = ?, responsavel_legal = ?, grau_parentesco = ?, serie_modulo = ?, periodo = ? WHERE id = ?";
 
     try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getEstuda_etec());
            stmt.setInt(2, aluno.getId());
            stmt.setString(3, aluno.getEstuda_outra_etec());
            stmt.setString(4, aluno.getJa_estudou_etec());
            stmt.setString(5, aluno.getTerminou_ensmedio());
            stmt.setString(6, aluno.getEscola());
            stmt.setString(7, aluno.getNome());
            stmt.setInt(8, aluno.getCpf());
            stmt.setString(9, aluno.getGenero());
            stmt.setInt(10, aluno.getData_nasc());
            stmt.setString(11, aluno.getNascimento());
            stmt.setString(12, aluno.getFiliacao_1());
            stmt.setString(13, aluno.getFiliacao_2());
            stmt.setString(14, aluno.getHabilitacao());
            stmt.setString(15, aluno.getAfrodescendente());
            stmt.setString(16, aluno.getEscol_publica());


            stmt.setString(17, aluno.getLocal_nasc());
            stmt.setString(18, aluno.getPais_origem());
            stmt.setString(19, aluno.getRua_avenida());
            stmt.setString(20, aluno.getComplemento());
            stmt.setInt(21, aluno.getApt());
            stmt.setInt(22, aluno.getBloco());
            stmt.setString(23, aluno.getBairro());
            stmt.setInt(24, aluno.getCidade());
            stmt.setInt(25, aluno.getCep());
            stmt.setInt(26, aluno.getTelefone());
            stmt.setInt(27, aluno.getTlf_celular());
            stmt.setString(28, aluno.getEmail());
            stmt.setString(29, aluno.getAssitatura_pai());
            stmt.setString(30, aluno.getReponsavel_legal());
            stmt.setInt(33, aluno.getGrau_parentesco());
            stmt.setString(32, aluno.getSerie_modulo());
            stmt.setString(33, aluno.getPeriodo());
            stmt.executeUpdate();
  
   } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar aluno: " + e.getMessage());
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
            throw new RuntimeException("Erro ao excluir açuno: " + e.getMessage());
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
        List<Aluno> lista = new ArrayList<Aluno>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT id, estuda_etec, estuda_outra_etec, ja_estudou_etec, terminou_ensmedio, escola, cpf, genero, data_nasc, nascimento, filiacao_1, filiacao_2, habilitacao, afrodescendente, escol_publica, local_nasc, pais_origem, rua_avenida, complemento, apt, bloco, bairro, cidade, cep, telefone, tlf_celular, assitatura_pai, reponsavel_legal, grau_parentesco, serie_modulo, periodo, nome, email FROM cliente ORDER BY id DESC";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEstuda_etec(rs.getString("estuda_etec"));
                cliente.setEstuda_outra_etec(rs.getString("estuda_outra_etec"));
                cliente.setJa_estudou_etec(rs.getString("ja_estudou_etec"));
                cliente.setTerminou_ensmedio(rs.getString("terminou_ensmedio"));
                cliente.setEscola(rs.getString("escola"));
                cliente.setCpf(rs.getInt("cpf"));
                cliente.setGenero(rs.getString("genero"));
                cliente.setData_nasc(rs.getInt("data_nasc"));
                cliente.setNascimento(rs.getString("nascimento"));
                cliente.setFiliacao_1(rs.getString("filiacao_1"));
                cliente.setFiliacao_2(rs.getString("filiacao_2"));
                cliente.setHabilitacao(rs.getString("habilitacao"));
                cliente.setAfrodescendente(rs.getString("afrodescendente"));
                cliente.setEscol_publica(rs.getInt("escol_publica"));
                cliente.setLocal_nasc(rs.getString("local_nasc"));
                cliente.setPais_origem(rs.getString("pais_origem"));

                cliente.setRua_avenida(rs.getString("rua_avenida"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setApt(rs.getInt("apt"));
                cliente.setBloco(rs.getInt("bloco"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setCep(rs.getInt("cep"));

                cliente.setTelefone(rs.getInt("telefone"));
                cliente.setTlf_celular(rs.getString("tlf_celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setAssitatura_pai(rs.getString("assitatura_pai"));
                cliente.setReponsavel_legal(rs.getString("reponsavel_legal"));
                cliente.setGrau_parentesco(rs.getInt("grau_parentesco"));
                cliente.setSerie_modulo(rs.getString("serie_modulo"));
                cliente.setPeriodo(rs.getString("periodo"));
                lista.add(aluno);
            }

           } catch (Exception e) {
            throw new RuntimeException("Erro ao listar clientes: " + e.getMessage());
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




            
