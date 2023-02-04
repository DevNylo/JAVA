import java.util.Scanner;
import java.util.Random;

class Ex128{
  public static void main(String [] args){

    int num = 25;
    int grupos = 15 / 3;

    int[] grupo1 = new int[grupos];
    int[] grupo2 = new int[grupos];
    int[] grupo3 = new int[grupos];

    for(int i = 0; i < grupos; i++){
      grupo1[i] = Aleatorio(num, grupo1, grupo2, grupo3);
      grupo2[i] = Aleatorio(num, grupo1, grupo2, grupo3);
      grupo3[i] = Aleatorio(num, grupo1, grupo2, grupo3);
    }
      Exibir(grupo1);
      Exibir(grupo2);
      Exibir(grupo3);
      
    }
public static void Exibir(int[] arr){
  for(int item: arr){
    System.out.printf("%d - ", item);
  }
  System.out.println();
}
  public static int buscar(int num, int[] numeros){
    int pos = -1;

    for (int i = 0; i < numeros.length; i ++){
      if(numeros[i] == num){
        pos = i;
      }
    }
    return pos;
  }
public static int Aleatorio(int grupos, int[] grupo1, int[] grupo2, int[] grupo3){
  Random rdn = new Random();
  int num = 0;

  do{
    num = rdn.nextInt(1, grupos + 1);
  }
    while((buscar(num, grupo1) != -1) || (buscar(num, grupo2) != -1) || (buscar(num, grupo3) != -1));
    return num;
  }
}