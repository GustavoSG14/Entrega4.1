package com.demo.gsg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Compras") 

public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompra;
	@Column 
	private Double valor;
	@Column
	private String pagamento;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "idDestino")
	private Destino destino;

	public Compras() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Compras(Long idCompra, Double valor, String pagamento, Cliente cliente, Destino destino) {
		super();
		this.idCompra = idCompra;
		this.valor = valor;
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.destino = destino;
	}



	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Destino getDestino() {
		return destino;
	}



	public void setDestino(Destino destino) {
		this.destino = destino;
	}



	
}
