public class Backup {

	public static void main(String[] args) {
		System.out.println(produceAnswer("20 - 1_1/2"));
		System.out.println(FractionParts("6_5/8"));
		System.out.println(toImproperFrac(1, 1, 1));

	}
	public static String produceAnswer(String input) {
		String[] Fraction = input.split(" ");
		String[] DefaultValue = {"0","0","1"};
		String Operand1  = Fraction[0];
		String[] Fraction1Parts = Operand1.split("[_/]");
		int whole1 = 1;
		int numerator1 = 1;
		int denominator1 = 1;
		if (Fraction1Parts.length < 1) {
			whole1 = Integer.parseInt(Fraction1Parts[0]);
			numerator1 = Integer.parseInt(DefaultValue[1]);
			denominator1 = Integer.parseInt(DefaultValue[2]);
		} 
		else if (Fraction1Parts.length > 1) {
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
		return ImproperFrac1;
	}
//Identifies the Whole, Denominator, and Numerator of the fraction
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
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
}
	
		
		
		