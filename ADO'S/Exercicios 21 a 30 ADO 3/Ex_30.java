import java.util.Scanner;
//import java.text.DecimalFormat;

class Ex_30 {
  public static void main(String[] args) {

    // Exercício 30

    Scanner inputScan = new Scanner(System.in);
    // DecimalFormat formatar = new DecimalFormat("#.##");

    double firRad, firHeight, secRad, secHeight, firCylinder, secCylinder, calcRad1, calcRad2;

    System.out.println("Programa dos CILINDROS");

    System.out.println("PRIMEIRO CILINDRO");

    System.out.print("Digite o valor do RAIO ");
    firRad = inputScan.nextDouble();

    System.out.print("Digite o valor da ALTURA ");
    firHeight = inputScan.nextDouble();

    System.out.println("------------------------------");

    System.out.println("SEGUNDO CILINDRO");

    System.out.print("Digite o valor do RAIO ");
    secRad = inputScan.nextDouble();

    System.out.print("Digite o valor da ALTURA ");
    secHeight = inputScan.nextDouble();

    calcRad1 = firRad / 2;
    calcRad2 = secRad / 2;
    firCylinder = Math.PI * calcRad1 * calcRad1 * firHeight;
    secCylinder = Math.PI * calcRad2 * calcRad2 * secHeight;
    boolean result = firCylinder <= secCylinder;

    System.out.println("O primeiro CILINDRO tem VOLUME " + firCylinder + "cm³");
    System.out.println("O segundo CILINDRO tem VOLUME " + secCylinder + "cm³");
    System.out.print("É possível transferir o primeiro para o segundo? " + result);

  }
}
