package br.com.munin.model;

public class Ticket {

	private String numeroTicket;
	private String cliente;
	private String prioridade;
	private String status;
	private String titulo;
	private String descricao;
	private String idCard;
	private boolean isHavingTrelloCard;
	private String idTrello;
	private String quadro;
	private String idQuadro;
	private String idlista;
	private String lista;
	private Membro membro;
	
	public String getNumeroTicket() {
		return numeroTicket;
	}
	public void setNumeroTicket(String numeroTicket) {
		this.numeroTicket = numeroTicket;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public boolean isHavingTrelloCard() {
		return isHavingTrelloCard;
	}
	public void setHavingTrelloCard(boolean isHavingTrelloCard) {
		this.isHavingTrelloCard = isHavingTrelloCard;
	}
	public String getIdTrello() {
		return idTrello;
	}
	public void setIdTrello(String idTrello) {
		this.idTrello = idTrello;
	}
	public String getQuadro() {
		return quadro;
	}
	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}
	public String getIdQuadro() {
		return idQuadro;
	}
	public void setIdQuadro(String idQuadro) {
		this.idQuadro = idQuadro;
	}
	public String getIdlista() {
		return idlista;
	}
	public void setIdlista(String idlista) {
		this.idlista = idlista;
	}
	public String getLista() {
		return lista;
	}
	public void setLista(String lista) {
		this.lista = lista;
	}
	public Membro getMembro() {
		return membro;
	}
	public void setMembro(Membro membro) {
		this.membro = membro;
	} 
	
}
