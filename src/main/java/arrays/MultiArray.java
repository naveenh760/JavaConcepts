package arrays;

public class MultiArray {

	public static void main(String[] args) {
		int arr[][] = { {1,2,3}, {4,5,6}};
	//	print2D(arr);
	//	fill2D();
		jaggedArray();

	}

	public static void print2D(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void fill2D() {
		int arr[][] = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			}
		}
		print2D(arr);
	}
	
	public static void jaggedArray() {
		int m = 9;
		int arr[][] = new int[m][];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}
		print2D(arr);
	}
	
	
}
