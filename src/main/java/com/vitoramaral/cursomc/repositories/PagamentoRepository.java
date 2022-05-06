package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoramaral.cursomc.domain.Pagamento;


public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
	Pagamento findByid(Integer id);
}
