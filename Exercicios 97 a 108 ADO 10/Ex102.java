import java.util.Scanner;

class Ex102 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num = input.nextInt();

    System.out.print("Qual o expoente: ");
    int expo = input.nextInt();

    if (num < 0) {
      System.out.println("Calculo inválido");
    } else {
      expoFun(num, expo);
    }
  }

  public static void expoFun(int num, int expo) {

    int valor = 1;

    for (int i = 1; i <= expo; i++) {
      if (num >= 0) {
        valor = valor * num;
      }else{
        valor = 1;
      }
    }
    System.out.print(num + " Elevado a " + expo + " é " + valor);
  }
}