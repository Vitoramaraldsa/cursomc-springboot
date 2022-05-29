package com.vitoramaral.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vitoramaral.cursomc.domain.Pedido;
import com.vitoramaral.cursomc.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody Pedido findById(@PathVariable(value = "id") Integer id) {
		Pedido pedido = new Pedido();
	    pedido = service.findById(id);
	    return pedido;
	}
	
}
