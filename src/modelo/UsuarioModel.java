package modelo;

//Obj Usuário

public class UsuarioModel {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String data_criacao;
    private String senha;
    private String login;
    private int nivel;
    
    private String[] colunas = new String[]{"ID", "NOME", "CPF", "EMAIL", "TELEFONE", "DATA_CRIACAO", "SENHA", "LOGIN", "NIVEL"};
   
    public UsuarioModel() {
        id = 0l;
    }

    // Construtor
    public UsuarioModel(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }
    
    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] Colunas) {
        this.colunas = Colunas;
    }

}
