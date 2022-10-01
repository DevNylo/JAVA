import java.util.Scanner;

class Ex_01 {
  public static void main(String[] args) {

    // Exercício 1

    Scanner numberScan = new Scanner(System.in);

    int firstNum, secondNum, calc;

    System.out.println("-----------------------");
    System.out.println("SOMA AÍ");
    System.out.println("------------------------");

    System.out.print("Digite o primeiro valor: "); // Primeira entrada
    firstNum = numberScan.nextInt();

    System.out.print("Digite o segundo valor: "); // Segunda entrada
    secondNum = numberScan.nextInt();

    calc = firstNum + secondNum; // Processamento

    System.out.print("A soma de " + firstNum + " + " + secondNum + " é: " + calc);

  }
}