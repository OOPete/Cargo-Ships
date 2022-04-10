package lab5;

public class CruiseShip extends Ship {

	protected int maximumSpace; //input variable for maximum space
	
	public CruiseShip(String ShipName, String ShipYear, int MaxSpace) //Cruise ship Constructor
	{
		super(ShipName, ShipYear); //this refers to the constructor of Ship
		maximumSpace = MaxSpace;
	}
	
	public void setMaximumSpace(int MaxSpace) //mutator for Maximum space variable
	{
		maximumSpace = MaxSpace;
	}
	
	public int getMaximumSpace() //obtains the value of Maximum space
	{
		return maximumSpace;
	}
	
	
	@Override
	public String toString() //This toString overrides the toString in the Ship class
	{
		String str = "Ship name: " + super.getShipName() + 
				"\nMaximum passengers: " + getMaximumSpace();
		
		return str;
	}
}
