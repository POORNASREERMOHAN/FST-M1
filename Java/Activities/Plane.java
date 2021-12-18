package activities;
import java.util.*;

public class Plane<passengers> {
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

public Plane(int maxPassengers)
{
	this.maxPassengers= maxPassengers;
	this.passengers = new ArrayList<>();
}

public void onboard(String passengers)
{
	this.passengers.add(passengers);
}


}