import java.util.Scanner;

class Ex_14 {
  public static void main(String[] args) {

    // Exercício 14 Converter Reais em Dólar / Cotação atual $5.16

    Scanner realScan = new Scanner(System.in); // Objeto

    double real, convert; // Variável

    System.out.print("Quantos reais você deseja converter em dólar: ");
    real = realScan.nextDouble(); // Entrada

    convert = real * 5.16; // Processamento

    System.out.print("R$" + real + " equivale a $" + convert + " dólares."); // Saída

  }
}