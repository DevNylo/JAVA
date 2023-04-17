import java.util.Scanner;

class Ex97 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num = input.nextInt();

    somarFun(num);

  }

  public static void somarFun(int num) {

    int valor = 0;

    for (int i = 1; i <= num; i++) {
      valor = valor + i;
    }
    System.out.println("A soma dos números de 1 á " + num + " é: " + valor);
  }
}