package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.AtletaService;

@Order(3)
@Component
public class AtletaTeste implements ApplicationRunner{
	
	@Autowired
	private AtletaService atletaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Atletas ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Atleta a1 = new Atleta ();
		a1.setCpf("62158680008");
		a1.setNome("Sergio Baptista");
		a1.setGenero(false);
		a1.setPcd(true);
		a1.setUsuario(usuario);
		atletaService.incluir(a1);
		
		Atleta a2 = new Atleta ();
		a2.setCpf("13664995066");
		a2.setNome("Isabelle Resende");
		a2.setGenero(true);
		a2.setPcd (false);
		a2.setUsuario(usuario);
		atletaService.incluir(a2);
		
		Atleta a3 = new Atleta ();
		a3.setCpf("62432958004");
		a3.setNome("Vicente dos Santos");
		a3.setGenero(false);
		a3.setPcd(false);
		a3.setUsuario(usuario);
		atletaService.incluir(a3);
	}

}
