package chap19_555;

import java.util.ArrayList;

// experiment based on Note in middle of p742

public class MultiGen<E1,E2> {
	private ArrayList<E1> lst1 = new ArrayList<E1>();
	private ArrayList<E2> lst2 = new ArrayList<E2>();
	
	// methods for E1 types
	public void push1(E1 ob) {
		lst1.add(ob);
	}
	public E1 pop1() {
		E1 ob = lst1.get(getSize1() - 1);
		lst1.remove(getSize1() - 1);
		return ob;
	}
	public int getSize1() {
		return lst1.size();
	}
	public E1 peek1() {
		return lst1.get(getSize1() - 1);
	}
	
	// methods for E2 types
	public void push2(E2 ob) {
		lst2.add(ob);
	}
	public E2 pop2() {
		E2 ob = lst2.get(getSize2() - 1);
		lst2.remove(getSize2() - 1);
		return ob;
	}
	public int getSize2() {
		return lst2.size();
	}
	public E2 peek2() {
		return lst2.get(getSize2() - 1);
	}
}
