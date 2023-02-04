import java.util.*;

class Ex08 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Ado 13 - Ex 08");

    System.out.println("Informe a quantidade de alunos");
    int n = ler.nextInt();

    double[] alunos = CriarArray(n);
    double[] ordenados = Ordem(alunos);

    System.out.println("Fila Indiana:");
    Exibir(Ordem);

  }

  public static double[] CriarArray(int tamanho) {
    Scanner ler = new Scanner(System.in);
    double[] alunos = new double[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.println("Informe a altura do aluno:");
      alunos[i] = ler.nextInt();

    }
    return alunos;
  }

  public static void Exibir(int[] arr) {
    for (int item : arr) {
      System.out.println(item);
    }
  }

  public static int[] Ordem(double alturas){ 
    double seq = 0;

    for (int i = 0; i < alturas.length; i++) {
      for (int j = 0; j < i; j++) {
        if (alturas[i] < alturas[j]) {
          seq = alturas[i];
          alturas[i] = alturas[j];
          alturas[j] = seq;
        }
      }
    }
    return alturas;
  }
}