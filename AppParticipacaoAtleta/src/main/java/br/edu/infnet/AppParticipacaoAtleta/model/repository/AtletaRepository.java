package br.edu.infnet.AppParticipacaoAtleta.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;

@Repository
public interface AtletaRepository extends CrudRepository<Atleta,Integer> {
	
	@Query("from Atleta a where a.usuario.id = :userid")
			List<Atleta> obterLista(Integer userid);

}
