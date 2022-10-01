import java.util.Scanner;

class Ex71 {
  public static void main(String[] args) {

    // Exercício 71 - Calcular o total.

    Scanner inputScan = new Scanner(System.in);

    double peso;

    System.out.print("Qual o peso do sorvete em GRAMAS? ");
    peso = inputScan.nextDouble();

    double calc = pesoFun(peso);

    if (calc > 0) {
      System.out.printf("O total a pagar é: R$ %.2f", calc);
    } else {
      System.out.printf("Peso inválido.");
    }

  }

  public static double pesoFun(double peso) {
    double calcTotal = 0;

    if ((peso / 1000) >= 1) {
      double pesoDim = 3.00 / 100;
      calcTotal = peso * pesoDim;
    } else {
      double pesoInd = 3.50 / 100;
      calcTotal = peso * pesoInd;
    }
    return calcTotal;
  }
}