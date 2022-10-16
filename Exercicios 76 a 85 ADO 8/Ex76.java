import java.util.Scanner;

class Ex76 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    // Exercício 76 - Tipo de triângulo com funções.

    double priLado, segLado, terLado;
    String result;

    System.out.print("Qual o valor do PRIMEIRO LADO: ");
    priLado = inputScan.nextDouble();

    System.out.print("Qual o valor do SEGUNDO LADO: ");
    segLado = inputScan.nextDouble();

    System.out.print("Qual o valor do TERCEIRO LADO: ");
    terLado = inputScan.nextDouble();

    result = tipoTriFun(priLado, segLado, terLado);

    System.out.println("Esse é um tipo de triângulo " + result);

  }

  public static String tipoTriFun(double l1Fun, double l2Fun, double l3Fun) {
    String tipoTri = "";

    if (l1Fun == l2Fun && l1Fun == l3Fun) {
      tipoTri = "Equilátero.";
    } else if ((l1Fun == l2Fun) || (l1Fun == l3Fun) || (l2Fun == l3Fun)) {
      tipoTri = "Isósceles";
    } else {
      tipoTri = "Escaleno";
    }
    return tipoTri;
  }
}