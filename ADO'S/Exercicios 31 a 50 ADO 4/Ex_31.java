import java.util.Scanner;

class Ex_31 {

  // Exercício 31
  
  public static void main(String[] args) {
    
    Scanner inputScan = new Scanner(System.in);

    String password;
    int avaliation;
    boolean convert;

    System.out.println("Identificando se a senha possui mais de 6 dígitos");

    System.out.print("Digite sua senha: ");
    password = inputScan.nextLine();

    avaliation = password.replace(" ", "").length();
    convert = avaliation >= 6;

    System.out.println("A senha cumpre o requisito de tamanho? " + convert);

  }
}