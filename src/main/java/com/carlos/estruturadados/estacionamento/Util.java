package com.carlos.estruturadados.estacionamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {

	public static void menu(List<String> lista) {
		System.out.println("        UPIS – União Pioneira de Integração Social\r\n" + 
				"            Sistema de Gestão de Estacionamento\r\n" + 
				"");
		
		
		if(!lista.isEmpty()) {
			System.out.println("               Situação do Estacionamento\r\n" + 
					"		Vaga		Veiculo");
			listarUsuario(lista);
		}
		
		
		System.out.print("\r\n" + 
				"                     Menu Principal\r\n" + 
				"		1 – Cadastrar usuário\r\n" + 
				"		2 – Remover usuário\r\n" + 
				"		3 – Consultar usuário\r\n" + 
				"                4 – Listar usuários\r\n" + 
				"                5 – Entrar no Estacionamento\r\n" + 
				"		6 – Sair do Estacionamento\r\n" + 
				"		7 – Encerrar \r\n" + 
				"			 		Informe sua opção:");
	}
	
	
	public static Usuarios cadastra( ) {
		Scanner input = new Scanner(System.in);
		String nome,departamentoDeLotacao, numeroDaPlaca;
		System.out.println("Informe seu nome: ");
		nome= input.next().toUpperCase();
		System.out.println("Informe o departemento de Lotação");
		departamentoDeLotacao = input.next();
		System.out.println("Informe o núremo da placa: ");
		numeroDaPlaca = input.next().toUpperCase();
		Usuarios user = new Usuarios(nome,departamentoDeLotacao,numeroDaPlaca);
		return user;
	}
	
	
	public static void listarUsuario(List<String> lista) {
		lista.stream().forEach(e -> System.out.println("                 "+"."+"                "+e.toString()));
	}
	
	public static void removePorNome(List<Usuarios> lista) {
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.print("Informe o nome para ser removido: ");
		nome= input.next().toUpperCase();
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getNome().equals(nome.toUpperCase())) {
				lista.remove(i);
			}
		}
	}
	
	
	public static void consultarUsuario(List<Usuarios> lista) {
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.print("Informe o nome para ser consultado: ");
		nome= input.next().toUpperCase();
		lista.stream().filter(e -> e.getNome().equals(nome.toUpperCase()))
		.forEach(e -> System.out.println("Nome: "+e.getNome() +"\n"+"Departamento De Lotação: "+
		e.getDepartamentoDeLotacao()  +"\n"+"Número Da Placa: "+e.getNumeroDaPlaca()));
	}
	
	public static void listarUsuarios(List<Usuarios> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("==========================================================");
			System.out.println("||   NOME:                "+lista.get(i).getNome());
			System.out.println("||   DEPARTAMENTO:        "+lista.get(i).getDepartamentoDeLotacao());
			System.out.println("||   PLACA:               "+lista.get(i).getNumeroDaPlaca());
			System.out.println("==========================================================");
		}

	}
	
	public static List<String>  estacionamento(List<Usuarios> lista) {
		List<String> estacionamento = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.print("Informe o nome para ser consultado: ");
		nome= input.next().toUpperCase();
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getNome().equals(nome.toUpperCase()) ) {
				estacionamento.add(lista.get(i).getNumeroDaPlaca());
			}
		}
		
		return estacionamento;
	}
	
	public static void removeDoEstacionamento(List<String> estacionamento) {
		Scanner input = new Scanner(System.in);
		String placa;
		System.out.print("Informe o número da placa que ira sair do estacionamento: ");
		placa = input.next().toUpperCase();
		for (int i = 0; i < estacionamento.size(); i++) {
			if(estacionamento.get(i).equals(placa.toUpperCase())) {
				estacionamento.remove(i);
			}
		}
	}
	
}
