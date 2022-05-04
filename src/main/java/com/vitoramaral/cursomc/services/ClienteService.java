package com.vitoramaral.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitoramaral.cursomc.domain.Categoria;
import com.vitoramaral.cursomc.domain.Cliente;
import com.vitoramaral.cursomc.repositories.ClienteRepository;
import com.vitoramaral.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente findById(Integer id) {
		Cliente cliente = clienteRepository.findByid(id);
		
		//delegar o erro
	    if(cliente == null) {
			  throw new ObjectNotFoundException
			  ("Objeto não encontrado " + id + Categoria.class.getName());
			}
			
		return cliente;
	  }
	
}
