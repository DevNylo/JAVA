import java.util.Scanner;

class Ex_15 {
  public static void main(String[] args) {

    // Exercício 15 Compra parcelada.

    Scanner cashScan = new Scanner(System.in); // Objeto

    double parc, product; // Var tipo Real
    int installments; // Var tipo Inteira

    System.out.print("Qual o valor do produto: ");
    product = cashScan.nextDouble(); // Entrada 1

    System.out.print("Irá parcelar em quantas vezes? ");
    installments = cashScan.nextInt(); // Entrada 2

    parc = product / installments; // Processamento

    System.out.print("Sua compra de R$" + product + " em " + installments + "x de R$" + parc + " foi concluída"); // Saída
  }
}