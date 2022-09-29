import java.util.Scanner;

class Ex_54 {
  public static void main(String[] args) {

    // Exercício 54 - Calcular salário com funções.

    double base, bonus, desconto, salario;

    Scanner input = new Scanner(System.in);

    System.out.print("Qual o salário base: ");
    base = input.nextDouble();

    System.out.print("Qual o bônus mensal: ");
    bonus = input.nextDouble();

    System.out.print("Qual o desconto aplicado: ");
    desconto = input.nextDouble();

    salario = salarioFunc(base, bonus, desconto);

    System.out.print("Seu salário líquido é de R$" + salario);
  }

  public static double salarioFunc(double ghostValue1, double ghostValue2, double ghostValue3) {
    double salarioBase = (ghostValue2 / 100 * ghostValue1) + ghostValue1;
    double calc = salarioBase - ghostValue3;
    return calc;
  }
}