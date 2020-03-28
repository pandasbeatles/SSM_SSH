package com.xiaochen.beatles.pojo;

import lombok.ToString;

import javax.persistence.*;

/**
 * @author xiaochen
 */
@ToString
@Entity
@Table(name = "product")
public class Product {
    private int id;
    private String name;
    private double price;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
