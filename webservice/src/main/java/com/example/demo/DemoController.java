package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Servico na porta 5050 que espera receber um token e faz o print no terminal 
 * @author nakamura
 *
 */
@RestController
public class DemoController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Application running!");
		return "Application running!";
	}
	
	@RequestMapping("/test")
	public String test(@RequestParam("token") String token){
		System.out.println("token:"+token);
		return "token:"+token;
	}
}
