import java.util.Scanner;

class Ex62 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    // Exercício 62 - Média com duas funções;

    double note1, note2, note3, media;
    boolean aprov;

    System.out.print("Qual a PRIMEIRA NOTA: ");
    note1 = inputScan.nextDouble();

    System.out.print("Qual a SEGUNDA NOTA: ");
    note2 = inputScan.nextDouble();

    System.out.print("Qual a TERCEIRA NOTA: ");
    note3 = inputScan.nextDouble();

    media = doubleFun(note1, note2, note3);
    aprov = compararFun(media);

    System.out.println("A média é " + media);
    System.out.println("O aluno passou? " + aprov);

  }

  public static double doubleFun(double note1, double note2, double note3) {
    double mediaNum = (note1 + note2 + note3) / 3;
    return mediaNum;
  }
  public static boolean compararFun (double media){
    boolean comp = media >= 6;
    return comp;
    }
  }
