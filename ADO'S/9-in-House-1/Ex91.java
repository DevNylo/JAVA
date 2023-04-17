import java.util.Scanner;

class Ex91 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    byte dote;

    System.out.print("Digite o a quantidade de esteríscos: ");
    dote = inputScan.nextByte();

    retanFun(dote);
  }

  public static void retanFun(byte dote) {

    byte i = 0;
    while (i < dote) {
      System.out.print("*");
      i++;
    }
  }
}