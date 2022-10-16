import java.util.Scanner;

class Desafio6 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int i = 1, num, maior = 0;

    while (i <= 10) {
      System.out.print("Digite um número do index(" + i + "): ");
      num = input.nextInt();
      if(num > maior){
        maior = num;
      }
      ++i;
    }
    System.out.print("O maior número é: "+maior);
  }
}