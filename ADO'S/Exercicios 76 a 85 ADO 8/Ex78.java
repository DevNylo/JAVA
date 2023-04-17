import java.util.Scanner;

class Ex78 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    double media, nota1, nota2, nota3;
    byte faltas;
    String situation;

    // Exercício 78 - Aprovação.

    System.out.print("Digite a PRIMEIRA NOTA ");
    nota1 = inputScan.nextDouble();

    System.out.print("Digite a SEGUNDA NOTA ");
    nota2 = inputScan.nextDouble();

    System.out.print("Digite a TERCEIRA NOTA ");
    nota3 = inputScan.nextDouble();

    System.out.print("Qual a quantidade de faltas: ");
    faltas = inputScan.nextByte();

    situation = situationFun(nota1, nota2, nota3, faltas);

    System.out.println("Situação do aluno: " + situation);

  }

  public static String situationFun(double nota1, double nota2, double nota3, byte faltas) {
    String situation = "";

    if (((nota1 + nota2 + nota3) / 3) >= 8 && faltas <= 30) {
      situation = "Aprovado com sucesso!";
    } else if (((nota1 + nota2 + nota3) / 3) >= 6 && ((nota1 + nota2 + nota3) / 3) < 8 && faltas <= 30) {
      situation = "Aprovado!";
    } else if (((nota1 + nota2 + nota3) / 3) >= 3 && ((nota1 + nota2 + nota3) / 3) < 6 && faltas <= 30) {
      situation = "Recuperação.";
    } else if (((nota1 + nota2 + nota3) / 3) == 0) {
      situation = "Desistente";
    } else {
      situation = "Reprovado";
    }
    return situation;
  }
}