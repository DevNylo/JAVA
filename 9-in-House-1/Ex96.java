import java.util.Scanner;

class Ex96 {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String msg = inputScan.nextLine();
    
        letraFun(msg);
        
    }
    public static void letraFun(String msg) {
        int i = 0;
        while(i < msg.length()){

        String letra = Character.toString(msg.charAt(i));
        if(letra.equals(" ")){
          System.out.println("Espaço");
        }
        else{
          System.out.println("Letra " + (i + 1)+ " = " + letra);
        }

        i++;
        }
      }
    }