import java.util.Scanner;

class Ex_23 {
  public static void main(String[] args) {

    // Exercício 23

    Scanner inputScan = new Scanner(System.in);

    double base1, altura1, base2, altura2, area1, area2;

    System.out.println("Programa dos Retângulos");

    System.out.println("Vamos verificar se os retângulos possuem a mesma área");

    System.out.println("PRIMEIRO RETÂNGULO");

    System.out.print("Digite o valor da BASE ");
    base1 = inputScan.nextDouble();

    System.out.print("Digite o valor da ALTURA ");
    altura1 = inputScan.nextDouble();

    System.out.println("------------------------------");

    System.out.println("SEGUNDO RETÂNGULO");

    System.out.print("Digite o valor da BASE ");
    base2 = inputScan.nextDouble();

    System.out.print("Digite o valor da ALTURA ");
    altura2 = inputScan.nextDouble();

    area1 = base1 * altura1;
    area2 = base2 * altura2;

    boolean comparar = area1 == area2;

    System.out.print("O primeiro retângulo possui área " + area1);
    System.out.print("O segundo retângulo possui área " + area2);
    System.out.print("Eles são iguais? " + comparar);

  }
}
