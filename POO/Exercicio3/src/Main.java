import entities.Cachorro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cachorro jack = new Cachorro();
        Cachorro dupli = new Cachorro();

        jack.corOlhos = "Preto";
        jack.corPelo = "Caramelo";
        jack.qtdPatas = 4;
        input.close();
        System.out.println(jack.getMovimento());
        jack.setMovimento("O que o Jack esta fazendo?\n ");
        System.out.println(jack.getMovimento());
        jack.setMovimento(input.next());

        dupli.corOlhos = "Marrom";
        dupli.corPelo = "Preto";
        dupli.qtdPatas = 3;

        System.out.println(jack.toString());
        System.out.println(dupli.toString());
        jack.latir();
        dupli.latir();
    }
}