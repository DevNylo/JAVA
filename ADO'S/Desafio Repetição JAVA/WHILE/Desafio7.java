import java.util.Scanner;

class Desafio7 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num1, num2, soma = 0;

    String continuar = "S";

    while (continuar.equalsIgnoreCase("S")) {

      System.out.print("Primeiro número: ");
      num1 = input.nextInt();
      System.out.print("Segundo número: ");
      num2 = input.nextInt();

      soma = num1 + num2;

      System.out.println(num1 + " + " + num2 + " = " + soma);

      System.out.println("Deseja continuar?");
      continuar = input.next();

    }
    System.out.println("Fim.");

  }
}