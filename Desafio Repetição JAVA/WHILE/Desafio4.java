import java.util.Scanner;

class Desafio4{
  public static void main (String[] args){

    Scanner inputScan = new Scanner (System.in);

    int soma = 0;
    int adc;
    int i = 0;

    while (i < 10){
      System.out.println("Digite o valor do index "+i+": ");
      adc = inputScan.nextInt();
      soma = soma + adc;
      i++;
    }
    System.out.print("O resultado é: "+soma);
    
  }
}