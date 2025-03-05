import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class InputExamples{
	public ArrayList<Integer> inputArrayFormat(){
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for(char c : input.toCharArray()){
			if(Character.isDigit(c)){
				int num = Character.getNumericValue(c);
				arr.add(num);
			}
		}
	return arr;
	}

	public ArrayList<Integer> inputSpaceSeperated(){
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Scanner sc = new Scanner(input);
		while(sc.hasNextInt()){
			arr.add(sc.nextInt());
		}
		return arr;
	}

	public ArrayList<Integer> inputCommaSeperated(){
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Scanner ss = new Scanner(input).useDelimiter(",");
		while(ss.hasNextInt()) arr.add(ss.nextInt());
		return arr;
	}

	public ArrayList<Integer> inputArraySizeNotGiven(){
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Scanner sc = new Scanner(input);
		while(sc.hasNextInt()) arr.add(sc.nextInt());
		return arr;
	}

}

class InputFormats{
	public static void main(String[] args){
		InputExamples IE = new InputExamples();
		
		/*
		System.out.println("Case 1: [1,2,3,4,5]");
		ArrayList<Integer> arr1 = IE.inputArrayFormat();
		for(int value:arr1) System.out.print(value + " ");
		System.out.println();
		
		
		System.out.println("Case 2: 1 2 3 4 5");
		ArrayList<Integer> arr2 = IE.inputSpaceSeperated();
		for(int nums : arr2) System.out.print(nums + " ");
		
		
		System.out.println("Case 3: 1,2,3,4,5");
		ArrayList<Integer> arr3 = IE.inputCommaSeperated();
		for(int nums : arr3) System.out.print(nums + " ");
		
		
		System.out.println("Case 4: size is not given");
		ArrayList<Integer> arr4 = IE.inputArraySizeNotGiven();
		//Collections.sort(arr4);
		for(int num : arr4) System.out.print(num + " ");
		
		System.out.println();
		
		*/
	}
}