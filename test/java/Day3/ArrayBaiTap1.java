package Day3;

import java.util.ArrayList;
import java.util.Random;

public class ArrayBaiTap1 {

	public static void main(String[] args) {

		ArrayList<Integer> arrNumber = new ArrayList<Integer>();
		Random r = new Random();
		
		//nhap du lieu cho mang
		for (int i = 0; i < 10; i++) {
			arrNumber.add(r.nextInt());
		}
		
		int chan=0;
		int le=0;

		//kiem tra chan, le 

		for(Integer obj:arrNumber)
		{
			if (obj%2==0) 
			{
				chan++;
			}
			else
			{
				le++;
			}
		}
		
		//print obj
		for(Integer obj:arrNumber)
		{
			System.out.println(obj);
		}
		
		//print chan, le 
		System.out.println(chan);
		System.out.println(le);
	}
}
