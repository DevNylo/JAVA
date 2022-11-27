import java.util.Scanner;

class Exe2 {
  public static void main(String[] args) {

    // Exercício 34
    Scanner inputScan = new Scanner(System.in);

    double kmlitros, conv, dist, capacidade;

    System.out.print("Qual a capacidade do tanque de combustível em LITROS: ");
    capacidade = inputScan.nextDouble();

    System.out.print("O consumo do veículo em LITROS: ");
    kmlitros = inputScan.nextDouble();

    System.out.print("Qual a distância da viagem: ");
    dist = inputScan.nextDouble();

    conv = stopFun(capacidade, kmlitros, dist);

    System.out.print("Você precisará fazer " + conv + " paradas para abastecer.");

  }

  public static double stopFun(double capacidadeFun, double kmlitrosFun, double distFun) {
    double calc = distFun / (capacidadeFun * kmlitrosFun);
    return Math.ceil(calc);
  }
}