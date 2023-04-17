import java.util.Scanner;

class Ex_41 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int mes;
    boolean comparar;

    System.out.println("PRIMEIRO SEMESTRE");

    System.out.print("Qual número que representa o mês que você se encontrar: ");
    mes = input.nextInt();
    
    comparar = mes >=1 && mes <= 6;

    System.out.print("É primeiro semestre? "+comparar);
    
  }
}
