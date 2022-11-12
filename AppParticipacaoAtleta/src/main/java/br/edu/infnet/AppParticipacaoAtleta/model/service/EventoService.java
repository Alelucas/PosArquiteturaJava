package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Evento;

@Service
public class EventoService {

	private static Map<Integer, Evento> mapa = new HashMap<Integer, Evento> ();
	private static Integer id = 1;
	
	public  void incluir(Evento evento) {
		evento.setId(id++);
		mapa.put(evento.getId(), evento);
	}
		
	public  void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public  Collection<Evento> obterLista(){
		return mapa.values();
	}
}
