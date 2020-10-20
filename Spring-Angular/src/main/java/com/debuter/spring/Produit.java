package com.debuter.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
 @ToString
public class Produit implements Serializable {
	
	

    @Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private String nom;
	private double prix;
	private int quantite;
	
	
	public Produit(long id, String nom, double prix, int quantite) {
		super();
		Id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	


	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}




	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}




	@Override
	public String toString() {
		return "Produit [Id=" + Id + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	
	
	
	
	
	
	
	
}
