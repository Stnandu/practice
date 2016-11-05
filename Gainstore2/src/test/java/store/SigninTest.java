package store;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SigninTest {
	 Signin si;
  @Test
  public void login() {
	  si.open("https://www.gainstores.com");
	  Assert.assertTrue(si.hometitle().toLowerCase().contains("gainstores"));
	  si.login();
	  
	  si.logintab();
	  si.email("swathlete19@gmail.com");
	  si.passwd("Great_23");
	  si.signin();
	  
	  Assert.assertTrue(si.userhomename().toLowerCase().equals("view store"));
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	 si = new Signin(); 
	 
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
