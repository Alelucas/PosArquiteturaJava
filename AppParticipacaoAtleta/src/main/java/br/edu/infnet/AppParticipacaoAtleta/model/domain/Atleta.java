package br.edu.infnet.AppParticipacaoAtleta.model.domain;


public class Atleta {
	private Integer id;
	private String cpf;
	private String nome;
	private Boolean genero;
	private Boolean pcd;
	
	
	@Override
	public String toString() {
		return id + ";" + cpf + ";" + nome + ";" +  ";" + genero + ";" + pcd;
}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Boolean getGenero() {
		return genero;
	}


	public void setGenero(Boolean genero) {
		this.genero = genero;
	}


	public Boolean getPcd() {
		return pcd;
	}


	public void setPcd(Boolean pcd) {
		this.pcd = pcd;
	}


	

}