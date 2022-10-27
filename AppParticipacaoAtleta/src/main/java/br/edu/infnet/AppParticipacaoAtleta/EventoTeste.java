package br.edu.infnet.AppParticipacaoAtleta;

import java.text.SimpleDateFormat;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Evento;


@Component
public class EventoTeste implements ApplicationRunner{

@Override
public void run(ApplicationArguments args) throws Exception {
	Evento e1 = new Evento ();
	e1.codigo = 001;
	e1.nome = "Corrida da Primavera";
	e1.dt_realizacao = '26-11-2022';
	e1.hora_inicio = '10:00';
	e1.assistencia_pcd = false;
	e1.tipo_assistencia_pcd = "";
	System.out.println ("Evento - " + e1);

	Evento e2 = new Evento ();
	e2.codigo = 002;
	e2.nome = "Riders 2022";
	e2.dt_realizacao = '27-11-2022';
	e2.hora_inicio = '09:00';
	e2.assistencia_pcd = true;
	e2.tipo_assistencia_pcd = "handbikes e triciclos";
	System.out.println ("Evento - " + e2);
	
	Evento e3 = new Evento ();
	e3.codigo = 003;
	e3.nome = "Circuito Verão de Natação";
	e3.dt_realizacao = '05-01-2023' ;
	e3.hora_inicio = '09:00';
	e3.assistencia_pcd = false;
	e3.tipo_assistencia_pcd = "";
	System.out.println ("Evento - " + e3);
}

}
