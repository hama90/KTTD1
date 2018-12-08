package Day3;

import java.util.ArrayList;
import java.util.Random;

public class ArrayBaiTap2 {
	public void NhapSo()
	{
		ArrayList<Integer> arrNumber = new ArrayList<Integer>();
		Random r = new Random();
		
		for (int i=0; i<10; i++)
		{
			arrNumber.add(r.nextInt());
		}
		
		int chan=0;
		int le=0;
		
		for(Integer obj:arrNumber)
		{
			if (obj%2 ==0)
			{
				chan++;
			}
			else
			{
				le++;
			}
		}
		
		System.out.println(chan);
		System.out.println(le);
	}
	
	public static void main(String[] args) {
		
		ArrayBaiTap2 abc = new ArrayBaiTap2();
		abc.NhapSo();
		
	}

}
