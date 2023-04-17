import java.util.Scanner;

class Ex81 {
  public static void main(String[] args) {

    // Exercício 81 - Calculo de mensalidade.

    Scanner inputScan = new Scanner(System.in);

    String sigla;
    boolean isento;
    double desconto, calc;

    System.out.print("Sigla do curso: ");
    sigla = inputScan.nextLine();

    System.out.print("O aluno é isento? ");
    isento = inputScan.nextBoolean();

    System.out.print("Qual o desconto em %: ");
    desconto = inputScan.nextDouble();

    calc = custoFun(sigla, isento, desconto);
    System.out.println(calc);

  }

  public static double custoFun(String sigla, boolean isento, double desconto) {

    double calc = 0;

    if (sigla.equalsIgnoreCase("SI")) {
      calc = ((desconto / 100) * 0);
    } else if (sigla.equalsIgnoreCase("SI") && isento == false) {
      calc = ((desconto / 100) * 550);
    } else if (sigla.equalsIgnoreCase("ADS")) {
      calc = ((desconto / 100) * 0);
    } else if (sigla.equalsIgnoreCase("ADS") && isento == false) {
      calc = ((desconto / 100) * 750);
    } else if (sigla.equalsIgnoreCase("CS")) {
      calc = ((desconto / 100) * 0);
    } else if (sigla.equalsIgnoreCase("CS") && isento == false) {
      calc = ((desconto / 100) * 1150);
    } else if (sigla.equalsIgnoreCase("EC")) {
      calc = ((desconto / 100) * 0);
    } else if (sigla.equalsIgnoreCase("EC") && isento == false) {
      calc = ((desconto / 100) * 1300);
    } else if (sigla.equalsIgnoreCase("ES") && isento == true) {
      calc = ((desconto / 100) * 0);
    } else {
      calc = ((desconto / 100) * 950);
    }
    return calc;
  }
}