import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int maxValue = 0;		
		//Open new input lines.
		Scanner sc = new Scanner(System.in);
		
		//Ask user for the size of the array.
		System.out.print("Enter the size of the array: ");
		int sizeofArray = sc.nextInt();
		int [] myArray = new int[sizeofArray];
		
		//User inputs array elements
		System.out.println("Enter the numbers (Decimal ok): ");
		for(int i=0; i < sizeofArray; i++) {
			myArray[i] = sc.nextInt();
		}
		
		//Calculate the mean
		double mean = 0;
		for(double num: myArray) {
			mean = mean+num/sizeofArray;
			
		}
		//Display the array elements.
				System.out.println("Displaying input: ");
				System.out.println(Arrays.toString(myArray));
				
		
		
		
		//Display mean
		System.out.println("Mean: "+mean);
				
		// Calculate the median
		Arrays.sort(myArray);
		double median;
		if (myArray.length % 2 == 0)
			median = ((double)myArray[myArray.length/2] + (double)myArray[myArray.length/2-1])/2;
		else	
			median = (double) myArray[myArray.length/2];
			System.out.println("Median: " +median);	
			
		// Calculate the mode
		int maxCount = 0;
		for (int i = 0; i < myArray.length; ++i) {
			int count = 0;
			for (int j =0; j < myArray.length; ++j) {
				if (myArray[j] == myArray[i]) ++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = myArray[i];
				
			}
		
		}
		System.out.println("Mode: "+maxValue);
		}
		
	}
	



