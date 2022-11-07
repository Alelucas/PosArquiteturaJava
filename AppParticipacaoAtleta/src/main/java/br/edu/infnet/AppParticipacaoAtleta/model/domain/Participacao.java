package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import java.time.LocalDateTime;


public class Participacao {
	private Integer id;
	private LocalDateTime dt_inscricao;
	private Atleta atleta;
	private Evento eventos;
	
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

	public Evento getEventos() {
		return eventos;
	}

	public void setEventos(Evento eventos) {
		this.eventos = eventos;
	}

		
	}
	
