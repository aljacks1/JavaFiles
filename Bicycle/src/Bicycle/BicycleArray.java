package Bicycle;
import java.util.Arrays;
public class BicycleArray {
// invoke an array
	public static void main(String[] args) {
	int[] gearArray;
	// declares an array
	gearArray = new int [10];
	Arrays.fill(gearArray,1);//autofills the array
	// initializes an empty array with 10 spaces
	System.out.println(gearArray.length);
	System.out.println(Arrays.toString(gearArray));
	// use Arrays util again to print the numbers in the array without the Hex translation that is by default
	}
}