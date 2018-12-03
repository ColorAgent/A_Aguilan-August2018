import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		System.out.println(produceAnswer("5_3/4 + 1_1/2"));
		System.out.println(FractionParts("6_5/8"));
		System.out.println(toImproperFrac(1, 1, 1));

	}
	public static String produceAnswer(String input) {
		String[] DefaultValue = {"0","0","1"};
		String[] Fraction = input.split(" "); //this is a really bad array name
		
		String Operand1  = Fraction[0];
		String[] Fraction1Parts = Operand1.split("[_/]");
		int whole1 = Integer.parseInt(Fraction1Parts[0]);
		int denominator1 = Integer.parseInt(Fraction1Parts[1]);
		int numerator1 = Integer.parseInt(Fraction1Parts[2]);
		String ImproperFrac1 = toImproperFrac(whole1, denominator1, numerator1);
		
		String Operater = Fraction[1];
		
		String Operand2  = Fraction[2];
		String[] Fraction2Parts = Operand2.split("[_/]");
		int whole2 = Integer.parseInt(Fraction2Parts[0]);
		int denominator2 = Integer.parseInt(Fraction2Parts[1]);
		int numerator2 = Integer.parseInt(Fraction2Parts[2]);
		String ImproperFrac2 = toImproperFrac(whole2, denominator2, numerator2);
		String Answer= "wow";
		if (Operater.contains("-")) {
			
		}
		return ImproperFrac1;
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
	// turns the mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
}
	
