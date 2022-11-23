package application.pizza.model;

import lombok.Data;

@Data
public class Pizza {
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Pizza: " + name + ", Price: " + price;
    }
}
