package mx.com.ids.nombre.ejercicio1.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping({ "/","/home","/index" })
	public String getMainPageAplication(Model model) {
		model.addAttribute("nombre", "Oscar Vidal Andres");
		model.addAttribute("tiempo", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
		return "home";
	}
}
