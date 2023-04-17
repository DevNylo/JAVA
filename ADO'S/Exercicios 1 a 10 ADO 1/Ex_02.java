import java.util.Scanner;

class Ex_02 {
  public static void main(String[] args) {

    // Exercício 2

    Scanner numScan = new Scanner(System.in); // Objeto

    int number, result; // Var

    System.out.print("Digite um número qualquer: ");
    number = numScan.nextInt(); // Entrada de valor

    result = number * 2; // Processamento

    System.out.print("O dobro de " + number + " é: " + result); // Resultado

  }
}