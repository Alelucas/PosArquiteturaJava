package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;
import br.edu.infnet.AppParticipacaoAtleta.model.repository.CiclismoRepository;

@Service
public class CiclismoService {
	
	@Autowired
	private CiclismoRepository ciclismoRepository;
	
	public  void incluir(Ciclismo ciclismo) {
		ciclismoRepository.save(ciclismo);
	}
	
	public void excluir(Integer id) {
		ciclismoRepository.deleteById(id);
	}
		
	public  Collection<Ciclismo> obterLista(){
		return (Collection<Ciclismo>) ciclismoRepository.findAll();
	}
}
