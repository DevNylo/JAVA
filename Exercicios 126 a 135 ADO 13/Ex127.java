import java.util.Scanner;

class Ex127{
  public static void main(String [] args){
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o número de números a serem armazenados");
    int n = ler.nextInt();

    int[] tam = tamanho(n);
    int[] viceversa = Inverter(tam);

    System.out.println("Os números invertidos são:");
    Exibir(viceversa);
  }
  public static int[] Inverter(int[] numeros){
    int half = numeros.length / 2;

    for(int i = 0; i < half; i++){
      int esquerda = numeros[i];
      int direita = numeros[numeros.length - i - 1];

      numeros[i] = direita;
      numeros[numeros.length - i - 1] = esquerda;
    }
    return numeros;
  }
  public static int[] tamanho(int tamanho){
    Scanner ler = new Scanner(System.in);

    int[] numeros = new int[tamanho];
    
    for(int i = 0; i < numeros.length; i++){
      System.out.println("Informe os números:");
      numeros[i] = ler.nextInt();
    }
  return numeros;
  }
  public static void Exibir(int[] numeros){
    for(int item: numeros){
      System.out.println(item);
    }
  }
}