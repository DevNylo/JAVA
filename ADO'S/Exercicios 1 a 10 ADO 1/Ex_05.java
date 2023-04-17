import java.util.Scanner;

class Ex_05 {
  public static void main(String[] args) {

    // Exercício 5

    /*
     * A área do quadrado é calculada multiplicando a medida do comprimento pela
     * medida da largura.
     */
    int side, result;

    Scanner areaScan = new Scanner(System.in); // Objeto

    System.out.print("Digite qual o valor: ");
    side = areaScan.nextInt(); // Entrada de valor inteiro

    result = side * side; // Processamento

    System.out.print("A área do quadrado é: " + result); // Resultado
  }
}