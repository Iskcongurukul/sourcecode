package p1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamtoArrayDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(35);
		marks.add(60);
		marks.add(45);
		marks.add(75);
		marks.add(55);
		marks.add(80);
		System.out.println(marks);
		Integer[] i = marks.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
		
	}
}
