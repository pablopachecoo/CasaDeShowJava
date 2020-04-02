package com.gft.mvc.casadeshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndiceController {
	
	@RequestMapping("/index")
	public String inicio() {
		return "Index";
	}
}
