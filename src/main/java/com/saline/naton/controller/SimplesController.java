package com.saline.naton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saline.naton.servico.SimplesServico;

@RestController
public class SimplesController {
	@Autowired
	SimplesServico servico;

	@GetMapping(path = "/nome")
	public String retornaNome() {
		return servico.simplesMetodo();
	}

	@GetMapping(path = "/mensagem")
	public String enviaMensagem() {
		return servico.simplesMetodo();
	}
}
