//note lookup fizzbuzz video
public class Hourglass {
	public static void main(String[] args) {
		printBase();
		System.out.println();
		printTophalf();
		mid();
		Bothalf();
	// print base
	// print top half
	// print mid
	// print bot half
	// print string of chars
		printBase();
	}
	
	// takes the string to print repeatedly and the number of repeats and prints
	public static void printStringofChars(String value, int amountofvalues) {
		for (int i = 0; i<amountofvalues; i++) {
			System.out.print(value);
		}
	}
	public static void printBase() {
		System.out.print("|");
		printStringofChars("\"", 10);
		System.out.print("|");
	}
	public static void printTophalf() {
		for (int i = 1; i<=4; i++) {
<<<<<<< HEAD
			System.out.print("\\");
			printStringofChars(":", 10-2*i);
			System.out.print("/");
=======
				printStringofChars(" ", i);
				for (int j = 1; j<=1; j++) {
					int DecreasingAmount = 10 - (2*i);
					printStringofChars(":", DecreasingAmount);
			}
>>>>>>> branch 'master' of https://github.com/ColorAgent/A_Aguilan-August2018.git
			System.out.println();
		}
	}
	public static void Bothalf() {
		for (int i = 4; i>=1; i--) {
				printStringofChars(" ", i);
				for (int j = 1; j<=1; j++) {
					int DecreasingAmount = 10 - (2*i);
					printStringofChars(":", DecreasingAmount);
				}
				System.out.println();
			}
	}
	public static void mid() {
		System.out.println("    ||");
		}
	}

	// \::::::::/ :=8
	//  \::::::/ :=6
	//   \::::/ :=4
	//    \::/ :=2

	
	
	