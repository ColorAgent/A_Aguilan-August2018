package textExcel;

public class PercentCell extends RealCell{
	private String percent;
	
	public PercentCell(String input) {
		super(input);
	}
	public String abbreviatedCellText() {
		percent.split("\\.");
		return percent[0] + (" %           ").substring(0, 10);
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return "";
	}
}
