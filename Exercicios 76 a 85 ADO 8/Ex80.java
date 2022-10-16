import java.util.Scanner;

class Ex80{
  public static void main (String[] args){

    Scanner inputScan = new Scanner (System.in);

    double nota, notaCorte, notaMin;
    String situation;

    // Exercício 80 - Situação do candidato.
    
    System.out.print("Qual a nota do candidato: ");
    nota = inputScan.nextDouble();
    
    System.out.print("Qual a nota de corte: ");
    notaCorte = inputScan.nextDouble();
    
    System.out.print("Qual a nota mínima: ");
    notaMin = inputScan.nextDouble();

    situation = situaFun(nota, notaCorte, notaMin);

    System.out.println(situation);

    
  }
  public static String situaFun (double valor1, double valor2, double valor3){
    String situation = "";

    if (valor1 < valor2){
      situation = "Candidato não passou";
    }else if (valor1 >= valor2 && valor1 < valor3){
      situation = "Candidato está na lista de espera.";
    }else{
      situation = "Candidato aprovado";
    }
    return situation;
  }
}