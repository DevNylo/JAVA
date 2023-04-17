import java.util.Scanner;

class Ex72{
  public static void main (String[]args){
    
  Scanner inputScan = new Scanner(System.in);

  // Exercício 72 - Febre.
  
  System.out.println("Situação do paciente");

  System.out.print("Digite sua temperatura ");
  double feb = inputScan.nextDouble();

  String febAlta = temp(feb);

  System.out.println("A situação para sua temperatura é "+febAlta);

  }
  public static String temp(double febre){
    String situacao ="";

    if(febre >= 41){
      situacao = "Hipertermia";
    }
    else if((febre >= 39.6) && (febre <= 39.6)){
      situacao = "Febre alta";
    }
    else if((febre >= 37.6) && (febre < 39.6)){
      situacao = "Febre";
    }
    else if((febre >= 36) && (febre < 37.6)){
      situacao = "Normal";
    }
    else{
      situacao = "Hipotermia";
    }
    return situacao;

  }