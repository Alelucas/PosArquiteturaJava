package br.edu.infnet.AppParticipacaoAtleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppParticipacaoAtleta.model.service.NatacaoService;

@Controller
public class NatacaoController {
 
	@Autowired
	private NatacaoService natacaoService;
	
	@GetMapping(value = "/natacao/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", natacaoService.obterLista());
			return "natacao/lista";
    }
			
	@GetMapping(value = "/natacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		natacaoService.excluir(id);
		return "redirect: /natacao/lista";
	}
	
}
