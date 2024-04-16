package com.etecja.tccfeatures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etecja.tccfeatures.entities.Cliente;
import com.etecja.tccfeatures.repositories.ClienteRepository;


@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public void save1(Cliente cliente) {
		clienteRepository.save(cliente);
	}

}