import java.util.Scanner;

class Exe1 {
  public static void main(String[] args) {

    // Calcular salário com funções.

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

  public static double salarioFunc(double funValue1, double funValue2, double funValue3) {
    double salarioBase = (funValue2 / 100 * funValue1) + funValue1;
    double calc = salarioBase - funValue3;
    return calc;
  }
}