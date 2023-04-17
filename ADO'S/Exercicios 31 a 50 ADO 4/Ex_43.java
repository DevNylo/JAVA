import java.util.Scanner;

class Ex_43 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String password;
    boolean tamanho, numeros, senhaForte, caracteres;

    System.out.println("Validando senha.");
    System.out.println("Digite sua senha: ");
    password = input.nextLine();

    caracteres = password.indexOf("@") >= 0
        || password.indexOf("!") >= 0
        || password.indexOf("#") >= 0
        || password.indexOf("$") >= 0
        || password.indexOf("%") >= 0
        || password.indexOf("^") >= 0
        || password.indexOf("&") >= 0
        || password.indexOf("*") >= 0;

    numeros = password.indexOf("0") >= 0
        || password.indexOf("1") >= 0
        || password.indexOf("2") >= 0
        || password.indexOf("3") >= 0
        || password.indexOf("4") >= 0
        || password.indexOf("5") >= 0
        || password.indexOf("6") >= 0
        || password.indexOf("7") >= 0
        || password.indexOf("8") >= 0
        || password.indexOf("9") >= 0;

    tamanho = password.length() >= 6;
    
    senhaForte = caracteres && numeros && tamanho;

    System.out.println(" A senha cumpre os requisitos? " + senhaForte);
  }
}