package contaBancaria;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ContaBanco conta = new ContaBanco();
		
		conta.banco();
		int action = input.nextInt();
		
		if(action == 1) {
			conta.abrirConta();
			while(conta.getStatus() == true) {
				System.out.println("\n1 - Depositar");
				System.out.println("2 - Saque");
				System.out.println("3 - Fechar Conta");
				System.out.println("4 - Pagar Mensalidade");
				System.out.println("0 - Sair");
				
				System.out.println("O que deseja fazer:");
				action = input.nextInt();
				
				if(action == 1) {
					conta.deposito();
					System.out.print("Saldo R$"+conta.getSaldo());

				}
				else if(action == 2) {
					conta.saque();
					System.out.print("Saldo R$"+conta.getSaldo());
				}
				else if(action == 3) {
					conta.fecharConta();
				}
				else if(action == 4) {
					conta.pagarMensalidade();
					System.out.print("Saldo R$"+conta.getSaldo());
				}
				else {
					break;
				}
			}
		}
		System.out.print("Dev Bank sempre o melhor para você!");
	}
}
