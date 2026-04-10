package Instance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import instance_enum.OrderStatus;
public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<Orderitem> items = new ArrayList<>();

	public Order() {
		
	}
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Orderitem> getItems() {
		return items;
	}
	
	
	public void addItem(Orderitem item) {
		items.add(item);
	}
	public void removeItem(Orderitem item) {
		
		items.remove(item);
	}
	public double total () {
		double total=0;
		for (Orderitem x : items) {
				total += x.subTotal();
			
		}
		return total;
		
		
	}
	
	
	
}
