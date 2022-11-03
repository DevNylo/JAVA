import java.util.Scanner;

class Ex96 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);

      System.out.println("Digite sua frase: ");
      String frase = input.nextLine();

      System.out.println();

      soletrarFun(frase);
  }

  
  public static void soletrarFun(String mensagem){
      int contLetras = 1;
      int posicao = 0;
      
      while(posicao < mensagem.length()){
          char letra = mensagem.charAt(posicao);
          if (letra == ' ') {
              System.out.println("Espaço");
          } else {
              System.out.println("Letra " + contLetras + " = " + letra);
              contLetras++;
          }
          posicao++;
    }
  }
}