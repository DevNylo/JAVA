import java.util.Scanner;

class Ex82 {

  public static void main(String[] args) {

    // Execício 82 - Calculo de ingresso.

    byte inteira, meia;
    String dia;
    boolean nacional;
    double valorTotal;

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Qual a quantidade de ingressos inteira: ");
    inteira = inputScan.nextByte();

    System.out.print("Qual a quantidade de ingressos de meia-entrada: ");
    meia = inputScan.nextByte();

    System.out.print("Informe o dia da semana: ");
    dia = inputScan.next();

    System.out.print("O filme é nacional? ");
    nacional = inputScan.nextBoolean();

    valorTotal = ingCalcFun(inteira, meia, dia, nacional);

    System.out.print("O total a se pagar pelos ingressos é R$" + valorTotal);

  }

  public static double ingCalcFun(byte inteira, byte meia, String diaDaSemana, boolean nacional) {

    double totalPag = 28.5;

    if (nacional == true) {
      totalPag = (inteira + meia) * 5;
    } else if (diaDaSemana.equalsIgnoreCase("quarta-feira")) {
      totalPag = (inteira + meia) * 14.25;
    } else {
      totalPag = (meia * 14.25) + (inteira * 28.5);
    }
    return totalPag;
  }
}
