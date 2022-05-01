package com.vitoramaral.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vitoramaral.cursomc.domain.Categoria;
import com.vitoramaral.cursomc.services.CategoriaService;
import com.vitoramaral.cursomc.services.exceptions.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody Categoria findById(@PathVariable(value = "id") Integer id) {
		Categoria categoria = new Categoria();
	    categoria = service.findById(id);
		
	    //delegar o erro
	    if(categoria == null) {
			  throw new ObjectNotFoundException
			  ("Objeto não encontrado " + id + Categoria.class.getName());
			}
			
	    return categoria;
	}
	
}
