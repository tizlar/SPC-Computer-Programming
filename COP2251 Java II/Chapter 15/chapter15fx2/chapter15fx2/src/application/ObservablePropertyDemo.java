package application;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {
  public static void main(String[] args) {
	  
    DoubleProperty balance = new SimpleDoubleProperty(10.0);
    
	/*
	 * balance.addListener(new InvalidationListener() { public void
	 * invalidated(Observable ov) { System.out.println("The new value is " +
	 * balance.doubleValue()); } });
	 */
    
    balance.addListener(lst -> {
    	System.out.println("The new value is " + balance.doubleValue());
    });

    balance.set(4.5);
    balance.set(22.5);
  }
}