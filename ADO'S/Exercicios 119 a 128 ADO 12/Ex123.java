import java.util.Scanner;

class Ex123 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Tamanho do Array: ");
    int tamanho = input.nextInt();

    int []arrNum =  arrNumFun (tamanho);
    int dobroArr[] = dobroArr(arrNum);

    exibirDobro (dobroArr);


  }
  public static int []arrNumFun (int tamanho){

    Scanner input = new Scanner(System.in);

    int i = 0;

    int [] arrayVoid = new int[tamanho];
    
    while (i < tamanho){
      System.out.print("Digite os valores: ");
      int userNum = input.nextInt();
      arrayVoid[i] = userNum;
      i++;
    }
    return arrayVoid;
  }
  public static int []dobroArr (int arrNum[] ){
    
    int[] arrayVoid2 = new int[arrNum.length];

    for(int i = 0; i < arrNum.length; i++){
    arrayVoid2[i] = arrNum[i] * 2;
    }
    return arrayVoid2;
  }
  public static void exibirDobro (int dobroArr[]){
    for(int dobro : dobroArr){
      System.out.println(dobro);
    }
  }
}