import java.util.Scanner;

class Ex_37 {
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    double valor, juros, calc, mensalidade, calc_2;
    int parcelas;

    System.out.println("Calculando Juros");
    
    System.out.print("Qual o valor da compra: " );
    valor = input.nextDouble();
    
    System.out.print("Qual a quantidade de parcelas: " );
    parcelas = input.nextInt();
    
    System.out.print("Taxa de juros: " );
    juros = input.nextDouble();

    calc = (valor * juros * parcelas) / 100;
    calc_2 = calc + valor;
    mensalidade = calc_2 / parcelas;

    System.out.println("Sua compra ficará R$ " + calc_2 + " em " + parcelas + "x de R$ " + mensalidade + " por mês.");
  }
}