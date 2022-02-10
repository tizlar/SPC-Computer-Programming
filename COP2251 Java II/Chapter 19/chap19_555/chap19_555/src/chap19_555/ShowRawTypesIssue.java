package chap19_555;

public class ShowRawTypesIssue {

	public static void main(String[] args) {

		String name = "Gosling";
		Integer num = 12;
		
		System.out.println(Max.max(name, num)); // looks okay but not at runtime
		
		//System.out.println(MaxUsingGenericType.max(name, num)); // compiler says "nope"		
			
	}

}
