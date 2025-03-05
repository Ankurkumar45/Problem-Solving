import java.util.Scanner;

class Main{

	private static void lastZeroes(int[] arr, int len){
		int start = 0;

		for(int j = 0; j < len; j++) if(arr[j] != 0) arr[start++] = arr[j];

		while(start < len) arr[start++] = 0;

		for(int value:arr) System.out.print(value + " ");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

		lastZeroes(arr, n);
	}
}