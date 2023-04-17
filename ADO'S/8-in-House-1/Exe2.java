import java.util.Scanner;

class Exe2 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    byte dia;
    String mes;
    boolean libra;

    System.out.print("Qual o dia de nascimento: ");
    dia = inputScan.nextByte();
    System.out.print("Digite o mês de nascimento por extenso: ");
    mes = inputScan.next();

    libra = functionSupply(dia, mes);

    System.out.println("“É do signo de Libra? "  + libra);
  }

  public static boolean functionSupply(byte diaFun, String mesFun) {

    boolean libra = diaFun >= 23 && diaFun <= 31 && mesFun.equalsIgnoreCase("Setembro")
                  ||diaFun == 1 && diaFun <= 22 && mesFun.equalsIgnoreCase("Outubro");
    return libra;

  }
}