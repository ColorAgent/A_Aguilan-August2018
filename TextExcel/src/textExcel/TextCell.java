// @author Alex Aguilan
// @version March 27, 2019
package textExcel;

public class TextCell implements Cell{
	private String text;
	private String fullText;
	
	public TextCell(String text) {
		this.text = text;
		this.fullText = text;
	}
	
	@Override
	public String abbreviatedCellText() {
		// removes the quotation marks
		// removes the ?
		if(text.contains("\"")) {
			text = text.substring(1, text.length() - 1);
		}
		// fills in the cell if its less than 10 spaces
		if(text.length() < 10) {
				text = (text + "          ").substring(0, 10);
		// otherwise returns cell as normal and fits it into the cell w/ 10 chars
		}else {
			text = text.substring(0, 10);
		}
		return text;
	}

	@Override
	// returns original text unaltered
	public String fullCellText() {
		return fullText;
	}

}