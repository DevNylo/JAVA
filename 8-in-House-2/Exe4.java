import java.util.Scanner;

class Exe4 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    System.out.println("Digite o ganho da familia");
    double ganho = inputScan.nextDouble();

    System.out.println("Digite o gasto da familia");
    double gasto = inputScan.nextDouble();

    String resultado = calcFun(ganho, gasto);
    System.out.println(resultado);

  }

  public static String calcFun(double ganho, double gast) {
    double valor = (gast * 100) / ganho;

    String result = "";

    if (valor <= 30) {
      result = "Parabéns, está gerenciando bem seu orçamento! ";
    } else if (valor <= 50) {
      result = "Muito bem, seus gastos não ultrapassam metade dos ganhos! ";
    } else if (valor <= 80) {
      result = "Atenção, melhor conter os gastos!";
    } else if (valor <= 100) {
      result = "Cuidado, seu orçamento pode ficar comprometido!";
    } else {
      result = "Orçamento comprometido! Hora de rever seus gastos!";
    }
    return result;
  }
}