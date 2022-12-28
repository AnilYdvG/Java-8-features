package predefinedFI.java8;

import java.util.function.Predicate;

class PredicatePgm {

	public static void main(String[] args) {
		String[] s = { "Tom", "Jerry", "Mowgli", "Ninja" };
		Predicate<String> p = s1 -> s1.length() > 3;
		Predicate<String> p1 = s1 -> s1.length() <= 5;
		for (String e : s) {
//			if (p.test(e))
//				System.out.println(e);
			if (p.and(p1).test(e))
				System.out.println(e);

		}
		System.out.println("-------------");

		for (String e : s) {
			if (p.or(p1).test(e))
				System.out.println(e);
		}
		System.out.println("============");

		for (String e : s) {
			if (p1.negate().test(e))
				System.out.println(e);
		}

	}
}
