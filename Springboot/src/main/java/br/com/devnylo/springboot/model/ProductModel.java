package br.com.devnylo.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class ProductModel {

    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "valor")
    private double valor;

    //GETTER AND SETTER
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
