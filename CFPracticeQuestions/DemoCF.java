package CFPracticeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoCF {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

//Q1.Create ArrayList and add 5 integers to it.		
//		
//		System.out.print("Five Integer Elements = ");
//		System.out.println(list);

//Q2.Display all elements of a list using for-each loop
//
//		for (Integer a : list) {
//			System.out.println(a);
//		}

//Q3.add element on specific index
//
//		System.out.println(list);
//
//		list.add(0, 10);
//
//		System.out.println(list);

//Q4.remove an element from a list using index
//
//		list.remove(0);
//
//		System.out.println(list);

//Q5.find the size of a list
//
//		System.out.println(list);
//
//		System.out.println(list.size());

//Q6.Check whether a list is empty or not
//
//		System.out.println(list);
//
//		System.out.println(list.isEmpty());

//Q7.Retrive an element from a list using get() method
//
//		System.out.println(list.get(1));

//Q8.Create a HashSet and add 5 String values		
//
//		Set<String> s = new HashSet<String>();
//
//		s.add("Shruti");
//		s.add("Onkar");
//		s.add("Harsh");
//		s.add("Ganesh");
//		s.add("Vaishnavi");
//
//		System.out.println(s);

//Q9.Try to add duplicates elements in a set observe the output
//
//		Set<Integer> s1 = new HashSet<Integer>();
//
//		s1.add(1);
//		s1.add(2);
//		s1.add(3);
//		s1.add(1);
//		s1.add(2);
//
//		System.out.println(s1);

//Q10.Display all elements of a set using for-each loop
//
//		Set<Character> s3 = new HashSet<Character>();
//
//		s3.add('@');
//		s3.add('#');
//		s3.add('$');
//		s3.add('%');
//		s3.add('&');
//
//		for (Character b : s3) {
//			System.out.println(b);
//		}

//Q11.Check wheather a specific element exists in a set
//
//		Set<Integer> s4 = new HashSet<Integer>();
//
//		s4.add(11);
//		s4.add(12);
//		s4.add(13);
//		s4.add(14);
//		s4.add(15);
//
//		System.out.println(s4);
//
//		System.out.println(s4.contains(11));

//Q12.Remove all elements from a set
//
//		Set<Integer> s5 = new HashSet<Integer>();
//
//		s5.add(11);
//		s5.add(12);
//		s5.add(13);
//		s5.add(14);
//		s5.add(15);
//
//		System.out.println(s5);
//
//		s5.removeAll(s5);
//
//		System.out.println(s5);

//Q13.Find total number of elements in a set
//
//		Set<Integer> s6 = new HashSet<Integer>();
//
//		s6.add(11);
//		s6.add(12);
//		s6.add(13);
//		s6.add(14);
//		s6.add(15);
//
//		System.out.println(s6);
//
//		System.out.println(s6.size());

//Q14.Create a HashMap and store Roll no. as key and Name as Value
//
//		Map<Integer, String> m = new HashMap();
//
//		m.put(1, "Shruti");
//		m.put(2, "Onkar");
//		m.put(3, "Harsh");
//		m.put(4, "Ganesh");
//		m.put(5, "Vaishnavi");
//
//		System.out.println(m);

//Q15.Display all key-value pairs using entrySet()
//
//		Map<Integer, String> m1 = new HashMap();
//
//		m1.put(1, "Shruti");
//		m1.put(2, "Onkar");
//		m1.put(3, "Harsh");
//		m1.put(4, "Ganesh");
//		m1.put(5, "Vaishnavi");
//
//		System.out.println(m1);
//
//		for (Entry<Integer, String> entry : m1.entrySet()) {
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//		}

//Q16.Retrive a value using a key from map
//
//		Map<Integer, String> m6 = new HashMap();
//
//		m6.put(1, "Shruti");
//		m6.put(2, "Onkar");
//		m6.put(3, "Harsh");
//		m6.put(4, "Ganesh");
//		m6.put(5, "Vaishnavi");
//
//		System.out.println(m6);
//
//		System.out.println(m6.get(2));

//Q17.Check whether key exists in map
//
//		Map<Integer, String> m2 = new HashMap();
//
//		m2.put(1, "Shruti");
//		m2.put(2, "Onkar");
//		m2.put(3, "Harsh");
//		m2.put(4, "Ganesh");
//		m2.put(5, "Vaishnavi");
//
//		System.out.println(m2);
//
//		System.out.println(m2.containsKey(1));

//Q18.Check whether value exists in map		
//
//		Map<Integer, String> m3 = new HashMap();
//
//		m3.put(1, "Shruti");
//		m3.put(2, "Onkar");
//		m3.put(3, "Harsh");
//		m3.put(4, "Ganesh");
//		m3.put(5, "Vaishnavi");
//
//		System.out.println(m3);
//
//		System.out.println(m3.containsValue("Shruti"));

//Q19.Remove an entry from Map Using key
//
//		Map<Integer, String> m4 = new HashMap();
//
//		m4.put(1, "Shruti");
//		m4.put(2, "Onkar");
//		m4.put(3, "Harsh");
//		m4.put(4, "Ganesh");
//		m4.put(5, "Vaishnavi");
//
//		System.out.println(m4);
//
//		m4.remove(1);
//
//		System.out.println(m4);

//Q20.Find the Size of a Map
//
//		Map<Integer, String> m5 = new HashMap();
//
//		m5.put(1, "Shruti");
//		m5.put(2, "Onkar");
//		m5.put(3, "Harsh");
//		m5.put(4, "Ganesh");
//		m5.put(5, "Vaishnavi");
//
//		System.out.println(m5);
//
//		System.out.println(m5.size());

	}

}
