import java.util.Scanner;
class Ex2{
  public static void main(String[]args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Dgite um numero");
    int nuber = ler.nextInt();

    int recFun= chamFun(nuber);

    System.out.printf("O fatoriado de %d é %d ",nuber,recFun);
  }
  public static int chamFun(int num){
    //int i = 1;
    int fator = 1;
    for(int i = 1;i<=num;i++){
      fator = i*fator;
    }
    return fator;
  }
}