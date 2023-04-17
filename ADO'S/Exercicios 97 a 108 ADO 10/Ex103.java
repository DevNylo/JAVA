import java.util.Scanner;

class Ex103{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String texto = input.nextLine().trim();

    boraKodar(texto);
    
  }
  public static void boraKodar(String texto){
    
    for (int i = 0; i < texto.length(); i++){
      char digTex = texto.charAt(i);
      System.out.print(digTex);
      System.out.print("-");
    }
  }
}