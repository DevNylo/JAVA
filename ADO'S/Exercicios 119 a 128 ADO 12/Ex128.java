import java.util.Scanner;
import java.util.Random;

class Ex10 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Qual a quantidade de alunos? ");
    int qtdAlunos = input.nextInt();

    int turmas = qtdAlunos / 2;

    int[] grupo1 = new int[turmas];
    int[] grupo2 = new int[turmas];

    for (int i = 0; i < turmas; i++) {
      grupo1[i] = gerarNovo(qtdAlunos, grupo1, grupo2);
      grupo2[i] = gerarNovo(qtdAlunos, grupo1, grupo2);
    }

    exibirArray(grupo1);
    exibirArray(grupo2);
  }

  public static void exibirArray(int[] arr) {

    for (int item : arr) {
      System.out.printf("%d - ", item);
    }
    System.out.println();
  }

  public static int buscar(int num, int[] numeros) {
    int pos = -1;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == num) {
        pos = i;
      }
    }

    return pos;
  }

  public static int gerarNovo(int tamSala, int[] grupo1, int[] grupo2) {

    Random rand = new Random();

    int num = 0;
    do {
      num = rand.nextInt(1, tamSala + 1);
    } while (buscar(num, grupo1) != -1 ||
        buscar(num, grupo2) != -1);

    return num;
  }

}