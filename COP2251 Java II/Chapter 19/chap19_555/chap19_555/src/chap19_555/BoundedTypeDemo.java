package chap19_555;

public class BoundedTypeDemo {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 2);
		Circle circle = new Circle(2);

		System.out.println("Same area? " + equalArea(rectangle, circle));
		
		Rectangle r2 = new Rectangle(4,1); System.out.println("Same area? " +
		BoundedTypeDemo.<GeometricObject> equalArea(rectangle, r2));
		 

	}

	public static <E extends GeometricObject> boolean equalArea(E object1,E object2) {
		return object1.getArea() == object2.getArea();
	}
}
