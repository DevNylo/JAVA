package projetofinal;

public class Gafanhoto extends Pessoa{

	private String login;
	private int totAssistindo;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		
	}
	
	public void viuMaisUm() {
		
	}

	public int getTotAssistindo() {
		return totAssistindo;
	}

	public void setTotAssistindo(int totAssistindo) {
		this.totAssistindo = totAssistindo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}