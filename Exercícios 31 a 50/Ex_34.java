import java.util.Scanner;

class Ex_34 {
  public static void main(String[] args) {

    // Exercício 34
    Scanner inputScan = new Scanner(System.in);

    double kmlitros, conv, dist, capacidade, calc;
    
    System.out.print("Qual a capacidade do tanque de combustível em LITROS: ");
    capacidade = inputScan.nextDouble();

    System.out.print("O consumo do veículo em LITROS: ");
    kmlitros = inputScan.nextDouble();

    System.out.print("Qual a distância da viagem: ");
    dist = inputScan.nextDouble();

    calc = dist / (capacidade * kmlitros);
    conv = Math.ceil(calc);
    
    System.out.print("Você precisará fazer "+conv+" paradas para abastecer.");

  }
}