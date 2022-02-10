package chap19_555;

public class TestMaxClasses {

	public static void main(String[] args) {
		
		// next line looks okay, but...
		Max.max("Hello", 25); // crashes at runtime
		// MaxUsingGenericType.max("Hello", 25);

	}

}
