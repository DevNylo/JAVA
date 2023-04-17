import java.util.Scanner;

class Ex_42 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String nome, msgCut;
    int msgIndex, msgLength;

    System.out.println("Mensagem de boas-vindas!");

    System.out.print("Digite seu nome completo: ");
    nome = input.nextLine().trim();

    msgIndex = nome.lastIndexOf(" ");
    msgLength = nome.length();
    msgCut = nome.substring(msgIndex, msgLength);

    System.out.print("Seja bem-vindo" + msgCut);

  }
}
