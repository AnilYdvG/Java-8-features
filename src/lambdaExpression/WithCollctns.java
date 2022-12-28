package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;			

public class WithCollctns {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(23);
		l.add(1);
		l.add(13);
		System.out.println(l);
		Collections.sort(l,(o1,o2)-> (o1>o2)?1:(o1<o2)?-1:0);
		System.out.println(l);

	}
}

//class MyComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
////		return o1-o2;
//		return (o1<o2)?-1:(o1>o2)?1:0;
//	}
//	
//}