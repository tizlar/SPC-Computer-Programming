package chap19_555;

//// NOTE: This is older, prior to JDK 1.5 way

public class Max {
  /** Return the maximum between two objects */
	
// NOTE: the compiler warns (lightbulbs) that raw types are unsafe.
// This is older, non-generic Java.
	
  public static Comparable max(Comparable o1, Comparable o2) {
    if (o1.compareTo(o2) > 0)
      return o1;
    else
      return o2;
  }
}
