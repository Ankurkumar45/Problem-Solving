import java.util.Scanner;
public class Main
{
	static int[] dRow = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dCol = {-1, 0, 1, 1, 1, 0, -1, -1};

	private static int countQualites(int arr[][], int N, int M, int row, int col) {
		int qlty = 0;
		
		for(int i = 0; i < 8; i++) {
			int newRow = N + dRow[i];
			int newCol = M + dCol[i];
			
			if (isValid(newRow, newCol, row, col) && arr[newRow][newCol] != 0) qlty++;
		}
		return qlty;
	}

	private static boolean isValid(int row, int col, int N, int M) {
		return row >= 0 && row < N && col >= 0 && col < M;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rows: ");
		int row = sc.nextInt();
		System.out.print("Enter the Columns: ");
		int col = sc.nextInt();
		
		int matrix[][] = new int[row][col];
		
		System.out.println("The data about girls and their qualities.-->>");
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int maxQuality = -1;
		int minDist = Integer.MAX_VALUE;
		int brideRow = -1;
		int brideCol = -1;
		boolean tie = false;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if (matrix[i][j] == 1 && !(i == 0 && j == 0)) {
					int qualities = countQualites(matrix, i, j, row, col);
					int distance = Math.max(Math.abs(i - 0), Math.abs(j - 0));
					
					if(qualities > maxQuality) {
						maxQuality = qualities;
						minDist = distance;
						brideRow = i + 1;
						brideCol = j + 1;
						tie = false;
					} else if (qualities == maxQuality) {
						if(distance < minDist) {
							minDist = distance;
							brideRow = i + 1;
							brideCol = j + 1;
							tie = false;
						}
						else if (distance == minDist) tie = true;
					}
				}
			}
		}
		
		if(maxQuality == -1) System.out.println("No suitable girl found");
		else if (tie) System.out.println("Polygamy not allowed");
		else {
			System.out.println(brideRow + ":" + brideCol + ":" + maxQuality);
		}
	}
}