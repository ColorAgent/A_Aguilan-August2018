//@author Alex Aguilan
//@version date
package textExcel;

public class RealCell implements Cell {
	private String filler;

	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return filler;
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return "";
	}
}
