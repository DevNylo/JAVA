package entities;

public class CurrencyConveter {

    public static float dollarPrice;
    private static float dollarQuantity;
    private static float realValor;
    public static final float IOF_VALOR = 6.0F;

    public static float getDollarQuantity() {
        return dollarQuantity;
    }

    public void setDollarQuantity(float dollarQuantity) {
        this.dollarQuantity = dollarQuantity;
    }

    public static float calc(float dollarPrice, float dollarQuantity, float IOF_VALOR){
        float calculator = dollarPrice * dollarQuantity;
        return calculator + ((IOF_VALOR/100) * calculator);
    }
}
