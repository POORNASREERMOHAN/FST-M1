package activities;

public class Car {
	int tyres;
	int doors;
	String colour;
	String transmission;
	int make;
	
	Car()
	{
		 tyres=4;
		 doors=4;
	}
	
	 void accelerate()
	{
		System.out.println("Car is moving forward");
	}
	
	 void brake()
	{
		System.out.println("Car has stopped");
	}
	
	 void displayCharacteristics()
	{
		System.out.println("No of doors is :"+tyres);
		System.out.println("No of doors is :"+doors);
		System.out.println("No of doors is :"+colour);
		System.out.println("No of doors is :"+transmission);
		System.out.println("No of doors is :"+make);
	}

}
