package ConversoEmBinario;

public class TAD_Binario {
	private Integer num;

	public void conversoDeDecimalParaBinario(int numEmDecimal) {

	}

	public void binario(int numero) {
		int d = numero;
		StringBuffer binario = new StringBuffer(); // guarda os dados
		while (d > 0) {
			this.num = d % 2;
			binario.append(this.num);
			d = d >> 1; // � a divis�o que voc� deseja
		}
		System.out.println("O n�mero decimal ("+numero +") convertido para binario: "+binario.reverse()); // inverte a ordem e imprime
		System.out.println();
	}


	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
