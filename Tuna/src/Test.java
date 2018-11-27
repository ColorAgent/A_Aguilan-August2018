
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
	public static String FractionParts (String Part) {
		String[] FractionSplit = Part.split("[_/]");
		String PartsDefined = "Placeholder";
		if (Part != "+" || Part != "-" || Part != "/" || Part != "*") {
			String whole = FractionSplit[0];
			if (FractionSplit[1] = "") {
				String Newwhole = Part;
				String numerator = "0";
				String denominator = "1";
				PartsDefined = "whole:" + Newwhole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
			}
			String numerator = FractionSplit[1];
			String denominator = FractionSplit[2];
			PartsDefined = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
			return PartsDefined;
		}
		return PartsDefined;
	}
}
