package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(35);
		marks.add(60);
		marks.add(45);
		marks.add(75);
		marks.add(55);
		marks.add(80);
		System.out.println(marks);
		Comparator<Integer> c = (i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0;
		List<Integer> sortedMarks = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(sortedMarks);
	}
}
