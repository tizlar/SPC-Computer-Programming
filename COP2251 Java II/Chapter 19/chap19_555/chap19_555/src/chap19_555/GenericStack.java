package chap19_555;

public class GenericStack<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

  public int getSize() {
    return list.size();
  }

  public E peek() {
    return list.get(getSize() - 1);
  }

  public E push(E o) {
    list.add(o);
    return o;
  }

  public E pop() {
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
}
