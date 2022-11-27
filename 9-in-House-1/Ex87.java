import java.util.Scanner;
class Ex87{
  public static void main(String[]args){
    Scanner ler =  new Scanner (System.in);

    System.out.print("Informe o numero do contador");
    int i = ler.nextInt();

    System.out.print("Digite um numero ");
    int n = ler.nextInt();

    int recebe = funcao(i,n);
    System.out.println(recebe);
    
  }
  public static int funcao(int i, int n){
  
    while(i>n){
      System.out.println(i);
      i--;
    }
    return i;
  }
}