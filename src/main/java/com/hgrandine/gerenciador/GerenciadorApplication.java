package com.hgrandine.gerenciador;

import com.hgrandine.gerenciador.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorApplication {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(GerenciadorApplication.class, args);
	}

}
