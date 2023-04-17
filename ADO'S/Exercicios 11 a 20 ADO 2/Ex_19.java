import java.util.Scanner;

class Ex_19 {
  public static void main(String[] args) {

    // Exercício 19 - Calculo de preço por quantidade e com cupom de desconto.

    Scanner inputScan = new Scanner(System.in);

    int smallScan, mediumScan, largeScan;
    double smallcup = 13.50;
    double mediumcup = 15.00;
    double largecup = 17.50;
    double result, voucher, calc;

    System.out.println("Temos os seguintes tamanhos de copo de açaí: ");
    System.out.println("Copo PEQUENO POR R$13,50");
    System.out.println("Copo MÉDIO POR R$15,00");
    System.out.println("Copo GRANDE POR R$17,50");

    System.out.print("Quantos copos PEQUENOS você deseja? ");
    smallScan = inputScan.nextInt(); // Entrada 1

    System.out.print("Quantos copos MÉDIOS você deseja? ");
    mediumScan = inputScan.nextInt(); // Entrada 2

    System.out.print("Quantos copos GRANDES você deseja? ");
    largeScan = inputScan.nextInt(); // Entrada 3

    System.out.print("Quanto vale o seu cupom de desconto? ");
    voucher = inputScan.nextInt(); // Entrada 4 - Cupom

    calc = (smallcup * smallScan) + (mediumcup * mediumScan) + (largecup * largeScan); // Processamento

    result = calc - (voucher / 100 * calc); // Calculo com cupom.

    System.out.printf("O total a pagar é R$%.2f", result); // Saída

  }
}