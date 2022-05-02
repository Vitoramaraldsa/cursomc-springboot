package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoramaral.cursomc.domain.Estado;


public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	Estado findByid(Integer id);
}
