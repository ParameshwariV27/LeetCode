package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransactionLogic {
	
public static void main(String args[])
{
	List<Transaction> list = new ArrayList<>();

	list.add(new Transaction("credit", 1000));
	list.add(new Transaction("debit", 5000));
	list.add(new Transaction("credit", 2000));
	list.add(new Transaction("debit", 1000));
	list.add(new Transaction("credit", 1500));
	list.add(new Transaction("debit", 7000));
	list.add(new Transaction("credit", 2000)); // duplicate amount
	list.add(new Transaction("debit", 5000));  // duplicate amount
	Collections.sort(list);
	
	list.forEach(System.out::println);
}

}
class Transaction implements Comparable<Transaction>
{
	private String type;
	private Integer amount;
	
	public Transaction(String type, int amount)
	{
		this.type = type;
		this.amount = amount;
	}

	@Override
	public String toString()
	{
		return "Transaction["+"Type="+type+" , Amount="+amount+"]";
	}
	@Override
	public int compareTo(Transaction o) {
		// TODO Auto-generated method stub
		int thisp = (this.type.equals("credit"))?1:2;
		int op = (o.type.equals("credit"))?1:2;
		if(thisp!=op)
			return Integer.compare(thisp, op);
		return Integer.compare(o.amount, this.amount);
	}
}