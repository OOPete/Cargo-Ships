package lab5;

public class CargoShip extends Ship{

	protected int tonnage; //variable for the amount of tons the ship weighs
	
	public CargoShip(String ShipName, String ShipYear, int tonnage) //cargo ship constructor
	{
		super(ShipName, ShipYear); //this is the constructor from the Ship class
		this.tonnage = tonnage;
	}
	
	public void setCargo(int tonnage) //accessor for the tonnage
	{
		this.tonnage = tonnage;
	}
	
	public int getCargo() //obtains the value of the tonnage variable
	{
		return tonnage;
	}
	
	@Override
	public String toString() //toString overrides the toString in the ship class
	{
	String str = "Ship name: " + super.getShipName() + 
				"\nShip tonnage: " +getCargo();
	return str;
	}
}
