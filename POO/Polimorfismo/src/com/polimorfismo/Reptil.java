package com.polimorfismo;

public class Reptil extends Animal {
	private String corEscamas;

	public String getCorEscamas() {
		return corEscamas;
	}

	public void setCorEscamas(String corEscamas) {
		this.corEscamas = corEscamas;
	}
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo coisas de réptil");
	}
	@Override
	public void emitirSom() {
		System.out.println("Emitindo sons de réptil");
	}
	
}
