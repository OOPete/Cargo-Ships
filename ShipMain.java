package lab5;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Peter Obinomen
 * Computer Science 1
 * lab 6
 * 
 * we will be creating a program that stores different types of ships 
 * and returns their values to the user.
 */
public class ShipMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Ship> Ship = new ArrayList<Ship>(); //array for the ship objects
		Scanner keyboard = new Scanner(System.in); //using scanner to obtain the inputs
		
		String ShipInput; //gets the ship name
		int CruiseInput; //gets the amount of passengers
		int CargoInput; // gets the tonnage of the ship
		int AmountOfShips; //gets input value the user puts in for the amount of ships they want
	    String ShipYear; //gets the year of the ship
	    int choiceInput; // gets the value for what type of ship the user wants
	    String input; // used for the choice variable
	    char choice;  //used to decide whether the user wants to continue or exit the program
		
	  do //runs the program and then asks the user if they want to continue
	  {
		  
	  
		System.out.println("how many ships do you want to enter: ");
		
		AmountOfShips = keyboard.nextInt();
		
		for(int i = 0; i < AmountOfShips; i++)
		{
			System.out.println("enter 1 for ship, 2 for cruise Ship, and 3 for cargo ship");
			choiceInput = keyboard.nextInt();
			
			switch(choiceInput)
			{
			case 1: //if the user entered number 1
				System.out.println("enter the shipname for number #" + (i+1));
				
				ShipInput = keyboard.next();
				
				System.out.println("enter the year the ship was built");
				
				ShipYear = keyboard.next();
				
				Ship ship = new Ship(ShipInput,ShipYear); //create a ship object
				
				Ship.add(ship); //adds the object to the arraylist
				break;
				
			case 2: //if the user entered number 2
				System.out.println("enter the shipname for number #" + (i+1));
				
				ShipInput = keyboard.next();
				
				
				System.out.println("enter the maximum space for ship number#" + (i+1));
				
				CruiseInput = keyboard.nextInt();
				
				System.out.println("enter the year the ship was built");
				
				ShipYear = keyboard.next();	
				
				Ship ship2 = new CruiseShip(ShipInput,ShipYear,CruiseInput); //creates a cruiseship object
				
				Ship.add(ship2); //adds the cruiseship to the arraylist
				break;
				
				case 3: //if the user entered number 3
					System.out.println("enter the shipname for number #" + (i+1));
				
					ShipInput = keyboard.next();
				
					System.out.println("enter the year the ship was built");
				
					ShipYear = keyboard.next();
				
				
					System.out.println("enter the amount of tons that ship number #" + (i+1) + " weighs");
					
					CargoInput = keyboard.nextInt();
					
					Ship ship3 = new CargoShip(ShipInput,ShipYear, CargoInput); //creates a cargoship object
					Ship.add(ship3); //adds the cargoship to the arraylist
					break;
				
				default: //if the number is not 1,2, or 3
					System.out.println("that was an invalid number");
					break;
				
			}
			
			for(int index = 0; index < Ship.size(); index++) //prints out the values in the Ship arraylist
			{
				System.out.println(Ship.get(index).toString());
			}
			
		}
			System.out.println("do you want to try again? Y/N"); //asks if the user wants to try again
		
				 input = keyboard.next();
				choice = input.charAt(0);
		  }while(Character.toUpperCase(choice) == 'Y');
		
		
		
	}

}
