import java.util.Scanner;

class Ex73{
  public static void main (String[] args){
    Scanner inputScan = new Scanner (System.in);

    double media, nota1, nota2, nota3;
    String situation;

    // Exercício 73 - Média com funções

    System.out.print("Digite a PRIMEIRA NOTA ");
    nota1 = inputScan.nextDouble();
    
    System.out.print("Digite a SEGUNDA NOTA ");
    nota2 = inputScan.nextDouble();
    
    System.out.print("Digite a TERCEIRA NOTA ");
    nota3 = inputScan.nextDouble();

    media = mediaFun(nota1, nota2, nota3);
    situation = situationFun(media);

    System.out.println("A média do aluno é: "+media);
    System.out.print("Situação: "+situation);
  }
  public static double mediaFun (double nota1, double nota2, double nota3){
    double media = (nota1 + nota2 + nota3) / 3;
    return media;
  }
  public static String situationFun (double media){
    String situation = "";
    if (media >= 8){
      situation = "Aprovado com sucesso!";
    }
    else if (media >= 6 && media < 8){
      situation = "Aprovado!";
    }
    else if (media >= 3 && media < 6){
      situation = "Recuperação.";
    }
    else if (media == 0){
      situation = "Desistente";
    }
    else {
      situation = "Reprovado";
    }
    return situation;
  }
}