package activities;

public class Activity1 extends Car{
	
	public static void main(String[] args)
	{
		Car carName = new Car();
		carName.make=2014;
		carName.colour= "black";
		carName.transmission="Manual";
		carName.displayCharacteristics();
		carName.accelerate();
		carName.brake();
		
	}

}
