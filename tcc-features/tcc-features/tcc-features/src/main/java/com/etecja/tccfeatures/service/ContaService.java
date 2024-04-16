package com.etecja.tccfeatures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etecja.tccfeatures.entities.Conta;
import com.etecja.tccfeatures.repositories.ContaRepository;

@Service
public class ContaService {
	@Autowired
	private ContaRepository contaRepository;

	public List<Conta> findAll() {
		return contaRepository.findAll();
	}

	public void save(Conta conta) {
		contaRepository.save(conta);
	}

}
