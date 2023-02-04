import java.util.Scanner;

class Ex130{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

      System.out.println("Informe o tamanho do array");
      int n = ler.nextInt();

      int[] tam = CriarArray(n);

      System.out.println("Sequência dos " +n+ " primeiros primos são:");
      Exibir(tam);

    }
  public static void Exibir(int[] arr){
    for(int item: arr){
      System.out.println(item);
    }
  }
  public static int[] CriarArray(int tamanho){
    int[] primos = new int[tamanho];
    int numero = 2, primo = 0, divisoes = 0;

    while(primo != tamanho){
      for(int i = 1; i <= numero; i++){
        if(numero % i == 0){
          divisoes++;
        }
      }
      if(divisoes == 2){
        primos[primo] = numero;
        primo++;
      }
      numero++;
      divisoes = 0;
    }
    return primos;
  }
}