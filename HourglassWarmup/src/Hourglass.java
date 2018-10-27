/* This class contains methods that help make up the shape of an hourglass
 * @author Alex Aguilan  
 * Version October 26
 */
// The hourglass itself made by using various constructed methods
public class Hourglass {
	public static void main(String[] args) {
		// print base
		// print top half
		// print mid
		// print bot half
		// print string of chars
		printBase();
		System.out.println();
		printTophalf();
		mid();
		Bothalf();
		printBase();
	}
	
	// takes the string to print repeatedly and the number of repeats and prints
	public static void printStringofChars(String value, int amountofvalues) {
		for (int i = 0; i<amountofvalues; i++) {
			System.out.print(value);
		}
	}
	// the base of the hourglass
	public static void printBase() {
		System.out.print("|");
		printStringofChars("\"", 10);
		System.out.print("|");
	}
	// the upper portion of the hourglass
	public static void printTophalf() {
		for (int i = 1; i<=4; i++) {
				printStringofChars(" ", i);
				for (int j = 1; j<=1; j++) {
					int DecreasingAmount = 10 - (2*i);
					System.out.print("\\");
					printStringofChars(":", DecreasingAmount);
					System.out.print("/");
			}
			System.out.println();
		}
	}
	// the lower portion of the hourglass
	public static void Bothalf() {
		for (int i = 4; i>=1; i--) {
				printStringofChars(" ", i);
				for (int j = 1; j<=1; j++) {
					int DecreasingAmount = 10 - (2*i);
					System.out.print("/");
					printStringofChars(":", DecreasingAmount);
					System.out.print("\\");
				}
				System.out.println();
			}
	}
	// the middle section of the hourglass
	public static void mid() {
		System.out.println("     ||");
		}
	}


	
	