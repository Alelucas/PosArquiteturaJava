package br.edu.infnet.AppParticipacaoAtleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;
import br.edu.infnet.AppParticipacaoAtleta.model.domain.Usuario;
import br.edu.infnet.AppParticipacaoAtleta.model.service.AtletaService;


@Controller
public class AtletaController {
 
	@Autowired
	private AtletaService atletaService;
	
	@GetMapping(value = "/atleta/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", atletaService.obterLista());
			return "atleta/lista";
    }
	
	@GetMapping(value = "/atleta")
	public String telaCadastro() {		
		return "atleta/cadastro";
    }
	
	
	@PostMapping(value = "/atleta/incluir")
	public String incluir(Atleta atleta, @SessionAttribute("user") Usuario usuario) {
		
		atleta.setUsuario(usuario);
		atletaService.incluir(atleta);		
		return "redirect: /atleta/lista";
	}
	
	
	@GetMapping(value = "/atleta/{id}/excluir")
	public String excluir(@PathVariable Integer id) {		
		atletaService.excluir(id);
		return "redirect: /atleta/lista";
	}
	
}
	
