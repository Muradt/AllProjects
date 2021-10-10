package main;

public class BMW  extends Car{
	
	 public BMW drive()  {
		System.out.println("BMW drive");
		return new BMW();
	 }
}
