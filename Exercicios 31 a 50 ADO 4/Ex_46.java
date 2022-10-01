import java.util.Scanner;

public class Ex_46 {
  public static void main(String args[]) {
    Scanner inputScan = new Scanner(System.in);

    // Equação do segundo grau.

    int delta, a, b, c;
    double x1, x2, raiz;

    System.out.print("Qual o valor de A: ");
    a = inputScan.nextInt();

    System.out.print("Qual o valor de B: ");
    b = inputScan.nextInt();

    System.out.print("Qual o valor de C: ");
    c = inputScan.nextInt();

    delta = b * b - 4 * a * c;
    raiz = Math.sqrt(delta);

    if (delta >= 0) {

      x1 = ((-b) + raiz) / (2 * a);
      x2 = ((-b) - raiz) / (2 * a);
      System.out.println("Os valores para x são " + x1 + " e " + x2);

    } else {
      System.out.print("Delta é menor que 0;");

    }
  }
}