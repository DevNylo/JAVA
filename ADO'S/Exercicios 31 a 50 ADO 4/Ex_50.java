import java.util.Scanner;

class Ex_50 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int ano, calc1, calc2;

    // Ano Bissexto

    System.out.print("Digite um ANO: ");
    ano = input.nextInt();

    calc1 = ano % 4;
    calc2 = ano % 400;
    boolean condi = calc1 == 0 || calc2 == 0;

    System.out.print("O ano é bissexto? " + condi);

  }
}