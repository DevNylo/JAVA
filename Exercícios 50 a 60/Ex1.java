import java.util.Scanner;

class Ex51 {
  public static void main(String[] args) {

    // Exercício 51 - Soma com funções.

    Scanner input = new Scanner(System.in);

    int num1, num2, soma;

    System.out.print("Informe um número: ");
    num1 = input.nextInt();
    System.out.print("Informe outro número: ");
    num2 = input.nextInt();

    soma = somar(num1, num2);

    System.out.print("A soma é:"soma);

  }

  public static int somar(int valor1, int valor2) {
    int somar2 = valor1 + valor2;
    return somar2;
  }

}