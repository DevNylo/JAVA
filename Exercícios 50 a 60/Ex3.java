import java.util.Scanner;

class Ex_53 {
  public static void main(String[] args) {

    // Exercício 53 - Média de 3 com funções

    Scanner input = new Scanner(System.in);

    double num1, num2, num3, result;

    System.out.print("Qual o primeiro VALOR: ");
    num1 = input.nextDouble();
    System.out.print("Qual o segundo VALOR: ");
    num2 = input.nextDouble();
    System.out.print("Qual o terceiro VALOR: ");
    num3 = input.nextDouble();

    result = calc(num1, num2, num3);

    System.out.print("A média é: " + result);
  }

  public static double calc(double valor1, double valor2, double valor3) {
    double calc = (valor1 + valor2 + valor3) / 3;
    return calc;
  }

}
