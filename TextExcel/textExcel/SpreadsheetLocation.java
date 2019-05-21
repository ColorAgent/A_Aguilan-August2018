// @author Alex Aguilan
// @version March 27, 2019
package textExcel;

public class SpreadsheetLocation implements Location {
    private int row;
    private int column;
    
    public int getRow() {    
        return row;
    }
    public int getCol() {
        return column;
    }
    
    public SpreadsheetLocation(String cellName) {
    	cellName = cellName.toUpperCase();
    	char col = cellName.charAt(0);
    	row = Integer.parseInt(cellName.substring(1)) - 1;
    	column = col - 'A';
    }
    public SpreadsheetLocation(int row, int column) {
    	this.row = row;
    	this.column = column;
    }
}
