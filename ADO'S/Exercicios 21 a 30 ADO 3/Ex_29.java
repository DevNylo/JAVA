import java.util.Scanner;

class Ex_29 {
  public static void main(String[] args) {

    // Exercício 29

    System.out.print("ABASTECER OU NÃO ABASTECER, EIS A QUESTÃO...");
    System.out.print("----------------------------------------------");

    Scanner inputScan = new Scanner(System.in);

    int tanque;
    double comb, calc;
    boolean result;

    System.out.print("Qual o tamanho do tanque de combustível em Litros: ");
    tanque = inputScan.nextInt();

    System.out.print("Qual a quantidade de combustível no tanque em Litros? ");
    comb = inputScan.nextDouble();

    calc = tanque / 4;
    result = comb <= calc;

    System.out.print("Carro precisa ser reabastecido? " + result);

    /*
     * if (comb <= calc) {
     * System.out.print("Precisa reabastecer!");
     * } else {
     * System.out.print("Não é necessário reabastecer, continue a viagem.");
     * }
     */

  }
}