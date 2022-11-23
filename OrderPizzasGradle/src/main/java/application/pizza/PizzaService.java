package application.pizza;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import application.pizza.model.Order;
import application.pizza.model.Pizza;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaService {
    private static final Logger logger = LogManager.getLogger(PizzaService.class);

    int orderCounter = 1;

    private List<Pizza> pizzaList = List.of(
            new Pizza("Margarita", 20.2),
            new Pizza("4 Cheese", 25),
            new Pizza("New yorker", 27.4));

    public Order makeOrder(Pizza pizza){
        logger.info("Method makeOrder used.");
        if (pizza == null || pizzaList.stream().noneMatch(p -> p.getName().equalsIgnoreCase(pizza.getName()))){
            throw new PizzaNotFoundException();
        }
        return new Order(orderCounter++, pizza);
    }

    public List<Pizza>getAvailablePizzas(){
        logger.info("Method getAvailablePizzas used.");
        return pizzaList;
    }

}
