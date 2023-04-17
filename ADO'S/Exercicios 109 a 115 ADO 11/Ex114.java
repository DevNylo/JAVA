import java.util.Scanner;

class Ex114 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String addProd;
    int qtdProd = 0, qtdSubTotal = 0;
    double preProd = 0, subTotal = 0, total = 0;

    int menuEscolha = menuEscolhaFun();
    double adicionar = adicionarFun(subTotal, qtdProd, preProd);

    while (menuEscolha != 0) {

      // INICIA EM 0 E NO PRÓXIMO PASSO CALCULA OS VALORES;
      subTotal = subTotal + (preProd * qtdProd);

      // EXIBE SUBTOTAL CASO A OPÇÃO SEJA 2;
      if (menuEscolha == 2) {
        System.out.print("\n(" + qtdSubTotal + " itens) - ");
        exibirSubTotal(subTotal);
      }

      System.out.print("Informe o nome do produto: ");
      addProd = input.next(); // ADD

      System.out.print("Informe a quantidade: ");
      qtdProd = input.nextInt(); // QTD

      System.out.print("Informe o preço da unidade: ");
      preProd = input.nextDouble(); // PREÇO

      qtdSubTotal = qtdSubTotal + qtdProd;

      menuEscolha = menuEscolhaFun();

      if (menuEscolha == 3) {
        subTotal = subTotal + (preProd * qtdProd);
        total = subTotal;
        System.out.print("\n(" + qtdSubTotal + " itens) - ");
        finalizarFun(total);
        qtdProd = 0;
        subTotal = 0;
        total = 0;
        qtdSubTotal = 0;

      }
      adicionar = adicionarFun(subTotal, qtdProd, preProd);
      
    }
  }

  // FUNÇÃO DE ESCOLHA E MENU;
  public static int menuEscolhaFun() {

    Scanner input = new Scanner(System.in);

    System.out.println("\n1 - Adicionar Produto");
    System.out.println("2 - Exibir subtotal");
    System.out.println("3 - Finalizar compra");
    System.out.println("0 - Sair\n");

    int escolha = input.nextInt();

    return escolha;

  }

  // FUNÇÃO PARA CALCULO DE SUBTOTAL;
  public static double adicionarFun(double subTotal, int qtdProd, double preProd) {
    subTotal = subTotal + (preProd * qtdProd); // PRECAUÇÃO;
    return subTotal;
  }

  // FUNÇÃO PARA EXIBIR SUBTOTAL;
  public static void exibirSubTotal(double subTotal) {

    System.out.println("Subtotal: R$ " + subTotal);

    System.out.println("\nContinuar comprando...\n"); // Poderia exibir como pergunta? Mas teriam 2 parâmetros... :(
  }

  // EXIBE O TOTAL E FINALIZA A COMPRA
  public static void finalizarFun(double total) {
    System.out.println("Total: R$ " + total);
    System.out.println("\nCompra finalizada!");

    System.out.println("\nProduto adicionado ao carrinho!\n");
  }
}