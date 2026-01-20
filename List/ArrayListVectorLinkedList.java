package com.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListVectorLinkedList {

	public static void main(String[] args) {

//		ArrayList

		ArrayList list = new ArrayList();

		list.add("Shruti");
		list.add(21);
		list.add(121);
		list.add("shruti@gmail.com");
		list.add(9546433636l);

		System.out.println(list);
//Q1.Clear the list
//		
		list.clear();
		
		System.out.println(list);

//Q2.Copy same list
//		
		list.clone();
		
		System.out.println(list);

//Q3.Check present or not
//
		System.out.println(list.contains(0));

//Q4.list equal or not
//
		ArrayList list1 = new ArrayList();

		list1.add(56);
		list1.add(34);
		list1.add('s');
		list1.add("shruti");

		System.out.println(list.equals(list1));

//Q5.print hashcode
//
		System.out.println(list.hashCode());

//		Vector

		Vector v = new Vector();

		v.add("Java Full Stack Development");
		v.add(23);
		v.add('#');
		v.add(34564574537654l);
		v.add(45.56);

		System.out.println(v);

//Q6.Element at ... index	
//
		System.out.println(v.elementAt(3));

//Q7.First element
//
		System.out.println(v.firstElement());

//Q8.last element
//
		System.out.println(v.lastElement());

//Q9.index
//
		System.out.println(v.indexOf(v));

//Q10.add element
//		
		v.insertElementAt(v, 1);
		
		System.out.println(v);

//		LinkedList

		LinkedList ll = new LinkedList();

		ll.add("Vaishnavi");
		ll.add('@');
		ll.add(45);
		ll.add(53453656343l);
		ll.add(345.667f);

		System.out.println(ll);

//Q11.Empty or not	
//
		System.out.println(ll.isEmpty());

//Q12.add element at last
//
		ll.offer("Shruti");
		
		System.out.println(ll);

//Q13.add element at first
//		
		ll.offerFirst(34);
		
		System.out.println(ll);

//Q14.pick element
//
		System.out.println(ll.peek());

//Q15.pick last element
//
		System.out.println(ll.peekLast());

//		Generics 
//		ArrayList

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(45);
		list2.add(21);
		list2.add(121);
		list2.add(67);
		list2.add(78);

		System.out.println(list2);

//Q16.Clear list

		list2.clear();
		System.out.println(list2);

//		Vector

		Vector<String> v1 = new Vector<String>();

		v1.add("Java Full Stack Development");
		v1.add("Shruti");
		v1.add("Onkar");
		v1.add("Harsh");
		v1.add("Ganesh");

		System.out.println(v1);

//Q17.remove 1 element	
//
		v1.remove(0);

		System.out.println(v1);

//		LinkedList

		LinkedList<Character> l = new LinkedList<Character>();

		l.add('S');
		l.add('@');
		l.add('&');
		l.add('#');
		l.add('*');

		System.out.println(l);

//Q18.remove first element
//
		l.pollFirst();

		System.out.println(l);

//		foreach
//		ArrayList

		ArrayList<Integer> list3 = new ArrayList<Integer>();

		list3.add(45);
		list3.add(21);
		list3.add(121);
		list3.add(67);
		list3.add(78);

		System.out.println(list3);

//Q19.int print in single line	

		for (Integer a : list3) {
			System.out.println(a);
		}

//		Vector

		Vector<String> v2 = new Vector<String>();

		v2.add("Java Full Stack Development");
		v2.add("Shruti");
		v2.add("Onkar");
		v2.add("Harsh");
		v2.add("Ganesh");

		System.out.println(v2);

//Q20.string print in single line
//		
		for (String ab : v2) {
			System.out.println(ab);
		}

//		LinkedList

		LinkedList<Character> l2 = new LinkedList<Character>();

		l2.add('S');
		l2.add('@');
		l2.add('&');
		l2.add('#');
		l2.add('*');

		System.out.println(l2);
//Q21.char print in single line

		for (Character abc : l2) {
			System.out.println(abc);
		}

	}

}
