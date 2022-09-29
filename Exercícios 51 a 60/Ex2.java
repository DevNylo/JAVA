import java.util.Scanner;

class Ex_52 {
  public static void main(String[] args) {

    // Exercício 52 - Dobro do número com funções.

    Scanner input = new Scanner(System.in);

    int num, result;

    System.out.println("Qual o número a ser duplicado: ");
    num = input.nextInt();

    result = duplicar(num);

    System.out.println("O dobro de " + num + " é " + result);

  }

  public static int duplicar(int num) {
    int mult = num * 2;
    return mult;
  }

}
