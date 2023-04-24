package br.com.api.conceitosdeapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Column
    private String nome;
    @Column
    private Integer idade;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
