import java.util.Scanner;

public class D7 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    /// INCOMPLETO

    System.out.print("Informe a palavra: ");
    String palavra = input.next().toLowerCase();

    // LIMPAR TELA

    int tentativas = 5;

    String descPalavra = palavra;

    while (tentativas != 0 && descPalavra.length() != 0) {

      System.out.print("Descubra a palavra: ");

      String letra = input.next().substring(0, 1).toLowerCase();

      if (descPalavra.indexOf(letra) >= 0) {

        String[] faltantes = descPalavra.split(letra);
        descPalavra = String.join("", faltantes);

        System.out.println("Faltam " + descPalavra.length() + " letras!");
        System.out.println(forcaBonito(descPalavra, palavra));
      } else {
        System.out.println("Você errou.");
        tentativas -= 1;
      }
    }

    if (tentativas == 0) {
      System.out.println("Você perdeu!");
    } else {
      System.out.println("Você ganhou!");
    }

    System.out.println("A palavra era: " + palavra);
  }

  static String forcaBonito(String faltantes, String palavra) {
    StringBuilder forca = new StringBuilder();

    for (String charPal : palavra.split("")) {
      if (faltantes.contains(charPal)) {
        forca.append("_");
      } else {
        forca.append(charPal);
      }
    }
    return forca.toString();
  }
}