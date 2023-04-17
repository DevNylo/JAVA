import java.util.Scanner;

class Ex_36 {
  public static void main(String[] args) {
    // Exercício 36

    Scanner input = new Scanner(System.in);

    double imc, altura, peso;

    System.out.println("Calculando IMC");

    System.out.print("Qual a sua altura: ");
    altura = input.nextDouble();

    System.out.print("Qual o seu peso: ");
    peso = input.nextDouble();

    imc = peso / Math.pow(altura, 2);

    System.out.printf("Seu IMC é: %.0f", imc);

  }
}