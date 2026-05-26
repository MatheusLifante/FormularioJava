package model;

public class Aluno{

    private int id;

    private String estuda_etec;
    private String estuda_outra_etec;
    private String ja_estudou_etec;
    private String terminou_ensmedio;
    private String escola;

    private String nome;
    private int cpf;
    private String genero;
    private int data_nasc;
    private String nascimento;
    private String filiacao_1;
    private String filiacao_2;
    private String habilitacao;
    private String afrodescendente;
    private int escol_publica;
    private String local_nasc;
    private String pais_origem;

    private String rua_avenida;
    private String complemento;
    private int apt;
    private int bloco;
    private String bairro;
    private String cidade;
    private int cep;
    private int telefone;
    private int tlf_celular;
    private String email;
    private String assitatura_pai;

    private String reponsavel_legal;
    private int grau_parentesco;

    private int serie_modulo;
    private String periodo;



public Aluno() {

}

public Aluno(String estuda_etec, String estuda_outra_etec) {
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec; = estuda_outra_etec;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec; = estuda_outra_etec;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1= filiacao_1;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;

}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep, int telefone) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    this.telefone = telefone;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep, int telefone, int tlf_celular, String email) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    this.telefone = telefone;
    this.tlf_celular = tlf_celular;
    this.email = email;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep, int telefone, int tlf_celular, String email, String assitatura_pai) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    this.telefone = telefone;
    this.tlf_celular = tlf_celular;
    this.email = email;
    this.assitatura_pai = assitatura_pai;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep, int telefone, int tlf_celular, String email, String assitatura_pai, String reponsavel_legal) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    this.telefone = telefone;
    this.tlf_celular = tlf_celular;
    this.email = email;
    this.assitatura_pai = assitatura_pai;
    this.reponsavel_legal = reponsavel_legal;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep, int telefone, int tlf_celular, String email, String assitatura_pai, String reponsavel_legal, String grau_parentesco) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    this.telefone = telefone;
    this.tlf_celular = tlf_celular;
    this.email = email;
    this.assitatura_pai = assitatura_pai;
    this.reponsavel_legal = reponsavel_legal;
    this.grau_parentesco = grau_parentesco;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep, int telefone, int tlf_celular, String email, String assitatura_pai, String reponsavel_legal, String grau_parentesco, int serie_modulo) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    this.telefone = telefone;
    this.tlf_celular = tlf_celular;
    this.email = email;
    this.assitatura_pai = assitatura_pai;
    this.reponsavel_legal = reponsavel_legal;
    this.grau_parentesco = grau_parentesco;
    this.serie_modulo = serie_modulo;
    
}

public Aluno(int id, String estuda_etec, String estuda_outra_etec, String ja_estudou_etec, String terminou_ensmedio, String escola, String nome, int cpf, String genero, String nascimento, String filiacao_1, String filiacao_2, String habilitacao, String afrodescendente, String publica, String local_nasc, String pais_origem, String rua_avenida, String complemento, int apt, int bloco, String bairro, String cidade, int cep, int telefone, int tlf_celular, String email, String assitatura_pai, String reponsavel_legal, String grau_parentesco, int serie_modulo, String periodo) {
    this.id = id;
    this.estuda_etec = estuda_etec;
    this.estuda_outra_etec = estuda_outra_etec;
    this.ja_estudou_etec = ja_estudou_etec;
    this.terminou_ensmedio = terminou_ensmedio;
    this.escola = escola;
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.nascimento = nascimento;
    this.filiacao_1 = filiacao_1;
    this.filiacao_2 = filiacao_2;
    this.habilitacao = habilitacao;
    this.afrodescendente = afrodescendente;
    this.publica = publica;
    this.local_nasc = local_nasc;
    this.pais_origem = pais_origem;
    this.rua_avenida = rua_avenida;
    this.complemento = complemento;
    this.apt = apt;
    this.bloco = bloco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
    this.telefone = telefone;
    this.tlf_celular = tlf_celular;
    this.email = email;
    this.assitatura_pai = assitatura_pai;
    this.reponsavel_legal = reponsavel_legal;
    this.grau_parentesco = grau_parentesco;
    this.serie_modulo = serie_modulo;
    this.periodo = periodo;
    
}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public String getEstuda_etec() {
        return estuda_etec;
    }

    public void setEstuda_etec(String estuda_etec) {
        this.estuda_etec = estuda_etec;
    }

    public String getEstuda_outra_etec() {
        return estuda_outra_etec;
    }

    public void setEstuda_outra_etec(String estuda_outra_etec) {
        this.estuda_outra_etec = estuda_outra_etec;
    }

    public String getJa_estudou_etec() {
        return ja_estudou_etec;
    }

    public void setJa_estudou_etec(String ja_estudou_etec) {
        this.ja_estudou_etec = ja_estudou_etec;
    }


    
     public String getTerminou_ensmedio() {
        return terminou_ensmedio;
    }

    public void setTerminou_ensmedio(String terminou_ensmedio) {
        this.terminou_ensmedio = terminou_ensmedio;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    
    public String getFiliacao_1() {
        return filiacao_1;
    }

    public void setFiliacao_1(String filiacao_1) {
        this.filiacao_1 = filiacao_1;
    }

    public String getFiliacao_2() {
        return filiacao_2;
    }

    public void setFiliacao_2(String filiacao_2) {
        this.filiacao_2 = filiacao_2;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }


    public String getAfrodescendente() {
        return afrodescendente;
    }

    public void setAfrodescendente(String afrodescendente) {
        this.afrodescendente = afrodescendente;
    }

    public int getEscol_publica() {
        return escol_publica;
    }

    public void setEscol_publica(String escol_publica) {
        this.escol_publica = escol_publica;
    }

    public String getLocal_nasc() {
        return local_nasc;
    }

    public void setLocal_nasc(String local_nasc) {
        this.local_nasc = local_nasc;
    }
   

     public String getPais_origem() {
        return pais_origem;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }

    public String getRua_avenida() {
        return rua_avenida;
    }

    public void setRua_avenida(String rua_avenida) {
        this.rua_avenida = rua_avenida;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public int getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }




    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



     public int getTlf_celular() {
        return celular;
    }

    public void seTtlf_celular(String tlf_celular) {
        this.tlf_celular = tlf_celular;
    }

    public String getaAssitatura_pai() {
        return assitatura_pai;
    }

    public void setAssitatura_pai(String assitatura_pai) {
        this.assitatura_pai = assitatura_pai;
    }

    public String getReponsavel_legal() {
        return reponsavel_legal;
    }

    public void setReponsavel_legal(String reponsavel_legal) {
        this.reponsavel_legal = reponsavel_legal;
    }




     public int getGrau_parentesco() {
        return grau_parentesco;
    }

    public void setGrau_parentesco(String grau_parentesco) {
        this.grau_parentesco = grau_parentesco;
    }

    public int getSerie_modulo() {
        return serie_modulo;
    }

    public void setSerie_modulo(String serie_modulo) {
        this.serie_modulo = serie_modulo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }



}





