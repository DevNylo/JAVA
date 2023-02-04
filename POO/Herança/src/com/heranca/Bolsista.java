package com.heranca;

public final class Bolsista extends Aluno{
	
	private int bolsa;
	
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	public void RenovarBolsa() {
		
	}
	
	@Override
	public void PagarMensalidade() {
		System.out.println("Bolsista "+this.getNome()+" pagou a mensalidade");
	}

}
