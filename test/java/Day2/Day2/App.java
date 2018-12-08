package Day2.Day2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int a;
        System.out.println( "Hello World!" );
    }
}
 class Test1 {

@Test
public void TestPTSo1()
{
	Assert.assertEquals(GiaiPT(0,0,1), "PT vo nghiem");
	System.out.println("Phương trình vô nghiệm");
}


@Test
public void TestPTSo2()
{
	Assert.assertEquals(GiaiPT(1,0,1), "PT vo nghiem");
	System.out.println("Phương trình vô nghiệm");
}

public String GiaiPT(float a, float b, float c)
{
String kq = "" ;
if ( a==0 ) 
	{ 
		if ( b==0 ) 
		{
			kq= " PT vo nghiem" ;
		}
		else 
		{
			kq= "PT co mot nghiem:" + "x=" + (-c/b); 
		}
	return kq;
	}

float delta = b*b - 4*a*c ;
float x1;
float x2;
if (delta > 0 )
{
	x1 = (float)((-b+ Math.sqrt(delta))/(2*a));
	x2 = (float)((-b + Math.sqrt(delta))/(2*a));

}

else 
{
	if (delta ==0 )
	{
		x1= (-b/(2*a));
		kq = "PT co nghiem kep:"+ "x1=x2="+x1 ;
	}
	else
	{
		kq = "PT vo nghiem";
	}
	return kq;
}


}

}