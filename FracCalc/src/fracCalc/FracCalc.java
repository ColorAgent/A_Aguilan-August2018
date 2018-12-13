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
		String[] Fraction = input.split(" "); 
		String[] DefaultValue = {"0","0","1"};
		String Operand1  = Fraction[0];
		String[] Fraction1Parts = Operand1.split("[_/]");
		int whole1 = 0;
		int numerator1 = 0;
		int denominator1 = 0;
		// checks the first fraction to determine if its a fraction or whole number
		if (Fraction1Parts.length < 2) {
			whole1 = Integer.parseInt(Fraction1Parts[0]);
			numerator1 = Integer.parseInt(DefaultValue[1]);         
			denominator1 = Integer.parseInt(DefaultValue[2]);
		}
		if (Fraction1Parts.length > 1) {
			String[] NoWholeArray = Operand1.split("[_/]");
			if (Operand1.contains("_")) {
				whole1 = Integer.parseInt(Fraction1Parts[0]);
				numerator1 = Integer.parseInt(Fraction1Parts[1]);
				denominator1 = Integer.parseInt(Fraction1Parts[2]);
			} else {
				whole1 = Integer.parseInt(DefaultValue[0]);
				numerator1 = Integer.parseInt(NoWholeArray[0]);
				denominator1 = Integer.parseInt(NoWholeArray[1]);
			}
		}
		// converts the whole, numerator, and denominator into the 1st improper frac
		String ImproperFrac1 = toImproperFrac(whole1, numerator1, denominator1);
		String[] Improper1Parts = ImproperFrac1.split("/");
		int ImproperNum1 = Integer.parseInt(Improper1Parts[0]);
		int ImproperDenom1 = Integer.parseInt(Improper1Parts[1]);
		if (Operand1.contains("-")){
			if (ImproperNum1 < 0) {
				ImproperNum1 = ImproperNum1;
			} else
			ImproperNum1 = absValue(ImproperNum1);
		}

				
		String Operand2  = Fraction[2];
		String[] Fraction2Parts = Operand2.split("[_/]");
		int whole2 = 0;
		int numerator2 = 0;
		int denominator2 = 0;
		// checks the 2nd fraction to see if its a whole num or fraction
		if (Fraction2Parts.length < 2) {
			whole2 = Integer.parseInt(Fraction2Parts[0]);
			numerator2 = Integer.parseInt(DefaultValue[1]);         
			denominator2 = Integer.parseInt(DefaultValue[2]);
		}
		if (Fraction2Parts.length > 1) {
			String[] NoWholeArray = Operand2.split("[_/]");
			if (Operand2.contains("_")) {
				whole2 = Integer.parseInt(Fraction2Parts[0]);
				numerator2 = Integer.parseInt(Fraction2Parts[1]);
				denominator2 = Integer.parseInt(Fraction2Parts[2]);
			} else {
				whole2 = Integer.parseInt(DefaultValue[0]);
				numerator2 = Integer.parseInt(NoWholeArray[0]);
				denominator2 = Integer.parseInt(NoWholeArray[1]);
			}
		}
		// converts the whole, numerator, and denominator into the 2nd improper frac
		String ImproperFrac2 = toImproperFrac(whole2, numerator2, denominator2);
		String[] Improper2Parts = ImproperFrac2.split("/");
		int ImproperNum2 = Integer.parseInt(Improper2Parts[0]);
		int ImproperDenom2 = Integer.parseInt(Improper2Parts[1]);
		if (Operand2.contains("-")){
			ImproperNum2 = absValue(ImproperNum2);
			if (ImproperNum2 < 0) {
				ImproperNum2 = ImproperNum2;
			} else
			ImproperNum2 = absValue(ImproperNum2);
		}
		String Final = "0";
		
		if (ImproperDenom1 != ImproperDenom2) {
			if (Fraction[1].contains("-")) {
				int FinalNum = (ImproperNum2 * ImproperDenom1) - (ImproperNum1 * ImproperDenom2);
				int NewDenom = ImproperDenom1 * ImproperDenom2;
				if (Operand1.contains("-") && Operand2.contains("-")) {
					FinalNum = FinalNum * -1;
				}
				Final = FinalNum + "/" + NewDenom;
			}
			if (Fraction[1].contains("+")) {
				int FinalNum = (ImproperNum1 * ImproperDenom2) + (ImproperNum2 * ImproperDenom1);
				int NewDenom = ImproperDenom1 * ImproperDenom2;
				Final = FinalNum + "/" + NewDenom;
			}
			if (Fraction[1].contains("*")) {
				int FinalNum = ImproperNum1 * ImproperNum2;
				int NewDenom = ImproperDenom1 * ImproperDenom2;
				Final = FinalNum + "/" + NewDenom;
			}
			if (Fraction[1].contains("/")) {
				int FinalNum = ImproperNum1 * ImproperDenom2;
				int NewDenom = ImproperNum2 * ImproperDenom1;
				Final = FinalNum + "/" + NewDenom; //you can simplify
			}
		}
		if (ImproperDenom1 == ImproperDenom2) {
			if (Fraction[1].contains("-")) {
				int FinalNum = ImproperNum1 - ImproperNum2;
				Final = FinalNum + "/" + Integer.parseInt(Fraction1Parts[2]);;
			}
			if (Fraction[1].contains("+")) {
				int FinalNum = ImproperNum1 + ImproperNum2;
				Final = FinalNum + "/" + ImproperDenom2;
			}
			if (Fraction[1].contains("*")) {
				int FinalNum = ImproperNum1 * ImproperNum2;
				Final = FinalNum + "/" + ImproperDenom2;
			}
			if (Fraction[1].contains("/")) {
				int FinalNum = ImproperNum1 * ImproperDenom2;
				int NewDenom = ImproperNum2 * ImproperDenom1;
				Final = FinalNum + "/" + NewDenom; //you can simplify
			}
		}
		// WIP TO SIMPLIFY FRACTIONS
		String[] FinalConvert = Final.split("/");
		int FinalNum = Integer.parseInt(FinalConvert[0]);
		int FinalDenom = Integer.parseInt(FinalConvert[1]);
		String Answer = toMixedNum(FinalNum, FinalDenom);
		return Final;
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
	// turns the mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		if (whole < 0) {
			whole = whole * -1;
		}
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	//returns the absolute value of the input
	public static int absValue(int num) {	
		return num *-1;
	}
	//changes an improper fraction in the form of the integers into a mixed number and returns it
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator / denominator + "_" + numerator % denominator + "/" + denominator);
		return answer;
	}
}