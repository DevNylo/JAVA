import java.util.Scanner;

class Ex104{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String texto = input.nextLine().toUpperCase().trim().replace(" ", "");

    boraKodar(texto);
    
  }
  public static void boraKodar(String texto){
    
    int j = 1;
    for (int i = 0; i < texto.length(); i++){
      char digTex = texto.charAt(i);
      System.out.print(digTex);
      if(j < texto.length()){
        System.out.print("-");
      }
      j++;
    }
  }
}