import java.util.Scanner;

class Ex93 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    byte base, altura, result;

    System.out.print("Digite o valor da BASE: ");
    base = inputScan.nextByte();

    System.out.print("Digite o valor da ALTURA: ");
    altura = inputScan.nextByte();

    retanFun(base, altura);
  }

  public static void retanFun(byte base, byte altura) {

    byte colunas = 0;
    byte linhas = 0;
    while (linhas < altura) {
      while (colunas < base) {
        System.out.print("*");
        colunas++;
      }
      colunas = 0;
      System.out.println("*");
      linhas++;
    }
  }
}