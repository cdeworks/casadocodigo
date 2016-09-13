package br.com.casadocodigo.loja.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String index() {
		return "index";
	}

}
