package chap20_555;

public class SortStringIgnoreCase {
  public static void main(String[] args) {
    java.util.List<String> cities = java.util.Arrays.asList ("Atlanta", "Savannah", "new York", "dallas", "tampa");
    
    cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
    
    // could have done it with a method reference like this, too.
    // comment out line 8 above and uncomment line 12 below.
    //cities.sort(String::compareToIgnoreCase);
    
    for (String s: cities) {
      System.out.print(s + " ");
    }
  }
}