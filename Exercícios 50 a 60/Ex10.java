import java.util.Scanner;

class Ex_60 {
  public static void main(String[] args) {

    // Exercício 60 - Boas-vindas com funções.

    Scanner input = new Scanner(System.in);

    String nome, nomeCut;

    System.out.print("Digite o seu nome completo: ");
    nome = input.nextLine().trim();

    nomeCut = meuNome(nome);

    System.out.println("Seja bem-vindo " + nomeCut);

  }

  public static String meuNome(String nomeFun) {
    int nomeIndex = nomeFun.indexOf(" ");
    String nomeCut = nomeFun.substring(0, nomeIndex);
    return nomeCut;
  }
}
