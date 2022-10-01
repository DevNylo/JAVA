import java.util.Scanner;

class Ex_22 {
  public static void main(String[] args) {

    // Exercício 22

    Scanner inputScan = new Scanner(System.in);

    double nota1, nota2, nota3;

    System.out.println("Programa da Média");

    System.out.print("Qual a primeira nota? ");
    nota1 = inputScan.nextDouble();

    System.out.print("Qual a segunda nota?? ");
    nota2 = inputScan.nextDouble();

    System.out.print("Qual a terceira nota? ");
    nota3 = inputScan.nextDouble();

    System.out.println("Verificando se você foi aprovado...");

    boolean result = (nota1 + nota2 + nota3) / 3 >= 6;

    System.out.print("O aluno foi aprovado? " + result);

  }
}