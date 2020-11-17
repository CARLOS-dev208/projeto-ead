package com.carlos.estruturadados.estacionamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pricipal {

	public static void main(String[] args) throws InterruptedException {
		List<Usuarios> listaUpis  = new ArrayList<>();
		List<String> estacionamento  = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int sair = 1;
		
		while (sair != 0) {
			Util.menu(estacionamento);
			
			switch (input.nextInt()) {
			case 1:
					Usuarios user = Util.cadastra();
					listaUpis.add(user);
				break;
			case 2:
				Util.removePorNome(listaUpis);
				break;
			case 3:
				Util.consultarUsuario(listaUpis);
				 Thread.sleep(7000);
				break;
			case 4:
				Util.listarUsuarios(listaUpis);
				 Thread.sleep(7000);
				break;
			case 5:
				if(estacionamento.size() <=5) {
					estacionamento.addAll(Util.estacionamento(listaUpis));
				}else {
					System.out.println("Estacionamento está cheio!!! ");
				}
				break;
			case 6:
				Util.removeDoEstacionamento(estacionamento);
				break;
			case 7:
				sair = 0;
				break;

			default:
				break;
			}
			
		}
		
	
	}

	 
}
