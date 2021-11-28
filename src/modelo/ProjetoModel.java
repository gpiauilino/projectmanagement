package modelo;

public class ProjetoModel {

    private long id;
    private long id_usu;
    private String nome;
    private String descricao;
    private String data_criacao;
    private String data_modificacao;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private String[] colunas = new String[]{"ID", "NOME", "DESCRICAO", "DATA_CRIACAO", "DATA_MODIFICACAO", "ID_USU"};

    public long getId_usu() {
        return id_usu;
    }

    public void setId_usu(long id_usu) {
        this.id_usu = id_usu;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getData_modificacao() {
        return data_modificacao;
    }

    public void setData_modificacao(String data_modificacao) {
        this.data_modificacao = data_modificacao;
    }

    public ProjetoModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

}
