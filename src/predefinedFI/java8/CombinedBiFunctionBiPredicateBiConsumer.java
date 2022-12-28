package predefinedFI.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class CombinedBiFunctionBiPredicateBiConsumer {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();

		BiFunction<String, Integer, Employee> f = (ename, salary) -> new Employee(ename, salary);

		l.add(f.apply("Tom", 1000));
		l.add(f.apply("Jerry", 2000));
		l.add(f.apply("Mowgli", 3000));
		l.add(f.apply("Ninja", 4000));

		BiConsumer<Employee, Integer> c = (e, i) -> {
			e.salary += i;
			System.out.print("Ename: " + e.name);
			System.out.println(" >> Salary: " + e.salary);
			System.out.println();
		};

		Predicate<Employee> p = (e) -> e.salary < 3000;
		Predicate<Employee> p1 = (e) -> e.salary > 3500;

		for (Employee e : l) {
			if (p.test(e))
				c.accept(e, 500);

			if (p1.test(e))
				c.accept(e, -200);

		}

	}
}

//class Employees{
//	String name;
//	double salary;
//	Employees(String name,double salary){
//		this.name=name;
//		this.salary=salary;
//	}
//}
