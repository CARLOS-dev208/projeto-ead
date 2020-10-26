package com.carlos.estruturadados.fila;


public class FilaComPrioridade<T> extends TAD_Fila_ArranjoCirc<T>{
	int retorno;
 public FilaComPrioridade(int capacidade) {
	 super(capacidade);
 }

	
	public void enfileira(T elemento){
	
//		Comparable<T> chave = (Comparable<T>) elemento;
	
			int i;
			for (i=0; i<this.tamanho; i++){
//				if (chave.compareTo(this.elementos[i]) < 0){
//					break;
//				}
			}
		
			this.retorno = this.adiciona(i, elemento);
		}
	
	public String retorna() {
		if(retorno > 2) {
			return "Fila de pedidos com prioridade está cheio!";
			
		}
		return "";
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}
		

	
	

	
	
}