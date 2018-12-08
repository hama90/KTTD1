package Day2.Day2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class register {

	private WebDriver driver;
	
	@FindBy (css="div.mod-login-input-phone>input")
	public WebElement txtPhone ; 
	
	@FindBy (css= "div.mod-login-input-name>input")
	public WebElement txtFullName ;
	
	@FindBy (css="div.mod-login-input-email>input")
	public WebElement txtEmail ;
	
	@FindBy (css="div.mod-login-input-password>input[type=\"password\"]")
	public WebElement txtPass ;
	
	@FindBy (css="div.mod-birthday-month>span")
	public WebElement slMonth ;
	

	@FindBy (css="span.mod-birthday-day[id=\"day\"]")
	public WebElement slDay; 
	
	@FindBy (css="span.mod-birthday-year[id=\"year\"]")
	public WebElement slYear; 
	
	@FindBy (css="span.mod-gender-gender[id=\"gender\"]")
	public WebElement rdGender; 
	
	
	@FindBy (css="div.mod-login-btn>button[type=\"submit\"]")
	public WebElement btDangKy; 
	
	
	public register(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}

	    
	    @Test
	    public void secondTestCase()
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    	driver= new ChromeDriver();
	    	
	    	driver.get("https://member.lazada.vn/user/register?spm=a2o4n.home.header.d6.1905e182JIYPfZ");
	    	
	    	/*
	    	//Nhap Username
	    	loginpage lgPage = new loginpage(driver);
	    	lgPage.txtUserName.sendKeys("khanh.tx@live.com");
	    	*/
	    	
	    	// Nhap thong tin dang ky
	    	
	    	register reg = new register(driver);
	    	
	    	reg.txtPhone.sendKeys("975650628");
	    	reg.txtFullName.sendKeys("NguyenHa");
	    	reg.txtEmail.sendKeys("hoadialan@123.com");
	    	reg.txtPass.sendKeys("123456");
	    	reg.rdGender.click();
	    	/*
	    	reg.slYear.sendKeys("1990");
	    	reg.slMonth.sendKeys("10");
	    	reg.slDay.sendKeys("17");
	    	*/
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	        assertTrue( true );
	    }
	
}
