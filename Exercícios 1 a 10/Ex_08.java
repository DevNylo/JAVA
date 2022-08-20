import java.util.Scanner;

class Ex_08 {
  public static void main(String[] args) {

    // Exercício 8
    
    // O perímetro do octógono é o valor de um lado * 8 basicamente.

    Scanner octScan = new Scanner(System.in);

    int side, result;

    System.out.print("Digite qual o comprimento de um único lado do octógono: ");
    side = octScan.nextInt(); // Entrada

    result = side * 8; // Processamento

    System.out.print("O perímetro do octágono é: " + result); // Saída
  }
}