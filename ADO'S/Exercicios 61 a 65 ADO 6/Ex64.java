import java.util.Scanner;

class Ex64 {
  public static void main(String[] args) {

    // Exercício 64 - Implementar um programa em Java para verificar se duas cores
    // são primárias.

    String cor1, cor2, comparar;

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Qual a primeira cor? ");
    cor1 = inputScan.nextLine().trim().toLowerCase();

    System.out.print("Qual a segunda cor? ");
    cor2 = inputScan.nextLine().trim().toLowerCase();

    boolean primaria1 = coresFun(cor1);
    boolean primaria2 = coresFun(cor2);
    boolean verificar = verificarFun(primaria1, primaria2);

    System.out.print("As duas cores são primárias? " + verificar);
  }

  public static boolean coresFun(String cor) {
    boolean coresPrim = cor.equals("amarelo")
                     || cor.equals("vermelho")
                     || cor.equals("azul");
    return coresPrim;
  }

  public static boolean verificarFun(boolean cor1, boolean cor2) {
    boolean cores = cor1 == true && cor2 == true;
    return cores;
  }
}