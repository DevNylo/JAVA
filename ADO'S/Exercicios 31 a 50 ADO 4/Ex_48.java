import java.util.Scanner;

class Ex_48 {
  public static void main(String[] args) {
    
    // Verificando se as cores são primárias

    Scanner input = new Scanner(System.in);

    String cor;
    boolean condiction;

    System.out.print("Qual a cor você deseja verificar? ");
    cor = input.nextLine();

    condiction = cor.equalsIgnoreCase("Azul") || cor.equalsIgnoreCase("Amarelo") || cor.equalsIgnoreCase("Vermelho");

    System.out.println("É cor primária? " + condiction);
  }
}