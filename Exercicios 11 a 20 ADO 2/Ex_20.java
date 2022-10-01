import java.util.Scanner;

class Ex_20 {
  public static void main(String[] args) {

    // Exercício 20 - Calculo de salário.

    Scanner valorScan = new Scanner(System.in);

    float baseSalary, netSalary, bonus, calc, discount;

    System.out.print("Qual o valor do seu salário base? ");
    baseSalary = valorScan.nextFloat();

    System.out.print("Qual a porcentagem do seu bônus mensal: ");
    bonus = valorScan.nextFloat();

    System.out.print("Desconto aplicado no seu salário em R$: ");
    discount = valorScan.nextFloat();

    calc = (bonus / 100 * baseSalary) + baseSalary;

    netSalary = calc - discount;

    System.out.printf("Seu salário líquido é de $%.2f", netSalary);

  }
}