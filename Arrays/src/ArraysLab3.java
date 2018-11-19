import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
	//declare array values
	//            0  1  2  3
	int[] arr  = {2, 4, 6, 8};
	int[] Arr1 = {3, 6, 9, 12};
	int[] Arr2 = {1, 2, 3, 4};
	int num = 1;
	//methods
	System.out.println("Arr: " + Arrays.toString(arr));
	System.out.println("Arr1: " + Arrays.toString(Arr1));
	System.out.println("Arr2: " + Arrays.toString(Arr2));
	System.out.println("Sum: " + Arrays.toString(Sum(Arr1, Arr2)));
	System.out.println("Append: " + Arrays.toString(append(arr, num)));
	System.out.println("Remove: " + Arrays.toString(remove(arr, 2)));
	System.out.println("SumEven: " + (sumEven(arr)));
	System.out.print("rotateRight: ");
	rotateRight(Arr1);
	
	}
	//Arr1 indexes plus Arr2 indexes
	public static int[] Sum(int[] Arr1, int[] Arr2) {
		for (int i = 0; i<Arr1.length; i++) {
			Arr1[i] = Arr1[i] + Arr2[i];		
		}
		return Arr1;
	}
	//Arr indexes incremented by num
	public static int[] append(int[] Arr, int num) {
		for (int i = 0; i<Arr.length; i++) {
			Arr[i] = Arr[i] + num;
		}
		return Arr;
	}
	// Array looks for a value and removes it from the array
	public static int[] remove(int[] arr, int idx) {
		//create a new set of arrays with the last index removed
		int[] NewArray = new int[arr.length-1];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i != idx) {
				NewArray[index] = arr[i];
				index++;
			}
		}
		return NewArray;
	}
	// Accepts an array of ints and returns an integer thats the sum of all the even index numbers
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(i % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	// Rotates all elements of an array to the right by 1
	public static void rotateRight(int[] arr) {
		int lastValue = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = lastValue;
		System.out.println(Arrays.toString(arr));
	}
}



