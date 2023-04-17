import java.util.Scanner;

class Ex_35 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Exercíco 35

    double oposto, adjacente, calc;

    System.out.println("Descobrindo o valor da HIPOTENUSA");

    System.out.print("Digite o valor do CATETO OPOSTO: ");
    oposto = input.nextDouble();

    System.out.print("Dgite o valor do CATETO ADJACENTE: ");
    adjacente = input.nextDouble();

    calc = Math.sqrt(
        oposto * oposto +
        adjacente * adjacente);

    System.out.println("A hipotenusa é " + calc);

  }
}
