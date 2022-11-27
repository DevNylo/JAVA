import java.util.Scanner;

class Ex94 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    byte num, i = 1;

    System.out.print("Digite um numero: ");
    num = inputScan.nextByte();

    while (i <= 10) {
      System.out.println(num + " x " + i + " = " + num * i);
      i++;
    }
  }
}