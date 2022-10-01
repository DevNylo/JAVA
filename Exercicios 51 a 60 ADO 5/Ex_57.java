import java.util.Scanner;

class Ex57 {
  public static void main(String[] args) {

    // Exercício 57 - Quadrado da hipotenusa com função.

    Scanner input = new Scanner(System.in);

    double catetoAD, catetoOP, result;

    System.out.print("INFORME O CATETO OPOSTO: ");
    catetoOP = input.nextDouble();
    System.out.print("INFORME O CATETO ADJACENTE: ");
    catetoAD = input.nextDouble();

    result = hipoCalc(catetoAD, catetoOP);

    System.out.print("O quadro da hipotenusa é: " + result);
  }

  public static double hipoCalc(double cateto1, double cateto2) {
    double calc = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
    double raiz = Math.sqrt(calc);
    return raiz;
  }

}
