import java.util.Arrays;

public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		System.out.println("Before");
		System.out.println("num: " + num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		changeMe(num, strMain, arrMain);
		System.out.println("after");
		System.out.println("num: " + num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		System.out.println();
		System.out.println("With Ints");
		part2WithInts();
		System.out.println("With Strings");
		part2WithStrings();
		System.out.println("With Arrays");
		part2WithArrays();
	}	
	public static void part2WithInts() {
		int a = 7;// a = startvalue
		int b = a;// b = a
		a = 1;    // a = newvalue
		System.out.println("Ints");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithStrings() {
		String a = "hi";// a = startvalue
		String b = a;          // b = a
		a = "Bye";      // a = newvalue
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithArrays() {
		int[] Woah = {1, 2, 3, 4, 5};// a = startvalue
		int[] b = Woah;              // b = a
		Woah[3] = 8888;                 // a = newvalue
		System.out.println("a: " + Arrays.toString(Woah));
		System.out.println("b: " + Arrays.toString(b));
	}
	public static void changeMe(int x, String str, int[] arr) {
		x = 229886;
		str += str;
		arr[4] = 100;
	}
}

