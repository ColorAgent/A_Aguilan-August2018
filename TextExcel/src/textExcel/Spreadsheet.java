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
		// refrator rows columns and array
		for(int i = 0; i<rows; i++)
		    for(int j = 0; j<columns; j++)
		        array[i][j] = 0;

		for(int i = 0; i<rows; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(array[i][j]);
		    }
		    System.out.println();
		}
		
	}
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return null;
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
