package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
    private int row;
    private int column;
	@Override
    public int getRow() {
    	
        
        return row;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return column;
    }
    
    public SpreadsheetLocation(String cellName) {
    	cellName = cellName.toUpperCase();
    	char col = cellName.charAt(0);
    	row = Integer.parseInt(cellName.substring(1)) - 1;
    	column = cellName.charAt(0) - 'A';
        // TODO: Fill this out with your own code
    }

}
