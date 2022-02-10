package genericexamples;

import java.util.HashMap;
import java.util.Map;

public class JavaMaps {

	public static void main(String[] args) {
		
		Map<Integer,String> langs = new HashMap<>();
		langs.put(1, "Python");
		langs.put(3, "C++");
		langs.put(2, "Java");
		langs.put(4, "C#");
		
		langs.forEach((k,v)-> System.out.println(k + ":" +v));

	}

}
