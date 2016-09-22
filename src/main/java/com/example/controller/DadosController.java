package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Dados;
import com.example.repository.DadosRepository;

@Controller
public class DadosController {
	@Autowired
	DadosRepository dadosRepository;
	
	@GetMapping("/dado")
	public String contador(@RequestParam Integer id, Model model) {
		Dados dado = dadosRepository.findOne(id);
		if(dado == null){
			dado = new Dados(id);
		}
		Integer quantidade = dado.incrementa();
		model.addAttribute("dado1", quantidade);
		dadosRepository.save(dado);
		return "redirect:/dados";
	}
	
	@GetMapping("/dados")
	public String contador( Model model) {
		model.addAttribute("dados", dadosRepository.findAll());
		return "contador";
	}

}
