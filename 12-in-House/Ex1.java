import java.util.Scanner;
import java.util.Random;

class Ex1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] numeros = new int[15];

    for (int i = 0; i < 15; i++) {
      numeros[i] = gerarNum(numeros);
    }

    exibirNumeros(numeros);
  }

  public static void exibirNumeros(int[] arr) {

    int x = 0;
    
    for (int num : arr) {
      System.out.print(num);
      if(x < 14){
        System.out.print(" - ");
      }
      x++;
    }
  }    
  public static int gerarNum(int[] numeros) {

    Random random = new Random();

    int num = 0;
    do {
      num = random.nextInt(1, 26);
    } while (validarArr(num, numeros) != -1);

    return num;
  }

  public static int validarArr(int num, int[] numeros) {
    
    int count = -1;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == num) {
        count = i;
      }
    }

    return count;
  }

}