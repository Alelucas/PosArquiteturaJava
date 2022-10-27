package br.edu.infnet.AppParticipacaoAtleta.model.domain;

import java.sql.Time;
import java.util.Date;


public class Evento {
	public int codigo;
	public String nome;
	public Date dt_realizacao;
	public Time hora_inicio;
	public Boolean assistencia_pcd;
	public String tipo_assistencia_pcd;

}
