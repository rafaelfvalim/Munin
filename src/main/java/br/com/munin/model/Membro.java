package br.com.munin.model;

public class Membro {
	
	public Membro(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	private String id;
	private String nome;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
