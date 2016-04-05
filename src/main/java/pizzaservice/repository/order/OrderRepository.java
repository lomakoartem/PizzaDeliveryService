package pizzaservice.repository.order;


import pizzaservice.domain.Order;

public interface OrderRepository {

	Long saveOrder(Order newOrder);
}
