package test;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

import junit.framework.Assert;
import pages.LoginPage;

public class LoginTest {

	static WebDriver driver;
	static LoginPage loginPage;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 
		 
		
		//chamar os exe
				System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
				//System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
				
				
				
				driver = new ChromeDriver();
				//driver = new FirefoxDriver();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("https://www.phptravels.net/admin");
				loginPage = new LoginPage(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		loginPage.preencerCampos();
		
		assertEquals(loginPage.validarMensagem(), "bobson278@gmail.com");
	
	}

}
