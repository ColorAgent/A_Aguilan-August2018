/*\FracCalc
 * @author Alex Aguilan
 * @version 5 November 2018
 */

package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner UserInputs = new Scanner(System.in);
		boolean Continue = true;
		System.out.println("Welcome to FracCalc");
        
		//Reads the input from the user and call produceAnswer with an equation
		//ask user for variables and does things
		
		while(Continue){
			String Input = UserInputs.next();
			System.out.println(produceAnswer(Input));	
			//ask the user if the user wants to quit and closes the loop if yes
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			if(UserInputs.next().equals("quit")){
				Continue = false;
				UserInputs.close();
			}
		}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    // methods and stuff
    public static String produceAnswer(String input) {
		String[] Fraction = input.split(" "); //this is a really bad array name
		String Operand1  = Fraction[0];
		String Operater = Fraction[1];
		String Operand2  = Fraction[2];
        // TODO: Implement this function to produce the solution to the input
		return FractionParts(Operand2);
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
    // converts a mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	public static String FractionParts (String Operand) {
		String[] DefaultValue = {"0","0","1"};
		String[] FractionSplit = Operand.split("[_/]");
		String PartsDefined = "whole:" + Operand + " " + "numerator:" + DefaultValue[1] + " " + "denominator:" + DefaultValue[2];
		for (int i = 0; i < FractionSplit.length; i++)
		if (FractionSplit[i] != "+" || FractionSplit[i] != "-" || FractionSplit[i] != "/" || FractionSplit[i] != "*") {
			if (FractionSplit.length < 1) {
				String whole = FractionSplit[0];
				String numerator = DefaultValue[1];
				String denominator = DefaultValue[2];
				PartsDefined = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
			} 
			else if (FractionSplit.length > 1) {
				for (int x = 0; x < FractionSplit.length; x++)
				if (FractionSplit[x] != "_") {
					String whole = DefaultValue[0];
					String numerator = FractionSplit[0];
					String denominator = FractionSplit[1];
					PartsDefined = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
				} else {
					String whole = FractionSplit[0];
					String numerator   = FractionSplit[1];
					String denominator = FractionSplit[2];
					PartsDefined = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
				}
			}
		}
		return PartsDefined;
	}
}
	