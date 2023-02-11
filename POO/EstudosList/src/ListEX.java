import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEX implements Carrinho{

    Scanner input = new Scanner(System.in);
    List<String> listaCompras = new ArrayList<>();

    @Override
    public String addItem() {
        System.out.print("ADICIONAR ITEM: ");
        String add = input.nextLine().toUpperCase();
        System.out.println("\nITEM ADICIONADO AO CARRINHO\n");
        System.out.println("CARRINHO: ");
        return add;
    }

    @Override
    public String rmvItem() {
        System.out.println(listaCompras);
        System.out.println("REMOVER: ");
        String remove = input.nextLine().toUpperCase();
        System.out.println(remove +" FOI REMOVIDO DA LISTA");
        return remove;
    }

    @Override
    public Float valorTotal() {
        return null;
    }

    public void verCarrinho(){
        System.out.println(listaCompras);
    }

    public void apresentar(){
        System.out.println("1 - ADICIONAR ITEM");
        System.out.println("2 - REMOVER ITEM");
        System.out.println("3 - SAIR");
        System.out.print("\nSELECIONE UMA OPÇÃO: ");    }
}
