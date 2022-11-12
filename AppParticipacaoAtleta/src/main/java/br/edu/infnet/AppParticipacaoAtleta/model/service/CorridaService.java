package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.repository.CorridaRepository;

@Service
public class CorridaService {
	
	@Autowired
	private CorridaRepository corridaRepository;
	
	public  void incluir(Corrida corrida) {
		corridaRepository.save(corrida);
	}
	
	public void excluir(Integer id) {
		corridaRepository.deleteById(id);
	}
		
	public  Collection<Corrida> obterLista(){
		return (Collection<Corrida>) corridaRepository.findAll();
	}
}
