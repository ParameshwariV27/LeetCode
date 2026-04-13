package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NullHandling {
	public static void main(String args[])
	{
		List<User> users = new ArrayList<>();

		users.add(new User("Ram", 25));
		users.add(new User(null, 30));
		users.add(new User("Amit", 22));
		users.add(new User("Zara", 28));
		users.add(new User(null, 35));
		users.add(new User("John", 27));
		users.add(new User("Amit", 24)); // same name, different age
		
		Collections.sort(users);
		
		users.stream().forEach(System.out::println);
	}

}


class User implements Comparable<User>
{
	private String name;
	private Integer age;
	
	public User(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "User["+"Name="+name+" , Age="+age+"]";
	}
	
	@Override
	public int compareTo(User o)
	{
		if(this.name==null && o.name==null)
		{
			return Integer.compare(this.age, o.age);
		}
		else if(this.name==null)
		{
			return 1;
		}
		else if(o.name==null)
		{
			return -1;
		}
		
		else 
		{
			Integer diff = this.name.compareTo(o.name);
			if(diff!=0)
			{
			return this.name.compareTo(o.name);
			}
			else
			{
			return Integer.compare(this.age, o.age);
			}
		}
}
}