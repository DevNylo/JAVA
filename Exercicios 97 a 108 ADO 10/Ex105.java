import java.util.Scanner;

class Ex105{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String texto = input.nextLine().trim();

    boraKodar(texto);
    
  }
  public static void boraKodar(String texto){
    
    int j = texto.length() - 1;
    for (int i = 0 ; j >= i; j--){
      char digTex = texto.charAt(j);
      System.out.print(digTex);
  
    }
  }
}