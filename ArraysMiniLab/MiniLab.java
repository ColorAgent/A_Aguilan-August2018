import java.util.Arrays;
import java.util.Scanner;

public class MiniLab {
	
	
	public static void main(String[] args) {
		// problem 1
		/* Declare a new integer array called arr1.  
		 * It should start empty but have space to store 10 elements.   
		 * Use a for loop to fill it with consecutive numbers starting with 2016.
		 */
		int[] arr1 = new int[10];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 2016;
		}
		// Arrays.toString() takes an array and converts it to a pretty String with [ ] and ,
		// In the code below, we store the string in a variable and then print the variable
		//String forPrinting = Arrays.toString(arr1);       
		//System.out.println(forPrinting);
		System.out.println("Problem 1:" + Arrays.toString(arr1));
		
		
		
		System.out.println("\n\nProblem 2:");
		
		
		String[] schedule = {"Sec 7.1 and .split()", "for vs. for-each loops", "Sec 7.2", "Sec 7.4", "Lab Day", "Sec 7.3", "Review", "Test"};
		int numDays = schedule.length; //7
		for (int i = 1; i < numDays; i++)
		{
			System.out.println("Day " + i + ": " + schedule[i]);
		}
		
		
		
		System.out.println("\n\nProblem 3:");		
		/* Problem 3:
		 * Write code to collect information about the cost of each meal ordered in a dinner
		 * out with friends.  To start you off, code is provided that asks for the number of 
		 * meals.  Use this value to create an empty array of doubles called mealPrices that 
		 * will store the cost of each meal.  Prompt the user to enter the cost of each meal.  
		 * (Ex.  "Price of meal 1: ")  
		 * The code to print your array is given below, you just need to uncomment it. 
		 */
		Scanner console = new Scanner(System.in);
		System.out.print("How many meals did you buy?");
		int numMeals = console.nextInt(); 
		double[] MealCost = new double[numMeals];
		
		for(int i = 0; i < MealCost.length; i++){
			System.out.print("Price of Meal " + (i+1) + ": ");
			MealCost[i] = console.nextDouble();
		} 
		 
		
		//System.out.println( Arrays.toString(mealPrices) );
		//console.close();
		
		
		
		System.out.println("\n\nProblem 4:");		
		/* Problem 4:
		 * Use the mealPrices array from the previous problem.  Count how many meals cost 
		 * more than $8.  Print your result.  
		 * (Ex. "There were ___ meals over $8 out of ___ total")
		 */
		
		int MealsOverEight = 0;
		for(int i = 0; i< MealCost.length; i++) {
			if(MealCost[i] < 8);
			MealsOverEight++;
		}
		System.out.println("There were " + MealsOverEight + " meals over $8 out of " + MealCost.length + " total");
			
		
		
		System.out.println("\n\nProblem 5:");
		/* Problem 5:
		 * Use the mealPrices array from the previous problem.  Find the most expensive meal
		 * in the array and print its cost.  (Ex.  "The most expensive meal was $_____!")		
		 */
		
		double MostExpensive = MealCost[0];
		for(int i = 0; i< MealCost.length; i++) {
			if(MealCost[i] > MostExpensive);
			MostExpensive = MealCost[i];
		}
		System.out.println("The most expensive meal was $" + MostExpensive + "!");
		
		
		System.out.println("\n\nProblem 6:");		
		/* Problem 6:  
		 * Remember the Calculate project and how dumb the average method was because you had to
		 * tailor the method to 2 numbers or 3 numbers?  Write a method here that accepts an array, 
		 * computes the average of its values, and returns that average.    
		 * Test it out by calling it below, and passing it your mealPrices.  
		 * Print your result: "The average cost of a meal was $_____"  
		 */
		System.out.println("The average cost of a meal was $" + averageMealPrice(MealCost));	
		
		
		
		System.out.println("\n\nProblem 7:");		
		/* Problem 7: 
		 * Create a string array containing the last names of all your teachers this year
		 * Print the array.  
		 * Then create a scanner and ask the user to enter the last name of a teacher.
		 * If that teacher is in the array, print "Yay, I have ______ too!" otherwise say
		 * "I don't have _____"    
		 */
		
		
		
		System.out.println("\n\nProblem 8:");		
		/* Problem 8:
		 * Use a Scanner to ask a user for their list of teachers and put them in an array.
		 * Write a method teacherCompare that accepts two String arrays (mine and yours).  If they  
		 * are the same, it prints "We have the same teachers!" otherwise it says "Aw, we have 
		 * different classes".  There is no return.  
		 * 
		 * Hint: Useful methods built into the prewritten (and already imported) Arrays class can be 
		 * found on p461 of your textbook.   
		 */
		
		
		
		
		
	}
	public static double averageMealPrice(double[] MealCost) {
		double totalcost = 0;
		for (int i=0;i<MealCost.length;i++) {
			totalcost = 0 + MealCost[i];
		}
		return totalcost/MealCost.length;

	}
}
