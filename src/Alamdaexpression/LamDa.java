package Alamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 Lamda Expression: Dùng biểu thức lamda Java 8 để sắp xếp 1 list.*/
public class LamDa {
	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.toString());
		}

		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		// Can write
		listDevs.sort(new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		// sort by name
		Collections.sort(listDevs, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		

		//lambda
/*		listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName())));				
		
		//lambda, valid, parameter type is optional
		listDevs.sort((o1, o2)->o1.getAge()-o2.getAge());*/

		
		/*listDevs.forEach((developer)->System.out.println(developer));*/
		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.toString());
		}

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", 33));
		result.add(new Developer("alvin", 20));
		result.add(new Developer("jason", 10));
		result.add(new Developer("iris", 55));

		return result;

	}

}
