package br.edu.infnet.AppParticipacaoAtleta.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppParticipacaoAtleta.model.domain.Atleta;


@Controller
public class AtletaController {
 
	private static Map<Integer, Atleta> mapa = new HashMap<Integer, Atleta> ();
	private static Integer id = 1;
	
	public static void incluir(Atleta atleta) {
		atleta.setId(id++);
		mapa.put(atleta.getId(), atleta);
	}
		
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Atleta> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/atleta/lista")
		public String telaLista(Model model) {		
			model.addAttribute("listagem", obterLista());
			return "atleta/lista";
    }
	
	@GetMapping(value = "/atleta/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		excluir(id);
		return "redirect: /atleta/lista";
	}
	
	
	
}
