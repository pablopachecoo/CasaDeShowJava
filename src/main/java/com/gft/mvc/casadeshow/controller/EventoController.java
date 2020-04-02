package com.gft.mvc.casadeshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("/Eventos")
	public String inicio() {
		return "/Evento/Index";
	}

}
