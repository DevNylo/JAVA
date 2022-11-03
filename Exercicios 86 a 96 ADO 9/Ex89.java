import java.util.Scanner;
class Ex89{
  public static void main(String[]args){
    Scanner ler =  new Scanner (System.in);

    System.out.print("Digite um numero do contador ");
    int i = ler.nextInt();

    System.out.print("Digite um numero ");
    int n = ler.nextInt();

    int recebe = f(i,n);
    System.out.println(recebe);
    
  }
  public static int f(int i,int n ){
    
    while(i>n){
      System.out.println(i);
      i--;
    }
    return i;
  }
}