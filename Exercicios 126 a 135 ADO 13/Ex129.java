import java.util.Scanner;

class Ex129{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Quantidade de números: ");
    int qtdNumeros = input.nextInt();

    int []ordenarNum = ordenarNum(qtdNumeros);
    boolean ordemCrescente = ordemCrescente(ordenarNum);
    boolean ordemDecrescente = ordemDecrescente(ordenarNum);

    if(ordemCrescente == true){
      System.out.println("\nOrganização dos elementos:");
      System.out.println("Ordem crescente.");
    }else if(ordemDecrescente == true){
      System.out.println("\nOrganização dos elementos:");
      System.out.println("Ordem decrescente.");
    }else{
      System.out.println("\nOrganização dos elementos:");
      System.out.println("Desordenada.");
    }
  }
  public static int []ordenarNum(int qtdNumeros){

    Scanner input = new Scanner(System.in);

    int []numerosArr = new int[qtdNumeros];
    
    for(int i = 0; i < numerosArr.length; i++){
      System.out.print("Digite o número: ");
      int numeros = input.nextInt();
      numerosArr[i] = numeros;
    }
    return numerosArr;
  }
  public static boolean ordemCrescente(int []ordenarNum){

    int i = 0;
    int y = 1;
    boolean resultado = true;
    
    while(y < ordenarNum.length){
      if (ordenarNum[i] < ordenarNum[y]){
        resultado = true;
      }
      else{
        resultado = false;
      }
      y++;
      i++;
    }
    return resultado;
    
  }
   public static boolean ordemDecrescente(int []ordenarNum){

    int i = 0;
    int y = 1;
    boolean resultado = true;
    
    while(y < ordenarNum.length){
      if (ordenarNum[i] > ordenarNum[y]){
        resultado = true;
      }
      else{
        resultado = false;
      }
      y++;
      i++;
    }
    return resultado;
    
  }
}