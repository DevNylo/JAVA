import java.util.Scanner;

class Ex_18 {
  public static void main(String[] args) {

    // Exercício 18 - Calculo de preço por quantidade.

    Scanner inputScan = new Scanner(System.in); // Objeto Scanner

    // * Variáveis
    int smallScan, mediumScan, largeScan;
    double small = 13.50;
    double medium = 15.00;
    double large = 17.50;
    double result;
    // *

    System.out.println("Temos os seguintes tamanhos de copo de açaí: ");
    System.out.println("Copo PEQUENO POR R$13,50");
    System.out.println("Copo MÉDIO POR R$15,00");
    System.out.println("Copo GRANDE POR R$17,50");

    System.out.print("Quantos copos PEQUENOS você deseja? ");
    smallScan = inputScan.nextInt(); // Entrada 1

    System.out.print("Quantos copos MÉDIOS você deseja? ");
    mediumScan = inputScan.nextInt(); // Entrada 2

    System.out.print("Quantos copos GRANDES você deseja? ");
    largeScan = inputScan.nextInt(); // Entrada 3

    result = (small * smallScan) + (medium * mediumScan) + (large * largeScan);
    // Processamento

    System.out.printf("O total a pagar é R$%.2f", result); // Saída
    
  }
}