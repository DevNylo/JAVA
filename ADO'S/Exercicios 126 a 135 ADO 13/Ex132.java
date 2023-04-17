import java.util.Scanner;

class Ex132{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe quantos pilotos estão competindo");
    int p = ler.nextInt();

    System.out.println("Informe as posições de largada");
    int incio[] = CriarArray(p);

    System.out.println("Informe as posições de chegada");
    int fim[] = CriarArray(p);

    String[] result = PP(p, inicio, fim);
    Exibir(result);
   
    }
    public static int[] CriarArray(int tamanho){
      Scanner ler = new Scanner(System.in);
      int[] tam = new int[tamanho];

      for(int i = 0; i < tamanho; i++){
        System.out.println("Informe a posição do piloto" + (i + 1));
        tam[i] = ler.nextInt();
      }
      return tam;

    }
  public static String[] PP(int p, int[] inicio, int[] fim){
    String[] resultado = new String[p];

    for(int i = 0; i < p; i++){
      int posicao = inicio[i] - fim[i];

      if(posicao == 0){
        resultado[i] = "O piloto " +(i + 1)+ " manteve a posição";
      }
      else if(posicao > 0){
        resultado[i] = "O piloto " +(i + 1)+ " retrocedeu " +posicao+ " posições";
      }
      else{
        resultado[i] = "O piloto " +(i + 1)+ " avançou " +Math.abs(posicao)+ " posições";
      }
    }
    return resultado;
  }
}  