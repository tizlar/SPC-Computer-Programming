package chap19_555;

public class TestGenericStack {

	public static void main(String[] args) {
		GenericStack<String> capitals = new GenericStack<String>();
		
		// capitals.push(25);   // Nope...must be a String
		capitals.push("Washington DC");
		capitals.push("Paris");
		capitals.push("Ottawa");
		capitals.push("London");
		capitals.push("Tampa");
		
		System.out.println(capitals.getSize());
		System.out.println(capitals.pop());	 // bye bye Tampa	
		System.out.println(capitals.peek());
		System.out.println(capitals.getSize());		
		
		GenericStack<Circle> circles = new GenericStack<Circle>();
		circles.push(new Circle(5.0));
		circles.push(new Circle(10.0));
		
		System.out.println(circles.peek().getArea());
	}
}
