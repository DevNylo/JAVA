package com.emojicombate;

public class Lutador implements Combate {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String no, String nas, int id, double alt, double pe, int vit, int emp, int der) {
		this.setNome(no);
		this.setNacionalidade(nas);
		this.setIdade(id);
		this.setAltura(alt);
		this.setPeso(pe);
		this.setVitorias(vit);
		this.setEmpates(emp);
		this.setDerrotas(der);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCategoria() {
		return categoria;
		
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	@Override
	public void apresentar() {
		System.out.println("------------------------------");
		System.out.println("CHEGOU A HORA APRESENTAMOS O LUTADOR! "+this.getNome());
		System.out.println("Diretamente de "+this.getNacionalidade());
		System.out.println("Ele possue "+this.getIdade()+" anos e "+this.getAltura()+" de altura");
		System.out.println("Pesando cerca de "+this.getPeso());
		System.out.println("Seus números são esses:");
		System.out.println("Vitória: "+this.getVitorias());
		System.out.println("Empates: "+this.getEmpates());
		System.out.println("Derrotas "+this.getDerrotas());
		
	}
	@Override
	public void status() {
		// TODO Stub de método gerado automaticamente
		
	}
	@Override
	public void ganharLuta() {
		// TODO Stub de método gerado automaticamente
		
	}
	@Override
	public void perderLuta() {
		// TODO Stub de método gerado automaticamente
		
	}
	@Override
	public void empatarLuta() {
		// TODO Stub de método gerado automaticamente
		
	}
	
}
