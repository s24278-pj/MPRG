package pizza.model;

import lombok.Data;

public @Data class  Order {
    private int number;
    private String pizza;
    private double price;

    public Order(int number, Pizza pizza) {
        this.number = number;
        this.pizza = pizza.getName();
        this.price = pizza.getPrice();
    }

//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
//
//    public String getPizza() {
//        return pizza;
//    }
//
//    public void setPizza(String pizza) {
//        this.pizza = pizza;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

    public String toString (){
        return "Order number: " + number + ", Pizza: " + pizza + " , Price: " + price;
    }
}
