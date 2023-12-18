package com.demo.gsg.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Destino")

public class Destino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestino;
	@Column 
	private String cidade;
	@Column
	private String país;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idDestino")
	private List<Compras> compras;

	public Destino() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Destino(Long idDestino, String cidade, String país, List<Compras> compras) {
		super();
		this.idDestino = idDestino;
		this.cidade = cidade;
		this.país = país;
		this.compras = compras;
	}


	public Long getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPaís() {
		return país;
	}

	public void setPaís(String país) {
		this.país = país;
	}


	public List<Compras> getCompras() {
		return compras;
	}


	public void setCompras(List<Compras> compras) {
		this.compras = compras;
	}

	
	
}
