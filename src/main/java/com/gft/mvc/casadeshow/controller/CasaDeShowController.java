package com.gft.mvc.casadeshow.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.mvc.casadeshow.model.CasaDeShow;
import com.gft.mvc.casadeshow.repository.CasasDeShow;

@Controller
@RequestMapping("/Casas")
public class CasaDeShowController {
	
	@Autowired
	private CasasDeShow casasdeshow;
	
	@RequestMapping
	public String inicio() {
		return "/CasaDeShow/Index";
	}

	@RequestMapping(value="/criar")
	public String doStuffMethod() {
	    return "/CasaDeShow/Criar";
	}
	
	public ModelAndView pesquisar() {
		List<CasaDeShow> todasCasas = casasdeshow.findAll();
		ModelAndView mv = new ModelAndView("/CasaDeShow/Criar");
		mv.addObject("casas", todasCasas);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(CasaDeShow casa) {
		casasdeshow.save(casa);
		ModelAndView mv = new ModelAndView("/CasaDeShow/Criar");
		mv.addObject("mensagem", "Salvo com Sucesso");
		return mv;
	}
	
}
