import java.util.Scanner;

class Ex_58 {
  public static void main(String[] args) {

    // Exercício 58 - Verificando se as cores são primárias com funções.

    Scanner input = new Scanner(System.in);

    String cor;
    boolean condiction;

    System.out.print("Qual a cor você deseja verificar? ");
    cor = input.nextLine();

    condiction = condictionFunc(cor);

    System.out.println("É cor primária? " + condiction);
  }

  public static boolean condictionFunc(String cor) {
    boolean condiction = cor.equalsIgnoreCase("Azul") || cor.equalsIgnoreCase("Amarelo")
    || cor.equalsIgnoreCase("Vermelho");
    return condiction;
  }
}