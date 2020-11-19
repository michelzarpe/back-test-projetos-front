package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/perguntas")
public class PerguntasResource {

	Random gerador = new Random();
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public List<Pergunta> getPerguntas(@PathVariable Integer id){
		log.info("ID Etapa: "+id);
		List<Pergunta> listPerguntas = new ArrayList<>();				
		for(int i=1;i<5;i++) {
			List<Opcao> listOpcao = new ArrayList<>();
		 for(int x=1;x<3;x++) {
			 int idOpcao = gerador.nextInt(10);
			 listOpcao.add(new Opcao(idOpcao, i+"_Resposta_"+idOpcao));
		 }
			
	     listPerguntas.add(new Pergunta(gerador.nextInt(10), "Pergunta "+i, listOpcao));
	    
	    }
	    return listPerguntas;
	}
}
