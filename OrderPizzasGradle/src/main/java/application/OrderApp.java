package application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import application.pizza.PizzaNotFoundException;
import application.pizza.PizzaService;
import application.pizza.model.Pizza;


@SpringBootApplication
public class OrderApp {
    private static final Logger logger = LogManager.getLogger(OrderApp.class);

    public static void main (String[] args){
        SpringApplication.run(OrderApp.class, args);

        PizzaService pizzaService = new PizzaService();

        for (int i = 0; i < pizzaService.getAvailablePizzas().size(); i++){
            System.out.println((i + 1) + ". " + pizzaService.getAvailablePizzas().get(i));
        }

        System.out.println(pizzaService.makeOrder(pizzaService.getAvailablePizzas().get(0)));
        System.out.println(pizzaService.makeOrder(pizzaService.getAvailablePizzas().get(1)));
        System.out.println(pizzaService.makeOrder(pizzaService.getAvailablePizzas().get(0)));

        try {
            System.out.println(pizzaService.makeOrder(new Pizza("Pineapple", 12.99)));
        } catch (PizzaNotFoundException e) {
            System.out.println(e.getMessage());
            logger.error(e.getMessage(),e);
        }

        try {
            System.out.println(pizzaService.makeOrder(null));
        } catch (PizzaNotFoundException e) {
            System.out.println(e.getMessage());
            logger.error(e.getMessage(),e);
        }


    }
}
