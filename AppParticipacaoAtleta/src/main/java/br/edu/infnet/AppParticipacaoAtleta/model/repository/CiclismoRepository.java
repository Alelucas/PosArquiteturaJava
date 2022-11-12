package br.edu.infnet.AppParticipacaoAtleta.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;

@Repository
public interface CiclismoRepository extends CrudRepository<Ciclismo,Integer> {

}
