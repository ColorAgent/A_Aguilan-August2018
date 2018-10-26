//note lookup fizzbuzz video
public class Hourglass {
	public static void main(String[] args) {
		printBase();
		System.out.println();
		printTophalf();
	// print base
	// print top half
	// print mid
	// print bot half
	// print string of chars
		printBase();
	}
	
	// takes the string to print repeatedly and the number of repeats and prints
	public static void printStringofChars(String str, int count) {
		for (int i = 0; i<10; i++) {
			System.out.print(str);
		}
	}
	public static void printBase() {
		printStringofChars("\"", 2);
		System.out.println();
	}
	public static void printTophalf() {
		for (int i = 1; i<=4; i++) {
			System.out.print("\\");
			printStringofChars(":", 10-2*i);
			System.out.print("/");
			System.out.println();
		}
	}
	
	
	
	
}