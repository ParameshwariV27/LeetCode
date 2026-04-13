package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ECommerceProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item> items = new ArrayList<>();

		items.add(new Item("Laptop", 50000, 5000));     // final = 45000
		items.add(new Item("Mobile", 20000, 2000));     // final = 18000
		items.add(new Item("Tablet", 20000, 2000));     // final = 18000 (same as Mobile)
		items.add(new Item("Headphones", 5000, 500));   // final = 4500
		items.add(new Item("Monitor", 15000, 1000));    // final = 14000
		items.add(new Item("Keyboard", 3000, 500));     // final = 2500
		items.add(new Item("Mouse", 2000, 200));        // final = 1800
		
		Collections.sort(items);
		items.stream().forEach(System.out::println);

	}

}

class Item implements Comparable<Item>
{
	private String name;
	private Integer price;
	private Integer discount;
	
	public Item(String name, Integer price, Integer discount)
	{
		this.name=name;
		this.price=price;
		this.discount=discount;
	}
	
	@Override
	public String toString()
	{
		return "Item["+"Name="+name+" , Price="+price+" , Discount="+discount+"]";
	}
	
	@Override
	public int compareTo(Item e)
	{
		int odiff = this.price-this.discount;
		int ediff = e.price-e.discount;
		if(odiff != ediff)
		{
			return odiff-ediff;
		}
		else
		{
			return this.name.compareTo(e.name);
		}
	}
}
