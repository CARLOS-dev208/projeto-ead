package com.carlos.estruturadados.fila;

import com.carlos.estruturadados.base.EstruturaEstatica;

public class TAD_Fila_ArranjoCirc<T> extends EstruturaEstatica<T>{

	public TAD_Fila_ArranjoCirc(){
		super();
	}
	
	public TAD_Fila_ArranjoCirc(int capacidade){
		super(capacidade);
	}
	
	public void enfileira(T elemento){
		//this.elementos[this.tamanho] = elemento;
		//this.tamanho++;
		
		//this.elementos[this.tamanho++] = elemento;
		
		this.adiciona(elemento);
	}
	
	public T espiar(){
		
		if (this.isEmpty()){
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileira(){
		
		final int POS = 0;
		
		if (this.isEmpty()){
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
		
	}
	
	public int sucessor(int pos) {
		return (pos+1)% this.tamanho;
	}
	
	public  int antecessor(int pos) {
		return (pos-1+this.tamanho)%this.tamanho;
	}
	

}
