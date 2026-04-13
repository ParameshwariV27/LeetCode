package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieRatingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<MovieComparable> l = new ArrayList<>();
		l.add(new MovieComparable(8.9,2025,"Sitaramam"));
		l.add(new MovieComparable(8.1,2020,"Bahubali"));
		l.add(new MovieComparable(6.9,2021,"LoveMocktail"));
		l.add(new MovieComparable(6.9,2025,"LoveMocktail2"));
		l.add(new MovieComparable(5.9,2024,"RRR"));
		l.add(new MovieComparable(9.9,2026,"Dhurandhar"));
		
		Collections.sort(l);
		l.forEach(System.out::println);

	}

}
class MovieComparable implements Comparable<MovieComparable>
{
	private Double rating;
	private Integer year;
	private String name;
	
	public MovieComparable(double rating , int year, String name)
	{
		this.rating = rating;
		this.year = year;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "MovieComparable["+"Rating="+ rating+", Year="+year+" , name="+name+"]";
	}
	
	@Override
	public int compareTo(MovieComparable m)
	{
		int ratingdiff = Double.compare(m.rating, this.rating) ;
		if(ratingdiff!=0)
		{
			return ratingdiff;
		}
		int yearDiff = Integer.compare(this.year, m.year);
		if(yearDiff!=0)
		{
			return yearDiff;
		}
		else
		{
			return this.name.compareTo(m.name);
		}
	}
	

}