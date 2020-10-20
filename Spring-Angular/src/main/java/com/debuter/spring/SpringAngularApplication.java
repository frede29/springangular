package com.debuter.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class SpringAngularApplication implements CommandLineRunner {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		restConfiguration.exposeIdsFor(Produit.class);
		produitRepository.save(new Produit(1,"ordinateur hp elibook",500,1));
		produitRepository.save(new Produit(2,"ordinateur asus chromebook ",1500,1));
		produitRepository.save(new Produit(3,"imprimante samsung",600,3));
		produitRepository.save(new Produit(4,"Smatphone iphone x ",4800,4));
		produitRepository.save(new Produit(5,"tablette samsung",400,2));
	  
		
		
		produitRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}
	
	

}
