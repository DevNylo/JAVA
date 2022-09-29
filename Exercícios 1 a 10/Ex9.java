import java.util.Scanner;

class Ex_09 {
  public static void main(String[] args) {

    // Exercício 9

    double firstNote, secNote, thirNote, media; // Var

    Scanner mediaScan = new Scanner(System.in); // Obj

    System.out.print("Qual a PRIMEIRA nota? ");
    firstNote = mediaScan.nextDouble(); // Entrada valor 1

    System.out.print("Qual a SEGUNDA nota? ");
    secNote = mediaScan.nextDouble(); // Entrada valor 2

    System.out.print("Qual a TERCEIRA nota? ");
    thirNote = mediaScan.nextDouble(); // Entrada valor 3

    media = (firstNote + secNote + thirNote) / 3; // Processamento

    System.out.print("A média é " + media); // Saída com result.
  }
}