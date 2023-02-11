import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ListEX carrinho = new ListEX();

        int action = 0;

        while(action <= 3) {
            carrinho.apresentar();
            action = input.nextInt();
            switch (action){
                case 1:
                    carrinho.listaCompras.add(carrinho.addItem());
                    System.out.println(carrinho.listaCompras);
                    break;
                case 2:
                    carrinho.listaCompras.remove(carrinho.rmvItem());
                    System.out.println(carrinho.listaCompras);
                    break;
            }
        }


    }
}
