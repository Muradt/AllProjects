package main;

public class Car extends Mechanic {
	
    public BMW drive() {
    	System.out.println("Car drive");
    	return new BMW();
    }
    
}
