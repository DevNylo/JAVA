import java.util.Scanner;

class Ex_13 {
  public static void main(String[] args) {

    // Exercício 13 Converter quilogramas para gramas.

    double kilo, gramas; // Variáveis

    Scanner valorScan = new Scanner(System.in); // Objeto

    System.out.print("Digite o peso em Kg: ");
    kilo = valorScan.nextDouble(); // Entrada

    gramas = kilo * 1000; // Processamento

    System.out.print("O valor em gramas é: " + gramas); // Saída

  }
}