package com.carlos.estruturadados.fila;

import java.util.Scanner;

public class Pedidos {

	public static void main(String[] args) {

		TAD_Fila_ArranjoCirc<Cliente> regular = new TAD_Fila_ArranjoCirc<Cliente>();
		FilaComPrioridade<Cliente> prioridade = new FilaComPrioridade<Cliente>(3);

		final int MAX_PRIORIDADE = 3;
		Scanner input = new Scanner(System.in);
		String nome,edereco,opt;
		double preco = 0;

		String finaliza = "sim";

		while (finaliza == "sim") {
			System.out.println("As pizzas disponíveis são:\r\n" + "1. Mussarela - R$ 31,00\r\n"
					+ "2. Presunto - R$ 32,00\r\n" + "3. Calabresa - R$ 33,00\r\n" + "4. Peito de frango - R$ 34,00\r\n"
					+ "5. Portuguesa - R$ 35,00");
			
			 System.out.print("Escolha a pizza desejada: ");
				switch (input.nextInt()) {
				case 1:
					System.out.println("Digite os dados pedidos abaixo para entrega: ");
					System.out.println("Informe seu nome: ");
					nome =input.next();
					System.out.println("Informe o seu endereço para entrega: ");
					edereco =input.next();
					System.out.println("Qual e a quantidade de pizza o senho(a) deseja? ");
					preco =  input.nextDouble();
					System.out.println("Deseja pagar 10R$ para prioridade? Informe sim/não");
					opt =input.next();
					
					if(opt.equals("nao")) {
						regular.enfileira(new Cliente(nome,edereco,"Mussarela",31.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}else if (opt.equals("sim") && prioridade.retorno == 0){
						prioridade.enfileira(new Cliente(nome,edereco,"Mussarela",31.00*preco));
						System.out.println("Lista de pedidos com prioridade: "+prioridade.toString());
					}else {
						System.out.println(prioridade.retorna());
						regular.enfileira(new Cliente(nome,edereco,"Mussarela",31.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}

					break;
				case 2:
					System.out.println("Digite os dados pedidos abaixo para entrega: ");
					System.out.println("Informe seu nome: ");
					nome =input.next();
					System.out.println("Informe o seu endereço para entrega: ");
					edereco =input.next();
					System.out.println("Qual e a quantidade de pizza o senho(a) deseja? ");
					preco =  input.nextDouble();
					System.out.println("Deseja pagar 10R$ para prioridade? Informe sim/não");
					opt =input.next();
					
					if(opt.equals("nao")) {
						regular.enfileira(new Cliente(nome,edereco,"Presunto",32.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}else if (opt.equals("sim") && prioridade.retorno == 0){
						prioridade.enfileira(new Cliente(nome,edereco,"Presunto",32.00*preco));
						System.out.println("Lista de pedidos com prioridade: "+prioridade.toString());
					}else {
						System.out.println(prioridade.retorna());
						regular.enfileira(new Cliente(nome,edereco,"Presunto",32.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}

					break;
				case 3:
					System.out.println("Digite os dados pedidos abaixo para entrega: ");
					System.out.println("Informe seu nome: ");
					nome =input.next();
					System.out.println("Informe o seu endereço para entrega: ");
					edereco =input.next();
					System.out.println("Qual e a quantidade de pizza o senho(a) deseja? ");
					preco =  input.nextDouble();
					System.out.println("Deseja pagar 10R$ para prioridade? Informe sim/não");
					opt =input.next();
					
					if(opt.equals("nao")) {
						regular.enfileira(new Cliente(nome,edereco,"Calabresa",33.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}else if (opt.equals("sim") && prioridade.retorno == 0){
						prioridade.enfileira(new Cliente(nome,edereco,"Calabresa",33.00*preco));
						System.out.println("Lista de pedidos com prioridade: "+prioridade.toString());
					}else {
						System.out.println(prioridade.retorna());
						regular.enfileira(new Cliente(nome,edereco,"Calabresa",33.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}
					break;
				case 4:
					System.out.println("Digite os dados pedidos abaixo para entrega: ");
					System.out.println("Informe seu nome: ");
					nome =input.next();
					System.out.println("Informe o seu endereço para entrega: ");
					edereco =input.next();
					System.out.println("Qual e a quantidade de pizza o senho(a) deseja? ");
					preco =  input.nextDouble();
					System.out.println("Deseja pagar 10R$ para prioridade? Informe sim/não");
					opt =input.next();
					
					if(opt.equals("nao")) {
						regular.enfileira(new Cliente(nome,edereco,"Peito de frango",34.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}else if (opt.equals("sim") && prioridade.retorno == 0){
						prioridade.enfileira(new Cliente(nome,edereco,"Peito de frango",34.00*preco));
						System.out.println("Lista de pedidos com prioridade: "+prioridade.toString());
					}else {
						System.out.println(prioridade.retorna());
						regular.enfileira(new Cliente(nome,edereco,"Peito de frango",34.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}
					break;
				case 5:
					System.out.println("Digite os dados pedidos abaixo para entrega: ");
					System.out.println("Informe seu nome: ");
					nome =input.next();
					System.out.println("Informe o seu endereço para entrega: ");
					edereco =input.next();
					System.out.println("Qual e a quantidade de pizza o senho(a) deseja? ");
					preco =  input.nextDouble();
					System.out.println("Deseja pagar 10R$ para prioridade? Informe sim/não");
					opt =input.next();
					
					if(opt.equals("nao")) {
						regular.enfileira(new Cliente(nome,edereco,"Portuguesa",35.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}else if (opt.equals("sim") && prioridade.retorno == 0){
						prioridade.enfileira(new Cliente(nome,edereco,"Portuguesa",35.00*preco));
						System.out.println("Lista de pedidos com prioridade: "+prioridade.toString());
					}else {
						System.out.println(prioridade.retorna());
						regular.enfileira(new Cliente(nome,edereco,"Portuguesa",35.00*preco));
						System.out.println("Lista de pedidos sem prioridade: "+regular.toString());
					}
					break;

				default:
					finaliza ="nao";
					break;
				}
		}


		while (!regular.isEmpty() || !prioridade.isEmpty()) {

			int cont = 0;

			while (!prioridade.isEmpty() && cont < MAX_PRIORIDADE) {
				atendePessoa(prioridade, "Fila com prioridade foi atendia.");
				cont++;
			}

			if (!regular.isEmpty()) {
				atendePessoa(regular, "Fila sem prioridade foi atendia.");
			}

			if (prioridade.isEmpty()) {
				while (!regular.isEmpty()) {
					atendePessoa(regular,"Fila sem prioridade foi atendia.");
				}
			}
		}
	}

	public static void atendePessoa(TAD_Fila_ArranjoCirc<Cliente> fila, String msg) {
		Cliente pessoaAtendida = fila.desenfileira();
		System.out.println(pessoaAtendida + " "+msg);
	}

}
