import java.util.Scanner;

class Ex68 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    double ganhos, gastos;

    System.out.print("Total de GANHOS R$ ");
    ganhos = inputScan.nextDouble();

    System.out.print("Total de GASTOS R$ ");
    gastos = inputScan.nextDouble();

    String verificar = orcamentoFun(ganhos, gastos);

    System.out.println(verificar);

  }

  public static String orcamentoFun(double ganhos, double gastos) {
    String verificar = "";
    if (ganhos >= gastos) {
      verificar = "Você está dentro do orçamento!";
    } else if (ganhos == gastos) {
      verificar = "Você está dentro do orçamento!";
    } else {
      verificar = "Você está fora do orçamento! Não gaste mais!";
    }
    return verificar;
  }
}