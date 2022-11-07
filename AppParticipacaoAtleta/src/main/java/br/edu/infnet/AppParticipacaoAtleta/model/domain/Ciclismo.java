package br.edu.infnet.AppParticipacaoAtleta.model.domain;

public class Ciclismo extends Evento {
	private String categoria;
	private String classificacao;
	private String tipo_bicicleta;
	
@Override
public String toString() {
		return super.toString() + ";" + categoria + ";" + classificacao + ";" + tipo_bicicleta;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getClassificacao() {
	return classificacao;
}

public void setClassificacao(String classificacao) {
	this.classificacao = classificacao;
}

public String getTipo_bicicleta() {
	return tipo_bicicleta;
}

public void setTipo_bicicleta(String tipo_bicicleta) {
	this.tipo_bicicleta = tipo_bicicleta;
}


}
