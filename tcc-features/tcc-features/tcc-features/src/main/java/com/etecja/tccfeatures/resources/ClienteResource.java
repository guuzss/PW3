package com.etecja.tccfeatures.resources;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.etecja.tccfeatures.entities.Cliente;
import com.etecja.tccfeatures.service.ClienteService;

//@RestController
//@RequestMapping(value = "/clientes")
@Controller
public class ClienteResource {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private ClienteService clienteService;

	// Endpoints

	@GetMapping("/clientes")
	public String findAll(Model model) {
		return "clientes";
	}

	@GetMapping("/cadastroCli")
	public String exibirFormularioCadastro(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "cadastro-cliente";
	}

	@PostMapping("/save1")
	public String salvarCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteService.save1(cliente);
		return "redirect:/clientes";
	}

}
