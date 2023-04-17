import java.util.Scanner;

class Ex_07 {
  public static void main(String[] args) {

    // Exercício 7

    double base, heigth, result; // var

    Scanner triScan = new Scanner(System.in); // Obj

    System.out.print("Digite o valor da BASE do triângulo: ");
    base = triScan.nextDouble(); // Entrada de valor

    System.out.print("Digite o valor da ALTURA do triângulo: ");
    heigth = triScan.nextDouble(); // Entrada de valor

    result = (base * heigth) / 2; // Processamento

    System.out.print("A área do triângulo é: " + result); // Saída

  }
}