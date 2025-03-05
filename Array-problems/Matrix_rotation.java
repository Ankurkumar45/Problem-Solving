import java.util.Scanner;

class Matrix_rotation{
	
	private static void reverseCols(int[][] arr){
		int n = arr.length;
		int cols = arr.length;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < cols / 2; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[i][cols - 1 - j];
				arr[i][cols - 1 - j] = temp;
			}
		}
	}
	
	private static void rotation(int[][] matrix){
		int size = matrix.length;
		//Transpose of the matrix
		for(int i = 0; i < size; i++){
			for(int j = i + 1; j < size; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		//Reverse each row
		reverseCols(matrix);
		
	}
	
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size: ");
		int n = sc.nextInt();
		
		int matrix[][] = new int[n][n];
		System.out.println("Enter the values--->>>");
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}*/
		
		int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		rotation(matrix);
		
		System.out.println("\nAfter rotation--->>>");
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}