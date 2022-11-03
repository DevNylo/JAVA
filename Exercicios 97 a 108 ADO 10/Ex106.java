import java.util.Scanner;

class Ex106{
  public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um texto: ");
    String texto = input.nextLine().trim().toUpperCase();

    fraseFun(texto);
    
  }
  public static void fraseFun(String texto){
 
    char digTex = ' ';
    char digTexEsp = ' ';

    int i = 0;
    for (i = 0; i < texto.length(); i++){
      digTex = texto.charAt(i);
    }

    int j = texto.length() - 1;
    for (i = 0 ; j >= i; j--){
      digTexEsp = texto.charAt(j);
  
    }
    if (digTex == digTexEsp ){
        System.out.println("É um palíndromo");
    }else{
        System.out.println("Não é um palíndromo");
    }
  }
}
