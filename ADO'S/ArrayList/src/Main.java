import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        nomes.add(0,"Danilo");
        nomes.add(1,"Luan");
        nomes.add(2,"Gabriel");
        nomes.add(0,"Henrique");

        try {
            System.out.println(nomes.get(2)); // EXIBE O ELEMENTO NO INDEX OU MELHOR, NA POSIÇÃO 1
            nomes.clear(); // LIMPA O ARRAYLIST
            System.out.println(nomes.indexOf("Danilo")); // VAI INDICAR A POSIÇÃO QUE ESTÁ O NOME;
            nomes.remove(1); // REMOVE O ELEMENTO *TAMBÉM PODE USAR O NOME*;
        }catch (Exception e){
            System.out.println(e);
        }

        for(int num : numeros){
            System.out.println(num);
        }

        for(String name : nomes){
            System.out.println(name);
        }
    }
}