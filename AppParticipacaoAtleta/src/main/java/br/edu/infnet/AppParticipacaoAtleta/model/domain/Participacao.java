package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tparticipacao")
public class Participacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime dt_inscricao;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idAtleta")
	private Atleta atleta;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Evento> eventos;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@Override
	public String toString() {
		return id + ";" + dt_inscricao + ";" + atleta + ";" + eventos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDt_inscricao() {
		return dt_inscricao;
	}

	public void setDt_inscricao(LocalDateTime dt_inscricao) {
		this.dt_inscricao = dt_inscricao;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
		
	}
	
