//note lookup fizzbuzz video
public class Hourglass {
	public static void main(String[] args) {
		printBase();
		System.out.println();
		printTophalf();
	// print top half
	// print mid
	// print bot half
		printBase();
	}
	
	// takes the string to print repeatedly and the number of repeats and prints
	public static void printStringofChars(String str, int count) {
		for (int i = 0; i<10; i++) {
			System.out.print("\"");
		}
	}
	
	
	
	
	
	
	public static void printBase() {
		printStringofChars("l", i);
		printStringofChars("\"",10);
		printStringofChars("l", i);
	}
	
	
	
	public static void printTophalf() {
		for (int i = 1; i<=4; i++) {
			printStringofChars(" ", i);
			printStringofChars("\\",1);
			printStringofChars(":", 10-2*i);
			System.out.println();
		}
	}
	
	
	
	
}