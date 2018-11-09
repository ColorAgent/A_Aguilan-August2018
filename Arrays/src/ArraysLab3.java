import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
	int[] Arr1 = {3, 6, 9, 12};
	int[] Arr2 = {1, 2, 3, 4};
	System.out.println("Sum of arrays");
	Sum(Arr1, Arr2);
	int[] Arr = {2, 4, 6, 8};
	int Add = 1;
	System.out.println("Array indexes incremented by 1");
	append(Arr, Add);
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
	public static i
}