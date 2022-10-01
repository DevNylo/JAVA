import java.util.Scanner;

class Ex_27 {
  public static void main(String[] args) {

    // Exercício 27

    Scanner inputScan = new Scanner(System.in);
    double peso, altura, imc;
    boolean pesoIdeal;

    System.out.println("CALCULANDO IMC");
    System.out.println("-----------------------");

    System.out.print("Digite o seu peso: ");
    peso = inputScan.nextDouble();

    System.out.print("Digite sua altura: ");
    altura = inputScan.nextDouble();

    imc = peso / (altura * altura);
    pesoIdeal = imc > 23 && imc < 25;

    System.out.println("Seu IMC é " + imc);
    System.out.println("Você está acima do peso ideal? " + pesoIdeal);

  }
}