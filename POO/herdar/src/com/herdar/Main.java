package com.herdar;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Heranca trab = new Heranca();
		
		trab.fazerAni();
		
		pessoa.setNome("Danilo");
		
		System.out.print("Seu nome é "+ pessoa.getNome());

	}

}