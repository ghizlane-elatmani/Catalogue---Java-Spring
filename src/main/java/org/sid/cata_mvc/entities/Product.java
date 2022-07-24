package org.sid.cata_mvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String designation;
    private double price;
    private int quantity;

    public Product() {
        // TODO Auto-generated constructor stub
    }

    public Product(String designation, double price, int quantity){
        super();
        this.designation = designation;
        this.price = price;
        this.quantity = quantity;
    }

    //  === GETTERS & SETTERS ===
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
