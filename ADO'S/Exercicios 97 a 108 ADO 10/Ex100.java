import java.util.Scanner;

class Ex100{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o número inicial: ");
    int num1 = input.nextInt();

    System.out.print("Digite o número final: ");
    int num2 = input.nextInt();

    initFim(num1, num2);
  }
  public static void initFim (int num1, int num2){

    int valor = 0;
    for (int i = 0; num1 <= num2 && i < num2; i++){
      if(num1 % 2 == 0){
        valor = valor + num1;
      }
      num1++;
    }
    System.out.print("A soma dos números pares de "+num1+" até " + num2 + " é " + valor);
  }
} 