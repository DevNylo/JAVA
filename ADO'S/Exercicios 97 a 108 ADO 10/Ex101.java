import java.util.Scanner;

class Ex101 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Dgite um numero de inicio ");
    int inicio = input.nextInt();

    System.out.println("Digite um numero de fim ");
    int fim = input.nextInt();

    System.out.println("Digite o multiplo ");
    int mul = input.nextInt();

    int recFun = chamFun(inicio, fim, mul);
    System.out.println(recFun);

  }

  public static int chamFun(int in, int fim, int m) {

    int fator = 1;
    for (int i = 1; in <= fim; in++) {
      if (i % m == 0) {
        fator = i * fator;
      }
    }
    return fator;
  }
}