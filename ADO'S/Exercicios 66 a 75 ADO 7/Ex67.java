import java.util.Scanner;

class Ex67 {
  public static void main(String[] args) {

    String corSemaforo;

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Qual a cor do semáforo: ");
    corSemaforo = inputScan.nextLine();

    String verificar = semaforoFun(corSemaforo);

    System.out.print(verificar);

  }

  public static String semaforoFun(String cor) {

    String corIndex = "";

    if (cor.equalsIgnoreCase("Vermelho")) {
      corIndex = "Espere!";
    } else if (cor.equalsIgnoreCase("Verde")) {
      corIndex = "Atravesse.!";
    } else {
      corIndex = "Farol Inoperante.";
    }
    return corIndex;
  }
}