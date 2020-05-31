package br.com.account_launch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/accounts-launch")
public class AccountLaunchController {

	@GetMapping
	public String teste() {
		return "<h2> Adilson Silva Docker </h2>";
	}

}
