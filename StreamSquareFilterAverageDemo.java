package p1;

import java.util.Arrays;
import java.util.List;

public class StreamSquareFilterAverageDemo {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4);
		
		double m = l.stream().map(e->e*e).filter(e->e>2).mapToInt(e->e).average().getAsDouble();
		System.out.println(m);
		
	}

}
