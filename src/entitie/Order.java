package entitie;

import java.util.Date;

import entitie.enu.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;

	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {

		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public Date getMoment() {
		return this.moment;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

	@Override
	public String toString() {
		
		return "Data Status:\n" + String.format("Id: " + this.id + ", " + "Date: " + this.moment + ", " + "Status: " + this.status);
	}
}
