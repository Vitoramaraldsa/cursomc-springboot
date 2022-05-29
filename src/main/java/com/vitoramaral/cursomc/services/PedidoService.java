package com.vitoramaral.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitoramaral.cursomc.domain.Pedido;
import com.vitoramaral.cursomc.repositories.PedidoRepository;
import com.vitoramaral.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido findById(Integer id) {
		Pedido pedido = pedidoRepository.findByid(id);
		//delegar o erro
	    if(pedido == null) {
			  throw new ObjectNotFoundException
			  ("Objeto não encontrado " + id + Pedido.class.getName());
			}
			
		return pedido;
	  }
	
}
