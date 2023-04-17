import java.util.Random;
import java.util.Scanner;

class D5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int comprarP1 = 1;
    int comprarP2 = 1;
    int resultP1 = 0;
    int resultP2 = 0;

    String mostrarNum = numCarta(); // Chama números de cartas.
    String mostrarNaipe = naipeCarta(); // Chama naipe de cartas.
    int pontos = pontuacao(mostrarNum); // Recebe a carta e define a pontuação dela
    int calcPontos = calcPontuacao(mostrarNum, pontos); // Calcular pontuação.

    if (comprarP1 == 1 && comprarP2 == 1) {
      desenho();
      System.out.println("Jogador 1, sua vez de jogar.");

      do {
        System.out.println("\n1 - COMPRAR");
        System.out.println("2 - PARAR");
        comprarP1 = input.nextInt();

        mostrarNum = numCarta();
        mostrarNaipe = naipeCarta();

        if (comprarP1 == 1) {
          System.out.println("Carta comprada " + mostrarNum + mostrarNaipe);
          calcPontos = calcPontuacao(mostrarNum, pontos);
          resultP1 = resultP1 + calcPontos;
        }
      } while (comprarP1 == 1);

      clearConsole();
      desenho();

      System.out.println("Jogador 2, sua vez de jogar.");

      do {
        System.out.println("\n1 - COMPRAR");
        System.out.println("2 - PARAR");
        comprarP2 = input.nextInt();

        mostrarNum = numCarta();
        mostrarNaipe = naipeCarta();

        if (comprarP2 == 1) {
          System.out.println("Carta comprada " + mostrarNum + mostrarNaipe);
          calcPontos = calcPontuacao(mostrarNum, pontos);
          resultP2 = resultP2 + calcPontos;
        }
      } while (comprarP2 == 1);
    }
    if (resultP1 >= 21 && resultP1 < resultP2 || resultP1 <= 21 && resultP1 > resultP2
        || resultP1 <= 21 && resultP2 > 21) {
      System.out.println("\n---------\n");
      System.out.println("\nResultado: Jogador 1 venceu!\n");
      System.out.println("Jogador 1: " + resultP1);
      System.out.println("Jogador 2: " + resultP2);
    } else if (resultP2 >= 21 && resultP2 < resultP1 || resultP2 <= 21 && resultP2 > resultP1
        || resultP2 <= 21 && resultP1 > 21) {
      System.out.println("\n---------\n");
      System.out.println("\nResultado: Jogador 2 venceu!\n");
      System.out.println("Jogador 1: " + resultP1);
      System.out.println("Jogador 2: " + resultP2);
    } else {
      System.out.println("\nEmpate!\n");
      System.out.println("Jogador 1: " + resultP1);
      System.out.println("Jogador 2: " + resultP2);
    }
  }

  public static String numCarta() {

    Random random = new Random();
    int numRandom = random.nextInt(1, 13);

    String escolha = "";

    switch (numRandom) {
      case 1:
        escolha = "1";
        break;
      case 2:
        escolha = "2";
        break;
      case 3:
        escolha = "3";
        break;
      case 4:
        escolha = "4";
        break;
      case 5:
        escolha = "5";
        break;
      case 6:
        escolha = "6";
        break;
      case 7:
        escolha = "7";
        break;
      case 8:
        escolha = "8";
        break;
      case 9:
        escolha = "9";
        break;
      case 10:
        escolha = "10";
        break;
      case 11:
        escolha = "J";
        break;
      case 12:
        escolha = "Q";
        break;
      case 13:
        escolha = "K";
        break;
      default:
        escolha = "Inválido";
    }
    return escolha;
  }

  public static String naipeCarta() {
    Random random = new Random();
    int numRandom = random.nextInt(1, 4);

    String escolha = "";

    switch (numRandom) {
      case 1:
        escolha = " ♠";
        break;
      case 2:
        escolha = " ♣";
        break;
      case 3:
        escolha = " ♥";
        break;
      case 4:
        escolha = " ♦";
        break;
      default:
        escolha = "Inválido";
    }
    return escolha;
  }

  public static int pontuacao(String mostrarNum) {

    int pontos = 0;

    switch (mostrarNum) {
      case "1":
        pontos = 1;
        break;
      case "2":
        pontos = 2;
        break;
      case "3":
        pontos = 3;
        break;
      case "4":
        pontos = 4;
        break;
      case "5":
        pontos = 5;
        break;
      case "6":
        pontos = 6;
        break;
      case "7":
        pontos = 7;
        break;
      case "8":
        pontos = 8;
        break;
      case "9":
        pontos = 9;
        break;
      case "10":
        pontos = 10;
        break;
      case "J":
        pontos = 10;
        break;
      case "Q":
        pontos = 10;
        break;
      case "K":
        pontos = 10;
        break;
    }
    return pontos;

  }

  public static int calcPontuacao(String carta, int calc) {

    switch (carta) {
      case "1":
        calc = 1;
        break;
      case "2":
        calc = 2;
        break;
      case "3":
        calc = 3;
        break;
      case "4":
        calc = 4;
        break;
      case "5":
        calc = 5;
        break;
      case "6":
        calc = 6;
        break;
      case "7":
        calc = 7;
        break;
      case "8":
        calc = 8;
        break;
      case "9":
        calc = 9;
        break;
      case "10":
        calc = 10;
        break;
      case "J":
        calc = 10;
        break;
      case "Q":
        calc = 10;
        break;
      case "K":
        calc = 10;
        break;
    }
    return calc;
  }

  public final static void clearConsole() {
    System.out.print("\n\nPressione ENTER para limpar: ");
    new Scanner(System.in).nextLine();

    System.out.print("\033[H\033[\2J");
    System.out.flush();
  }

  public final static void desenho() {

    System.out.println("\n   ===================================   ");
    System.out.println("  =============------------============");
    System.out.println("===========    BLACKJACK 21    ==========");
    System.out.println("  =============------------============");
    System.out.println("   ===================================   \n");

  }
}