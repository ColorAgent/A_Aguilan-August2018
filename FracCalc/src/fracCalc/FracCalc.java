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
		String[] Fraction1Parts = Operand1.split("[_/]");
		int whole1 = Integer.parseInt(Fraction1Parts[0]);
		int denominator1 = Integer.parseInt(Fraction1Parts[1]);
		int numerator1 = Integer.parseInt(Fraction1Parts[2]);
		String ImproperFrac1 = toImproperFrac(whole1, denominator1, numerator1);
		String[] Improper1Parts = ImproperFrac1.split("/");
		int ImproperNum1 = Integer.parseInt(Improper1Parts[0]);
		int ImproperDenom1 = Integer.parseInt(Improper1Parts[1]);

				
		String Operand2  = Fraction[2];
		String[] Fraction2Parts = Operand2.split("[_/]");
		int whole2 = Integer.parseInt(Fraction2Parts[0]);
		int denominator2 = Integer.parseInt(Fraction2Parts[1]);
		int numerator2 = Integer.parseInt(Fraction2Parts[2]);
		String ImproperFrac2 = toImproperFrac(whole2, denominator2, numerator2);
		String[] Improper2Parts = ImproperFrac2.split("/");
		int ImproperNum2 = Integer.parseInt(Improper2Parts[0]);
		int ImproperDenom2 = Integer.parseInt(Improper2Parts[1]);
		String Final = "default";
		
		if (ImproperDenom1 != ImproperDenom2) {
			int NewNum1 = ImproperNum1 * ImproperDenom2;
			int NewNum2 = ImproperNum2 * ImproperDenom1;
			int NewDenom = ImproperDenom1 * ImproperDenom2;
			if (Fraction[1].contains("-")) {
				int FinalNum = NewNum1 - NewNum2;
				Final = FinalNum + "/" + NewDenom;
			}
			if (Fraction[1].contains("+")) {
				int FinalNum = NewNum1 + NewNum2;
				Final = FinalNum + "/" + NewDenom;
			}
			if (Fraction[1].contains("*")) {
				int FinalNum = NewNum1 + NewNum2;
				Final = FinalNum + "/" + NewDenom;
			} 
		} else {
			if (Fraction[1].contains("-")) {
				int FinalNum = ImproperNum1 - ImproperDenom2;
				Final = FinalNum + "/" + ImproperDenom2;
			}
			if (Fraction[1].contains("+")) {
				int FinalNum = ImproperNum1 + ImproperDenom2;
				Final = FinalNum + "/" + ImproperDenom2;
			}
			if (Fraction[1].contains("*")) {
				int FinalNum = ImproperNum1 + ImproperDenom2;
				Final = FinalNum + "/" + ImproperDenom2;
			}
		}
		return FractionParts(Final);
	}
    // converts a mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	// Identifies the Whole, Denominator, and Numerator of the fraction
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
				String[] NoWholeArray = Operand.split("[_/]");
				for (int x = 0; x < NoWholeArray.length; x++)
				if (Operand.contains("_")) {
					String whole = FractionSplit[0];
					String numerator   = FractionSplit[1];
					String denominator = FractionSplit[2];
					PartsDefined = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
				} else {
					String whole = DefaultValue[0];
					String numerator = NoWholeArray[0];
					String denominator = NoWholeArray[1];
					PartsDefined = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
				}
			}
		}
		return PartsDefined;
	}
}
	