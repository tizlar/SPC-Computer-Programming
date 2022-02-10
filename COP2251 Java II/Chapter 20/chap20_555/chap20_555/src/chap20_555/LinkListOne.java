// LinkListOne.java

package chap20_555;

import java.util.*;

public class LinkListOne {
    public static void main ( String [] args )  {
        LinkedList<String> langs = new LinkedList<String>();
        langs.add("Java");
        langs.add("Python");
        langs.add("C++");
        
        System.out.println(langs);  // crude dump
        langs.add( 1,"JavaScript");
        
        ListIterator<String> iter = langs.listIterator();
        iter.add("Ruby");    
        
        while ( iter.hasNext() )  {
            System.out.println( iter.next() );
        }   
        
        System.out.println("All langs now backwards");
        while ( iter.hasPrevious() )  {
            System.out.println( iter.previous());
        }      
        System.out.println(langs.size() + " languages in list");
    }
}
