package p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSecondHighestNumber {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,25,66,89,99,152,367,367,999,1000);
		
		Integer integer = l.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(integer);
		
	}

}
