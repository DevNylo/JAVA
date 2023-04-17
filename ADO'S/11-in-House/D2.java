import java.util.Scanner;
import java.util.Random;

class D2 {
  public static void main(String[] args) {

    int i = 1;
    int num = 0;

    Scanner input = new Scanner(System.in);

    int aleatorio = randomFun();
    System.out.println("\nO número ja foi sorteado!");

    String validar = validarFun(aleatorio, num, i);
    System.out.println(validar);
    
  }
  
  public static int randomFun() {
    Random random = new Random();
    int randomInt = random.nextInt(0, 1000);
    return randomInt;
  }

  public static String validarFun(int aleatorio, int num, int i) {

    String msg = "";
    String msgResult = "";
    int tentativas = 9;

    do {
      Scanner input = new Scanner(System.in);

      System.out.print("\nDigite o seu número: ");
      num = input.nextInt();

      if (i == 10) {
        System.out.println("\nSua escolha: " + num + "\nComputador " + aleatorio+"\n");
        msgResult = "Você perdeu.";  
      } else if (aleatorio > num) {
        System.out.println("\nRestam " + tentativas + " tentativas");
        System.out.println("Sua escolha: " + num);
        msgResult = "É menor";
        System.out.println(msgResult);
      } else if (aleatorio < num) {
        System.out.println("\nRestam " + tentativas + " tentativas");
        System.out.println("Sua escolha: " + num);
        msgResult = "É maior";
        System.out.println(msgResult);
      } else {
        System.out.println("\nSua escolha: " + num + "\nComputador " + aleatorio);
        msgResult = "Você venceu!";
        System.out.println("Restando " + tentativas + " tentativas");
      }
      msg = msgResult;
      tentativas--;
      i++;
    } while (i <= 10 && num != aleatorio);
    return msg;
  }
}