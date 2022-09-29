import java.util.Scanner;

class Ex6 {
  public static void main(String[] args) {

    // Exercício 6

    int base, heigth, result; // Atribuição do tipo e variáveis

    Scanner retanScan = new Scanner(System.in); // Obj

    System.out.print("Qual o valor da base do retângulo: ");
    base = retanScan.nextInt(); // Entrada

    System.out.print("Qual o valor da altura do retângulo: ");
    heigth = retanScan.nextInt(); // Entrada

    result = base * heigth; // Processamento das variáveis

    System.out.print("A área do retângulo (" + base + " por " + heigth + ") é " + result); // Saída

  }
}