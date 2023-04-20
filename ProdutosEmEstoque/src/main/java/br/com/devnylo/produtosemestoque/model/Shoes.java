package br.com.devnylo.produtosemestoque.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "shoes")
public class Shoes {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String brand;
    private Byte size;
    private String material;

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

    public Byte getSize() {
        return size;
    }

    public void setSize(Byte size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
