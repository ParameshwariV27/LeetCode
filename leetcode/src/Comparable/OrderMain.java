package Comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderMain {
	public static void main(String args[])
	{
		
		List<Order> list = new ArrayList<>();
		list.add(new Order(1, 845, LocalDate.of(2025, 12, 16)));
		list.add(new Order(2,129, LocalDate.of(2026, 01, 24)));
		list.add(new Order(3,129, LocalDate.of(2026, 3, 2)));
		list.add(new Order(4, 554,LocalDate.of(2025, 9, 27)));
		list.add(new Order(5,980,LocalDate.of(2025, 9, 27)));
		Collections.sort(list);
		list.forEach(System.out::println);
		
		
	}

}
class Order implements Comparable<Order>{
	
	private Integer orderId;
	private Integer amount;
	private LocalDate date;
	
	public Order(int orderId,  int amount, LocalDate date)
	{
		this.orderId = orderId;
		this.amount=amount;
		this.date=date;
	
	}

	@Override
	public String toString() {
		return "Employee [orderId=" + orderId +" , amount="+amount+ " , date="+date+"]";
	}

	@Override
	public int compareTo(Order o) {
		if(!o.date.equals(this.date))
		{
			return o.date.compareTo(this.date);
		}
		else
			return o.amount.compareTo(this.amount);
	}
	
}
