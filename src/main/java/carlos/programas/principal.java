package carlos.programas;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		IRetangulo iRetangulo = new IRetangulo();
        String sair = "nao";
		while (sair.equals("nao")) {
			int opt = 0;
			float base, altura;
			Scanner input = new Scanner(System.in);
			System.out.println("=============Menu============ ");
			System.out.println("1-Iniciar um retângulo");
			System.out.println("2-Modificar retângulo");
			System.out.println("3-Calcular área");
			System.out.println("4-Mostrar retângulo");
			System.out.println("5-Sair");
			System.out.println();
			System.out.print("Escolha uma das opições acima: ");
			opt = input.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Informe a Base e Altura para iniciar o retângulo: ");
				System.out.print("Valor da base: ");
				base = input.nextFloat();
				System.out.print("Valor da altura: ");
				altura = input.nextFloat();
				iRetangulo.inicializa(base, altura);
				System.out.println();
				break;
			case 2:
				System.out.println("Informe novos valores para Base e Altura: ");
				System.out.print("Valor da base: ");
				base = input.nextFloat();
				System.out.print("Valor da altura: ");
				altura = input.nextFloat();
				iRetangulo.modificarRetangulo(base, altura);
				System.out.println();
				break;

			case 3:
				iRetangulo.calcularArea(iRetangulo.getBase(), iRetangulo.getAltura());
				break;
			case 4:
				iRetangulo.MostraRetangulo();
				break;
			case 5:
				System.out.print("Para Sair Informe (sim): ");
				sair = input.next();
				break;
			default:
				break;
			}

			
		
		}
		
		System.out.print("Programa encerrado!");
		}

}
