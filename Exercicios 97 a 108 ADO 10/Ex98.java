import java.util.Scanner;

class Ex98 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Dgite um numero");
    int number = input.nextInt();

    int recFun = chamFun(number);

    System.out.printf("O fatoriado de %d é %d ", number, recFun);

  }

  public static int chamFun(int num) {

    int fator = 1;

    for (int i = 1; i <= num; i++) {
      fator = i * fator;

    }
    return fator;
  }
}