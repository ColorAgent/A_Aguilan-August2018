package textExcel;

public class PercentCell extends RealCell{
	private String percent;
	
	public PercentCell(String input) {
		super(input);
	}
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		String percent.split("\\.");
		return percent[i] + ("          ").substring(0, 10);
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		percent.split("\\.");
		return percent;
	}
}
