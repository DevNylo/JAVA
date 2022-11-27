import java.util.Scanner;

class Exe1 {
  public static void main(String[] args) {

    byte tamPeque, tamMedio, tamGrande;
    double cupom, total;

    Scanner inputScan = new Scanner(System.in);

    System.out.println("Qual a quantidade de açaí PEQUENO: ");
    tamPeque = inputScan.nextByte();
    System.out.println("Qual a quantidade de açaí MÉDIO: ");
    tamMedio = inputScan.nextByte();
    System.out.println("Qual a quantidade de açaí GRANDE: ");
    tamGrande = inputScan.nextByte();
    System.out.println("Desconto do cupom em %: ");
    cupom = inputScan.nextDouble();

    total = functionSupply(tamPeque, tamMedio, tamGrande, cupom);

    System.out.println("Total à pagar é R$" + total);
  }

  public static double functionSupply(byte pequeno, byte medio, byte grande, double valorCupm) {
    double tamPequeno = pequeno * 13.50;
    double tamMedio = medio * 15.00;
    double tamGrande = grande * 17.50;
    double calc = tamPequeno + tamMedio + tamGrande;
    double calcTotal = calc - ((valorCupm / 100) * calc);
    return calcTotal;

  }
}