package com.carlos.estruturadados.biblioteca;

public class Biblioteca {
	private String tituloDoLivro;
	private String nomeDoAutor;
	private String nomeDaEditora;
	private String anoDePUblicacao;
	private boolean controleDeEmprestimo;
	
	
	
	
	public Biblioteca() {
		
	}
	
	
	public Biblioteca(String tituloDoLivro, String nomeDoAutor, String nomeDaEditora, String anoDePUblicacao,
			boolean controleDeEmprestimo) {
		this.tituloDoLivro = tituloDoLivro;
		this.nomeDoAutor = nomeDoAutor;
		this.nomeDaEditora = nomeDaEditora;
		this.anoDePUblicacao = anoDePUblicacao;
		this.controleDeEmprestimo = controleDeEmprestimo;
	}
	
	public String getTituloDoLivro() {
		return tituloDoLivro;
	}
	public void setTituloDoLivro(String tituloDoLivro) {
		this.tituloDoLivro = tituloDoLivro;
	}
	public String getNomeDoAutor() {
		return nomeDoAutor;
	}
	public void setNomeDoAutor(String nomeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
	}
	public String getNomeDaEditora() {
		return nomeDaEditora;
	}
	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}
	public String getAnoDePUblicacao() {
		return anoDePUblicacao;
	}
	public void setAnoDePUblicacao(String anoDePUblicacao) {
		this.anoDePUblicacao = anoDePUblicacao;
	}
	public boolean isControleDeEmprestimo() {
		return controleDeEmprestimo;
	}
	public void setControleDeEmprestimo(boolean controleDeEmprestimo) {
		this.controleDeEmprestimo = controleDeEmprestimo;
	}


	@Override
	public String toString() {
		return "Biblioteca [tituloDoLivro=" + tituloDoLivro + ", nomeDoAutor=" + nomeDoAutor + ", nomeDaEditora="
				+ nomeDaEditora + ", anoDePUblicacao=" + anoDePUblicacao + ", controleDeEmprestimo="
				+ controleDeEmprestimo + "]";
	}
	
	
	
}
