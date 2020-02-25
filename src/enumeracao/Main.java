package enumeracao;

import java.util.Date;

import entitie.Order;
import entitie.enu.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDENTE);
		
		System.out.println(order.toString());

	}

}
