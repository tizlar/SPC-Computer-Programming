package chap19_555;

// test of experimental MultiGen class

public class MultiGenTest {

	public static void main(String[] args) {
		
		MultiGen<Integer,Double> nums = new MultiGen<>();
		nums.push2(12.25);
		nums.push1(10);
		nums.push1(50);
		nums.push2(0.88);

		System.out.println(nums.peek1());
		System.out.println(nums.peek2());
		System.out.println(nums.pop1());
		System.out.println(nums.peek1());
		
	}
}
