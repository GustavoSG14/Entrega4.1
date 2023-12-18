package com.demo.gsg.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table (name = "Cliente")
public class Cliente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCliente;
@Column 
private String nome;
@Column
private String cpf;

@OneToMany(mappedBy = "cliente")
private List<Compras> compra;


public Cliente() {
	super();
	// TODO Auto-generated constructor stub
}



public Cliente(Long idCliente, String nome, String cpf, List<Compras> compra) {
	super();
	this.idCliente = idCliente;
	this.nome = nome;
	this.cpf = cpf;
	this.compra = compra;
}



public Long getIdCliente() {
	return idCliente;
}

public void setIdCliente(Long idCliente) {
	this.idCliente = idCliente;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}



public List<Compras> getCompra() {
	return compra;
}



public void setCompra(List<Compras> compra) {
	this.compra = compra;
}






}

