package streams.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorted {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("AAA");
		l.add("AA");
		l.add("AAAAA");
		l.add("AAAA");
		l.add("AAAAAAAA");
		l.add("XXX");
		System.out.println(l);
		List<String> sortedList = l.stream().sorted((s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			return (l1 > l2) ? 1 : (l1 < l2) ? -1 : s1.compareTo(s2);
		}).collect(Collectors.toList());

		Comparator<String> c = (a1, a2) -> {
			int l1 = a1.length();
			int l2 = a2.length();
			return (l1 > l2) ? -1 : (l1 < l2) ? 1 : -a1.compareTo(a2);
		};
		List<String> sortedList2 = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(sortedList2);
	}
}
