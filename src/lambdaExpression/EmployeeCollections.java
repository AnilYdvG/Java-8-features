package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCollections {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Tom", 125));
		l.add(new Employee("Mowgli", 140));
		l.add(new Employee("Jerry", 130));
		
		System.out.println(l);
		Collections.sort(l, new MyComp());
		System.out.println(l);
	}
}

class Employee {
	String name;
	int eno;
	public Employee(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eno=" + eno + "]";
	}
}

class MyComp implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.eno < o2.eno) ? -1 : (o1.eno > o2.eno) ? 1 : 0;
	}
}
