import java.util.*;

class Ex131{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o tamanho do array");
    int n = ler.nextInt();

    int[] fibo = Fibonacci(n);

    System.out.println("A sequência do Fibonacci com " +n+ " números é:");
    Exibir(fibo);
    
  }
  public static void Exibir(int[] arr){
    for(int item: arr){
      System.out.println(item);
    }
  }
  public static int[] Fibonacci(int num){
    int[] fibo = new int[num];
    
    int atual = 1, anterior = 0, fibon = 0, soma = 0;

      while(fibon < num){
        soma = atual + anterior;
        anterior = atual;
        atual = soma;

        fibo[fibon] = soma;
        fibon++;
      }
    return fibo;
  }
}