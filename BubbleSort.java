import java.util.Scanner;

public class BubbleSort{
	//create a scanner
	Scanner input = new Scanner(System.in);
	//create an array 
	public BubbleSort(){
		int temp;
		int[] number = new int[10];
		System.out.println("Please enter 10 numbers");
		//for loop that let every number be stored into array
		for (int i = 0; i < number.length; i++){
        	number[i] = input.nextInt();
    	}
    	//for loop that compare the numbers
    	for (int i = 1; i < number.length; ++i ) {
    		//for loop that compare each two numbers
			for (int j = 0; j < number.length - 1; ++j ) {
				//if the number is greater than second one then swap them
				if ( number[j] > number[j+1] ) {
					temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				} 
			}
		} 
		//use for loop to show the result via array
		for (int show = 0;show<number.length;show++){
			System.out.print(number[show] + " ");
		}
    }
	
}