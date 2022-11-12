package br.edu.infnet.AppParticipacaoAtleta;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Ciclismo;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Corrida;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Natacao;
import br.edu.infnet.AppParticipacaoAtleta.model.service.EventoService;


@Order(2)
@Component
public class EventoTeste implements ApplicationRunner{
	
@Autowired
private EventoService eventoService;

@Override
public void run(ApplicationArguments args) throws Exception {
	System.out.println("## Cadastramento de Eventos ##");
		
	Ciclismo ec1 = new Ciclismo ();
	ec1.setNome("Riders 2022");
	ec1.setDt_realizacao(LocalDateTime.now());
	ec1.setAssistencia_pcd(true);
	ec1.setTipo_assistencia_pcd("handbikes e triciclos");
	eventoService.incluir(ec1);
	
	Ciclismo ec2 = new Ciclismo ();
	ec2.setNome("Pedala Galera");
	ec2.setDt_realizacao(LocalDateTime.now());
	ec2.setAssistencia_pcd(true);
	ec2.setTipo_assistencia_pcd("handbikes e triciclos");
	eventoService.incluir(ec2);
	
	Ciclismo ec3 = new Ciclismo ();
	ec3.setNome("Night Riders 2022");
	ec3.setDt_realizacao(LocalDateTime.now());
	ec3.setAssistencia_pcd(true);
	ec3.setTipo_assistencia_pcd("handbikes e triciclos");
	eventoService.incluir(ec3);
	
	Corrida ecr1 = new Corrida ();	
	ecr1.setNome("Corrida da Primavera");
	ecr1.setDt_realizacao(LocalDateTime.now());
	ecr1.setAssistencia_pcd(false);
	ecr1.setTipo_assistencia_pcd("ajudante cadeirante");
	eventoService.incluir(ecr1);
	
	Corrida ecr2 = new Corrida ();	
	ecr2.setNome("Runners 2022");
	ecr2.setDt_realizacao(LocalDateTime.now());
	ecr2.setAssistencia_pcd(false);
	ecr2.setTipo_assistencia_pcd("ajudante cadeirante");
	eventoService.incluir(ecr2);
	
	Corrida ecr3 = new Corrida ();	
	ecr3.setNome("Corrida de Verão");
	ecr3.setDt_realizacao(LocalDateTime.now());
	ecr3.setAssistencia_pcd(false);
	ecr3.setTipo_assistencia_pcd("ajudante cadeirante");
	eventoService.incluir(ecr3);

	Natacao en1 = new Natacao ();	
	en1.setNome("Circuito Verão de Natação");
	en1.setDt_realizacao(LocalDateTime.now());
	en1.setAssistencia_pcd(false);
	en1.setTipo_assistencia_pcd("rampas de acesso");
	eventoService.incluir(en1);
	
	Natacao en2 = new Natacao ();	
	en2.setNome("Circuito Primavera de Natação");
	en2.setDt_realizacao(LocalDateTime.now());
	en2.setAssistencia_pcd(false);
	en2.setTipo_assistencia_pcd("rampas de acesso");
	eventoService.incluir(en2);
	
	Natacao en3 = new Natacao ();	
	en3.setNome("Circuito Outono de Natação");
	en3.setDt_realizacao(LocalDateTime.now());
	en3.setAssistencia_pcd(false);
	en3.setTipo_assistencia_pcd("rampas de acesso");
	eventoService.incluir(en3);
	
}

}
