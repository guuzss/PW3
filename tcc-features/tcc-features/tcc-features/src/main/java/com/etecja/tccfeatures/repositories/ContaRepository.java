package com.etecja.tccfeatures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etecja.tccfeatures.entities.Conta;

public interface ContaRepository extends JpaRepository<Conta, String> {

}
