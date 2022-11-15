package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.AtletaService;

@Order(2)
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
				
	}

}
