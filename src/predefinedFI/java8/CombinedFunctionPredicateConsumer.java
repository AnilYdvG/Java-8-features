package predefinedFI.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CombinedFunctionPredicateConsumer {

	public static void main(String[] args) {
		Function<Employee, String> f = s -> {
			int salary = s.salary;
			return salary > 50000 ? "A[CEO]" : salary > 30000 ? "B[AM]" : salary > 20000 ? "C[Er]" : "D[Others]";
		};
		Predicate<Employee> p = s -> s.salary > 36000;

		Employee[] e = { new Employee("Tom", 60000), new Employee("Jerry", 45000), new Employee("Mowgli", 35000),
				new Employee("Ninja", 25000), new Employee("ScoobyDoo", 5000) };

		Consumer<Employee> c = s -> {
			System.out.print(s.name+":");
			System.out.print(s.salary+":");
			System.out.println(f.apply(s));
			
//			if(p.test(s)) {
//				System.out.print(s.name+":");
//				System.out.print(s.salary+":");
//				System.out.println(f.apply(s));
//			}
		};
		for(Employee e1:e) {
			c.accept(e1);
//			if(p.test(e1))
//				c.accept(e1);
		}

//		for (Employee e1 : e) {
//			System.out.print(e1.name + ":");
//			System.out.print(e1.salary + ":");
//			System.out.println(f.apply(e1));
//		}
//		System.out.println("-----------------------");
//		for (Employee e1 : e) {
//			if (p.test(e1)) {
//				System.out.print(e1.name + ":");
//				System.out.print(e1.salary + ":");
//				System.out.println(f.apply(e1));
//			}
//		}
	}
}

class Employee {
	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}
