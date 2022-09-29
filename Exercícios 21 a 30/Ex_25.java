import java.util.Scanner;

class Ex_25 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String person = "Chandler";
    String resposta;
    
    System.out.print("Qual o personagem de Friends que trabalha com TI: ");
    resposta = input.nextLine();

    boolean condiction = resposta.trim().equalsIgnoreCase(person);

    System.out.println("A resposta está certa? "+condiction);
    
  }
}