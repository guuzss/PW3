package com.etecja.tccfeatures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etecja.tccfeatures.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

