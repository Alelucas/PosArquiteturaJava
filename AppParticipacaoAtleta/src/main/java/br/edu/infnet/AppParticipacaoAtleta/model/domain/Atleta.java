package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tatleta")
public class Atleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cpf;
	private String nome;
	private Boolean genero;
	private Boolean pcd;	
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
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


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    
	

}