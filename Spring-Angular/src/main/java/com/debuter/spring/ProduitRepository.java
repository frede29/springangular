package com.debuter.spring;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {

@RestResource(path="/byNom")
public List<Produit> findByNomContains(@Param("mc") String name);

@RestResource(path="/byNomPage")
public Page<Produit> findByNomContains(@Param("mc") String name, Pageable pageable);
	
}
