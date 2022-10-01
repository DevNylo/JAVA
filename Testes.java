import java.util.Scanner;

class Ex65 {
  public static void main (String[] args){

    // Exercício 65 -  Implementar um programa em Java para verificar se uma senha é forte. Para ser forte ela precisa ter no mínimo 6 caracteres, um número e um caractere especial.

    String password;
    boolean caractere, numero, requisitos, autentificar;
    
    Scanner inputScan = new Scanner(System.in);

    System.out.print("Digite sua SENHA: ");
    password = inputScan.nextLine().trim().toLowerCase();

    caractere = caractereFun(password);
    numero = numFun(password);
    requisitos = cumpriFun(password);
    autentificar = requiFun(caractere, numero, requisitos);

    System.out.print("A senha cumpre os requisitos? "+autentificar);
  }
  // Requisitos de CARACTERE.
  public static boolean caractereFun(String password){
    boolean verificar = password.indexOf("@") >= 0||
                        password.indexOf("!") >= 0||
                        password.indexOf("$") >= 0||
                        password.indexOf("#") >= 0||
                        password.indexOf("%") >= 0||
                        password.indexOf("^") >= 0||
                        password.indexOf("*") >= 0||
                        password.indexOf("(") >= 0||
                        password.indexOf(")") >= 0||
                        password.indexOf("-") >= 0||
                        password.indexOf("_") >= 0;
    return verificar;                
  }
  // Requisitos de NÚMERO.
  public static boolean numFun(String password){
    boolean verificar = password.indexOf("0") >= 0||
                        password.indexOf("1") >= 0||
                        password.indexOf("2") >= 0||
                        password.indexOf("3") >= 0||
                        password.indexOf("4") >= 0||
                        password.indexOf("5") >= 0||
                        password.indexOf("6") >= 0||
                        password.indexOf("7") >= 0||
                        password.indexOf("8") >= 0||
                        password.indexOf("9") >= 0;
    return verificar;
  }
  // Requisitos de COMPRIMENTO.
  public static boolean cumpriFun(String password){
    int maiorQue = password.length();
    boolean comparar = maiorQue >= 6;
    return comparar;
  }
  // Autentificando as 3 funções.
  public static boolean requiFun(boolean carac, boolean num, boolean comp){
    boolean verificar = carac == true && num == true && comp == true;
    return verificar;
  }
}