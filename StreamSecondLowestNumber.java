package p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSecondLowestNumber {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10, 11, 12, 25, 66, 89, 99, 152, 367, 367, 999, 1000);

		Integer integer = l.stream().sorted().distinct().skip(2).findFirst().get();
		System.out.println(integer);

	}

}
