import java.util.Scanner;

class Ex_26 {
  public static void main(String[] args) {

    // Exercício 26

    Scanner inputScan = new Scanner(System.in);

    String semaforo;
    boolean autho;

    System.out.println("Qual a cor exibida no semáforo? ");
    semaforo = inputScan.nextLine();

    autho = semaforo.equalsIgnoreCase("Verde");

    System.out.print("Pode atravessar? " + autho);

    /*
     * if (semaforo.equalsIgnoreCase(verde)) {
     * System.out.print("Atravesse.");
     * } else if (semaforo.equalsIgnoreCase(amarelo)) {
     * System.out.print("Aguarde um pouco.");
     * } else {
     * System.out.print("Não atravesse!");
     * }
     */
  }
}