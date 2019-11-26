package com.viavarejo.appLog.LogScreen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.viavarejo.appLog.LogScreen.model.RecuperaLog;
import com.viavarejo.appLog.LogScreen.repository.LogRepository;

@Controller
public class LogController {

	Integer protocolo = 0;
	
	@Autowired
	LogRepository repository;
	
	@GetMapping("/getLog")
	public String form(Model model) {
		model.addAttribute("logResponse", new RecuperaLog());
		return "getLog";
	}
	
	
	@PostMapping("/buscaLog")
	public String formSubmit(@ModelAttribute RecuperaLog logResponse,Model model) {
		System.out.println("ID VINDO DO FORMULARIO : ======= " + logResponse.getProtocolo());
		RecuperaLog response = new RecuperaLog();
		response = repository.findByProtocolo(logResponse.getProtocolo());
		model.addAttribute("response", response);
		return "result";
	}
}
