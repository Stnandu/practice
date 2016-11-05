package store;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {
	private static WebDriver dr;
	
		// TODO Auto-generated method stub
		
		
		By login = By.xpath("//body//div/a[contains(text(),'Login')]");
		By logintab = By.xpath("//body//li/a[contains(text(),'Login')]");
		By userhome = By.xpath("//body//a[contains(text(),'View Store')]");
		//By userhome = By.xpath("//body//a[contains(@class,'dropdown-toggle')]");
		By email = By.xpath("//form[@id='login_form']/input[2]");
		By passwd = By.xpath("//form[@id='login_form']/input[3]");
		By 	signin = By.xpath("//form[@id='login_form']/input[4]");
		
		 
		public String hometitle(){
			return dr.getTitle();
		}
		
	public void login(){
		dr.findElement(login).click();
	}
	
	public void logintab(){
		dr.findElement(logintab).click();
	}
	public void email(String Email){
		dr.findElement(email).sendKeys(Email);;
	}
	public void passwd(String Passwd){
		dr.findElement(passwd).sendKeys(Passwd);;
	}
	public void signin(){
		dr.findElement(signin).click();
		dr.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	public void open(String page){
		dr = new FirefoxDriver();
		dr.get(page);
		dr.manage().window().maximize();
	}
	public String userhomename(){
		return dr.findElement(userhome).getText();
	}

}
