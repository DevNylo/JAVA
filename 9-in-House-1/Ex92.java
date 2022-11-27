import java.util.Scanner;

class Ex92 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    byte dote, result;

    System.out.print("Digite o a quantidade de esteríscos: ");
    dote = inputScan.nextByte();

    retanFun(dote);
  }

  public static void retanFun(byte dote) {

    byte colunas = 0;
    byte linhas = 0;
    while (linhas < dote) {
      while (colunas < dote) {
        System.out.print("*");
        colunas++;
      }
      colunas = 0;
      System.out.println("*");
      linhas++;
    }
  }
}