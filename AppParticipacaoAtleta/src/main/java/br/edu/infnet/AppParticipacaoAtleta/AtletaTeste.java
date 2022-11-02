package br.edu.infnet.AppParticipacaoAtleta;



import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;


@Component
public class AtletaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Atleta a1 = new Atleta ();
		a1.setCpf("62158680008");
		a1.setNome("Sergio Baptista");
		a1.setDt_nascimento(LocalDateTime.now());
		a1.setGenero(false);
		a1.setPcd(true);
		System.out.println ("Atleta - " + a1);
		
		Atleta a2 = new Atleta ();
		a2.setCpf("13664995066");
		a2.setNome("Isabelle Resende");
		a2.setDt_nascimento(LocalDateTime.now());
		a2.setGenero(true);
		a2.setPcd (false);
		System.out.println ("Atleta - " + a2);
		
		Atleta a3 = new Atleta ();
		a3.setCpf("62432958004");
		a3.setNome("Vicente dos Santos");
		a3.setDt_nascimento(LocalDateTime.now());
		a3.setGenero(false);
		a3.setPcd(false);
		System.out.println ("Atleta - " + a3);
	}

}
