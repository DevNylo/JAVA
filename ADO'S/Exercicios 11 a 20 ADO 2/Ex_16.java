import java.util.Scanner;

class Ex_16 {
  public static void main(String[] args) {

    // Exercício 16 - Calculo de combustível.

    double litros, kmlitro, dist, calc, res;

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Qual a capacidade do tanque em litros: ");
    litros = inputScan.nextDouble();

    System.out.print("Consumo do veículo (km por litros): ");
    kmlitro = inputScan.nextDouble();

    System.out.print("Distância da viagem: ");
    dist = inputScan.nextDouble();

    calc = dist / (litros * kmlitro) + 0.1;

    System.out.print("Você pracisará fazer " + Math.round(calc) + " parada para abastecer!");

  }
}