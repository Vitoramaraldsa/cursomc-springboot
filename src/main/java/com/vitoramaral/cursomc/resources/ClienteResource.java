package com.vitoramaral.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vitoramaral.cursomc.domain.Categoria;
import com.vitoramaral.cursomc.domain.Cliente;
import com.vitoramaral.cursomc.services.CategoriaService;
import com.vitoramaral.cursomc.services.ClienteService;
import com.vitoramaral.cursomc.services.exceptions.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody Cliente findById(@PathVariable(value = "id") Integer id) {
		Cliente cliente = new Cliente();
	    cliente = service.findById(id);
	    return cliente;
	}
	
}
