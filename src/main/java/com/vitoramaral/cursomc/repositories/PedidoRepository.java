package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vitoramaral.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	Pedido findByid(Integer id);
}
