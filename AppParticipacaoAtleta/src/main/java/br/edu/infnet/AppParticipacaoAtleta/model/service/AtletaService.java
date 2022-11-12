package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;
import br.edu.infnet.AppParticipacaoAtleta.model.repository.AtletaRepository;


@Service
public class AtletaService {
	
	@Autowired
	private AtletaRepository atletaRepository;
	
	public  void incluir(Atleta atleta) {
		atletaRepository.save(atleta);
	}
	
	public void excluir(Integer id) {
		atletaRepository.deleteById(id);
	}
		
	public  Collection<Atleta> obterLista(){
		return (Collection<Atleta>) atletaRepository.findAll();
	}

}
