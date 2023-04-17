import java.util.Scanner;

class Ex74{
  public static void main (String[] args){
    /*Implemente um programa em Java
que a partir da altura e do peso de uma
pessoa, calcule o IMC e avalie a faixa
correspondente a tabela ao lado. Ao
final, apresente o IMC e a situação.
*/  double peso, altura, calc;
    String grau;
  
    Scanner inputScan = new Scanner (System.in);

    System.out.print("Qual o seu PESO: ");
    peso = inputScan.nextDouble();

    System.out.print("Qual a sua ALTURA: ");
    altura = inputScan.nextDouble();

    calc = imcFun(peso,altura);
    grau = imcGrauFun(calc);

    System.out.println("Seu IMC é: "+calc);
    System.out.println("Sua classificação é: "+ grau);
    
  }
  public static double imcFun (double peso, double altura){
    double imc = peso / Math.pow(altura, 2);
    return imc;
  }
  public static String imcGrauFun (double calc){
    String imcFun = "";

    if (calc >= 40){
      imcFun = "OBESIDADE GRAU |||";      
    }
    else if (calc >= 35 && calc <= 39.9){
      imcFun = "OBESIDADE GRAU ||";
    }
    else if (calc >= 30 && calc <= 34.9){
      imcFun = "OBESIDADE GRAU |";
    }
    else if (calc >= 25 && calc <= 29.9){
      imcFun = "SOBREPESO";
    }
    else if (calc >= 18.5 && calc <= 24.9){
      imcFun = "PESO NORMAL";
    }
    else {
      imcFun = "Abaixo do peso";
    }
    return imcFun;
  }
}