package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedDemo {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("ramjee");
		l.add("aditya shanmuk");
		l.add("sairam arigela");
		l.add("krishna rohit");
		l.add("karthi");
		l.add("mahankali kashyap");
		System.out.println(l);
		Comparator<String> c = (s1, s2) -> {
			int i1 = s1.length();
			int i2 = s2.length();
			if (i1 > i2) {
				return +1;
			} else if (i1 < i2) {
				return -1;
			} else
				return s1.compareTo(s2);
		};
		List<String> sortedList = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
