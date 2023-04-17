import java.util.Scanner;

class Ex_49 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    // Verificando se duas pessoas podem assistir o mesmo filme.

    String filme, nome;
    int idadeClass, idade1, idade2;
    boolean comp;

    System.out.print("Qual o nome do filme. ");
    nome = input.nextLine();

    System.out.print("Qual a CLASSIFICAÇÃO DE IDADE:  ");
    idadeClass = input.nextInt();

    System.out.print("Idade da PRIMEIRA PESSOA: ");
    idade1 = input.nextInt();

    System.out.print("Idade da SEGUNDA PESSOA: ");
    idade2 = input.nextInt();

    comp = idade1 > idadeClass && idade2 > idadeClass;

    System.out.print("Vamos assistir um filme? " + comp);
  }
}