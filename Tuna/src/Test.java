import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		System.out.println(produceAnswer("1/4 + 1_1/2"));
		System.out.println(FractionParts("20"));

	}
	public static String produceAnswer(String input) {
		String[] Fraction = input.split(" "); //this is a really bad array name
		String Operand1  = Fraction[0];
		String Operater = Fraction[1];
		String Operand2  = Fraction[2];
		return Operand1 + " " + Operater + " " + Operand2;
	}
	public static String FractionParts (String Operand) {
		String [] DefaultValue = {"0","0","1"};
		String[] FractionSplit = Operand.split("[_/]");
		String PartsDefined = "Placeholder";
		if (Operand != "+" || Operand != "-" || Operand != "/" || Operand != "*") {
			if (Fraction.length < 1)
			String whole = DefaultValue[0];
			String numerator = FractionSplit[1];
			String denominator = FractionSplit[2];
			PartsDefined = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
		}
		return PartsDefined;
	}
}
