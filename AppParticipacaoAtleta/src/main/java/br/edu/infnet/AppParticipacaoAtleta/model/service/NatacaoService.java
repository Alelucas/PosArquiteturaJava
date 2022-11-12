package br.edu.infnet.AppParticipacaoAtleta.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;
import br.edu.infnet.AppParticipacaoAtleta.model.repository.NatacaoRepository;

@Service
public class NatacaoService {
	
	@Autowired
	private NatacaoRepository natacaoRepository;
	
	public  void incluir(Natacao natacao) {
		natacaoRepository.save(natacao);
	}
	
	public void excluir(Integer id) {
		natacaoRepository.deleteById(id);
	}
		
	public  Collection<Natacao> obterLista(){
		return (Collection<Natacao>) natacaoRepository.findAll();
	}

}
