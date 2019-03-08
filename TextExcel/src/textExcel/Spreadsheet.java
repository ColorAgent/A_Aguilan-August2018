package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int numOfRows;
	private int numOfCols;
	//constructor
	public Spreadsheet() {
		//initialize a 20 array of EmptyCells
		numOfRows = 20;
		numOfCols = 12;
		// rows columns 
		String Sheet[][] = new String [numOfRows][numOfCols];
		for(int i = 0; i<numOfRows; i++)
		for(int j = 0; j<numOfCols; j++)
		Sheet[i][j] = "0   ";

		for(int i = 0; i<numOfRows; i++) {
		    for(int j = 0; j<numOfCols; j++) {
		        System.out.print(Sheet[i][j]);
		    }
		    System.out.println();
		}		
	}
	
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return " ";
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return numOfRows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return numOfCols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
