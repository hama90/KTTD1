package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {

public static void main(String[] args) {
	int [] arrNumber = new int[3];
	
	arrNumber[0] = 10;
	arrNumber[1] = 11;
	arrNumber[2] = 22;
	
	int[] paramNumber = Arrays.copyOf(arrNumber, arrNumber.length);
			
	int[] newArray = ArrayModification (arrNumber);
	
	for (int number:arrNumber)
	{
		System.out.println(number);
	}
	
	System.out.println("--");
	
	for(int number:arrNumber)
	{
		
	}
	
	puclic static void ArrayModification(int[] arrNumber)
	{
		arrNumber[0]= 100;
	}
}
}
