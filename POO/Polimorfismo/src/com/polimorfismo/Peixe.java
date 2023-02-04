package com.polimorfismo;

public class Peixe extends Animal{
	private String corEscamas;

	public String getCorEscamas() {
		return corEscamas;
	}

	public void setCorEscamas(String corEscamas) {
		this.corEscamas = corEscamas;
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo coisas de peixe");
	}
	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som");
	}
	
	public void soltarBolha() {
		System.out.println("Glu glu glu glu");
	}
	
	
}
