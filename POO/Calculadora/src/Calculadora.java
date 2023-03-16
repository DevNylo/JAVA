import java.util.Scanner;
import entidades.*;

public class Calculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora Estática");

        int escolha = opcoes();

        while(escolha > 0){

            switch(escolha){
                case 1:
                    System.out.println("Primeiro número: ");
                    double num1 = input.nextDouble();
                    System.out.println("Segundo número: ");
                    double num2 = input.nextDouble();
                    Somar.somar(num1, num2);
                    break;

                case 2:
                    System.out.println("Primeiro número: ");
                    num1 = input.nextDouble();
                    System.out.println("Segundo número: ");
                    num2 = input.nextDouble();
                    Subtrair.subtrair(num1, num2);
                    break;
                case 3:
                    System.out.println("Dividendo: ");
                    num1 = input.nextDouble();
                    System.out.println("Divisor: ");
                    num2 = input.nextDouble();
                    Dividir.dividir(num1, num2);
                    break;
                case 4:
                    System.out.println("Primeiro número: ");
                    num1 = input.nextDouble();
                    System.out.println("Segundo número: ");
                    num2 = input.nextDouble();
                    Multiplicar.multiplicar(num1, num2);
                    break;
                case 5:
                    System.out.println("Raiz quadrada de: ");
                    num1 = input.nextDouble();
                    RaizQuadrada.sqrt(num1);
                    break;
                case 0:
                    escolha = 0;
                    break;
                default:
                    System.out.println("Operação Inválida!");
                    continue;
            }
            escolha = opcoes();
        }
        
    }
    public static int opcoes(){

        Scanner input = new Scanner(System.in);

        System.out.println("Selecione uma opção:");
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - DIVIDIR");
        System.out.println("4 - MULTIPLICAR");
        System.out.println("5 - RAIZ QUADRADA");
        System.out.println("0 - SAIR\n");

        System.out.println("SELECIONAR OPÇÃO");
        int escolha = input.nextInt();
        
        return escolha;
    }
}
