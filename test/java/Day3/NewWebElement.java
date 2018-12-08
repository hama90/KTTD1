package Day3;

import java.util.Random;


public class NewWebElement  extends WebElement {   // --ke thua tu lop WebElement
	public void HelloViettel()
	{
		String fullName = "Nguyen Thi Trang";
		int firstSpace = fullName.indexOf(" ",0);
		String firstName = fullName.substring(0, firstSpace) ;
				System.out.println(firstName);
		
		int lastSpace = fullName.lastIndexOf(" ", fullName.length());
		String lastName = fullName.substring(lastSpace+1, fullName.length());
		System.out.println(lastName);;
		
		String[] arrP = fullName.split(" ");
		String ho = fullName.split(" ")[0];
		String ten = fullName.split(" ")[arrP.length -1];
		System.out.println(ho);
		System.out.println(ten);
		
		
		
		// Cat chuoi bat ky
		Random rad = new Random() ;
		int randomNumber = rad.nextInt(fullName.length() );
		String part1 = fullName.substring(0, randomNumber); 
		
		System.out.println(part1);
		
	}
public static void main(String[] args) {
	NewWebElement abc = new NewWebElement() ; 
	abc.HelloViettel();
}
}
