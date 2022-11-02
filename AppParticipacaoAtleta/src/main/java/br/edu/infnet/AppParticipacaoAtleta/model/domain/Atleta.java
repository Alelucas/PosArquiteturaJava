package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import java.time.LocalDateTime;


public class Atleta {
	private String cpf;
	private String nome;
	private LocalDateTime dt_nascimento;
	private Boolean genero;
	private Boolean pcd;
	
	
	@Override
	public String toString() {
		return cpf + ";" + nome + ";" + dt_nascimento +  ";" + genero + ";" + pcd;
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


	public LocalDateTime getDt_nascimento() {
		return dt_nascimento;
	}


	public void setDt_nascimento(LocalDateTime dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
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