import java.util.Scanner;

class Ex3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num = input.nextInt();

    somarPar(num);
    

  }

  public static void somarPar(int num) {
    int valor = 0;
    int i = 0;
    for (i = 1; i <= num; i++) {
      if (i % 2 == 0) {
        valor = valor + i;
      }
    }
    System.out.print("A soma dos números páres de 1 até " + num + " é " + i);
  }
}