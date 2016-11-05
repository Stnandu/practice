package store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr;
		/*
		By storeName = By.id("stName");
		By next = By.xpath("//body//input[2]");
		By login = By.xpath("//body//div/a[contains(text(),'Login')]");
		By loginAct = By.xpath("//body//a[contains(text(),'Login')][@role = 'tab']");
		By email = By.xpath("//form[@id='login_form']/input[2]");
		By passwd = By.xpath("//form[@id='login_form']/input[3]");
		By 	signin = By.xpath("//form[@id='login_form']/input[4]");
		By currency = By.id("stcurr");
		By Next = By.xpath("//select[@id='stcurr']/following-sibling::input");
		By theme = By.xpath("//li[@id='theme46']//span[contains(text(),'Select Theme')]");
		*/
		By product = By.xpath("//body//a[contains(text(),'PRODUCTS')]");
		By newProduct = By.xpath("//body//div[contains(text(),'NEW PRODUCT')]");
		By title = By.xpath("//body//label[contains(text(),'Title')]/following-sibling::input[@type= 'text']");
		
	}

}
