package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoramaral.cursomc.domain.Cidade;
import com.vitoramaral.cursomc.domain.Cliente;
import com.vitoramaral.cursomc.domain.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	Endereco findByid(Integer id);
}
