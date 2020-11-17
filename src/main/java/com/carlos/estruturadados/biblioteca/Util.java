package com.carlos.estruturadados.biblioteca;

import java.util.List;
import java.util.Scanner;

public  class Util {

	public static Biblioteca cadastrarLivro() {
		Scanner input = new Scanner(System.in);
		String tituloDoLivro,nomeDoAutor,nomeDaEditora,anoDePublicacao;

		System.out.println("Cadastrar livro\n");
		
		System.out.println("Informe o tituto do livro: ");
		tituloDoLivro = input.next();
		System.out.println("Informe o nome do autor: ");
		nomeDoAutor = input.next();
		System.out.println("Informe o nome da editora: ");
		nomeDaEditora = input.next();
		System.out.println("Informe o ano de publicacao: ");
		anoDePublicacao = input.next();
		
		return new Biblioteca(tituloDoLivro,nomeDoAutor,nomeDaEditora,anoDePublicacao,false);
		

	}
	
	public static void remover(List<Biblioteca> bibliotecas, String titulo) {
	
		for (int i = 0; i < bibliotecas.size(); i++) {
			if(bibliotecas.get(i).getTituloDoLivro().equals(titulo)) {
				bibliotecas.remove(i);
			}
		}
		
	}
	
	public static void emprestimoDoLivro(List<Biblioteca> bibliotecas, String titulo,boolean status) {
		for (int i = 0; i < bibliotecas.size(); i++) {
			if(bibliotecas.get(i).getTituloDoLivro().equals(titulo)) {
				bibliotecas.get(i).setControleDeEmprestimo(status);
			}
			
		}
	}
	
	public static void consutarLivro(List<Biblioteca> bibliotecas, String livro, int filtro) {
		for (int i = 0; i < bibliotecas.size(); i++) {
			if(filtro == 0) {
				if(bibliotecas.get(i).getTituloDoLivro().equals(livro)) {
					System.out.println(bibliotecas.toString());
				}
			}else {
				if(bibliotecas.get(i).getNomeDoAutor().equals(livro)) {
					bibliotecas.toString();
				}
			}
			
			
		}
	}

}
