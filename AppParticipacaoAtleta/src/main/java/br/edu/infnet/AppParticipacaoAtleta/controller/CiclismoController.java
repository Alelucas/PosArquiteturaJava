package br.edu.infnet.AppParticipacaoAtleta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.AppParticipacaoAtleta.model.service.CiclismoService;

@Controller
public class CiclismoController {
	
	@Autowired
	private CiclismoService ciclismoService;
 
	@GetMapping(value = "/ciclismo/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", ciclismoService.obterLista());
			return "ciclismo/lista";
	}
	
	@GetMapping(value = "/ciclismo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		ciclismoService.excluir(id);
		return "redirect: /ciclismo/lista";
}
	
}