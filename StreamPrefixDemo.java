package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrefixDemo {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(2,22,35,689,2456,8756,-219,-365,4785,986,2365,2478965);
		List<Integer> list = l.stream().map(String::valueOf).filter(e->e.startsWith("2")|| e.startsWith("-2")).map(Integer::valueOf).collect(Collectors.toList());
	
	System.out.println(list);
	}

}
