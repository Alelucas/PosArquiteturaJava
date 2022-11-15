package br.edu.infnet.AppParticipacaoAtleta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppParticipacaoAtletaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppParticipacaoAtletaApplication.class, args);
	}

}
