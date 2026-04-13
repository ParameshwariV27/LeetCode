package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSort {
	
	public static void main(String args[])
	{
		List<Book> list = new ArrayList<>();

		list.add(new Book("Java Basics", 300));
		list.add(new Book("Spring Boot Guide", 500));
		list.add(new Book("Data Structures", 450));
		list.add(new Book("Microservices", 500)); // duplicate pages
		list.add(new Book("Algorithms", 350));
		
		Collections.sort(list, (a,b)->{
			if(a.getPages().equals(b.getPages()))
			{
				return a.getTitle().compareTo(b.getTitle());
			}
			return Integer.compare(b.getPages(), a.getPages());
			
		});
		
		
		list.forEach(System.out::println);
	}

}
class Book
{
	private String title;
	private Integer pages;
	
	public Book(String title, Integer pages)
	{
		this.title=title;
		this.pages=pages;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public Integer getPages()
	{
		return this.pages;
	}
	@Override
	public String toString()
	{
		return "Book["+"Title"+title+" , Pages="+pages+"]";
	}
}