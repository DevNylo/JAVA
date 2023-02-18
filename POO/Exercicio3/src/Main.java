import entities.CurrencyConveter;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        CurrencyConveter conveter = new CurrencyConveter();

        System.out.print("What's the dollar price: ");
        CurrencyConveter.dollarPrice = input.nextFloat();

        System.out.print("How many dollars will be bought: ");
        conveter.setDollarQuantity(input.nextFloat());
        input.close();

        float totalValor =
            CurrencyConveter.calc(
            CurrencyConveter.dollarPrice,
            CurrencyConveter.getDollarQuantity(),
            CurrencyConveter.IOF_VALOR);

        System.out.printf("Amount be pain in Real R$%.2f",totalValor);
    }
}