package com.carlos.estruturadados.estacionamento;

public class Usuarios {
	
	private String nome;
	private String departamentoDeLotacao;
	private String numeroDaPlaca;
	
	public Usuarios() {}

	public Usuarios(String nome, String departamentoDeLotacao, String numeroDaPlaca) {
		super();
		this.nome = nome;
		this.departamentoDeLotacao = departamentoDeLotacao;
		this.numeroDaPlaca = numeroDaPlaca;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamentoDeLotacao() {
		return departamentoDeLotacao;
	}
	public void setDepartamentoDeLotacao(String departamentoDeLotacao) {
		this.departamentoDeLotacao = departamentoDeLotacao;
	}
	public String getNumeroDaPlaca() {
		return numeroDaPlaca;
	}
	public void setNumeroDaPlaca(String numeroDaPlaca) {
		this.numeroDaPlaca = numeroDaPlaca;
	}
	
	
	
}
