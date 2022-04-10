package lab5;

public class Ship {

	protected String ShipName; //Ship name input	
	protected String ShipYear; //Ship year input
	
	public Ship(String Sn, String Sy) // Constructor for ship
	{
		ShipName = Sn;
		ShipYear = Sy;
	}
	
	

	public void setShipName(String Sn) //used to access the ShipName input
	{
		ShipName = Sn;
	}
	
	public void setShipYear(String Sy) //Used to access the ShipYear input
	{
		ShipYear = Sy;
	}
	
	public String getShipName() //Used to obtain the ShipName value
	{
		return ShipName;
	}
	
	public String getShipYear() //Used to obtain the ShipYear value
	{
		return ShipYear;
	}
	
	public String toString() //The toString for the ship class
	{
	  String str = "Ship name: " + getShipName() +
			  "\nYear built: " + getShipYear();
	  return str;
	}
	

}
