import java.util.ArrayList;
import java.util.Arrays;

public class ThereAndBackAgain 
{

	public static void main(String[] args) 
	{
		
		Hobbit frodo = new Hobbit("Frodo");
		Hobbit sam = new Hobbit("Sam");
		Dwarf gimli = new Dwarf("Gimli");
		// Create a traveling party called party1 by creating an array of Travelers 
		// and filling it with frodo, sam, and gimli
		Traveler[] party1 = {frodo, sam, gimli}; 
		// Then, use a loop to make all travelers go a distance of 50 miles  
		for(int i = 0; i < party1.length; i++) {
		// Then, for each Traveler in the travelingParty, print their name and how far they've
		//    traveled in miles.  (In the next piece, you'll do this in methods, but 
		//    for a first pass, just do it in main and print to the console.)
			party1[i].travel(50);
			System.out.println(party1[i].getName() + " has traveled " + party1[i].getDistanceTraveled() + " miles");
		// Expected output:  Frodo has traveled 50 miles.
		//                   Sam has traveled 50 miles.
		//                   Gimli has traveled 50 miles.
			}
		System.out.println("\n\n\nPART 2: \n");

		String[] dwarfNames = {"Fili", "Kili", "Dori", "Ori", "Nori", "Balin", "Dwalin", 
		"Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin"};

		// Make a new ArrayList to hold a 2nd party of Travelers called party2:
		
		ArrayList<Traveler> party2 = new ArrayList<Traveler>();
		// Make a new Hobbit called "Bilbo" and add him to party2
		
		Hobbit bilbo = new Hobbit("Bilbo");
		party2.add(bilbo);
		// Make a new Wizard called "Gandalf" and add him to party2.
		
		Wizard gandalf = new Wizard("Gandalf", "Grey");
		party2.add(gandalf);
		
		createParty(party2, dwarfNames);
		allTravel(party2, 100);
	}
	//write createParty
			// Call the createParty method and pass it party2 and the dwarfNames array.

			// create party should add all the new dwarves to party2,
	public static void createParty(ArrayList<Traveler> party, String[] names) {
		for(int i = 0; i < names.length; i++) {
			Dwarf members = new Dwarf(names[i]);
			party.add(members);
		}
	}
	//Write allTravel
			// Finally, call the allTravel method passing it party2 and 100 (representing
			// the 100 miles that party2 has traveled together.

			//Make sure your code prints out the name and distances party2 has traveled.
	public static void allTravel(ArrayList<Traveler> party, int miles) {
		for(int i = 0; i < party.size(); i++) {     
			party.get(i).travel(miles);
			System.out.println(party.get(i).getName() + " has traveled for " + party.get(i).getDistanceTraveled() + " miles.");
		}
	}
}
