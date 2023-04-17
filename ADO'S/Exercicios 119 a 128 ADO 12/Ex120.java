import java.util.Scanner;

class Ex120 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double num = 0;

    exbArrDec(num);

  }
  public static void exbArrDec (double num) {
    Scanner input = new Scanner(System.in);
    
    double[] arrNumDec = new double[5];

    for (int i = 0; i <= 4; i++){
    System.out.print("Digite um número: ");
    num = input.nextDouble();
    arrNumDec[i] = num;
    }

    for (double numExb : arrNumDec){
      System.out.println(numExb);
    }
  }
}