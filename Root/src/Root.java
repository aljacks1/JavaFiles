import java.util.Scanner;
// added the functionality to import 
public class Root {
	public static void main(String[] args) { 
		double x; //declare input variable
		Scanner scan = new Scanner(System.in); //initialize scanner for keyboard i.o
		System.out.println("Enter a number to get it's square root!");
		x = scan.nextDouble(); //assign the next input to our declared variable 
		System.out.println("The square root of " + x + " is " + Math.sqrt(x));
		//output is the square root of the number the user inputs. 
	}
}
