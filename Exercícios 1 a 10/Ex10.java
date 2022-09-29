import java.util.Scanner;

class Ex10 {
  public static void main(String[] args) {

    // Exercício 10

    double firstNote, secNote, thirNote, fourthNote, fiftNote, media; // Variáveis

    Scanner mediaScanner = new Scanner(System.in); // Obj

    System.out.print("Qual a PRIMEIRA nota? ");
    firstNote = mediaScanner.nextDouble(); // Entrada valor 1

    System.out.print("Qual a SEGUNDA nota? ");
    secNote = mediaScanner.nextDouble(); // Entrada valor 2

    System.out.print("Qual a TERCEIRA nota? ");
    thirNote = mediaScanner.nextDouble(); // Entrada valor 3

    System.out.print("Qual a QUARTA nota? ");
    fourthNote = mediaScanner.nextDouble(); // Entrada valor 4

    System.out.print("Qual a QUINTA nota? ");
    fiftNote = mediaScanner.nextDouble(); // Entrada valor 5

    media = (firstNote + secNote + thirNote + fourthNote + fiftNote) / 5; // Processamento

    System.out.print("A média é " + media); // Saída.
  }
}