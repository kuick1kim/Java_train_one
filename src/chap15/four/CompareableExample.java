package chap15.four;

import java.util.Iterator;
import java.util.TreeSet;

public class CompareableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name +":"+ person.age);
		}
	}

}
