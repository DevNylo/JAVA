import java.util.Scanner;

class Ex_21 {
  public static void main(String[] args) {

    // Exercício 21

    Scanner inputScan = new Scanner(System.in);

    double temp;

    System.out.println("Programa da Temperatura");

    System.out.print("Qual a sua temperatura? ");
    temp = inputScan.nextDouble();
    System.out.println("Verificando temperatura...");

    boolean result = temp >= 37.3;

    System.out.print("Você está com febre? " + result);

  }
}