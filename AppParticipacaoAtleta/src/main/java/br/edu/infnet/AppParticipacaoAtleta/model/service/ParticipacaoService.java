package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;

@Service
public class ParticipacaoService {
	
	private static Map<Integer, Participacao> mapa = new HashMap<Integer, Participacao> ();
	private static Integer id = 1;
	
	public  void incluir(Participacao participacao) {
		participacao.setId(id++);
		mapa.put(participacao.getId(),participacao);
	}
		
	public  void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public  Collection<Participacao> obterLista(){
		return mapa.values();
	}

}
