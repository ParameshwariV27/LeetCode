package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseInsensitiveSorting {

	public static void main(String args[])
	{
		List<Person> people = new ArrayList<>();

		people.add(new Person("apple"));
		people.add(new Person("Banana"));
		people.add(new Person("APPLE"));
		people.add(new Person("banana"));
		people.add(new Person("Cherry"));
		people.add(new Person("cherry"));
		people.add(new Person("Apricot"));
		people.add(new Person("apricot"));
		
		Collections.sort(people);
		people.stream().forEach(System.out::println);
	}
}
class Person implements Comparable<Person>
{
private String name;

public Person(String name)
{
	this.name=name;
}
@Override
public String toString()
{
	return "Names["+"Name="+name+"]";
}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int diff = this.name.compareToIgnoreCase(o.name);
		return diff;
	}
}