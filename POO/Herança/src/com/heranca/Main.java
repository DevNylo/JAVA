package com.heranca;

public class Main {

	public static void main(String[] args) {
		
		Visitante visita = new Visitante();
		
		visita.setNome("Danilo");
		visita.setIdade(24);
		visita.setSexo("M");
	
		Aluno aluno = new Aluno();
		
		aluno.setNome("Gabriel");
		aluno.setIdade(21);
		aluno.setMatricula(5121);
		aluno.setSexo("M");
		aluno.PagarMensalidade();
		
		Bolsista bolsista = new Bolsista();
		
		bolsista.setNome("Silvia");
		bolsista.setIdade(18);
		bolsista.setMatricula(9241);
		bolsista.setSexo("F");
		bolsista.PagarMensalidade();
		
		
	}
}
