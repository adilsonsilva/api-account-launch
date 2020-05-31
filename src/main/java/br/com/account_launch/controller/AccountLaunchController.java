package br.com.account_launch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountLaunchController {

	@GetMapping("/")
	public String teste() {
		return "<h2> Adilson Silva Docker </h2>";
	}

}
