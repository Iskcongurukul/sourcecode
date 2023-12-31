package p1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSumOfIntegersDemo {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4);
		 Optional<Integer> r = l.stream().reduce((a,b)->a+b);
		 System.out.println(r.get());
		
	}

}
