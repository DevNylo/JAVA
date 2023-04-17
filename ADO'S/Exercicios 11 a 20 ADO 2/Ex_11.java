import java.util.Scanner;

class Ex_11 {
  public static void main(String[] args) {

    // Exercício 11 Calculo de cupom em dinheiro

    Scanner cashScan = new Scanner(System.in); // Objeto

    double product, voucher, paidOut; // Variáveis

    System.out.print("Qual o valor do produto? ");
    product = cashScan.nextDouble(); // Entrada 1

    System.out.print("Qual o desconto do cupom em R$: ");
    voucher = cashScan.nextDouble(); // Entrada 2

    paidOut = product - voucher; // Processamento

    System.out.println("Compra finalizada! O total é de: R$ " + paidOut); // Saída

  }
}