import java.util.Scanner;

class Ex86 {
  public static void main(String[] args) {
    Scanner inputScan = new Scanner(System.in);

    System.out.print("Digite um numero ");
    int num = inputScan.nextByte();

    int result = fun(num);

    System.out.println(result);

  }

  public static int fun(int n) {
    int i = 1;
    
    while (i < n) {
      System.out.println(i);
      i++;
    }
    return i;
  }
}