package entites;

import java.util.Scanner;

public class Produto {

    Scanner input = new Scanner(System.in);
    public Produto(){

    }

    private String name;
    private float price;
    private short quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public double TotalValueInStock(){
        return 0;
    }
    public void AddProducts(short quantity){
        System.out.println("Informe a quantidade de produtos a serem ADICIONADOS: ");
        short add = input.nextShort();
        setQuantity((short) (getQuantity() + add));
        verProduto();
    }
    public void RemoveProducts(short quantity){
        System.out.println("Informe a quantidade de produtos a serem REMOVIDO: ");
        short remove = input.nextShort();
        setQuantity((short) (getQuantity() - remove));
        verProduto();
    }

    public void verProduto(){
        System.out.println("Dados do produto:");
        System.out.println("NOME: "+ getName());
        System.out.printf("PREÇO: R$%.2f%n", getPrice());
        System.out.println("QUANTIDADE: "+ getQuantity());
        System.out.printf("VALOR TOTAL: R$%.2f%n", getQuantity() * getPrice());
    }
}
