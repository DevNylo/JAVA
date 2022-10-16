import java.util.Scanner;

class Desafio5{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num, i = 1;

    System.out.print("Digite um numero: ");
    num = input.nextInt();

    while (i <= 10) {
      System.out.println(num + " x " + i + " = " + num * i);
      i++;
    }
  }
}