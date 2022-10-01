import java.util.Scanner;

class Ex_44 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nomeAutor, obra, cidade, editora, anoLan, ultimoNome, priChar, secNome;
    int numChar, charTotal, secChar, conv;

    System.out.print("Calculo de leitura.");

    System.out.print("Qual o nome completo do Autor: ");
    nomeAutor = input.nextLine().toUpperCase().trim();

    System.out.print("Qual o nome da obra: ");
    obra = input.nextLine();

    System.out.print("Qual a cidade do autor: ");
    cidade = input.nextLine();

    System.out.print("Nome da editora: ");
    editora = input.nextLine();

    System.out.print("Ano de lançamento: \n");
    anoLan = input.nextLine();

    // PEGA O ULTIMO NOME
    charTotal = nomeAutor.length();
    numChar = nomeAutor.lastIndexOf(" ");
    ultimoNome = nomeAutor.substring(numChar, charTotal);

    // PEGA A PRIMEIRA LETRA DO NOME
    priChar = nomeAutor.substring(0, 1);

    // PEGA A SEGUNDA LETRA DO NOME
    secChar = nomeAutor.indexOf(" ");
    conv = secChar + 2;
    secNome = nomeAutor.substring(secChar, conv);

    System.out.print(ultimoNome + ", " + priChar + "." + secNome + ". " + obra + ". " + cidade + ": " + editora + ", "
        + anoLan + ".");

  }
}c