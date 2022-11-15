package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.repository.ParticipacaoRepository;

@Service
public class ParticipacaoService {
	

	@Autowired
	private ParticipacaoRepository participacaoRepository;
	
	public  void incluir(Participacao participacao) {
		participacaoRepository.save(participacao);
	}
	
	public void excluir(Integer id) {
		participacaoRepository.deleteById(id);
	}
		
	public  Collection<Participacao> obterLista(){
		return (Collection<Participacao>) participacaoRepository.findAll();
	}
	
	
	public  Collection<Participacao> obterLista(Usuario usuario){
		return (Collection<Participacao>) participacaoRepository.obterLista(usuario.getId());
	}


}
