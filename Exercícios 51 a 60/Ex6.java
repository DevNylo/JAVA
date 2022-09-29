import java.util.Scanner;

class Ex_56 {
  public static void main(String[] args) {

    // Exercício 56 - Comparando retângulos com função.

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

    boolean compare = comparar(base1, altura1, base2, altura2);

    System.out.print("Os retângulos são iguais? " + compare);

  }

  public static boolean comparar(double valor1, double valor2, double valor3, double valor4) {
    double area1 = valor1 * valor2;
    double area2 = valor3 * valor4;
    boolean comparar = area1 == area2;
    return comparar;
  }
}
