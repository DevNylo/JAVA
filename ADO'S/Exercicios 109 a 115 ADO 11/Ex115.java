import java.util.Scanner;

public class Ex115 {

  // :D

  public static void main(String[] args) {

    int y = 1;
    String board = "";
    String tentativa = "";
    Scanner input = new Scanner(System.in);

    System.out.print("Qual a palavra: ");
    String palavra = input.nextLine();

    // RECEBE A QUANTIDADE DE CARACTERE DA STRING;
    int tmnPalavra = palavra.length();

    // CRIA O BOARD COM UNDERLINE COM BASE NO TAMANHO DA PALAVRA
    for (int i = 0; i < tmnPalavra; i++) {
      board = board + "_";
    }

    // CLEAR;
    clearConsole();

    while (y <= 12) {

      // CONDIÇÃO PARA VENCER
      boolean vencer = venceu(board);
      if (vencer == true) {
        System.out.println("A palavra era " + palavra + " você VENCEU!");
        break;
      }

      int escolha = menuHub(); // MENU

      if (escolha == 1) {

        // ENTRADA E VALIDAÇÃO
        System.out.print("Qual a letra? ");
        char letra = input.next().charAt(0);
        // charAt(0) ANULA A INSERÇÃO DE MAIS DE 1 CARACTERE PEGANDO APENAS O PRIMEIRO.

        String ver = tentarLetra(palavra, letra, board);
        board = ver;

        // OCORRENCIAS DE CARACTERES.
        int ocorrencias = correnciasFun(palavra, letra, board);
        System.out.println(ocorrencias + " ocorrência(s) encontradas.");
        System.out.println("Sua forca " + board);
        // -------
      } else if (escolha == 2) {
        boolean tentar = tentar(tentativa, palavra);
        if (tentar == true) {
          System.out.println("A palavra era " + palavra + " você VENCEU!");
          break;

        } else {
          System.out.println("A palavra era " + palavra + " você PERDEU!");
          break;
        }
      }
      y++;
    }
    input.nextLine(); // QUEBRANDO BUG
    System.out.print("Ultima tentativa! Qual é a palavra? ");
    tentativa = input.nextLine();

    boolean result = tentativa.equalsIgnoreCase(palavra);

    if (result == true) {
      System.out.println("Você venceu!");
    } else {
      System.out.println("Você perdeu.");
    }

  }

  // FUNÇÃO PARA SOLICITAR ESCOLHA;
  public static int menuHub() {

    Scanner input = new Scanner(System.in);

    System.out.println("\n1 - Escolher letra\n2 - Ja sei a palavra\n");
    int escolha = input.nextInt();

    return escolha;
  }

  // FUNÇÃO PARA ANALISAR LETRA E FILTRAR O BOARD;
  public static String tentarLetra(String palavra, char letra, String board) {

    int tmnPalavra = palavra.length();

    // IDENTIFICA O INDEX DO CARACTERE NA STRING;
    int indexLetra = palavra.indexOf(letra);

    // ARRAY QUE IRÁ COLOCAR ESSES UNDERLINE EM CADA POSIÇÃO
    String[] arrChar = board.split("");

    // CHAR TO STR
    String strLetra = letra + "";

    // CONTADOR
    int j = 0;

    // CONDIÇÃO QUE IRÁ VERIFICAR A EXISTÊNCIA DA LETRA E ADD A POSITION
    while (j < tmnPalavra) {

      if (indexLetra >= 0) {
        arrChar[indexLetra] = strLetra;
      }
      indexLetra = palavra.indexOf(letra, j);
      j++;
    }

    String receberStr = "";

    // ARRAY PERCORRIDA E ARMAZENADA
    for (String ver : arrChar) {
      receberStr = receberStr + ver;
    }
    board = receberStr;

    return board;
  }

  // FUNÇÃO OCORRÊNCIAS
  public static int correnciasFun(String palavra, char letra, String board) {

    String strLetra = letra + "";

    int count = 0;

    for (String ver : palavra.split("")) {
      if (ver.equals(strLetra)) {
        count++;
      }
    }

    return count;
  }

  // FUNÇÃO PARA RESPONDER
  public static boolean tentar(String tentativa, String palavra) {

    Scanner input = new Scanner(System.in);

    System.out.print("Qual é a palavra? ");
    tentativa = input.next();

    boolean result = tentativa.equalsIgnoreCase(palavra);

    return result;
  }
  // FUNÇÃO QUE VERIFICA SE O PLAYER VENCEU COM BASE NA EXISTÊNCIA DE UNDELINE NA
  // STRING.

  public static boolean venceu(String board) {

    boolean verificar = board.indexOf("_") < 0;

    return verificar;
  }

  public final static void clearConsole() {
    System.out.print("\n\nPressione ENTER para limpar: ");
    new Scanner(System.in).nextLine();

    System.out.print("\033[H\033[\2J");
    System.out.flush();
  }
}