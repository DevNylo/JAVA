import java.util.Scanner;

class Ex_32 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    // Exercício 32

    String userName, userNameCut;
    int userNameIndex;

    System.out.println("Programa das boas vindas");

    System.out.print("Digite seu nome completo: ");
    userName = inputScan.nextLine().trim();

    userNameIndex = userName.indexOf(" ");
    userNameCut = userName.substring(0, userNameIndex);

    System.out.print("Seja bem-vindo " + userNameCut + "!");

  }
}