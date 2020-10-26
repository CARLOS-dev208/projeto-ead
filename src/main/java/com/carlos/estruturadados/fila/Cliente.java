package com.carlos.estruturadados.fila;

public class Cliente {

	private String nome;
	private String endereçoDeEnterga;
	private String pizzaSolicitada;
	private Double preco;

	public Cliente(String nome, String endereçoDeEnterga, String pizzaSolicitada, Double preco) {
		this.nome = nome;
		this.endereçoDeEnterga = endereçoDeEnterga;
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

	public String getEndereçoDeEnterga() {
		return endereçoDeEnterga;
	}

	public void setEndereçoDeEnterga(String endereçoDeEnterga) {
		this.endereçoDeEnterga = endereçoDeEnterga;
	}

	public String getPizzaSolicitada() {
		return pizzaSolicitada;
	}

	public void setPizzaSolicitada(String pizzaSolicitada) {
		this.pizzaSolicitada = pizzaSolicitada;
	}

	@Override
	public String toString() {
		return "Nome do Cliente: " + this.nome + " Endereço de entrega: " + this.endereçoDeEnterga + " Sabor da pizza: "
				+ this.pizzaSolicitada + " preço: " + this.preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
