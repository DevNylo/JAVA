import java.util.Scanner;

class Ex_33 {
  public static void main(String[] args) {

    Scanner inputScan = new Scanner(System.in);

    String phrase, convert, charSpec;

    System.out.println("PROGRAMA DO FANHO");

    System.out.println(" ");
    System.out.print("Digite qualquer frase para Java Fanho traduzir: ");
    phrase = inputScan.nextLine();

    convert = phrase
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

    System.out.println(convert);
  }
}