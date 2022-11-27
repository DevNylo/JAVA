import java.util.Scanner;

class Ex121 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String names = "";

    exbArrNames(names);

  }
  public static void exbArrNames (String names) {
    Scanner input = new Scanner(System.in);
    
    String[] arrName = new String[5];

    for (int i = 0; i <= 4; i++){
    System.out.print("Digite alguns nomes: ");
    names = input.nextLine();
    arrName[i] = names;
    }

    for (String nameExb : arrName){
      System.out.println(nameExb);
    }
  }
}