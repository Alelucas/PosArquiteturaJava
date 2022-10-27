package br.edu.infnet.AppParticipacaoAtleta.model.domain;

public class Corrida extends Evento {
	public String tipo;
	public int percurso;
	public Boolean obstaculo;
	
public String toString() {
	return tipo + ";" + percurso + ";" + obstaculo;
}

}
