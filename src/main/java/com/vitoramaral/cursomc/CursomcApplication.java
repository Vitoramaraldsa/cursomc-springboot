package com.vitoramaral.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vitoramaral.cursomc.domain.Categoria;
import com.vitoramaral.cursomc.domain.Cidade;
import com.vitoramaral.cursomc.domain.Cliente;
import com.vitoramaral.cursomc.domain.Endereco;
import com.vitoramaral.cursomc.domain.Estado;
import com.vitoramaral.cursomc.domain.Produto;
import com.vitoramaral.cursomc.domain.enums.TipoCliente;
import com.vitoramaral.cursomc.repositories.CategoriaRepository;
import com.vitoramaral.cursomc.repositories.CidadeRepository;
import com.vitoramaral.cursomc.repositories.ClienteRepository;
import com.vitoramaral.cursomc.repositories.EnderecoRepository;
import com.vitoramaral.cursomc.repositories.EstadoRepository;
import com.vitoramaral.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired 
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public static void main(String[] args){
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria(null, "escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		 
		Estado est1 = new Estado(null,"Mina gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null,"Uberlandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null,"Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2));
		
		Cliente cli1 = new Cliente(null,"Vitor Souza Amaral", "vitoramaral2001.bkbd@gmail.com", "479.836.538-67", TipoCliente.PESSOA_FISICA);
		cli1.getTelefones().addAll(Arrays.asList("11956471243","1159752525"));
		
		Endereco e1 = new Endereco(null, "Rua gilda Dispa", "4" , "A", "Embura","04893085", cli1 ,c2 );
		
		cli1.getEnderecos().addAll(Arrays.asList(e1));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1));
		
	}
	
	

}


















//vitoramaral