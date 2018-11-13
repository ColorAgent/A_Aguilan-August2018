import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
	//declare array values
	int[] Arr  = {2, 4, 6, 8};
	int[] Arr1 = {3, 6, 9, 12};
	int[] Arr2 = {1, 2, 3, 4};
	//methods
	System.out.println("Sum of arrays");
	Sum(Arr1, Arr2);
	System.out.println("Array indexes incremented by 1");
	int num = 1;
	append(Arr, num);
	System.out.println("Array looks for a value and removes it from the array");
	int idx = 6;
	remove(Arr,idx);
	//place methods here!!!
	}
	public static int[] Sum(int[] Arr1, int[] Arr2) {
		for (int i = 0; i<Arr1.length; i++) {
			System.out.println(Arr1[i] + Arr2[i]);		
		}
		return Arr2;
	}
	public static int[] append(int[] Arr, int num) {
		for (int i = 0; i<Arr.length; i++) {
			System.out.println(Arr[i] + num);		
		}
		return Arr;
	}
	public static int[] remove(int[] Arr, int idx) {
		for (int i = 0; i < Arr.length - 1 ; i++) {
			Arr[i] = Arr[i+1];
		}
	}
}





