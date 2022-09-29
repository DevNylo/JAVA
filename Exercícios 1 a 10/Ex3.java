import java.util.Scanner;

class Ex3 {
  public static void main(String[] args) {

    // Exercício 3

    Scanner numScan = new Scanner(System.in); // Obj

    int number, calc; // VAR

    System.out.print("Digite um valor: ");
    number = numScan.nextInt(); // Entrada do valor

    calc = number * 3; // Processamento

    System.out.print("O triplo de " + number + " é: " + calc); // Resultado

  }
}