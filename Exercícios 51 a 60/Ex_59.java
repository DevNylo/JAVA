import java.util.Scanner;

class Ex_59 {
  public static void main(String[] args) {

    // Exercício 59 - Programa do fanho com funções

    Scanner inputScan = new Scanner(System.in);

    String phrase, convert, charSpec;

    System.out.println("PROGRAMA DO FANHO COM FUNÇÕES");

    System.out.print("Digite qualquer frase para Java Fanho traduzir: ");
    phrase = inputScan.nextLine();

    convert = tradutorFun(phrase);

    System.out.println(convert);
  }

  public static String tradutorFun(String phraseFun) {
    String convert = phraseFun
        .replace("a", "i")
        .replace("á", "i")
        .replace("A", "i")
        .replace("e", "i")
        .replace("é", "i")
        .replace("E", "i")
        .replace("í", "i")
        .replace("I", "i")
        .replace("o", "i")
        .replace("ó", "i")
        .replace("u", "i")
        .replace("ú", "i");
    return convert;
  }
}