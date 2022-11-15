package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Evento;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.repository.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eventoRepository;
	
	public  void incluir(Evento evento) {
		eventoRepository.save(evento);
	}
	
	public void excluir(Integer id) {
		eventoRepository.deleteById(id);
	}
		
	public  Collection<Evento> obterLista(){
		return (Collection<Evento>) eventoRepository.findAll();
	}
	
	public  Collection<Evento> obterLista(Usuario usuario){
		return (Collection<Evento>) eventoRepository.obterLista(usuario.getId());
	}
}
