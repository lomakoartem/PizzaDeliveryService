package pizzaservice.repository.pizza;


import pizzaservice.domain.Pizza;

public interface PizzaRepository {

	Pizza getPizzaByID(int id);
}
