package textExcel;

public class PercentCell extends RealCell{
	private String value;
	
	public PercentCell(String input) {
		super(input);
	}
	public String abbreviatedCellText() {
		return ((value.charAt(0)) + " %           ").substring(0, 10);
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return (Double.parseDouble(value));
	}
}
