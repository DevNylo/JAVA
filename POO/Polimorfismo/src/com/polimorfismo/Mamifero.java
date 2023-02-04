package com.polimorfismo;

public class Mamifero extends Animal{
	private String corPelo;
	
	public String getCorPelo() {
		return this.corPelo;
	}
	public void setCorPelo(String cor) {
		this.corPelo = cor;
	}
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	@Override
	public void alimentar() {
		System.out.println("Se alimentando");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}
}
