import java.util.Scanner;

class Ex135{
  public static void main(String[] args){

    String []primeiraPessoa = primeiraPessoa();
    String []segundaPessoa = segundaPessoa();

    int contar = 0;
    
    for(int j = 0; j < primeiraPessoa.length; j++){
      for(int i = 0; i < segundaPessoa.length; i++){
        if(primeiraPessoa[j].equals(segundaPessoa[i])){
          contar = contar + 1;
        }
      }
    }
    double similaridade = (contar * 100) / 5;
    
    if(similaridade > 50){
       System.out.println("Deu Match!");
       System.out.println("Similaridade: "+similaridade+"%");
    }else{
       System.out.println("Fila anda...");
       System.out.println("Similaridade: "+similaridade+"%");
    }
  }
  public static String []primeiraPessoa(){

    Scanner input = new Scanner(System.in);

    int count = 1;

    String []interesseP1 = new String[5];
    
    for(int i = 0; i < 5; i++){
      System.out.println("Digite seu interesse ("+count+"/5)");
      String interesse = input.nextLine().toUpperCase();

      interesseP1[i] = interesse;
      count++;
    }
    return interesseP1;
  }
  public static String []segundaPessoa(){
    
    Scanner input = new Scanner(System.in);

    int count = 1;

    String []interesseP2 = new String[5];
    
    for(int i = 0; i < 5; i++){
      System.out.println("Digite seu interesse ("+count+"/5)");
      String interesse = input.nextLine().toUpperCase();

      interesseP2[i] = interesse;
      count++;
    }
    return interesseP2;
  }
}