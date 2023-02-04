import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        User usuario = new User();

        System.out.print("Informe o seu primeiro nome: ");
        usuario.setFirstName(input.next());

        System.out.print("Informe o seu ultimo nome: ");
        usuario.setLastName(input.next());
        usuario.logar();
        usuario.apresentar();
        System.out.println(usuario.toString());

        User nomeArr[] = new User[5];

        for (int i = 0; i < nomeArr.length; i++){
            String nome = gerarChar();
            nomeArr[i] = new User(nome);
            System.out.println(nomeArr[i]);
        }
    }
    public static String gerarChar(){

        Random aleatorio = new Random();
        String nome = "";

        for (int i = 0; i<5; i++){
            char caractere = (char) (aleatorio.nextInt(26) + 'a');
            nome = nome + caractere;
        }
        return nome.toUpperCase();
    }
}