import java.util.Scanner;

class Ex_55 {
  public static void main(String[] args) {

    // Exercício 55 - Temperatura com funções.

    Scanner input = new Scanner(System.in);
    double temperatura;
    boolean result;

    System.out.print("Qual a temperatura: ");
    temperatura = input.nextDouble();

    result = calc(temperatura);

    System.out.print("Está com febre? " + result);
  }

  public static boolean calc(double temp) {
    boolean verificar = temp >= 37.3;
    return verificar;
  }

}
