package Day3;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrNumber = new ArrayList<Integer>();
		
		arrNumber.add(10);
		arrNumber.add(20);
		arrNumber.add(30);
		
		/*
		for(Integer obj:arrNumber)
		{
			System.out.println(obj);
		}
		*/
		
		int count = arrNumber.size();
		
		for (int i=0; i<count; i++)
		{
			System.out.println(arrNumber.get(i));
		}
		
	}

}
