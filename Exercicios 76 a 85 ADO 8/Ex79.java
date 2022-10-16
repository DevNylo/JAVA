import java.util.Scanner;

class Ex79 {
  public static void main(String[] args) {

    double num1, num2;
    String operador, calc;

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    num1 = inputScan.nextDouble();

    System.out.print("Digite o segundo número: ");
    num2 = inputScan.nextDouble();

    System.out.print("Qual o operador: ");
    operador = inputScan.next();

    calc = calcFun(num1, num2, operador);

    System.out.print(calc);
  }

  public static String calcFun(double num1, double num2, String calc) {

    String numberCalc = "";

    if (calc.equalsIgnoreCase("Soma") || calc.equalsIgnoreCase("+")) {
      numberCalc = "Resultado é: " + num1 + num2;
    } else if (calc.equalsIgnoreCase("Subtração") || calc.equalsIgnoreCase("-")) {
      numberCalc = "O resultado é: " + (num1 - num2);
    } else if (calc.equalsIgnoreCase("Multiplicação") || calc.equalsIgnoreCase("*")) {
      numberCalc = "Resultado é: " + num1 * num2;
    } else if (calc.equalsIgnoreCase("Divisão") || calc.equalsIgnoreCase("/")) {
      numberCalc = "Resultado é " + num1 / num2;
    } else if (calc.equalsIgnoreCase("Resto") || calc.equalsIgnoreCase("%")) {
      numberCalc = "Resultado é " + num1 % num2;
    } else if (calc.equalsIgnoreCase("Potência") || calc.equalsIgnoreCase("^")) {
      numberCalc = "Resultado é " + Math.pow(num1, num2);
    } else {
      numberCalc = "Operação não suportada";
    }
    return numberCalc;
  }
}