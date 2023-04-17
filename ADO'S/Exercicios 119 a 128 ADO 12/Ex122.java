import java.util.Scanner;

class Ex122 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o tamanho do Array: ");
    int tamanho = input.nextInt();

    int []exibirArr = tamArr(tamanho);

    numerosFun(exibirArr);

  }
  public static int []tamArr (int tamanho) {
    Scanner input = new Scanner(System.in);
    
    int arrNum[] = new int[tamanho];

    for(int i = 0; i < tamanho; i++){
      System.out.print("Valores para a Array: ");
      int valores = input.nextInt();
      arrNum[i] = valores;
     
    }
    return arrNum;
  }
  public static void numerosFun (int []exibirArr){
    for(int num : exibirArr){
      System.out.println(num);
    }
  }
}