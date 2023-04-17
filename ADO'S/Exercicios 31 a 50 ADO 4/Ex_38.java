import java.util.Scanner;

class Ex_38 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double total, taxas, calc, calc_2, mensalidade;
    int parcelas;

    System.out.println("Programa dos Juros compostos");

    System.out.println("Valor total da compra: ");
    total = input.nextDouble();

    System.out.println("Quantidade de Parcelas: ");
    parcelas = input.nextInt();

    System.out.println("Taxa de juros ");
    taxas = input.nextDouble();

    calc = total * Math.pow((1 + taxas / 100), parcelas);
    mensalidade = calc / parcelas;

    System.out.println("Sua compra ficará R$  " + calc + " em " + parcelas + "x de R$ " + mensalidade + " por mês.");

  }

}