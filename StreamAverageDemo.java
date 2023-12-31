package p1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamAverageDemo {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4); 
		double d = l.stream().mapToInt(e->e).average().getAsDouble(); 
		
		// we can't use average() method directly on stream we have to introduce one step in middle i.e mapToint i.e convert each stream Integer object to int
		System.out.println(d);
	}

}
