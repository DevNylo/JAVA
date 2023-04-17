import java.util.Scanner;

class Ex77 {
  public static void main(String[] args) {

    // Exercício 77 - União de cores.
    
    String cor1, cor2, corResult;

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Digite uma cor primária: ");
    cor1 = inputScan.nextLine().trim();

    System.out.print("Digite outra cor primária: ");
    cor2 = inputScan.nextLine().trim();

    corResult = corFun(cor1, cor2);

    System.out.println(corResult);
  }

  public static String corFun(String cor1, String cor2) {
    String cor = "";

    if (cor1.equalsIgnoreCase("Azul") && cor2.equalsIgnoreCase("Amarelo")) {
      cor = "A combinação das cores é Verde";
    } else if (cor1.equalsIgnoreCase("Amarelo") && cor2.equalsIgnoreCase("Azul")) {
      cor = "A combinação das cores é Verde";
    } else if (cor1.equalsIgnoreCase("Azul") && cor2.equalsIgnoreCase("Vermelho")) {
      cor = "A combinação das cores é Roxo";
    } else if (cor1.equalsIgnoreCase("Vermelho") && cor2.equalsIgnoreCase("Azul")) {
      cor = "A combinação das cores é Roxo";
    } else if (cor1.equalsIgnoreCase("Vermelho") && cor2.equalsIgnoreCase("Amarelo")) {
      cor = "A combinação das cores é Laranja";
    } else if (cor1.equalsIgnoreCase("Amarelo") && cor2.equalsIgnoreCase("Vermelho")) {
      cor = "A combinação das cores é Laranja";
    } else {
      cor = "Apenas cores primárias são aceitas.";
    }
    return cor;
  }
}