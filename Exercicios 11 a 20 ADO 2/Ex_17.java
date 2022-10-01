import java.util.Scanner;

class Ex_17 {
  public static void main(String[] args) {

    // Exercício 17 Total de vendas de açaí.

    int quantAcai; // Var
    double calc; // Var

    Scanner inputScan = new Scanner(System.in); // Objeto

    System.out.println("Bem-vindo(a)! O nosso açaí está no valor de R$ 13,50 cada."); // Apresentação

    System.out.print("Quantos você deseja comprar? ");
    quantAcai = inputScan.nextInt(); // Entrada

    calc = quantAcai * 13.50; // Processamento

    System.out.println("O total a pagar é R$" + calc); // Saída

  }
}