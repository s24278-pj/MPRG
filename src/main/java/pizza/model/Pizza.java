package pizza.model;

import lombok.Data;

public @Data
class Pizza {
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

    public String toString(){
        return "Pizza: " + name + ", Price: " + price;
    }
}
