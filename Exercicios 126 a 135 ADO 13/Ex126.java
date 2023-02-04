import java.util.Scanner;

class Ex126{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    String[] tarefas = new String[0];
    String opcao = ler.nextLine();
  
    while(!opcao.equals("Sair")){
      tarefas = NovaTask(opcao,tarefas);

      opcao = ler.nextLine();
    }
    System.out.println("Sua lista de tarefas");
    Exibir(tarefas);
  
}
    public static String[] NovaTask(String newtask, String[] tarefas){
      String[] novo = new String[tarefas.length + 1];

      for(int i = 0; i < tarefas.length; i++){
        novo[i] = tarefas[i];
      }
      novo[tarefas.length] = newtask;
      
      return novo;
    }
  public static void Exibir(String[] tarefas){
    for(String item: tarefas){
      System.out.println(item);
    }
  }
}