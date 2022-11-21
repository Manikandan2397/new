package test.collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//list
		
		List a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add("deepak");
		a.add(true);
		
		List <Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		
		
		int size = l.size();
		System.out.println(size);
		System.out.println("mani");
		
		Integer integer = l.get(0);
		System.out.println(integer);
		System.out.println(l.size());
		int indexOf = l.indexOf(20);
		System.out.println(indexOf);
		
		
		l.addAll(a);
		System.out.println(l);
		
		
		
		
}

}
