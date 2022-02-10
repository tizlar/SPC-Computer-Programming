package chap20_555;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class HumanSortByNameAndAge {

	public static void main(String[] args) {
		
		Human[] peeps = {new Human("Jones, A",22),
						 new Human("Smith, X",33),
						 new Human("Jones, M",44),
						 new Human("Smith, K",22),
						 new Human("Jones, D",20),
						 new Human("Smith, K",17),
						 new Human("Jones, M",25),};
		
		// sort by name and then by age
		Arrays.sort(peeps,
				Comparator.comparing(Human::getName).thenComparing(Human::getAge));
		
		for(Human h : peeps) {
			System.out.println(h);
		}
	}
}
