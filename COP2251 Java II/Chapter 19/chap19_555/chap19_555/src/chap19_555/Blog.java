package chap19_555;

public class Blog extends Printed {
	private String theme;

	public Blog(String title, String theme) {
		super(title);
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Blog theme = " + theme + ", " + super.toString();
	}
}
