import java.util.Scanner;

class Ex109 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int opcao = menuFun();
    do {
      switch (opcao) {
        case 1:
          double somar = somarFun();
          System.out.println("O resultado é: " + somar);
          break;
        case 2:
          double subtrair = subFun();
          System.out.println("O resultado é: " + subtrair);
          break;
        case 3:
          double mult = multFun();
          System.out.println("O resultado é: " + mult);
          break;
        case 4:
          double dividir = divFun();
          System.out.println("O resultado é: " + dividir);
          break;
        case 5:
          double pow = powFun();
          System.out.println("O resultado é: " + pow);
          break;
        case 6:
          double sqrt = sqrtFun();
          System.out.println("O resultado é: " + sqrt);
          break;
        default:
          System.out.println("Opção inválida.");
        continue;

      }

      System.out.print("\nSelecionar opção: ");
      opcao = input.nextInt();

    } while (opcao != 0);
    System.out.println("Fim da execução!");
  }

  public static int menuFun() {

    Scanner input = new Scanner(System.in);
    System.out.println("\n1 - Somar\n");
    System.out.println("2 - Subtrair\n");
    System.out.println("3 - Multiplicar\n");
    System.out.println("4 - Dividir\n");
    System.out.println("5 - Potência\n");
    System.out.println("6 - Raiz Quadrada\n");
    System.out.println("0 - Sair\n");

    System.out.println("Selecionar Opção: ");
    int opcao = input.nextInt();

    return opcao;
  }

  // FUNÇÃO SOMAR
  public static double somarFun() {
    Scanner input = new Scanner(System.in);

    System.out.print("Primeiro valor: ");
    double num1 = input.nextDouble();

    System.out.print("Segundo valor: ");
    double num2 = input.nextDouble();

    double calc = num1 + num2;

    return calc;
  }

  // FUNÇÃO SUBTRAIR
  public static double subFun() {
    Scanner input = new Scanner(System.in);

    System.out.print("Primeiro valor: ");
    double num1 = input.nextInt();

    System.out.print("Segundo valor: ");
    double num2 = input.nextInt();

    double calc = num1 - num2;

    return calc;
  }

  // FUNÇÃO MULTIPLICAR
  public static double multFun() {
    Scanner input = new Scanner(System.in);

    System.out.print("Primeiro valor: ");
    double num1 = input.nextDouble();

    System.out.print("Segundo valor: ");
    double num2 = input.nextDouble();

    double calc = num1 * num2;

    return calc;
  }

  // FUNÇÃO DIVIDIR
  public static double divFun() {
    Scanner input = new Scanner(System.in);

    System.out.print("Primeiro valor: ");
    double num1 = input.nextDouble();

    System.out.print("Segundo valor: ");
    double num2 = input.nextDouble();

    double calc = num1 / num2;

    return calc;
  }

  // FUNÇÃO POTÊNCIA
  public static double powFun() {
    Scanner input = new Scanner(System.in);

    System.out.print("Valor: ");
    double num1 = input.nextDouble();

    System.out.print("Expoente: ");
    double num2 = input.nextDouble();

    double calc = Math.pow(num1, num2);

    return calc;
  }

  // FUNÇÃO RAIZ QUADRADA
  public static double sqrtFun() {
    Scanner input = new Scanner(System.in);

    System.out.print("Raiz de: ");
    double num1 = input.nextDouble();

    double calc = Math.sqrt(num1);

    return calc;
  }
}
