package textExcel;

public class PercentCell extends RealCell{
	private String percent;
	
	public PercentCell(String userInput) {
		super(userInput);
		percent = userInput.substring(0, userInput.length() - 1);
	}
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
<<<<<<< HEAD
		return percent.split("\\.")[0] + ("          ").substring(0, 10);
=======
		return percent.split("\\.")[0] + ("%         ").substring(0, 10);
>>>>>>> branch 'master' of https://github.com/ColorAgent/A_Aguilan-August2018.git
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		percent.split("\\.");
		return percent;
	}
}
