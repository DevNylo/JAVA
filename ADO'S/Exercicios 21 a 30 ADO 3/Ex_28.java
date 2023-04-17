import java.util.Scanner;

class Ex_28 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    String book;
    int totalPag, seconds;
    double result;

    System.out.print("Qual o nome do livro? ");
    book = inputScan.nextLine();

    System.out.print("O livro contém quantas páginas? ");
    totalPag = inputScan.nextInt();

    System.out.print("Em quantos segundos você consegue ler cada página? ");
    seconds = inputScan.nextInt();

    result = (totalPag * seconds) / 3600;

    System.out.print("Você lerá " + book + " em " + result + " horas");

  }
}