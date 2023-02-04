package objCaneta;

public class Caneta {
	public String modelo;
	private double ponta;
	protected String tinta;
	public String cor;
	private boolean tampada;
	
	public Caneta(String m, String c) {
		this.modelo = m;
		this.cor = c ;
		this.tampar();
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String model) {
		this.modelo = model;
	}
	
	public double getPonta() {
		return this.ponta;
	}
	public void setPonta(double point) {
		this.ponta = point;
	}
	
	public String getTinta() {
		return this.tinta;
	}
	public void setTinta(String t) {
		this.tinta = t;
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
		
	public void sobreCaneta() {
		System.out.println("O modelo da caneta é "+getModelo());
		System.out.println("A ponta da caneta é "+getPonta());
		System.out.println("A cor da tinta é "+getTinta());
		System.out.println("A cor da caneta é "+getCor());
		System.out.println("A caneta está tampada? "+this.tampada);
	}
}
