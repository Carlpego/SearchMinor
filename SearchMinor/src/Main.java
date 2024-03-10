import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//The Scanner class is used to capture input data through the console
		Scanner userInput = new Scanner(System.in);
		//We request the first number and initialize the variable to store
		System.out.println("enter a number");
		long input=0;
		//ArraList to store all numbers entered
		ArrayList<Long> numList=new ArrayList<>();
		/*cycle to request the entry of new numbers and invoke the method 
		that will find the lowest number*/
		while (true) {
			//assign the number in the variable
			input= userInput.nextInt();
			//assign the number to a position in the ArrayList
			numList.add(input);
			//invoke the method searchMinor
			searchMinor(numList);
			//request to enter another number
			System.out.println("enter a number");
		}
	}
	/*method that goes through each index of the ArrayLiss, compares the numbers and 
	 * assigns the manor value to the "minor" variable
	 */
	public static void searchMinor(ArrayList<Long> list) {
		
		//the first number is the smallest value when the ArrayList has size 1
		
		if(list.size()==1)
			System.out.println("The smallest number entered is "+list.get(0));
		//compare all indexes of the array
		else {
			long minor=list.get(0);
			for(int i=1;i<list.size();i++) {			
				if(list.get(i)<minor)
					minor=list.get(i);		
			}
			//print the lowest value in the console
			System.out.println("The smallest number entered is "+minor);
		}	
	}	
}