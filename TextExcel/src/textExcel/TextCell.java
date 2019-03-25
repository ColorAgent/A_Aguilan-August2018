package textExcel;

public class TextCell implements Cell{
	private String text;
	
	public TextCell(String text) {
		this.text = text;
}
	// returns abbreviated version of text including 10 characters does not need quotation marks
	public String abbreviatedCellText() {
		//i remove " " marks
		if(text.contains("\"")) {
			text = text.substring(1, text.length() - 1);
		}
		// fills in blanks with spaces
		if(text.length() < 10) {
			for(int i = text.length(); i < 10; i++) {
				text += " ";
			}
		// assuming the cell is blank
		}else {
			text = text.substring(0, 10);
		}
		return text;
	}

	// returns exact copy of the original string entered into the cell including quotation marks nope
	public String fullCellText() {   
		return text;
	}
}
