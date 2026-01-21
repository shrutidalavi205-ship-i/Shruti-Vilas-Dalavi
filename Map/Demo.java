package Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Name");
		list.add("Roll No.");
		list.add("Age");
		list.add("Email");
		list.add("City");

//		System.out.println(list);

		List<String> list1 = new ArrayList<>();

		list1.add("Shruti");
		list1.add("1");
		list1.add("21");
		list1.add("shruti@gmail.com");
		list1.add("Pune");

		Map<String, String> ht = new Hashtable<>();

//		System.out.println(list + " " + list1);
		for (int i = 0; i < list.size(); i++) {
			ht.put(list.get(i), list1.get(i));
		}


		for (Map.Entry<String, String> entry : ht.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

//		
	}
}
