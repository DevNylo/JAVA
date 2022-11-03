import java.util.Scanner;

class Ex108 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Qual o número? ");
    int numero = input.nextInt();

    String result = primFun(numero);

    System.out.println(result);

  }

  public static String primFun(int numero) {

    int j = 0;
    String msg = "";

    for (int i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        j++;
      }
    }
    if (j == 2) {
      msg = "É um número primo.";
    } else {
      msg = "Não é um número primo.";
    }
    return msg;
  }
}
