package entities;

public class Cachorro {
    // ATRIBUTOS
    public String corOlhos;
    public String corPelo;
    public int qtdPatas;

    private String movimento = "Andando";

    public String getMovimento(){
        return this.movimento;
    }
    public void setMovimento(String movimento){
        this.movimento = movimento;
    }
    // MÉTODOS


    @Override
    public String toString() {
        return "Jack{" +
                "corOlhos='" + corOlhos + '\'' +
                ", corPelo='" + corPelo + '\'' +
                ", qtdPatas=" + qtdPatas +
                '}';
    }
    public void latir(){
        System.out.println("Latindo!");
    }
}
