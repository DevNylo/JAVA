import entites.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produto produto;
        produto = new Produto();

        System.out.println("NOME PRODUTO:");
        produto.setName(input.nextLine());

        System.out.println("PREÇO PRODUTO:");
        produto.setPrice(input.nextFloat());

        System.out.println("QUANTIDADE EM ESTOQUE");
        produto.setQuantity(input.nextShort());

        produto.verProduto();
        produto.AddProducts(produto.getQuantity());
        produto.RemoveProducts(produto.getQuantity());


    }
}