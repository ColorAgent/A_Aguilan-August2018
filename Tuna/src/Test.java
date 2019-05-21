import java.util.Arrays;

public class Test {
	
	private static int numOfRows;
	private static int numOfCols;
	//constructor
	public static void main(String[] args) {
		//initialize a 20 array of EmptyCells
		numOfRows = 20;
		numOfCols = 12;
		// rows columns 
		String Sheet[][] = new String [numOfRows][numOfCols];
		for(int i = 0; i<numOfRows; i++)
		for(int j = 0; j<numOfCols; j++)
		Sheet[i][j] = "0          |";

		for(int i = 0; i<numOfRows; i++) {
		    for(int j = 0; j<numOfCols; j++) {
		        System.out.print(Sheet[i][j]);
		    }
		    System.out.println();
		}		
	}
}
