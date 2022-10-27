package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;


@Component
public class AtletaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Atleta a1 = new Atleta ();
		a1.cpf = "62158680008";
		a1.nome = "Sergio Baptista";
		a1.dt_nascimento = '';
		a1.genero = false;
		a1.pcd = true;
		System.out.println ("Atleta - " + a1);
		
		Atleta a2 = new Atleta ();
		a2.cpf = "13664995066";
		a2.nome = "Isabelle Resende";
		a2.dt_nascimento = '';
		a2.genero = true;
		a2.pcd = false;
		System.out.println ("Atleta - " + a2);
		
		Atleta a3 = new Atleta ();
		a3.cpf = "62432958004";
		a3.nome = "Vicente dos Santos";
		a3.dt_nascimento = '';
		a3.genero = false;
		a3.pcd = false;
		System.out.println ("Atleta - " + a3);
	}

}
