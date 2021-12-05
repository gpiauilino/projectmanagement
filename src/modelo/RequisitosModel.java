package modelo;

import java.util.Date;

/**
 *
 * @author Daniel Gomes
 */
public class RequisitosModel {

    private long idRequisito;
    private long usuario_id;
    private long projeto_id;
    private String nomeRequisito;
    private String nomeProjeto;
    private String modulo;
    private String autor;
    private String funcionalidades;
    private String autorUltimaMod;
    private String descricao;
    private Double versao;
    private Double esforcoHoras;
    private int prioridade;
    private int estado;
    private int fase;
    private int complexidade;
    private Date dataCriacao;
    private Date dataUltimaMod;

    //TODO nome das colunas conforme o CREATE table e reisar o no Utilitarios:94
    // declarar tudo de acordo /home/gabriel/Desktop/ProjectMngnToolCreates.sql
    // ou alterar o SQL e testar novamente se decidir modificar o banco
    private final String[] colunas = new String[]{"ID", "NOME", "CPF", "EMAIL", "TELEFONE", "DATA_CRIACAO", "SENHA", "LOGIN", "NIVEL"};

    public RequisitosModel() {
    }

    public long getId() {
        return idRequisito;
    }

    public void setIdRequisito(long idRequisito) {
        this.idRequisito = idRequisito;
    }

    public long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public long getProjeto_id() {
        return projeto_id;
    }

    public void setProjeto_id(long projeto_id) {
        this.projeto_id = projeto_id;
    }

    public String getNomeRequisito() {
        return nomeRequisito;
    }

    public void setNomeRequisito(String nomeRequisito) {
        this.nomeRequisito = nomeRequisito;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public Double getVersao() {
        return versao;
    }

    public void setVersao(Double versao) {
        this.versao = versao;
    }

    public String[] getColunas() {
        return colunas;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(String funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public Date getDataUltimaMod() {
        return dataUltimaMod;
    }

    public void setDataUltimaMod(Date dataUltimaMod) {
        this.dataUltimaMod = dataUltimaMod;
    }

    public String getAutorUltimaMod() {
        return autorUltimaMod;
    }

    public void setAutorUltimaMod(String autorUltimaMod) {
        this.autorUltimaMod = autorUltimaMod;
    }

    public Double getEsforcoHoras() {
        return esforcoHoras;
    }

    public void setEsforcoHoras(Double esforcoHoras) {
        this.esforcoHoras = esforcoHoras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
