package br.edu.infnet.AppParticipacaoAtleta.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Participacao;

@Repository
public interface ParticipacaoRepository extends CrudRepository<Participacao,Integer> {
	
	@Query("from Participacao p where p.usuario.id = :userid")
	List<Participacao> obterLista(Integer userid);

}
