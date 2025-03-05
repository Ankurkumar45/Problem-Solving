import java.util.HashMap;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

class Array_Operations{
	
	private static int smallest_element(int arr[]){
		int n = arr.length;
		if(n == 0) return 0;
		if(n == 1) return arr[0];
		int min = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] < arr[min]) min = i;
		}
		
		return arr[min];
	}

	private static int second_smallest(int arr[]){
		
		if(arr.length < 2) return -1;
		
		int small_01 = Integer.MAX_VALUE;
		int small_02 = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < small_01){
				small_02 = small_01;
				small_01 = arr[i];
			} else if(arr[i] < small_02 && arr[i] != small_01) small_02 = arr[i];
		}
		return small_02;
	}
	
	private static int largest_element(int arr[]){
		int n = arr.length;
		if(n == 0) return 0;
		if(n == 1) return arr[0];
		int max = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] > arr[max]) max = i;
		}
		return arr[max];
	}
	
	private static int second_largest(int arr[]){
		int large_01 = Integer.MIN_VALUE;
		int large_02 = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > large_01){
				large_02 = large_01;
				large_01 = arr[i];
			} else if(arr[i] > large_02 && arr[i] != large_01) large_02 = arr[i];
		}
		return large_02;
	}
	
	private static void reverse(int arr[]){
		
		int n = arr.length;
		
		if(n < 2) return;
		
		int mid = n / 2;
		
		for(int i = 0; i < mid; i++){
			if(arr[i] != arr[n - i - 1]){
				int temp = arr[i];
				arr[i] = arr[n - i - 1];
				arr[n - i - 1] = temp;
			}
		}
	}
	
	private static void swap(int arr[], int start, int end, int n){
		for(int i = 0; i < n; i++){
			int temp = arr[start + i];
			arr[start + i] = arr[end + i];
			arr[end + i] = temp;
		}
	}
	
	private static void frequency_count(int arr[]){
		int n = arr.length;
		if(n == 1) System.out.println(arr[0] + " -> " + 1);
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		
		for(int i = 0; i < n; i++){
			if(hash.containsKey(arr[i])){
				hash.put(arr[i], hash.get(arr[i]) + 1);
			} else{
				hash.put(arr[i], 1);
			}
		}
		
		/*for(HashMap.Entry<Integer, Integer> entry:hash.entrySet()){
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}*/
		
		for(int i : hash.keySet()){
			System.out.println(i + " -> " + hash.get(i));
		}
	}
	
	private static void increasing_decreasing(int arr[]){
		int n = arr.length;
		/*if(n < 2) return;
		if(n == 2){
			System.out.print(Arrays.sort(arr));
			return;
		}*/
		
		Arrays.sort(arr);
		for(int i = 0; i < n/2; i++) System.out.print(arr[i] + " ");
		for(int i = n - 1; i >= n/2; i--) System.out.print(arr[i] + " ");
	}
	
	private static int sumOfElements(int arr[]){
		int n = arr.length;
		if(n < 2) return arr[0];
		/*int sum = 0;
		for(int i = 0; i < n; i++) sum += arr[i];*/
		
		return IntStream.of(arr).sum();
	}
	
	private static void rotateByK(int arr[], int i, int k, int n){
		if(k == 0 || k == n) return;
		
		if(k == n - k){
			swap(arr, i, n - k + i, k);
			return;
		} else if(k < n - k){
			swap(arr, i , n - k + i , k);
			rotateByK(arr, i, k, n - k);
		} else{
			swap(arr, i , k , n - k);
			rotateByK(arr, n - k + i, 2 * k - n, k);
		}
	}
	
	private static double avg(int arr[]){
		int n = arr.length;
		
		//if(n < 2) return arr[0];
		
		/*OptionalDouble average = IntStream.of(arr).average();
		
		if(average.isPresent()) {
			System.out.println("Average = " + average.getAsDouble());
		} else{
			System.out.println("Array is empty!");
		}*/
		
		return (sumOfElements(arr)) / n;
	}
	
	private static void printArray(int arr[]){
		int n = arr.length;
		for(int value : arr) System.out.print(value + " ");
		System.out.println();
	}
	
	public static void main(String[] args){
		
		int arr[] = {1,2,3,4,5};
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();*/
		
		System.out.println();
		
		/*
		
		System.out.println("Smallest element is " + smallest_element(arr));
		System.out.println("Second smallest element is " + second_smallest(arr));
		System.out.println("Largest element is " + largest_element(arr));
		System.out.println("Second largest element is " + second_largest(arr));
		
		reverse(arr);
		System.out.print("Reverse of the array is ");
		for(int element:arr) System.out.print(element + " ");
		
		frequency_count(arr);
		
		
		increasing_decreasing(arr);
		
		System.out.println("Sum of the elements is " + sumOfElements(arr));
		rotateByK(arr, 0, 2, 5);

		*/
		System.out.println("Average = " + avg(arr));
		//printArray(arr);
		System.out.println();
	}
}