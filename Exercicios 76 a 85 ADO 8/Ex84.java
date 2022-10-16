import java.util.*;

class Ex84 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    // Exercício 84 - Ímpar ou pá

    System.out.println("Ímpar ou par?");
    String par = inputScan.next();

    System.out.println("Digite o número");
    int num = inputScan.nextInt();
    int bot = aleat();
    String jogo = imp(par, num);
    System.out.println("Jogador escolheu " + par);
    System.out.print("Jogador " + num);
    System.out.println(" x " + bot + " maquina");
    System.out.println(jogo);
  }

  public static String imp(String jogada, int numero) {
    Random rand = new Random();
    int bot = rand.nextInt(1, 5);
    String sout = "";
    double par = (numero + bot) % 2;

    if ((jogada.equalsIgnoreCase("par")) && (par == 0)) {
      sout = "Jogador venceu";
    } else if ((jogada.equalsIgnoreCase("impar")) && (par == 1)) {
      sout = "jogador venceu";
    } else {
      sout = "Maquina venceu";
    }
    return sout;
  }

  public static int aleat() {
    Random l = new Random();
    int bot = l.nextInt(1, 5);
    return bot;
  }
}