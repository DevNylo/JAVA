package com.polimorfismo;

public class Ave extends Animal{
	private String corPenas;

	public String getCorEscamas() {
		return corPenas;
	}

	public void setCorEscamas(String penas) {
		this.corPenas = penas;
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo coisas de aves");
	}
	@Override
	public void emitirSom() {
		System.out.println("Sons de aves");
	}
	
	public void fazerNinhos() {
		System.out.println("Fazendo ninho");
	}
	
	
}
