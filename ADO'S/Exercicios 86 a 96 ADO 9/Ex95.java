import java.util.Scanner;

class Ex95 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String msg = inputScan.nextLine();

    soletrar(msg);
  }

  public static void soletrar(String msg) {
    byte i = 0;
    while (i <= msg.length() - 1) {
      char mensagem = msg.charAt(i);
      System.out.println(mensagem);
      i++;
    }
  }
}