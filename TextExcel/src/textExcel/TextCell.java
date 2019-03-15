package textExcel;

public class TextCell implements Cell{
	private String[][] storage;
	private String storedvalue;
	
	// returns abbreviated version of text including 10 characters does not need quotation marks
	public String abbreviatedCellText() {
		
		return storedvalue + "          " ;
	}

	// returns exact copy of the original string entered into the cell including quotation marks
	public String fullCellText() {
		// TODO Auto-generated method stub
		return  "\"storedvalue\"";
	}
}
