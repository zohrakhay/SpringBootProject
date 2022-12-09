package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String product_name;
    @Column
    private Long material_id;
   
    @Column
    private boolean availability;

    



    public Long getProductId() {
        return id;
    }
    

    public void setProductId(Long id) {
        this.id = id;
    }

    public Long getMaterialId() {
        return material_id;
    }

    public void setMaterialId(Long id) {
        this.material_id = id;
    }
    public String getProductName() {
        return product_name;
    }

    public void setProductName(String name) {
        this.product_name = name;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

}
