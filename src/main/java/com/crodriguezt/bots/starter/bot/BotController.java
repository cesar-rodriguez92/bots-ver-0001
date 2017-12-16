package com.crodriguezt.bots.starter.bot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1")
public class BotController {

	@RequestMapping("/ini")
	public String inicializar() {
		System.out.println("Inicializando llamado");
		return "Bienvenido";
	}

}
