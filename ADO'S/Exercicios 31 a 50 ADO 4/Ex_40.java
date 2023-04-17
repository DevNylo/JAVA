import java.util.Scanner;

class Ex_40 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int dia;
    String mes;
    boolean verificar;

    System.out.println("Verificando Signo\n");

    System.out.print("Qual o mês que você nasceu: ");
    mes = input.nextLine();
    
    System.out.print("Qual o dia do mês que você nasceu: ");
    dia = input.nextInt();

    verificar = mes.equalsIgnoreCase("Setembro") && dia >= 23 && dia <= 30 ||
                mes.equalsIgnoreCase("Outubro") && dia >= 1 && dia <= 22;

    System.out.print("Você é de LIBRA? " + verificar);

  }
}
