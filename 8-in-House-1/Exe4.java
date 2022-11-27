import java.util.Scanner;

class Exe4 {
  public static void main(String[] args) {

    String semana;
    boolean nacional;
    double calc;
    byte inteira, meia;

    Scanner inputScan = new Scanner(System.in);

    System.out.print("Quantos ingressos inteira: ");
    inteira = inputScan.nextByte();
    System.out.print("Quantos ingressos de meia-entrada: ");
    meia = inputScan.nextByte();
    System.out.print("Qual o dia da Semana? ");
    semana = inputScan.next();
    System.out.print("O filme é Nacional? ");
    nacional = inputScan.nextBoolean();

    calc = functionSupply(inteira, meia, semana, nacional);

    System.out.println("O total a se pagar pelos ingressos é R$ "+ calc);
  }
  public static double functionSupply(byte inteiraFun,byte meiaFun, String semanaFun, boolean nacional){

    double valor = 0;
    
    if (nacional == true){
      valor = (inteiraFun + meiaFun) * 5;
      
    }else if (semanaFun.equalsIgnoreCase("Quarta-feira")) {
      valor = (inteiraFun + meiaFun) * 14.25;
    }
    else{
      valor = (inteiraFun * 28.50) + (meiaFun * 14.25);
    }
    return valor;
  }
}