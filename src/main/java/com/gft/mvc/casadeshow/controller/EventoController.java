package com.gft.mvc.casadeshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.mvc.casadeshow.model.CasaDeShow;
import com.gft.mvc.casadeshow.model.Evento;
import com.gft.mvc.casadeshow.repository.CasasDeShow;
import com.gft.mvc.casadeshow.repository.Eventos;

@Controller
@RequestMapping("/Eventos")
public class EventoController {
	
	@Autowired
	public Eventos eventos;
	
	@Autowired
	private CasasDeShow casasdeshow;

	@RequestMapping(method = RequestMethod.GET)
	public String inicio() {
		return "/Evento/Index";
	}

	@RequestMapping(value="/criar")
	public ModelAndView doStuffMethod() {
		ModelAndView mv = new ModelAndView("/Evento/Criar");
		mv.addObject("casas", casasdeshow.findAll());
	    return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	
	public ModelAndView salvar(Evento evento) {
		eventos.save(evento);
		ModelAndView mv = new ModelAndView("/Evento/Criar");
		mv.addObject("mensagem", "Salvo com Sucesso");
		return mv;
	}
}
