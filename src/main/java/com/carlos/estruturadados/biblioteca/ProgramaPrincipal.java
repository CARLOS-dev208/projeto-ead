package com.carlos.estruturadados.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {

	

	public static void main(String[] args)  {
		List<Biblioteca> regular = new ArrayList<Biblioteca>();
		Scanner input = new Scanner(System.in);
		int sair = 1;

		while (sair != 0) {

			System.out.print("                 Organizações Silva & Santos\r\n"
					+ "               Sistema de Gestão de Biblioteca\r\n\n" + "                Menu Principal\r\n\n"
					+ "		1 – Cadastrar livro\r\n" + "		2 – Remover livro\r\n" + "		3 – Emprestar livro\r\n"
					+ "		4 – Devolver empréstimo\r\n" + "		5 – Consultar livros\r\n"
					+ "		0 – Encerrar \r\n" + "			 	        Informe sua opção: ");
		
			
			int opt;
			switch (input.nextInt()) {
			case 1:
				Biblioteca biblioteca = new Biblioteca();
				biblioteca = Util.cadastrarLivro();
				regular.add(biblioteca);

				break;
			case 2:
				System.out.println("Informe o nome do livro que você deseja remover: ");
				String nomeTitulo = input.next();
				Util.remover(regular, nomeTitulo);
				break;
			case 3:
				System.out.println("Informe o nome do livro que você deseja ler: ");
				nomeTitulo = input.next();
				Util.emprestimoDoLivro(regular, nomeTitulo, true);
				break;
			case 4:
				System.out.println("Informe o nome do livro que você deseja devolver: ");
				nomeTitulo = input.next();
				Util.emprestimoDoLivro(regular, nomeTitulo, false);
				break;
			case 5:
				menuEscoha(regular);

				break;
			case 0:
				System.out.println("Programa Encerrado!");
				sair = 0;
				break;
			default:
				break;
			}

		}

	}

	public static void menuEscoha(List<Biblioteca> regular) {
		int loop = 1;
		String nomeTitulo;
		Scanner input = new Scanner(System.in);
		do {
			menu();
			switch (input.nextInt()) {
			case 1:

				System.out.println("Informe o tituto do livro para consutar: ");
				nomeTitulo = input.next();
				Util.consutarLivro(regular, nomeTitulo, 0);
				break;
			case 2:
				input = new Scanner(System.in);
				System.out.println("Informe o autor do livro para consutar: ");
				nomeTitulo = input.next();
				Util.consutarLivro(regular, nomeTitulo, 1);
				break;
			case 3:
				System.out.println(regular.toString());
				break;
			case 4:
				loop = 0;
				break;

			default:
				System.out.println("opição invalida!");
				break;
			}
		} while (loop != 0);
	}

	public static void menu() {
		System.out.print("                      Organizações Silva & Santos\r\n"
				+ "                   Sistema de Gestão de Biblioteca\r\n"
				+ "                       Menu de Consultas\r\n" + "		1 – Consultar livro por título\r\n"
				+ "		2 – Consultar livro por autor\r\n" + "		3 – Listar livros\r\n"
				+ "		4 – Retornar ao Menu Principal\r\n" + "		 \r\n"
				+ "			                         Informe sua opção: ");
	}
}
