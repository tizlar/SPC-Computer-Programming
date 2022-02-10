package chap20_555;

import java.util.*;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<String>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    Iterator<String> iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next().toUpperCase() + " ");
    }
    System.out.println();
    iterator.remove();  // removes last one iterated - Madison
    System.out.println(collection.size());
  }
}

