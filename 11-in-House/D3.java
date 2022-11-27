import java.util.Scanner;

class D3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int votoAluno1 = 0, votoAluno2 = 0, votoAluno3 = 0;

    System.out.print("Informe um candidado: ");
    String aluno1 = input.nextLine();

    System.out.print("Informe outro candidado: ");
    String aluno2 = input.nextLine();

    System.out.print("Informe outro candidado: ");
    String aluno3 = input.nextLine();

    int voto = menuVotoFun(aluno1, aluno2, aluno3);
    clearConsole();
    while (voto != 0) {

      if (voto == 1) {
        votoAluno1 += 1;
      } else if (voto == 2) {
        votoAluno2 += 1;
      } else {
        votoAluno3 += 1;
      }
      voto = menuVotoFun(aluno1, aluno2, aluno3);
      clearConsole();
    }

    votoResultadoFun(votoAluno1, votoAluno2, votoAluno3);
    System.out.println("\nTotal de votos recebidos:\n");
    System.out.println(aluno1 + " = " + votoAluno1 + " votos");
    System.out.println(aluno2 + " = " + votoAluno2 + " votos");
    System.out.println(aluno3 + " = " + votoAluno3 + " votos");
  }

  public static void votoResultadoFun(int votoAluno1, int votoAluno2, int votoAluno3) {

    // REPRESENTANTE DA SALA
    if (votoAluno1 > votoAluno2 && votoAluno1 > votoAluno3) {
      System.out.println("\nO Representante é o 1° candidato \n");
    } else if (votoAluno2 > votoAluno1 && votoAluno2 > votoAluno3) {
      System.out.println("\nO Representante é o 2° candidato\n");
    } else if (votoAluno3 > votoAluno1 && votoAluno3 > votoAluno2) {
      System.out.println("\nO Representante é o 3° candidato\n");
    }

    // VICE-REPRESENTANTE DA SALA
    if (votoAluno1 > votoAluno2 && votoAluno1 < votoAluno3 ||
        votoAluno1 < votoAluno2 && votoAluno1 > votoAluno3) {
      System.out.println("\nO Vice-representante é o 1° candidato\n");
    } else if (votoAluno2 > votoAluno1 && votoAluno2 < votoAluno3 ||
        votoAluno2 < votoAluno1 && votoAluno2 > votoAluno3) {
      System.out.println("\nO Vice-representante é o 2° candidato\n");
    } else if (votoAluno3 > votoAluno1 && votoAluno3 < votoAluno2 ||
        votoAluno3 < votoAluno1 && votoAluno3 > votoAluno2) {
      System.out.println("\nO Vice-representante é o 3° candidato\n");
    }

    // EMPATE
    if (votoAluno1 == votoAluno2 || votoAluno1 == votoAluno3 || votoAluno2 == votoAluno3) {
      System.out.println("\nVotação com empate, discutam suas ideias e iniciem uma nova votação!\n");
    }
  }

  public static int menuVotoFun(String aluno1, String aluno2, String aluno3) {

    Scanner input = new Scanner(System.in);

    System.out.print("\nOPÇÃO ");
    System.out.print("/ CANDIDATOS\n");
    System.out.println(" ");
    System.out.println(" 1 ------- " + aluno1);
    System.out.println(" 2 ------- " + aluno2);
    System.out.println(" 3 ------- " + aluno3);
    System.out.println(" 0 ------- ENCERRAR\n");

    System.out.print("Qual o seu voto? ");
    int voto = input.nextInt();

    return voto;
  }

  public final static void clearConsole() {
    System.out.print("\n\nPressione ENTER para limpar: ");
    new Scanner(System.in).nextLine();

    System.out.print("\033[H\033[\2J");
    System.out.flush();
  }
}