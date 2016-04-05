package pizzaservice.service;


import pizzaservice.domain.Customer;
import pizzaservice.domain.Order;

public interface OrderService {

	Order placeNewOrder(Customer customer, Integer... pizzasID);

}