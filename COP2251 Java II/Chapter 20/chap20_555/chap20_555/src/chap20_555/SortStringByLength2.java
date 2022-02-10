package chap20_555;

import java.util.Comparator;

public class SortStringByLength2 {
  public static void main(String[] args) {
    String[] cities = {"Atlanta", "Savannah", "New York", "Dallas", "Tampa"};
    
    // the comparing method, page 790. Try both of the next 2 lines
    java.util.Arrays.sort(cities, Comparator.comparing(String::length));  // a method reference
    //java.util.Arrays.sort(cities, Comparator.comparing(e-> e.length()));    // a lambda
    
    for (String s : cities) {
      System.out.print(s + " ");
    }
  }


}