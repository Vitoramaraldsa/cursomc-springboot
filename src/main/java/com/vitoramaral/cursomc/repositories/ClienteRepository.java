package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoramaral.cursomc.domain.Cidade;
import com.vitoramaral.cursomc.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	Cliente findByid(Integer id);
}
