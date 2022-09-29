import java.util.Scanner;

class Ex_24 {
  public static void main(String[] args) {

    // Exercício 24

    Scanner numberScan = new Scanner(System.in);

    int impaPar, number;

    System.out.println("Programa de Impar ou Par");

    System.out.print("Digite um número: ");
    impaPar = numberScan.nextInt();

    number = impaPar % 2;
    
    boolean result = number == 0;

    System.out.print("O número é par? " + result);

    /*
     * if (result == 0) {
     * System.out.println("O número "+impaPar+" é PAR");
     * } else {
     * System.out.print("O número "+impaPar+" é ÍMPAR");
     * }
     */
  }
}