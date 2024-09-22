package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterate_ways {

	public static void main(String[] args) {
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("Games of thrones");
		tvSeries.add("Arrow");
		tvSeries.add("Screat Game");
		tvSeries.add("Suits");
		
		//1. using Java 8 with for each and lambda expression
		System.out.println("------print using for each with lambda expression------");
		
		tvSeries.forEach(shows ->{
			System.out.println(shows);
		});
		
        //2. using Iterator
		System.out.println("-----print using iterate---------");
		
		Iterator<String> it = tvSeries.iterator();
				
		while(it.hasNext())
		{
			String shows = it.next();
			System.out.println(shows);
		}
		
		//3. using iterator and Java 8 lambda and foreachRemaining method
		System.out.println("-----print using iterate and and Java 8 lambda and foreachRemaining method---------");
		
		it = tvSeries.iterator();
		it.forEachRemaining(shows ->
		{
			System.out.println(shows);
		});
		
		//4. using for each loop
		System.out.println("---print using for each loop---");
		
		for (String shows : tvSeries) {
			System.out.println(shows);
			
		}
		
		//5. using for loop with order/index
		System.out.println("---print using for loop with order/index---");
		
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
			
		}
		
		//6. using a ListIterator() to traverse in both diretions
		System.out.println("---print using a ListIterator() to traverse in both diretions");
		
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		
		while(tvSeriesListIterator.hasPrevious())
		{
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
	}

	
}
