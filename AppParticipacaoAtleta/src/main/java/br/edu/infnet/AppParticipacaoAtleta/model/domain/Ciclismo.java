package br.edu.infnet.AppParticipacaoAtleta.model.domain;

public class Ciclismo extends Evento {
	public String categoria;
	public String classificacao;
	public String tipo_bicicleta;
	
  @Override
public String toString() {
		return categoria + ";" + classificacao + ";" + tipo_bicicleta;
}
}
