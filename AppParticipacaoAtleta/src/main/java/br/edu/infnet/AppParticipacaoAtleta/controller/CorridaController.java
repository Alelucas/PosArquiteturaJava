package br.edu.infnet.AppParticipacaoAtleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.AppParticipacaoAtleta.model.service.CorridaService;

@Controller
public class CorridaController {
		
	@Autowired
	private CorridaService corridaService;
		
		@GetMapping(value = "/corrida/lista")
			public String telaLista(Model model) {		
				model.addAttribute("listagem", corridaService.obterLista());
				return "corrida/lista";
	    }
		
		@GetMapping(value = "/corrida/{id}/excluir")
		public String exclusao(@PathVariable Integer id) {		
			corridaService.excluir(id);
			return "redirect: /corrida/lista";
		}
	
}
