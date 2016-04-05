package pizzaservice.repository.pizza;

import pizzaservice.domain.Pizza;

import java.util.ArrayList;
import java.util.List;


public class InMemPizzaRepository implements PizzaRepository {

    private List<Pizza> existingPizzas = new ArrayList<Pizza>();

    @Override
    public Pizza getPizzaByID(int id) {
        for (Pizza p : existingPizzas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

   /* @PostConstruct
    public void cookPizzas() {
        existingPizzas.add(new Pizza(1, "Pepperony", 1., Pizza.Type.VEGETERIAN));
        existingPizzas.add(new Pizza(2, "Second pizza", 1., Pizza.Type.SEA));
        existingPizzas.add(new Pizza(3, "Bonus", 1., Pizza.Type.MEAT));
    }*/
    
    public void init() {
        existingPizzas.add(new Pizza(1, "Pepperony", 1., Pizza.Type.VEGETERIAN));
        existingPizzas.add(new Pizza(2, "Second pizza", 1., Pizza.Type.SEA));
        existingPizzas.add(new Pizza(3, "Bonus paradise", 1., Pizza.Type.MEAT));
    }

}
