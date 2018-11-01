
import java.util.*;

	public class split {
		public static void main(String[] args) {
			//It's a method that acts on a string, <StringName>.split(<String sp>);
			// ToUpperCase, toLowerCase, length, CharAt, endsWith, StartsWith, substring
// Your task Part 0

//String.split();

//It's a method that acts on a string, <StringName>.split(<String sp>);

//Where sp is the string where the string splits

//And it returns an array

// Example: "I like apples!".split(" ");
// it will split at spaces and return an array of ["I","like","apples!"]
			System.out.println(Arrays.toString("I like apples!".split(" ")));
// Example 2: "I really like really red apples"split("really")
			System.out.println(Arrays.toString("I really like really apples!".split("really")));
// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

//play around with String.split!

//What happens if you "I reallyreally likeapples".split("really") ?
			System.out.println(Arrays.toString("I reallyreally likeapples!".split("really")));
			System.out.println(part1("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
			System.out.println(part2("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));
		}
//Your task Part 1:
			public static String part1(String sandwich) {
				return Arrays.toString(sandwich.split("bread"));
			}
/*Write a method that take in a string like

* "applespineapplesbreadlettustomatobaconmayohambreadcheese"

* describing a sandwich.

* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

* the sandwich and ignores what's on the outside

* What if it's a fancy sandwich with multiple pieces of bread?

*/

//Your task pt 2:
			public static String part2(String sandwich) {
				return Arrays.toString(sandwich.split(" "));
			}

/*Write a method that take in a string like

* "apples pineapples bread lettus tomato bacon mayo ham bread cheese"

* describing a sandwich

* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

* the sandwich and ignores what's on the outside.

* Again, what if it's a fancy sandwich with multiple pieces of bread?

*/

 }




