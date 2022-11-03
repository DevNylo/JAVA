import java.util.Scanner;

class Ex107{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Digite a posição desejada: ");
    int position = input.nextInt();

    fibonacciSeq(position);
  }
  public static void fibonacciSeq(int position){

    int valori = 1;
    int valorj = 0;

    for (int i = 1; i < position; i ++ ){
        valori = valori + valorj;
        valorj = valori - valorj;
    }
    System.out.println((valori));
  }
  
}