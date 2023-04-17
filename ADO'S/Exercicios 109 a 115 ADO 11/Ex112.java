import java.util.Scanner;
import java.util.Date;
import java.util.Random;

class Ex112 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int count = 1, acertos = 0;
    String digitar = "";

    System.out.print("Quantidade de caracteres: "); // ADD :)
    int qtdCarac = input.nextInt(); // ADD :)

    System.out.print("Quantidade de palavras ");
    int qtdPalavras = input.nextInt();

    String gerar = gerarPalavras(qtdCarac);
    long inicio = tempoInicial();

    while (count <= qtdPalavras) {
      gerar = gerarPalavras(qtdCarac);
      System.out.println(gerar);

      System.out.print("\nReescreva! ");
      digitar = input.next();

      if (gerar.equalsIgnoreCase(digitar)) {
        acertos = acertos + 1;
      }
      count++;
    }
    System.out.println("Seu teste terminou!");
    String precisao = precisaoFun(qtdPalavras, acertos);
    String tempo = tempoGasto(inicio);
    System.out.print("Precisão: " + precisao); // EXIBE PRECISÃO
    System.out.print("Tempo: " + tempo); // EXIBE TEMPO DECORRIDO.

  }
// IRÁ GERAR UMA CONSOANTE E UMA VOGAL EM SEQUENCIA COMO UMA STRING;
  public static String gerarPalavras(int qtdCarac) {

    Random random = new Random();

    String consoantes = "bcdfghjklmnpqrstvwxyz";
    String vogais = "aeiou";

    String novaPalavra = "";
    
    for (int i = 0; i < qtdCarac; i++) {
      char letra = ' ';
      if (i % 2 == 0) {
        letra = consoantes.charAt(random.nextInt(0, 20));
      } else {
        letra = vogais.charAt(random.nextInt(0, 4));
      }
      novaPalavra += letra;
    }
    return novaPalavra; 
  }
// PEGA O TEMPO DE INÍCIO
  public static long tempoInicial() { 
    long inicio = new Date().getTime();
    return inicio;
  }
// CALCULA O TEMPO FINAL
  public static String tempoGasto(long tempoInicial) { 

    String segundos = "seg.";
    double fim = new Date().getTime();
    double tempo = (fim - tempoInicial) / 1000;
    return tempo + segundos;

  }
// COMPARA E EXIBE O RESULTADO.
  public static String precisaoFun(int qtdPalavras, int acertos) { 
    String resultado = "% - ";
    double calc = (acertos * 100) / (double) qtdPalavras;
    return (int) calc + resultado;
  }
}