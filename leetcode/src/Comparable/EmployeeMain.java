package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Amit", 30, 50000, "IT"));
		list.add(new Employee("Ravi", 25, 70000, "HR"));
		list.add(new Employee("Sneha", 28, 50000, "IT"));
		list.add(new Employee("John", 35, 70000, "IT"));
		list.add(new Employee("Zara", 22, 40000, "HR"));
		list.add(new Employee("Ankit", 30, 70000, "IT"));
		list.add(new Employee("Meena", 25, 70000, "HR"));
		list.add(new Employee("Raj", 30, 50000, "Finance"));
		list.add(new Employee("Kiran", 27, 50000, "Finance"));
		list.add(new Employee("Arun", 30, 50000, "IT"));
		
		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
class Employee implements Comparable<Employee>
{
	private String name;
	private Integer age;
	private Integer salary;
	private String department;
	
	public Employee(String name, int age, int salary, String department)
	{
		this.name=name;
		this.age=age;
		this.salary = salary;
		this.department=department;
	}
	
	@Override
	public String toString()
	{
		return "Employee["+"Name="+name+" , Age="+age+" , Salary= "+salary+" , Department="+department+"]";
	}
	
	@Override
	public int compareTo(Employee o)
	{
		int depDiff = this.department.compareTo(o.department);
		if(depDiff!=0)
		{
			return depDiff;
		}
		else
		{
			int salDiff = Integer.compare(o.salary, this.salary);
			if(salDiff !=0)
			{
				return salDiff;
			}
			else
			{
				int ageDiff = Integer.compare(this.age, o.age);
				if(ageDiff!=0)
				{
					return ageDiff;
				}
				else
				{
					return this.name.compareTo(o.name);
				}
			}
		}
	}
}