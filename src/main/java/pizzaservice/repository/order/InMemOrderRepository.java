package pizzaservice.repository.order;

import pizzaservice.domain.Order;

import java.util.ArrayList;
import java.util.List;


public class InMemOrderRepository implements OrderRepository {

	private static long ORDERS = 0;
	private List<Order> savedOrders = new ArrayList<>();

	@Override
	public Long saveOrder(Order order) {
		order.setId(ORDERS++);
		savedOrders.add(order);
		return order.getId();
	}
}
