import java.util.Scanner;

class Ex4 {
  public static void main(String[] args) {

    // Exercício 4

    Scanner numberScan = new Scanner(System.in); // Obj

    int num; // A entrada deverá ser um numero inteiro.
    double result; // A saída será um número real confome PDF.
    System.out.print("Digite um valor: ");
    num = numberScan.nextInt(); // Entrada

    result = num / 2; // Processamento
    System.out.print("A metado de " + num + " é: " + result); // Saída

  }

}