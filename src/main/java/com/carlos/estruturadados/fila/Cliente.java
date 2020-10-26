package com.carlos.estruturadados.fila;

public class Cliente {

	private String nome;
	private String endere�oDeEnterga;
	private String pizzaSolicitada;
	private Double preco;

	public Cliente(String nome, String endere�oDeEnterga, String pizzaSolicitada, Double preco) {
		this.nome = nome;
		this.endere�oDeEnterga = endere�oDeEnterga;
		this.pizzaSolicitada = pizzaSolicitada;
		this.preco = preco;
	}

	public Cliente() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�oDeEnterga() {
		return endere�oDeEnterga;
	}

	public void setEndere�oDeEnterga(String endere�oDeEnterga) {
		this.endere�oDeEnterga = endere�oDeEnterga;
	}

	public String getPizzaSolicitada() {
		return pizzaSolicitada;
	}

	public void setPizzaSolicitada(String pizzaSolicitada) {
		this.pizzaSolicitada = pizzaSolicitada;
	}

	@Override
	public String toString() {
		return "Nome do Cliente: " + this.nome + " Endere�o de entrega: " + this.endere�oDeEnterga + " Sabor da pizza: "
				+ this.pizzaSolicitada + " pre�o: " + this.preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
