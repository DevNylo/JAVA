import java.util.Scanner;

class Ex61 {
  public static void main (String[] args){
    Scanner inputScan = new Scanner (System.in);

    // Exercício 61 - O dobro de dois números.
      
    int number1, number2, result1, result2;

    System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
    number1 = inputScan.nextInt();

    System.out.print("DIGITE O SEGUNDO NÚMERO: ");
    number2 = inputScan.nextInt();
      
    result1 = doubleFun(number1);
    result2 = doubleFun(number2); 

    System.out.println("O dobro de "+number1+" é "+result1);
    System.out.println("O dobro de "+number2+" é "+result2);
      
    }
  public static int doubleFun (int valor){
    int doubleNum = valor * 2 ;
    return doubleNum;
    }
  }
