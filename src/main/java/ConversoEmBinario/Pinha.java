package ConversoEmBinario;

public class Pinha {

	private Integer[] binario;
	private int topoPilha;
	
	private TAD_Binario converte;
	
	public Pinha(int tamPilha) {
		this.binario = new Integer[tamPilha];
		this.topoPilha = -1;
	}
	
	public void converteParaBinario(Integer converteBinario) {
		if(topoPilha == binario.length -1) {
			System.out.println("Pinha está cheia!");
		}else {
			topoPilha++;
			binario[topoPilha] =  converteBinario;
		}
	}

	public Integer[] getBinario() {
		return binario;
	}

	public void setBinario(Integer[] binario) {
		this.binario = binario;
	}

	public int getTopoPilha() {
		return topoPilha;
	}

	public void setTopoPilha(int topoPilha) {
		this.topoPilha = topoPilha;
	}

	public TAD_Binario getConverte() {
		return converte;
	}

	public void setConverte(TAD_Binario converte) {
		this.converte = converte;
	}
}
