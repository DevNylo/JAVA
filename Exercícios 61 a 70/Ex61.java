import java.util.Scanner;

class Ex61 {
    public static void main (String[] args){
    try (/*Implemente um programa em Java que a partir de dois números
        informados pelo usuário, calcule o dobro de cada número e apresente
        ao usuário. */
        Scanner inputScan = new Scanner (System.in)) {
            String num1;

            System.out.print("Digite dois números: ");
            num1 = inputScan.nextLine();

            System.out.println(dobroFun(num1));
        }

        // Exercício 61 - Dobro de 2 números.





    }
    public static String dobroFun (String valorNum){
        String posiNum = valorNum.substring(0,1);
        return posiNum;
        

    }
}
