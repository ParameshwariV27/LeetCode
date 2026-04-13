package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();

		list.add(new Product(101, 500));
		list.add(new Product(102, 300));
		list.add(new Product(103, 700));
		list.add(new Product(104, 200));
		list.add(new Product(105, 500)); // duplicate price (important case)
		
		Collections.sort(list, (e1, e2)->
		{
			if(e1.getPrice().equals(e2.getPrice()))
			{
				return Integer.compare(e1.getId(),e2.getId());
			}
			return Integer.compare(e1.getPrice(),e2.getPrice());
			
		});
		
		list.forEach(System.out::println);
		
	}

}
class Product
{
	private Integer id;
	private Integer price;
	
	public Product(int id, int price)
	{
		this.id = id;
		this.price=price;
	}
	
	public Integer getId()
	{
		return this.id;
	}
	
	public Integer getPrice()
	{
		return this.price;
	}
	
	@Override
	public String toString()
	{
		return "Product["+"Id="+id+" , Price="+price+"]";
	}
}