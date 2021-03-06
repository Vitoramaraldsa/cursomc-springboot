package com.vitoramaral.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitoramaral.cursomc.domain.Categoria;
import com.vitoramaral.cursomc.repositories.CategoriaRepository;
import com.vitoramaral.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(Integer id) {
		Categoria categoria = categoriaRepository.findByid(id);
		//delegar o erro
	    if(categoria == null) {
			  throw new ObjectNotFoundException
			  ("Objeto não encontrado " + id + Categoria.class.getName());
			}
			
		return categoria;
	  }
	
}
