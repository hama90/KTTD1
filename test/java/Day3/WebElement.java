package Day3;

public class WebElement {
String value ;
String CSS;

public void Input(String pValue )
{
	value=pValue;
}

public void AddClass(String pCSS)
{
	CSS=pCSS;
}

public void DoAction()
{
	System.out.println("In ra value: "+ value);
	System.out.println("In ra CSS: " + CSS);
}

public static void main(String[] args) {
	
	WebElement ObjA = new WebElement(); 
	ObjA.Input("Nguyen Van A");
	ObjA.AddClass ("Tran Van B");
}

}
