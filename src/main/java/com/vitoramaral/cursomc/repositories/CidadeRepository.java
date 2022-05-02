package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoramaral.cursomc.domain.Cidade;


public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	Cidade findByid(Integer id);
}
