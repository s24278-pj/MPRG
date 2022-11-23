package application.pizza.model;
import lombok.Data;

@Data
public class  Order {
    private int number;
    private String pizza;
    private double price;

    public Order(int number, Pizza pizza) {
        this.number = number;
        this.pizza = pizza.getName();
        this.price = pizza.getPrice();
    }

    public String toString (){
        return "Order number: " + number + ", Pizza: " + pizza + " , Price: " + price;
    }
}
