package com.vitoramaral.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoramaral.cursomc.domain.ItemPedido;



public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	//ItemPedido findByid(Integer id);
}
