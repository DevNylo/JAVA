import java.util.Scanner;
class Ex5{
  public static void main(String[]args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Dgite um numero de inicio ");
    int inicio = ler.nextInt();

    System.out.println("Digite um numero de fim");
    int fim = ler.nextInt();

    System.out.println(" Digite o multiplo ");
    int mul = ler.nextInt();

    int recFun= chamFun(inicio,fim,mul);
    System.out.println(recFun);

    //System.out.printf("O fatoriado de %d é %d ",nuber,recFun);
  }
  public static int chamFun(int in, int fim, int m){
    //int i = 1;
    int fator = 1;
    for(int i=1;in<=fim;in++){
      if(i%m==0){
        fator = i*fator;
      }
    }
    return fator;
  }
}