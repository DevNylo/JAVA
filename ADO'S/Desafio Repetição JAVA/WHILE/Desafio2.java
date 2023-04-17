import java.util.Scanner;

class Desafio2 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);
    
    byte n;
    
    System.out.print("Digite um número: ");
    n = inputScan.nextByte();

    byte i = 0;
    while (i < n) {
      System.out.println(i); 
      i++;
    }
  }
}