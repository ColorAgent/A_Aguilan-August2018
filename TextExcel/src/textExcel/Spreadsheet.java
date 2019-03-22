package textExcel;

import java.util.Arrays;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] sheet;
	private int numOfRows;
	private int numOfCols;
	//constructor
	public Spreadsheet() {
		//initialize a 20 array of EmptyCells
		//+1 array for headers and stuff
		numOfRows = 20;
		numOfCols = 12;
		sheet = new Cell [numOfRows][numOfCols];
		for(int r = 0; r<numOfRows; r++) {
			for(int c = 0; c<numOfCols; c++) {
				// rows columns 
				sheet[r][c] = new EmptyCell();
			}
		}
	}
	@Override
	public String processCommand(String command) {
		String[] commandInspector = command.split(" ", 3);
		if(commandInspector.length < 2) {
			return getCell(new SpreadsheetLocation(command)).fullCellText();
		}
		if(commandInspector[1].contains("=")) {
			char col = command.charAt(0);
			int row = Integer.parseInt(command.substring(1));
			new SpreadsheetLocation(row, Character.getNumericValue(col));
			return getGridText();
		}
		if(commandInspector[0].contains("clear")) {
			
		}
		return "";
	}

	@Override
	public int getRows()
	{
		return numOfRows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return numOfCols;
	}

	@Override
	public Cell getCell(Location loc) {
		return sheet[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText() {
		for(int i = 0; i<numOfCols; i++) {
			char 
		}
		
		return null;
	}

}
