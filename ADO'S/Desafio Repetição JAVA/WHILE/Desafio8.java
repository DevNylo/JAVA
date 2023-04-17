import java.util.Scanner;

class Desafio8{
  public static void main (String[] args){

    Scanner input = new Scanner (System.in);

   

    double nota1, nota2, media = 0;
    int i = 1;
    String nome;

    while (i <= 5){
      System.out.print("Qual o nome do aluno ("+i+"): ");
      nome = input.next();

      System.out.print("Qual a primeira nota do aluno ("+i+"): ");
      nota1 = input.nextDouble();

      System.out.print("Qual a segunda nota do aluno ("+i+"): ");
      nota2 = input.nextDouble();
      
      media = (nota1 + nota2) / 2;      
      i++;
    }
    if (media >= 7){
        System.out.println("Alunos Aprovados!");
      }else if (media < 7 && media >= 3){
        System.out.println("Alunos em Recuperação");
      }else{
        System.out.println("Alunos Reprovados!");
      }
  }
}