import java.util.*;

class Ex3{
  public static void main(String[] args){
    Scanner ler = new Scanner (System.in);

    System.out.println("Programa de formatação ABNT.");

    System.out.println(" ");

    String nome,obra,local,editora,ano, lastName,secondLetter, upper1,upper2;

    int spaceName,quantName, firstSpace;

    System.out.print("Digite o nome inteiro: ");
    nome = ler.nextLine();
    System.out.print("Digite o título da obra: ");
    obra = ler.nextLine();
    System.out.print("Digite a cidade onde foi publicada: ");
    local = ler.nextLine();
    System.out.print("Digite a editora que foi lançado: ");
    editora = ler.nextLine();
    System.out.print("Digite o ano em que foi lançado: ");
    ano = ler.nextLine();

    // Ultimo nome:
    spaceName = nome.lastIndexOf(" ");
    quantName = nome.length();
    lastName = nome.substring(spaceName, quantName);
    upper1 = lastName.toUpperCase();

    //Primeira letra:
    char firstLetter = nome.charAt(0);

    //Primeira letra do sobrenome:
    firstSpace = nome.indexOf(" ");
    char letra = nome.charAt(firstSpace + 1);

    System.out.println(lastName+", "+firstLetter+". "+letra+". "+obra+". "+local+": "+editora+", "+ano+".");
  }
}