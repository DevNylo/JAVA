package br.com.devnylo.produtosemestoque.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shirt")
public class Shirt {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column
    private String brand;

    @Column
    private String color;

    @Column
    private String size;



    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
