package contaBancaria;
import java.util.Scanner;

public class ContaBanco {
	
	Scanner input = new Scanner(System.in);

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo = 0;
	private boolean status = false;
	private float deposito;
	private float saque;
	private float mensalidade;
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int num) {
		this.numConta = num;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
	
	public float getSaque() {
		return this.saque;
	}
	public void setSaque(float saque) {
		this.saque = saque;
	}
	
	public float getDeposito() {
		return this.deposito;
	}
	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}
	
	public float getMensalidade() {
		return this.mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public void abrirConta() {
		
		this.setStatus(true);
		this.setNumConta(512431);
		System.out.println("Qual o tipo de conta deseja abrir?");
		
		System.out.println("CC - CONTA CORRENTE: ");
		System.out.print("CP - CONTA POUPANÇA: ");
		this.setTipo(input.nextLine());
		
		if(this.getTipo().equals("CC")) {
			this.setSaldo(50f);
		}else {
			this.setSaldo(150f);
		}
		
		System.out.println("");
		System.out.println("Informe seu nome completo: ");
		this.setDono(input.nextLine());
		
		System.out.println("Bem-vindo(a) "+this.getDono());
		System.out.print("Número da conta: "+this.getNumConta());
	
	}
	public void fecharConta() {
		
		if(this.getSaldo() > 0f) {
			System.out.println("Existe saldo, retire o saldo antes de fechar a conta.");
		}
		else {
			System.out.println("Conta encerrada com sucesso.");
			this.setStatus(false);
		}
	}
	
	public void deposito() {
		System.out.println("Valor para deposito: ");
		this.setDeposito(input.nextFloat());
		
		this.setSaldo(this.getSaldo() + this.getDeposito());
	}
	
	public void saque() {
		if(this.getSaldo() >= this.getSaque()) {
			System.out.println("Informe o valor para saque: ");
			this.setSaque(input.nextFloat());
			
			if(this.getSaldo() >= this.getSaque()) {
				this.setSaldo(this.getSaldo() - this.getSaque());
			}else {
				System.out.println("Saldo insuficiente!");
				
				while(this.getSaldo() < this.getSaque()) {
					System.out.println("Informe o valor para saque: ");
					this.setSaque(input.nextFloat());
				}
				this.setSaldo(this.getSaldo() - this.getSaque());
			}
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void pagarMensalidade() {
		if(this.getSaldo() >= this.getMensalidade()) {
			if(this.getTipo().equals("CC")) {
				this.setSaldo(this.getSaldo() - 12f);
			}else {
				this.setSaldo(this.getSaldo() - 20f);
			}
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	public void banco() {
		System.out.println("Bem-vindo(a) ao Dev Bank!\n");
		System.out.println("Selecione uma opção:\n");
		System.out.println("1 - ABRIR CONTA");
		System.out.print("2 - SAIR");
	}
}

