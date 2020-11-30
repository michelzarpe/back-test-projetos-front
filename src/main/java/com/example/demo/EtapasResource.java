package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/etapas")
public class EtapasResource {
	
	 Random gerador = new Random();
	
	@RequestMapping(method=RequestMethod.GET,path = "/empresa/{id}")
	public List<Etapa> getEtapas(){
		List<Etapa> list = new ArrayList<>();
		for(int i=1;i<5;i++) {
	    	log.info("Etapas_"+i); 
	    	list.add(new Etapa(gerador.nextInt(10), "Etapa_"+i, i));
	    }
	    return list;
	}
}
