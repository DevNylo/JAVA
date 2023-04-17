import java.util.Scanner;

class Ex119 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num = 0;

    exbArr(num);

  }
  public static void exbArr (int num) {

    Scanner input = new Scanner(System.in);
    
    int[] arrNum = new int[5];

    for (int i = 0; i <= 4; i++){
    System.out.print("Digite um número: ");
    num = input.nextInt();
    arrNum[i] = num;
    }

    for (int numExb : arrNum){
      System.out.println(numExb);
    }
  }
}