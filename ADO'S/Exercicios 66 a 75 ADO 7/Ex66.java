import java.util.Scanner;

class Ex66 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    String tipo;
    double quant, calc;

    System.out.print("Qual o tipo de ingresso (MEIA ou INTEIRA): ");
    tipo = inputScan.nextLine().trim();

    System.out.print("Qual a quantidade de ingresso: ");
    quant = inputScan.nextDouble();

    calc = ingressoFun(tipo, quant);

    System.out.print("O total a pagar é: R$ " + calc);
  }

  public static double ingressoFun(String tipo,
      double quanti) {
    double valor = 0;
    if (tipo.equalsIgnoreCase("Inteira")) {
      valor = quanti * 28.5;
    } else {
      valor = quanti * 14.25;

    }
    return valor;
  }
}