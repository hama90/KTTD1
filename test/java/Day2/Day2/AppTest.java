package Day2.Day2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // giai phuong trinh : ax + bx = 0 
    @Test    
    public void GiaiPhuongTrinh()
    {
    	//Arrange
    	int x1= 0 ;
    	String ketqua = "" ;
    	int a=1, b=2 ; 
    	
    	if 
    	(a == 0)
    	{
    		ketqua = "pt vo nghiem";
    	}
    	else
    	{
    		x1= -b/a;
    	}
    	
    	//Assertion
    	
    	Assert.assertEquals(x1, -2);
    	//Assert.assertEquals(ketqua , "pt vo nghiem");
    	
    	System.out.println("");
    	boolean test = true;
    	 assertTrue(test);
    	 
    	    assertEquals(4, 4);
    	       
    }

	private boolean assertArrayEquals(String ketqua, String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
