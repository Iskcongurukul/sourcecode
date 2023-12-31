package p1;

import java.util.ArrayList;

public class StreamMinAndMaxValueDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(35);
		marks.add(60);
		marks.add(45);
		marks.add(75);
		marks.add(55);
		marks.add(80);
		System.out.println(marks);

		Integer min = marks.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		Integer max = marks.stream().max((i1, i2) -> i1.compareTo(i2)).get();

		System.out.println("Asc ord : " + min + "..." + max);

		Integer min1 = marks.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		Integer max1 = marks.stream().max((i1, i2) -> i2.compareTo(i1)).get();

		System.out.println("Dsc ord : " + min1 + "..." + max1);

	}

}
