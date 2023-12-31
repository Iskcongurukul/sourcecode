package p1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamforEachDemo {
	
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(35);
		marks.add(60);
		marks.add(45);
		marks.add(75);
		marks.add(55);
		marks.add(80);
		System.out.println(marks);
		Consumer<Integer> c = i ->System.out.println("The square of "+i+" is "+i*i);
		marks.stream().forEach(c);
	}
}
