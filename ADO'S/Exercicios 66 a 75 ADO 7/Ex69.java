import java.util.Scanner;

class Ex69 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    // Exercício 70 - Escrever o dia.

    byte dias;
    String diasSemana;

    System.out.println("\nDIAS DA SEMANA\n");

    System.out.println("0 = DOMINGO \n1 = SEGUNDA \n2 = TERÇA \n3 = QUARTA \n4 = QUINTA \n5 = SEXTA \n6 = SÁBADO\n");

    System.out.print("Qual o dia da semana de (0 a 6): ");
    dias = inputScan.nextByte();

    diasSemana = diasFun(dias);
    System.out.println(diasSemana);

    
  }
  public static String diasFun (byte dias){
    String diasSemana = "";
    if (dias == 0){
      diasSemana = "\nDomingo\n";
    }
    else if(dias == 1){
      diasSemana = "\nSegunda-feira\n";
    }
    else if(dias == 2){
      diasSemana = "\nTerça-feira\n";
    }
    else if(dias == 3){
      diasSemana = "\nQuarta-feira\n";
    }
    else if(dias == 4){
      diasSemana = "\nQuinta-feira\n";
    }
    else if(dias == 5){
      diasSemana = "\nSexta-feira\n";
    }
    else if(dias == 6){
      diasSemana = "\nSábado\n";
    }
    else {
      diasSemana = "\nDia da semana INVÁLIDO.\n";
    }
    return diasSemana;
  }
}