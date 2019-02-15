// do not modify as of 2.8.2019
public class Traveler 
{
	//fields
	private int distanceTraveled;
	private String name;
	
	
	//constructor
	public Traveler(String name)
	{
		this.distanceTraveled = 0;
		this.name = name;
	}
	
	
	//methods
	public int getDistanceTraveled()
	{
		return distanceTraveled;
	}
	
	public void travel(int miles)
	{
		distanceTraveled += miles;
	}
	
	public String getName()
	{
		return name;
	}
	
}
