import java.util.Scanner;

class Exe3 {
  public static void main(String[] args) {
    
    short gramas;
    double calc;
    Scanner inputScan = new Scanner(System.in);

    System.out.println("Qual o peso do sorvete em GRAMAS? ");
    gramas = inputScan.nextShort();

    calc = functionSupply(gramas);

    if (gramas == 0) {
      System.out.println("Peso inválido!");
    } else {
      System.out.println("“O total a pagar é R$ " + calc);
    }

  }

  public static double functionSupply(short gramasFun) {

    double valor = 0;

    if (gramasFun / 1000 >= 1) {
      valor = (gramasFun / 100) * 3;

    } else {
      valor = (gramasFun / 100) * 3.50;
    }
    return valor;
  }
}