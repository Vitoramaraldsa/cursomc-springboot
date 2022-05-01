package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vitoramaral.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	Produto findByid(Integer id);
}
