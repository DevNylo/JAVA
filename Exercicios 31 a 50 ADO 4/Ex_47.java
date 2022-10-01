import java.util.Scanner;

class Ex_47 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Progressão Geométrica
    
    double priPos, razao, an, n, calc;
    
    
    System.out.print("Digite o valor da PRIMEIRA POSIÇÃO: ");
    priPos = input.nextDouble();
    
    System.out.print("Digite o valor da RAZÃO: ");
    razao = input.nextDouble();
    
    System.out.print("Qual a posição desejada? ");
    n = input.nextDouble();
    
    an = n - 1;
    calc = priPos * Math.pow(razao, an); 

    System.out.print("O valor do termo na posição "+n+" é "+calc);
  }
}