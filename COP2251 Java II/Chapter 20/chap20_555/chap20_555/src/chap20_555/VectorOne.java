// VectorOne.java

package chap20_555;

import java.util.*;

public class VectorOne {
    
    public static void main(String[] args) {
        //initial capacity of 3 elements, will also grow by three elements
        Vector<String> bolts = new Vector<String>( 3, 3 );
        bolts.add("Kucherov");
        bolts.add("Hedman");
        bolts.add("Johnson");
        bolts.add("Palat"); // adds 3 to capacity
        
        Iterator<String> iter = bolts.iterator();

        while ( iter.hasNext())  {
            System.out.println( iter.next());
        }
        
        bolts.set( 2, "Stamkos" );  /// replaces Johnson
        System.out.println("After replacement");        
        
        Collections.sort( bolts );  // alpha sorts bolts
        ListIterator<String> iter2 = bolts.listIterator();

        System.out.println("Sorted players");
        while ( iter2.hasNext())  {
            System.out.println( iter2.next());
        }
        System.out.println("Vector capacity : " + bolts.capacity() );
        bolts.trimToSize();   /// self evident purpose
        System.out.println("Vector capacity : " + bolts.capacity() );
    }
}
