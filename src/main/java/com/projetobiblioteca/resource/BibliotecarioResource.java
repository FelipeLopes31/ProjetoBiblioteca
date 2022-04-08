package com.projetobiblioteca.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetobiblioteca.domain.Bibliotecario;

@RestController
@RequestMapping(value = "/bibliotecarios")

public class BibliotecarioResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Bibliotecario> listar() {
		
		Bibliotecario bltc1 = new Bibliotecario(1, "Adriano");
		Bibliotecario bltc2 = new Bibliotecario(2, "Felipe");
		
		List<Bibliotecario> lista = new ArrayList<>();
		lista.add(bltc1);
		lista.add(bltc2);
		
		return lista;
	}

}
