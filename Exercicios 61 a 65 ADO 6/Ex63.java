import java.util.Scanner;

class Ex63 {
  public static void main(String[] args) {

    // Exercício 63 - Comparando retângulos com duas funções.

    Scanner inputScan = new Scanner(System.in);

    double base1, altura1, base2, altura2, area1, area2;

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

    area1 = calcularFun (base1, altura1);
    area2 = calcularFun (base2, altura2);
    boolean comparar = compararFun(area1, area2);

    System.out.println("Os retângulos são iguais? "+comparar);

  }
  // Função parar calcular área.
  public static double calcularFun(double base, double altura) {
    double calc = base * altura;
    return calc;

  }
  // Função para comparar.
  public static boolean compararFun (double area1, double area2){
    boolean comparar = area1 == area2;
    return comparar;
    
  }
}
