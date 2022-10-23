package pizza;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pizza.model.Order;
import pizza.model.Pizza;

import java.util.List;
import java.util.logging.Level;

public class PizzaService {
    private static final Logger logger = LogManager.getLogger(PizzaService.class);

    int orderCounter = 1;

    private List<Pizza> pizzaList = List.of(
            new Pizza("Margarita", 20.2),
            new Pizza("4 Cheese", 25),
            new Pizza("New yorker", 27.4));

    public Order makeOrder(Pizza pizza){
        logger.info("Method makeOrder used.");
        if (pizza == null || pizzaList.stream().filter(p -> p.getName().equalsIgnoreCase(pizza.getName())).toList().isEmpty()){
            throw new PizzaNotFoundException();
        }
        return new Order(orderCounter++, pizza);
    }

    public List<Pizza>getAvailablePizzas(){
        logger.info("Method getAvailablePizzas used.");
        return pizzaList;
    }

}
