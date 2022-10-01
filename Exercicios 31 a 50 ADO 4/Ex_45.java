import java.util.Scanner;

class Ex_45 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double numero1, numero2, numero3, numero4, numero5, numero6;

    System.out.println("\nJOGO DA MEGA SENA\n");

    numero1 = Math.round(Math.random() * 60);
    numero2 = Math.round(Math.random() * 60);
    numero3 = Math.round(Math.random() * 60);
    numero4 = Math.round(Math.random() * 60);
    numero5 = Math.round(Math.random() * 60);
    numero6 = Math.round(Math.random() * 60);

    System.out.println("O primeiro número é: " + numero1);
    System.out.println("O segundo número é: " + numero2);
    System.out.println("O terceiro número é: " + numero3);
    System.out.println("O quarto número é: " + numero4);
    System.out.println("O quinto número é: " + numero5);
    System.out.println("O sexto número é: " + numero6);
  }
}
