package controleremoto;

public class ControleRemoto implements Controlador {
	
	// ATRIBUTOS 
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// METODOS ESPECIAIS
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	public void ligar() {
		this.setLigado(true);
	}
	public void desligar() {
		this.setLigado(false);
	}
	public void abrirMenu() {
		
		System.out.println("Está ligado? "+ this.getLigado());
		System.out.println("Está tocando? "+this.getTocando());
		System.out.println("Volume: "+ this.getVolume());
		
		for(int i = 0; i <= this.getVolume(); i+= 10) {
			System.out.print("|");
		}

	}
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}
	public void mainVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
	
	// GETTERS E SETTERS
	
	public int getVolume() {
		return this.volume;
	}
	public void setVolume(int vol) {
		this.volume = vol;
	}
	
	public boolean getLigado() {
		return this.ligado;
	}
	public void setLigado(boolean lig) {
		this.ligado = lig;
	}
	
	public boolean getTocando() {
		return this.tocando;
	}
	public void setTocando(boolean toc) {
		this.tocando = toc;
	}
	

}