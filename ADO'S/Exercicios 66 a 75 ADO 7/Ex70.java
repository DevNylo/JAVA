import java.util.Scanner;

class Ex70 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    // Exercício 70 - Escrever o mês.
    
    byte mesNum;
    String mes;

    System.out.println("\nMẼS POR EXTENSO\n");

    System.out.println(
        "1 = JANEIRO \n2 = FEVEREIRO \n3 = MARÇO \n4 = ABRIL \n5 = MAIO \n6 = JUNHO \n7 = JULHO \n8 = AGOSTO \n9 = SETEMBRO \n10 = OUTUBRO \n11 = NOVEMBRO \n12 = DEZEMBRO \n");

    System.out.print("Qual o MẼS de (1 a 12): ");
    mesNum = inputScan.nextByte();

    mes = mesFun(mesNum);
    System.out.println(mes);

  }

  public static String mesFun(byte mes) {
    String mesNum = "";
    if (mes == 1) {
      mesNum = "\nJANEIRO\n";
    } else if (mes == 2) {
      mesNum = "\nFEVEREIRO\n";
    } else if (mes == 3) {
      mesNum = "\nMARÇO\n";
    } else if (mes == 4) {
      mesNum = "\nABRIL\n";
    } else if (mes == 5) {
      mesNum = "\nMAIO\n";
    } else if (mes == 6) {
      mesNum = "\nJUNHO\n";
    } else if (mes == 7) {
      mesNum = "\nJULHO\n";
    } else if (mes == 8) {
      mesNum = "\nAGOSTO\n";
    } else if (mes == 9) {
      mesNum = "\nSETEMBRO\n";
    } else if (mes == 10) {
      mesNum = "\nOUTUBRO\n";
    } else if (mes == 11) {
      mesNum = "\nNOVEMBRO\n";
    } else if (mes == 12) {
      mesNum = "\nDEZEMBRO\n";
    } else {
      mesNum = "\nMês inválido.\n";
    }
    return mesNum;
  }
}