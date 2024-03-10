import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("ingrese un número");
		long input=0;
		ArrayList<Long> numList=new ArrayList<>();
		
		while (true) {
			input= userInput.nextInt();
			numList.add(input);
			searchMinor(numList);
			System.out.println("Ingrese un número");
		}
	}

	public static void searchMinor(ArrayList<Long> list) {
		if(list.size()==1)
			System.out.println("El menor númetro ingresado es "+list.get(0));
		else {
			long minor=list.get(0);
			for(int i=1;i<list.size();i++) {			
				if(list.get(i)<minor)
					minor=list.get(i);		
			}
			System.out.println("El menor número ingresado es "+minor);
		}	
	}	
}