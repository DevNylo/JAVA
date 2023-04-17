import java.util.*;

class Ex134 {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe a quantidade de figurinhas");
    int n = ler.nextInt();

    System.out.println("Informe a quantidade de figurinhas da primeira pessoa");
    int[] p = ler.criarray(n);

    System.out.println("Informe a quantidade de figurinhas da segunda pessoa");
    int[] p2 = ler.criarray(n);

    int qntdrepetidas = repetidas(p,p2);
    int[] Vrepetidas = trocas(p,p2,qntdrepetidas);

    System.out.println("Podem ser feitas " +qntdrepetidas+ " trocas.");
    System.out.println("\nAs figurinhas repetidas são:");
    for(int i : vrepetidas){
      System.out.println(i + " ");
    }

  }
  public static int[] criarray(int tamanho){
    Scanner ler = new Scanner(System.in);
    int[] figurinhas = new int[tamanho];

    for(int i = 0; i < tamanhp; i++){
      System.out.println("Informe a figurinha:");
      figurinhas[i] = ler.nextInt();
      
    }
    return figurinhas;
  }
  public static int repetidas(int[] p, int[] p2){
    int cont = 0;

    for(int i = 0; i < p.length; i++){
      for(int j = 0; j < p.length; j++){
        if(p[i] == p2[i]){
          cont++;
        }
      }
    }
    return cont;
  }

  public static int[] trocas(int[] p, int[] p2, int comum){
    int[] repetidas = new int[comum];
    int posicao = 0;

    for(int i = 0; i < p.length; i++){
      for(int j = 0; j < p.length; j++){
        if(p[i] == p2[j]){
          repetidas[posicao] = p[i];
          posicao++;
        }
      }
    }
    return repetidas;
  }
}