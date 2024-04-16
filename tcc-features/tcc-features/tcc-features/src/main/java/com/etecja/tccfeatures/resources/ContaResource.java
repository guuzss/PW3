package com.etecja.tccfeatures.resources;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.etecja.tccfeatures.entities.Conta;
import com.etecja.tccfeatures.service.ContaService;

//@RestController
//@RequestMapping(value = "/conta")
@Controller
public class ContaResource {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private ContaService contaService;

	// Endpoints

	@GetMapping("/contas")
	public String findAll(Model model) {
		return "contas";
	}

	@GetMapping("/cadastro")
	public String exibirFormularioCadastro(Model model) {
		model.addAttribute("conta", new Conta());
		return "cadastro-conta";
	}

	@PostMapping("/save")
	public String salvarCurso(@ModelAttribute("conta") Conta conta) {
		contaService.save(conta);
		return "redirect:/contas";
	}

}
