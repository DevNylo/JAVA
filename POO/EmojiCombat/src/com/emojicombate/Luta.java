package com.emojicombate;
import java.util.Random;

public class Luta{
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public void marcarLuta(Lutador l1, Lutador l2) {
		
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada=true;
			this.desafiante=l1;
			this.desafiado=l2;
		}else {
			this.aprovada=false;
			this.desafiante=null;
			this.desafiado=null;
		}
	}
	public void lutar() {
		if(this.aprovada) {
			System.out.println("###Desafiado!###");
			this.desafiado.apresentar();
			System.out.print("###Desafiante!###");
			this.desafiante.apresentar();
		}else {
			System.out.print("A luta não pode acontecer!");
		}
		
		Random aleatorio = new Random();
		int vencedor = aleatorio.nextInt(3);
		
		switch(vencedor) {
		
		case 0: // Empate
			System.out.print("Empatou");
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			break;
		case 1: // Desafiado Win
			System.out.print("Vitória do "+this.desafiado.getNome());
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			break;
		
		case 2: // Desafiante Win
			System.out.print("Vitória do "+this.desafiante.getNome());
			this.desafiante.ganharLuta();
			this.desafiado.perderLuta();
			break;
		
		}
	}
	
}
