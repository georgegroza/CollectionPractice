package collectionspack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.io.*;

public class Collections {
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Pear");
		fruits.add("Apple");
		fruits.add("Cherries");
		fruits.add("Bananas");
		
	/*	// 1. Printing the ArrayList.
		System.out.println(fruits);
		
		// 2. Traversing the ArrayList using Iterator
		fruits.add(2, "Grapes");
		Iterator<String> itr =  fruits.iterator(); //getting the iterator
		
		while (itr.hasNext())  { // checking if iterator has elements
			System.out.print(itr.next() + " "); // printing the element and move to next
		}
		
		// 3. Traversing the ArrayList using for-each loop
		fruits.add("Orange");
		
		System.out.println(); // adding new line
		
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		
		// 4. Traversing the ArrayList using forEach method(this method was introduced starting with java 8)
		
		fruits.set(4, "Peaches"); // changing element at index 4 with Peaches.
		
		fruits.forEach(fruit -> {System.out.println(fruit);}); // using lambda(->) expression. */
		
		//Creating Students.class objects
		Students s1 = new Students(101, 20, "George");
		Students s2 = new Students(102, 22, "Florin");
		Students s3 = new Students(103, 24, "Diana");
		Students s4 = new Students(104, 23, "Ionut");
		
		// Creating an ArrayList and adding the students
		ArrayList<Students> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
		
		//Traversing and printing the ArrayList
		Iterator<Students> it = students.iterator();
		while (it.hasNext()) {
			Students st = it.next();
			System.out.println(st.rollNo + " " + st.age + " " + st.name);
		}
		
		// 5. SERIALIZATION AND DESERIALIZATION
		
		try {
			// SERIALIZATION
			FileOutputStream fos = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(fruits);
			fos.close();
			oos.close();
			
			// DESERIALIZATION
			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> desStudents =(ArrayList) ois.readObject();
			System.out.println(desStudents);
			
			fis.close();
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}	
}
