import java.util.Scanner;

class Ex_12 {
  public static void main(String[] args) {

    // Exercício 12 Calculo de cupom em porcentagem

    Scanner cashScan = new Scanner(System.in); // Objeto

    double product, voucher, paidOut; // Variáveis

    System.out.print("Qual o valor do produto? ");
    product = cashScan.nextDouble(); // Entrada 1

    System.out.print("Qual o desconto do cupom em % ");
    voucher = cashScan.nextDouble(); // Entrada 2

    paidOut =  product - (voucher / 100 * product); // Processamento

    System.out.println("Compra finalizada! O total é de: R$ " + paidOut); // Saída

  }
}