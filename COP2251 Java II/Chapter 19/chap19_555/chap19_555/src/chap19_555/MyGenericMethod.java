package chap19_555;

public class MyGenericMethod {

	public static void main(String[] args) {
	    
	    Circle circle = new Circle(10.0);
	    System.out.print("Circle area is ");
	    System.out.println(MyGenericMethod.<Circle>area(circle));
	    
	    Rectangle rectangle = new Rectangle(3.0, 4.0);
	    System.out.print("Rectangle area is ");
	    System.out.println(MyGenericMethod.<Rectangle>area(rectangle));
	    
	    System.out.println(area(circle));  // compiler knows type of circle
	    
	}

	public static <T extends GeometricObject> double area(T shape) {
		return shape.getArea();
	}
}
