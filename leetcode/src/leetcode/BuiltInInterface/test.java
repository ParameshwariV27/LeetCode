package leetcode.BuiltInInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class test {
public static void main(String args[])
{

	Addition ad = (a, b)->a+b;
	System.out.println(ad.add(9, 8));
	
	Predicate<Integer> p = n->n%2==0;
	System.out.println(p.test(2));
	
	Consumer c = ch->System.out.println(ch);
	c.accept("hellworld");
	
	Function<Integer, Integer> s = (n)->n*n;
	System.out.println(s.apply(6));
	
	Supplier sup = ()->Math.random();
	System.out.println(sup.get());
	
	
}
}
