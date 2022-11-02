package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import java.time.LocalDateTime;


public class Participacao {
	private LocalDateTime dt_inscricao;

	public LocalDateTime getDt_inscricao() {
		return dt_inscricao;
	}

	public void setDt_inscricao(LocalDateTime dt_inscricao) {
		this.dt_inscricao = dt_inscricao;
	}


}
