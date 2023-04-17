import java.util.Scanner;

class Ex_39 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double temperatura;

    System.out.println("Programa do Tempo\n ");

    System.out.print("Qual é a previsão do tempo ");
    temperatura = input.nextDouble();

    boolean previsao = temperatura >= 23 && temperatura <= 30;

    System.out.println(" Vamos ao parque? " + previsao);

  }
}