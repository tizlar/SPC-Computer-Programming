package chap19_555;

public class RectangelStack {

	public static void main(String[] args) {
		
		GenericStack<Rectangle> rects = new GenericStack<>();
		rects.push(new Rectangle(12,3));
		rects.push(new Rectangle(11,3));
		rects.push(new Rectangle(15,8));
		rects.push(new Rectangle(11,10));

		int size = rects.getSize();
		
		for(int i = 0; i < size; i++) {
			System.out.println(rects.pop().getArea());
		}
		
	}

}
